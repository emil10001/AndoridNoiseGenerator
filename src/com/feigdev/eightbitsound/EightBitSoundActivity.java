package com.feigdev.eightbitsound;

import android.app.Activity;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class EightBitSoundActivity extends Activity {
    /** Called when the activity is first created. */
	private final int duration = 3; // seconds
    private final int sampleRate = 8000;
    private final int numSamples = duration * sampleRate;
    private final double sample[] = new double[numSamples];
    private final byte generatedSnd[] = new byte[2 * numSamples];
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();
        
        TabSpec spec1=tabHost.newTabSpec("Tab 1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Tab 1");
        
        TabSpec spec2=tabHost.newTabSpec("Tab 2");
        spec2.setIndicator("Tab 2");
        spec2.setContent(R.id.tab2);
        
        TabSpec spec3=tabHost.newTabSpec("Tab 3");
        spec3.setIndicator("Tab 3");
        spec3.setContent(R.id.tab3);
        
        TabSpec spec4=tabHost.newTabSpec("Tab 4");
        spec4.setIndicator("Tab 4");
        spec4.setContent(R.id.tab4);
        
        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);
        tabHost.addTab(spec4);
        init();
    }
    
    private void init(){
    	ImageButton a1 = (ImageButton)findViewById(R.id.imageButtonA1);
    	a1.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(300);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
   	
    	ImageButton a2 = (ImageButton)findViewById(R.id.imageButtonA2);
    	a2.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(350);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton a3 = (ImageButton)findViewById(R.id.imageButtonA3);
    	a3.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(400);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton a4 = (ImageButton)findViewById(R.id.imageButtonA4);
    	a4.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(450);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton a5 = (ImageButton)findViewById(R.id.imageButtonA5);
    	a5.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(500);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton a6 = (ImageButton)findViewById(R.id.imageButtonA6);
    	a6.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(550);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton a7 = (ImageButton)findViewById(R.id.imageButtonA7);
    	a7.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(600);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton a8 = (ImageButton)findViewById(R.id.imageButtonA8);
    	a8.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(650);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton a9 = (ImageButton)findViewById(R.id.imageButtonA9);
    	a9.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(700);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b1 = (ImageButton)findViewById(R.id.imageButtonB1);
    	b1.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(750);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b2 = (ImageButton)findViewById(R.id.imageButtonB2);
    	b2.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(800);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b3 = (ImageButton)findViewById(R.id.imageButtonB3);
    	b3.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(850);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b4 = (ImageButton)findViewById(R.id.imageButtonB4);
    	b4.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(900);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b5 = (ImageButton)findViewById(R.id.imageButtonB5);
    	b5.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(950);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b6 = (ImageButton)findViewById(R.id.imageButtonB6);
    	b6.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1000);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b7 = (ImageButton)findViewById(R.id.imageButtonB7);
    	b7.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1050);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b8 = (ImageButton)findViewById(R.id.imageButtonB8);
    	b8.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1200);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton b9 = (ImageButton)findViewById(R.id.imageButtonB9);
    	b9.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1250);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c1 = (ImageButton)findViewById(R.id.imageButtonC1);
    	c1.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1300);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c2 = (ImageButton)findViewById(R.id.imageButtonC2);
    	c2.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1350);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c3 = (ImageButton)findViewById(R.id.imageButtonC3);
    	c3.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1400);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c4 = (ImageButton)findViewById(R.id.imageButtonC4);
    	c4.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1450);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c5 = (ImageButton)findViewById(R.id.imageButtonC5);
    	c5.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1500);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c6 = (ImageButton)findViewById(R.id.imageButtonC6);
    	c6.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1550);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c7 = (ImageButton)findViewById(R.id.imageButtonC7);
    	c7.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1600);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c8 = (ImageButton)findViewById(R.id.imageButtonC8);
    	c8.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(16500);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton c9 = (ImageButton)findViewById(R.id.imageButtonC9);
    	c9.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1700);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d1 = (ImageButton)findViewById(R.id.imageButtonD1);
    	d1.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(17500);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d2 = (ImageButton)findViewById(R.id.imageButtonD2);
    	d2.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1800);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d3 = (ImageButton)findViewById(R.id.imageButtonD3);
    	d3.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1850);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d4 = (ImageButton)findViewById(R.id.imageButtonD4);
    	d4.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1900);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d5 = (ImageButton)findViewById(R.id.imageButtonD5);
    	d5.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(1950);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d6 = (ImageButton)findViewById(R.id.imageButtonD6);
    	d6.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(2000);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d7 = (ImageButton)findViewById(R.id.imageButtonD7);
    	d7.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(2050);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d8 = (ImageButton)findViewById(R.id.imageButtonD8);
    	d8.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(2100);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    	ImageButton d9 = (ImageButton)findViewById(R.id.imageButtonD9);
    	d9.setOnTouchListener(new OnTouchListener() {
		    @Override
		    public boolean onTouch(View v, MotionEvent event) {
		    	int action = event.getAction();
		    	switch (action){
		    	case MotionEvent.ACTION_DOWN:
		    		play(2150);
		    		break;
		    	case MotionEvent.ACTION_UP:
		    		break;
		    	}
		    	return true;
		    }
		});
    }

    private void play(double freqOfTone){
    	// Code grabbed from these two locations
    	// http://marblemice.blogspot.com/2010/04/generate-and-play-tone-in-android.html
    	// http://stackoverflow.com/questions/2413426/playing-an-arbitrary-tone-with-android/3731075#3731075
    	
    	// fill out the array
        for (int i = 0; i < numSamples; ++i) {
            sample[i] = Math.sin(2 * Math.PI * i / (sampleRate/freqOfTone));
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
    	final AudioTrack audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                sampleRate, AudioFormat.CHANNEL_CONFIGURATION_MONO,
                AudioFormat.ENCODING_PCM_16BIT, numSamples,
                AudioTrack.MODE_STATIC);
        audioTrack.write(generatedSnd, 0, generatedSnd.length);
        audioTrack.play();
    }

}