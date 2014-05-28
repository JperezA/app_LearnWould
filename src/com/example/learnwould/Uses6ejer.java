package com.example.learnwould;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Uses6ejer extends Activity {
Button btnYWould;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_uses6ejer);
	    getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,    R.layout.barratitulo);
	    btnYWould =(Button) findViewById(R.id.calificaruse2);
	    		btnYWould.setOnClickListener(new OnClickListener(){

	                public void onClick(View view) {
	             	   
	             	   onPause();
	                    // lanzarAcercaDe(null);
	                }
	 	       		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uses6ejer, menu);
		return true;
	}
	
	
	 protected void onPause(){
	    	super.onPause();
	    	finish(); //termina la actividad
	    	}
	    	

}
