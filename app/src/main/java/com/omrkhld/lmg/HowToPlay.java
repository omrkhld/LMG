package com.omrkhld.lmg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class HowToPlay extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.howtoplay_layout);
	    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
		    case android.R.id.home:
	    		Intent intent = new Intent(this,MainActivity.class);
	    		startActivity(intent);
	    		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	@Override
	public void onBackPressed() {
	    super.onBackPressed();
	    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);  
	}

}
