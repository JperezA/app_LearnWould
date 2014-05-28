package com.example.learnwould;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Uses extends Activity  implements OnClickListener{
	//variableglobar puntos
		private int leer=0;
		private int leerima=0;
		private ImageView Ima1,Ima2,Ima3;
		//variable boton
		private Button btnYesuses;
		private Button btnNouses;
		//Mostrar mascota
		private ImageView mascotauses;
		
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
			setContentView(R.layout.activity_uses);
			getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,    R.layout.barratitulo);
			  //capturara eventos de los botones 
			View btnconfig =  findViewById(R.id.calificaruse);
		       btnconfig.setOnClickListener(this);
		       
		       ///imagen mascota
		       mascotauses =(ImageView) findViewById(R.id.mascotause1);
		       
		      ///botones yes y no, invisible al inicio

		       btnYesuses =(Button) findViewById(R.id.yesbtbuseeje);
		       btnNouses =(Button) findViewById(R.id.nobtbuseeje);
		       //boton yes click
		       btnYesuses.setOnClickListener(new OnClickListener(){

	               public void onClick(View view) {

	                   Intent intent = new Intent();
	                  intent.setClass(Uses.this,Uses1ejer.class);
	                  startActivity(intent);
	                  finish();
	                   // lanzarAcercaDe(null);
	               }
	        });
		       //boton No click
		       btnNouses.setOnClickListener(new OnClickListener(){

	               public void onClick(View view) {
	            	   
	            	   onPause();
	                   // lanzarAcercaDe(null);
	               }
		       		});
		
		}//fin Oncreate
		


		//@Override
	    public void onClick(View v)
	    { 
	    	
	    	//1
	    	if(v.getId()==findViewById(R.id.calificaruse).getId()){
	    		leer = leer+1;

	    	    Button btncaliificar = (Button) findViewById(R.id.calificaruse);
	    		 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.transparencia);
	    		 btncaliificar.startAnimation(animacion);
	    		//cambio text
	    		 TextView textxxx = (TextView) findViewById(R.id.textouseconcepto);	
	    		 Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.zompropiedades);
	    		
	    		
	    		 //Imagenes
	    		 Resources res = getResources(); 
	    		 Drawable drawable = res.getDrawable(R.drawable.progreso2);
	    		
				//caso
	    		 switch ( leer ) {
	    	      case 1:
	    	    	  //    	    		 
	    	    		 textxxx.setText(R.string.use2);
	    	   	   break;
	    	      case 2:
	    	    	    textxxx.setText(R.string.use3);
	    	    		 //
	    	    		  Ima1 = (ImageView)findViewById(R.id.imause1);
	    	    		  Ima1.setImageDrawable(drawable);
	    	    		  //
	    	    		  textxxx.startAnimation(animacion2);
	    	           break;
	    	      case 3:
	    	    	   textxxx.setText(R.string.use4);
	    	    	  break;
	    	      case 4:
	    	    	  textxxx.setText(R.string.use5);
	    	    	  Ima2 = (ImageView)findViewById(R.id.imause2);
		    		  Ima2.setImageDrawable(drawable);
	    	    	  
	    	    	  textxxx.startAnimation(animacion2);
	    	    	  
	    	           break;
	    	      case 5:
	    	    	  textxxx.setText(R.string.use6);
	    	    	  //muestra la mascota
	    	    	  break;
	    	      case 6:
	    	    	  mascotauses.setVisibility(View.VISIBLE);
	    	    	  //
	    	    	  Ima3 = (ImageView)findViewById(R.id.imause3);
		    		  Ima3.setImageDrawable(drawable);
		    		  textxxx.setText(R.string.would4);
	    	    	  btncaliificar.setText(R.string.btnNext);
	    	    	  MediaPlayer mp = MediaPlayer.create(this, R.raw.congratulations_01);
	    	    	     mp.start();
	    	    	     textxxx.startAnimation(animacion2);
	    	           break;
	    	      case 7:
	    	    	  textxxx.setText(R.string.useconcorrect);
	    	    	  btncaliificar.setText(R.string.btnOk);
	    	    	  
	    	           break;
	    	      case 8:
	    	    	  mascotauses.setVisibility(View.INVISIBLE);
	    	    	  btncaliificar.setVisibility(View.INVISIBLE);
	    	    	  textxxx.setText(R.string.test);
	    	    	  
	    	    	  //muestralosbotones
	    	    	 
	    	    	  btnYesuses.setVisibility(View.VISIBLE);
	    	      	  btnNouses.setVisibility(View.VISIBLE);
	    	           break;
	    	      default:
	    	          
	    	           break;
	    	      }
	    	}
	    
	    }
	   
	    protected void onPause(){
	    	super.onPause();
	    	finish(); //termina la actividad
	    	}
	    	
	  
	    
	    
	}

