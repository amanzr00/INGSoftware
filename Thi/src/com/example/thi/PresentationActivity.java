package com.example.thi;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * @author Pablo Diez Perez
 * @author Ivan Montes Vicente
 * @author Alberto Manzano Reguero
 * @version 1.0
 * 
 *          This class, is a presentation class (splash). It only showed a few
 *          seconds
 */

public class PresentationActivity extends Activity {

	// Duration in milliseconds that splash is displayed
	private final int SPLASH_DISPLAY_LENGTH = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		setContentView(R.layout.activity_presentation);
		
		new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(PresentationActivity.this,MainActivity.class);
                PresentationActivity.this.startActivity(mainIntent);
                PresentationActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

		

	}
}
