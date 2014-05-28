package com.example.learnwould;

import android.app.ActionBar;
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
import android.widget.TextView;

public class Would1 extends Activity implements OnClickListener {
//variableglobar puntos
	int leer=0;
	int leerima=0;
	private ImageView Ima1,Ima2,Ima3;
	//variable boton
	private Button btnYesWould;
	private Button btnNoWould;
	//Mostrar mascota
	private ImageView mascotawould1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_would1);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,    R.layout.barratitulo);
		  //capturara eventos de los botones 
		View btnconfig =  findViewById(R.id.calificar);
	       btnconfig.setOnClickListener(this);
	       
	       ///imagen mascota
	       mascotawould1 =(ImageView) findViewById(R.id.mascotawould1);
	       
	      ///botones yes y no, invisible al inicio

	       btnYesWould =(Button) findViewById(R.id.yesbtbwould);
	       btnNoWould =(Button) findViewById(R.id.nobtbwould);
	       //boton yes click
	       btnYesWould.setOnClickListener(new OnClickListener(){

               public void onClick(View view) {

                   Intent intent = new Intent();
                  intent.setClass(Would1.this,Uses.class);
                  startActivity(intent);
                  finish();
                   // lanzarAcercaDe(null);
               }
        });
	       //boton No click
	       btnNoWould.setOnClickListener(new OnClickListener(){

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
    	if(v.getId()==findViewById(R.id.calificar).getId()){
    		leer = leer+1;

    	    Button btncaliificar = (Button) findViewById(R.id.calificar);
    		 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.transparencia);
    		 btncaliificar.startAnimation(animacion);
    		//cambio text
    		 TextView textxxx = (TextView) findViewById(R.id.textowouldejer);	
    		 Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.zompropiedades);
    		
    		
    		 //Imagenes
    		 Resources res = getResources(); 
    		 Drawable drawable = res.getDrawable(R.drawable.progreso2);
    		
			//caso
    		 switch ( leer ) {
    	      case 1:
    	    	  //    	    		 
    	    		 textxxx.setText(R.string.would2);
    	    		
    	    		 //
    	    		  Ima1 = (ImageView)findViewById(R.id.imaWo1);
    	    		  Ima1.setImageDrawable(drawable);
    	    		  //
    	    		  textxxx.startAnimation(animacion2);
    	           break;
    	      case 2:
    	    	  Ima2 = (ImageView)findViewById(R.id.imaWo2);
	    		  Ima2.setImageDrawable(drawable);
    	    	  textxxx.setText(R.string.would3);
    	    	  textxxx.startAnimation(animacion2);
    	    	  
    	           break;
    	      case 3:
    	    	  //muestra la mascota
    	    	  mascotawould1.setVisibility(View.VISIBLE);
    	    	  //
    	    	  Ima3 = (ImageView)findViewById(R.id.imaWo3);
	    		  Ima3.setImageDrawable(drawable);
    	    	  textxxx.setText(R.string.would4);
    	    	  btncaliificar.setText(R.string.btnNext);
    	    	  MediaPlayer mp = MediaPlayer.create(this, R.raw.congratulations_01);
    	    	     mp.start();
    	    	     textxxx.startAnimation(animacion2);
    	           break;
    	      case 4:
    	    	  textxxx.setText(R.string.would5);
    	    	  btncaliificar.setText(R.string.btnOk);
    	    	  
    	           break;
    	      case 5:
    	    	  mascotawould1.setVisibility(View.INVISIBLE);
    	    	  btncaliificar.setVisibility(View.INVISIBLE);
    	    	  textxxx.setText(R.string.would6);
    	    	  
    	    	  //muestralosbotones
    	    	 
    	    	  btnYesWould.setVisibility(View.VISIBLE);
    	      	  btnNoWould.setVisibility(View.VISIBLE);
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
