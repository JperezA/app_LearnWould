package com.example.learnwould;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Uses4ejer extends Activity implements OnClickListener  {

	//variableglobar puntos
		private int leer=0;
		private int leerima=0;
		private int botonselecionado =0;
		private ImageView Ima7;
		//variable boton
		private TextView btncorrecto;
		private RadioButton  r1;
		private RadioButton  r2;
		private RadioButton  r3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_uses4ejer);
	    getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,    R.layout.barratitulo);
	 ///////
	    View btnconfig =  findViewById(R.id.calificaruse2);
	       btnconfig.setOnClickListener(this);

	  btncorrecto =(TextView) findViewById(R.id.text2use);
	    r1=(RadioButton)findViewById(R.id.radio1);
	    r2=(RadioButton)findViewById(R.id.radio2);
	    r3=(RadioButton)findViewById(R.id.radio3);
	    //capturara eventos de los botones 
	  		
	  	 
	}

	//
	//@Override
	public void onClick(View v)
	{ 
		
		//1
		if(v.getId()==findViewById(R.id.calificaruse2).getId()){
			leer = leer+1;
			if(leer==1){
		   		 //comprogar boton selecionado
		   		 if (r1.isChecked()==true) {
			    		 botonselecionado=1;
			             } else
			            if (r2.isChecked()==true) {
			            	botonselecionado=2;               
			            }  else
				            if (r3.isChecked()==true) {
				            	botonselecionado=3;               
				            } 	 	    
		   		}
			////
		    Button btncaliificar = (Button) findViewById(R.id.calificaruse2);
			 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.transparencia);
			 btncaliificar.startAnimation(animacion);
		  	  		
			 //Imagenes
			 Resources res = getResources(); 
			 Drawable drawable = res.getDrawable(R.drawable.progreso2);
			
			 
			 
			//caso
			 switch ( leer ) {
		      case 1:
		    	  	 if(botonselecionado==2)	 
		    	  	 {	btncorrecto.setText(R.string.correct);
		    	  	 MediaPlayer mp = MediaPlayer.create(this, R.raw.correctmusic);
		    	     mp.start();
		    	  	 }
		    	  	 else{
		    	  		btncorrecto.setText(R.string.incorrect);
		    	  		 MediaPlayer mp = MediaPlayer.create(this, R.raw.incorrectmusic);
	    	    	     mp.start();
		    	  	 }
		    	  	Ima7 = (ImageView)findViewById(R.id.imause7);
		    		     Ima7.setImageDrawable(drawable);
		    		    btncaliificar.setText(R.string.btnNext);
		           break;
		        
		      default:
		    	  Intent intent = new Intent();
	              intent.setClass(Uses4ejer.this,Uses5ejer.class);
	              startActivity(intent);
	              finish();
		           break;
		      }
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uses1ejer, menu);
		return true;
	}

}
