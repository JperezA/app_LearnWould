package com.example.learnwould;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener,OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //tema
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);
        
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,    R.layout.barratitulo);
        
        //capturara eventos de los botones 
       View btnconfig =  findViewById(R.id.btnconfiguracion);
       btnconfig.setOnClickListener(this);
       btnconfig.setOnLongClickListener( this);
   /////2
       View btncong =  findViewById(R.id.btnconjugacion);
       btncong.setOnClickListener(this);
       btncong.setOnLongClickListener( this);
   /////3
       View btnfuturo =  findViewById(R.id.btnfuturo);
       btnfuturo.setOnClickListener(this);
       btnfuturo.setOnLongClickListener( this);
   /////4
       View btnuso =  findViewById(R.id.btnuso);
       btnuso.setOnClickListener(this);
       btnuso.setOnLongClickListener( this);
   /////5
       View btnwould =  findViewById(R.id.btnwould);
       btnwould.setOnClickListener(this);
       btnwould.setOnLongClickListener( this);
   /////6
       View btninfo =  findViewById(R.id.btninformacion);
       btninfo.setOnClickListener(this);
       btninfo.setOnLongClickListener( this);
       
    }
        
		@Override
        public void onClick(View v)
        {
        	//1
        	if(v.getId()==findViewById(R.id.btnconfiguracion).getId()){
        		Button botoninfo = (Button) findViewById(R.id.btnconfiguracion);
        		 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.zompropiedades);
        		 botoninfo.startAnimation(animacion);
        		 //cambio text
        		 TextView repite = (TextView) findViewById(R.id.textMenu);	
 				 repite.setText(R.string.menuconfiguracionEn);
 				 repite.setTextColor(0xff5477B1);
        	}
        	//2
        	if(v.getId()==findViewById(R.id.btnconjugacion).getId()){
        		Button botoncog = (Button) findViewById(R.id.btnconjugacion);
        		 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.zommenu);
        		 botoncog.startAnimation(animacion);
        		 //cambio text
        		 TextView repite = (TextView) findViewById(R.id.textMenu);	
 				 repite.setText(R.string.menuconjugationEn);
 				 repite.setTextColor(0xff5EC988);
        	} 
        	//3
        	if(v.getId()==findViewById(R.id.btnfuturo).getId()){
        		Button botonfutu = (Button) findViewById(R.id.btnfuturo);
        		 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.zommenu);
        		 botonfutu.startAnimation(animacion);
        		//cambio text
        		 TextView repite = (TextView) findViewById(R.id.textMenu);	
 				 repite.setText(R.string.menufuturoEn);
 				repite.setTextColor(0xffD9E021);
        	}
        	//4
        	if(v.getId()==findViewById(R.id.btnuso).getId()){
        		Button botonuso = (Button) findViewById(R.id.btnuso);
        		 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.zommenu);
        		 botonuso.startAnimation(animacion);
        		//cambio text
        		 TextView repite = (TextView) findViewById(R.id.textMenu);	
 				 repite.setText(R.string.menuusesEn);
 				repite.setTextColor(0xffDF8F5E);
        	}
        	//5
        	if(v.getId()==findViewById(R.id.btnwould).getId()){
        		Button botonwould = (Button) findViewById(R.id.btnwould);
        		 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.zommenu);
        		 botonwould.startAnimation(animacion);
        		//cambio text
        		 TextView repite = (TextView) findViewById(R.id.textMenu);	
 				 repite.setText(R.string.menuwouldEn);
 				repite.setTextColor(0xffD9B53F);
        	}
        	//6
        	if(v.getId()==findViewById(R.id.btninformacion).getId()){
        		Button botoninfo = (Button) findViewById(R.id.btninformacion);
        		 Animation animacion = AnimationUtils.loadAnimation(this, R.anim.zompropiedades);
        		 botoninfo.startAnimation(animacion);
        		//cambio text
        		 TextView repite = (TextView) findViewById(R.id.textMenu);	
        		
        		 repite.setText(R.string.menuinfoEn);
        		 repite.setTextColor(0xff5477B1);
 				
        	}
        }
      //btn para entrar a los layouts
		public boolean onLongClick(View v)
        {
			//1
        	if(v.getId()==findViewById(R.id.btnconfiguracion).getId()){
        	
        		
        	}
        	//2
        	if(v.getId()==findViewById(R.id.btnconjugacion).getId()){
        		
        	}
        	//3
        	if(v.getId()==findViewById(R.id.btnfuturo).getId()){
        		Intent futu = new Intent(MainActivity.this,Would.class);
 				startActivity(futu);
        	}
        	//4
        	if(v.getId()==findViewById(R.id.btnuso).getId()){
        		Intent uses = new Intent(MainActivity.this,Uses.class);
 				startActivity(uses);
        	}
        	//5
        	if(v.getId()==findViewById(R.id.btnwould).getId()){
        		Intent would = new Intent(MainActivity.this,Would1.class);
 				startActivity(would);
        	}
        	//6
        	if(v.getId()==findViewById(R.id.btninformacion).getId()){
        		Intent about = new Intent(MainActivity.this,AboutLearnWould.class);
 				startActivity(about);
        	}
        	return false;
        }
  
        
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
    }
		   
}

//animacion
