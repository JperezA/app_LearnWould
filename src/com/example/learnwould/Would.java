package com.example.learnwould;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SlidingDrawer;
import android.widget.SlidingDrawer.OnDrawerCloseListener;
import android.widget.SlidingDrawer.OnDrawerOpenListener;
import android.widget.Toast;

public class Would extends Activity {

	//variables para cambio de boton en SlidingDrawer
	SlidingDrawer Drawer;
	ImageView tab;
	//variables para cambio de imagenes 
	Gallery gallery;
	ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_would);
		/////////funciones para el imagen
		gallery=(Gallery)findViewById(R.id.gallerywould);
		imageView=(ImageView) findViewById (R.id.mascota);
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setAdapter(new ImageAdapter(this));
		
		gallery.setOnItemClickListener(new OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> adapter,View arg1, int position,long arg3){
				Toast.makeText(getApplicationContext(), position+"", Toast.LENGTH_SHORT).show();
				imageView.setImageResource(ImageAdapter.ThumbsIds[position]);
				
			}
		}
		);
		
		/////////////
		Drawer = (SlidingDrawer) findViewById (R.id.drawer);
		tab = (ImageView) findViewById (R.id.tab);
		
		Drawer.setOnDrawerOpenListener(new OnDrawerOpenListener() {
			
			@Override
			public void onDrawerOpened() {
				// TODO Auto-generated method stub
				tab.setImageResource(R.drawable.tab_close);
				
			}
		});
		
		Drawer.setOnDrawerCloseListener(new OnDrawerCloseListener() {
			
			@Override
			public void onDrawerClosed() {
				// TODO Auto-generated method stub
				tab.setImageResource(R.drawable.tab_open);
				
			}
		});
	}

	
}
