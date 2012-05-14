package com.feigdev.eightbitsound;

import java.util.HashMap;

import android.app.Activity;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class EightBitSoundActivity extends Activity {
    private static final String TAG = "EightBitSoundActivity";
	private final int duration = 1; // seconds
    private final int sampleRate = 22050;
    private final int numSamples = duration * sampleRate;
    private final double sample[] = new double[numSamples];
    private HashMap<Integer,Double> buttonHertz;
    private HashMap<Integer,byte[]> audioTracks;
    final Handler handler = new Handler();

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();
        
        buildAddTabSpec(tabHost,"Tab 1",R.id.tab1);
        buildAddTabSpec(tabHost,"Tab 2",R.id.tab2);
        buildAddTabSpec(tabHost,"Tab 3",R.id.tab3);
        buildAddTabSpec(tabHost,"Tab 4",R.id.tab4);

        buttonHertz = new HashMap<Integer,Double>();
        //http://www.phy.mtu.edu/~suits/notefreqs.html 
        //beginning with C4 (middle C)
    	buttonHertz.put(R.id.imageButtonA1, 261.63);
    	buttonHertz.put(R.id.imageButtonA2, 277.18);
    	buttonHertz.put(R.id.imageButtonA3, 293.66);
    	buttonHertz.put(R.id.imageButtonA4, 311.13);
    	buttonHertz.put(R.id.imageButtonA5, 329.63);
    	buttonHertz.put(R.id.imageButtonA6, 349.23);
    	buttonHertz.put(R.id.imageButtonA7, 369.99);
    	buttonHertz.put(R.id.imageButtonA8, 392.00);
    	buttonHertz.put(R.id.imageButtonA9, 415.30);
    	buttonHertz.put(R.id.imageButtonB1, 440.00);
    	buttonHertz.put(R.id.imageButtonB2, 466.16);
    	buttonHertz.put(R.id.imageButtonB3, 493.88);
    	buttonHertz.put(R.id.imageButtonB4, 523.25);
    	buttonHertz.put(R.id.imageButtonB5, 554.37);
    	buttonHertz.put(R.id.imageButtonB6, 587.33);
    	buttonHertz.put(R.id.imageButtonB7, 622.25);
    	buttonHertz.put(R.id.imageButtonB8, 659.26);
    	buttonHertz.put(R.id.imageButtonB9, 698.46);
    	buttonHertz.put(R.id.imageButtonC1, 739.99);
    	buttonHertz.put(R.id.imageButtonC2, 783.99);
    	buttonHertz.put(R.id.imageButtonC3, 830.61);
    	buttonHertz.put(R.id.imageButtonC4, 880.00);
    	buttonHertz.put(R.id.imageButtonC5, 932.33);
    	buttonHertz.put(R.id.imageButtonC6, 987.77);
    	buttonHertz.put(R.id.imageButtonC7, 1046.50);
    	buttonHertz.put(R.id.imageButtonC8, 1108.73);
    	buttonHertz.put(R.id.imageButtonC9, 1174.66);
    	buttonHertz.put(R.id.imageButtonD1, 1244.51);
    	buttonHertz.put(R.id.imageButtonD2, 1318.51);
    	buttonHertz.put(R.id.imageButtonD3, 1396.91);
    	buttonHertz.put(R.id.imageButtonD4, 1479.98);
    	buttonHertz.put(R.id.imageButtonD5, 1567.98);
    	buttonHertz.put(R.id.imageButtonD6, 1661.22);
    	buttonHertz.put(R.id.imageButtonD7, 1760.00);
    	buttonHertz.put(R.id.imageButtonD8, 1864.66);
    	buttonHertz.put(R.id.imageButtonD9, 1975.53);
    	buildSamples();
    }
	
	public void buildAddTabSpec(TabHost tabHost, String title, int id){
        if (null == tabHost){
        	return;
        }
		TabSpec spec=tabHost.newTabSpec(title);
        spec.setIndicator(title);
        spec.setContent(id);
        tabHost.addTab(spec);
    }
	
    public void onClick(View v){
    	int minBuffer =  AudioTrack.getMinBufferSize(sampleRate, AudioFormat.CHANNEL_CONFIGURATION_MONO, AudioFormat.ENCODING_PCM_16BIT);
    	minBuffer *= 2;
		final AudioTrack audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                sampleRate, AudioFormat.CHANNEL_CONFIGURATION_MONO,
                AudioFormat.ENCODING_PCM_16BIT, minBuffer,
                AudioTrack.MODE_STATIC);
		byte [] pGeneratedSnd = audioTracks.get(v.getId());
    	
		audioTrack.write(pGeneratedSnd, 0, pGeneratedSnd.length);
		try{
       		audioTrack.play();
        	handler.postDelayed(new Runnable() {
        		@Override
        		public void run() {
        			audioTrack.flush();
        			audioTrack.release();
        		}
        	}, duration * 1000);
		} catch (IllegalStateException ex){
			Log.e(TAG,"Couldn't play");
		} 
    }
    
    private void buildSamples(){
    	audioTracks = new HashMap<Integer,byte[]>();
    	for (Integer key : buttonHertz.keySet()){
    	    final byte generatedSnd[] = new byte[2 * numSamples];

    		// Code grabbed from these two locations
        	// http://marblemice.blogspot.com/2010/04/generate-and-play-tone-in-android.html
        	// http://stackoverflow.com/questions/2413426/playing-an-arbitrary-tone-with-android/3731075#3731075
        	
        	// fill out the array
            for (int i = 0; i < numSamples; ++i) {
            	sample[i] = 0.5 - ( Math.atan(1/(Math.tan((Math.PI * i / (sampleRate/buttonHertz.get(key)))))));
            }

            // convert to 16 bit pcm sound array
            // assumes the sample buffer is normalised.
            int idx = 0;
            for (final double dVal : sample) {
                // scale to maximum amplitude
                final short val = (short) ((dVal * 32767));
                // in 16 bit wav PCM, first byte is the low order byte
                generatedSnd[idx++] = (byte) (val & 0x00ff);
                generatedSnd[idx++] = (byte) ((val & 0xff00) >>> 8);

            }
            audioTracks.put(key,generatedSnd);
    	}
    }
    
}