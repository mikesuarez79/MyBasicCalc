package com.example.mybasiccalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity{
	

	private static String TAG = Splash.class.getName();
	private static long SLEEP_TIME = 3;    // Sleep for some time

	@Override
	protected void onCreate(Bundle myVariable) {
		// TODO Auto-generated method stub
		super.onCreate(myVariable);
		setContentView(R.layout.splash);
		
		// Start timer and launch main activity
	    //IntentLauncher launcher = new IntentLauncher();
	    //launcher.start();
	    
		Thread timer = new Thread() {
			
			@Override
			public void run() {
				
				try {
					sleep(5000); //5 seconds.
				} catch( InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openMyBasicCalc = new Intent("com.example.mybasiccalc.MainActivity");
					startActivity(openMyBasicCalc);
					
				}
				
			} //run
		}; //thread
	    
		timer.start();
	    
	    
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
	
	//private class IntentLauncher extends Thread {
	      //@Override
	      //**
	      // * Sleep for some time and than start new activity.
	      // */
	      
	
	      //public void run() {
	      //   try {
	            // Sleeping
	      //      Thread.sleep(SLEEP_TIME*1000);
	      //   } catch (Exception e) {
	      //      Log.e(TAG, e.getMessage());
	      //   }
	 
	         // Start main activity
	      //   Intent intent = new Intent(Splash.this, MainActivity.class);
	      //   Splash.this.startActivity(intent);
	      //   Splash.this.finish();
	      //}
	 //  }
	
	
}
