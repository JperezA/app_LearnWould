package com.example.learnwould;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

public class ImageAdapter extends BaseAdapter implements SpinnerAdapter {
private Context context;
public ImageAdapter(Context context)
{
	this.context=context;
}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ThumbsIds.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView=null;
		if(convertView==null){
			imageView=new ImageView(context);
			imageView.setLayoutParams(new Gallery.LayoutParams(115,100));
			imageView.setPadding(8, 8, 8, 8);
		}
			else{
				imageView=(ImageView)convertView;
			}
			imageView.setImageResource(ThumbsIds[position]);
		
		return imageView;
	}
	public static Integer[] ThumbsIds={
		R.drawable.botonconfig,
		R.drawable.botoncongu,
		R.drawable.botonfutu,
		R.drawable.botoninfo,
		R.drawable.botonused
			
	};

}
