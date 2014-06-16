package com.example.sketchapic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.View;
import android.util.AttributeSet;
import java.util.ArrayList;




public class DrawView extends View {
		

		private Path mypath;
		public Bitmap mBitmap;
		public int mycolor = Color.RED;
		private Paint mBitmapPaint;
		private ArrayList<Path> pathList = new ArrayList<Path>();
	    private ArrayList<Paint> paintList = new ArrayList<Paint>();

		

		 public DrawView(Context context, AttributeSet attrs) {
			    super(context, attrs);
			    mypath = new Path();
			    mBitmapPaint = new Paint();  
			    mBitmapPaint.setColor(Color.BLUE);
			    mBitmapPaint.setStyle(Paint.Style.STROKE);
			    mBitmapPaint.setStrokeWidth(5);
			    mBitmapPaint.setAntiAlias(true);
			   
			    mBitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
			 Log.v("Testing", "HIII");
		     
			  

	     }
		 
		 public void setPenColor(int color) {
		    
		     mycolor=color;
		
		 }
	
		 public void clearsheet(){
			
	       pathList = new ArrayList<Path>();
	       paintList = new ArrayList<Paint>();
	       invalidate();
		 }
		 
		 protected void onDraw(Canvas canvas) {
			
			super.onDraw(canvas);

		    canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);
			
		   
	        for (int i=0; i < pathList.size(); i++){  
			     canvas.drawPath(pathList.get(i), paintList.get(i));
			 }
			
			 
			
		 }
		 
		 public void addToPath(float newx, float newy){
			 mypath.lineTo(newx, newy);
				this.invalidate();
		 }
		
		
		public void createNewPath(float currentx, float currenty){
			
			mypath = new Path();
			pathList.add(mypath);
			mBitmapPaint = new Paint();
		    mBitmapPaint.setColor(mycolor);
			mBitmapPaint.setStyle(Paint.Style.STROKE);
		    mBitmapPaint.setStrokeWidth(5);
		    mBitmapPaint.setAntiAlias(true);
			    
			   paintList.add(mBitmapPaint);
	
			mypath.moveTo(currentx, currenty);
	        this.invalidate();
		}
	 
   }





