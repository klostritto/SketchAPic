package com.example.sketchapic;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.util.Log;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.ImageButton;




public class MainActivity extends Activity {
	
 
	
    public DrawView drawView;
	private float newx;
	private float newy;
	public Bitmap mBitmap;
	private Boolean icon=false;
	

	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    drawView=(DrawView) findViewById (R.id.paper);
	    
		
		final ImageButton clearbutton = (ImageButton) findViewById(R.id.clearbutton);
		clearbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.clearsheet();
            }
		});
	
		final ImageButton redbackgroundbutton = (ImageButton) findViewById(R.id.redbackground);
		redbackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.RED);	
            }
		});
		
		final ImageButton bluebackgroundbutton = (ImageButton) findViewById(R.id.bluebackground);
		bluebackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.BLUE);
            }
		});
		
		final ImageButton yellowbackgroundbutton = (ImageButton) findViewById(R.id.yellowbackground);
		yellowbackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.YELLOW);
            }
		});
		
		final ImageButton greenbackgroundbutton = (ImageButton) findViewById(R.id.greenbackground);
		greenbackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.GREEN);
            }
		});
		
		final ImageButton redpenbutton = (ImageButton) findViewById(R.id.redpen);
		redpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	drawView.setPenColor(Color.RED);
            	icon=false;
            }
		});
		
		final ImageButton bluepenbutton = (ImageButton) findViewById(R.id.bluepen);
		bluepenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setPenColor(Color.BLUE);
            	icon=false;
            }
		});
		
		final ImageButton yellowpenbutton = (ImageButton) findViewById(R.id.yellowpen);
		yellowpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {	
            	drawView.setPenColor(Color.YELLOW);
            	icon=false;
            }
		});
		
		final ImageButton greenpenbutton = (ImageButton) findViewById(R.id.greenpen);
		greenpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setPenColor(Color.GREEN);
            	icon=false;
            }
		});
		
		final Button iconbutton = (Button) findViewById(R.id.iconbutton);
		iconbutton.setOnClickListener(new View.OnClickListener() {
		  public void onClick(View v) {
			  
			icon=true;
			 
		  }
		  });
		
	
		
	}
	
	   public boolean onTouchEvent(MotionEvent event) {
	    	super.onTouchEvent(event);
	    	switch (event.getAction()) {
	    		case MotionEvent.ACTION_DOWN: {
	    	    newx=event.getX();
	    	    newy=event.getY();
	    		drawView.createNewPath(newx, newy-300);
	    		if (icon==true){
	    				
	    				 drawView.addToPath(newx-200, newy-300);
	    				 drawView.addToPath(newx-200, newy-100);
	    				 drawView.addToPath(newx, newy-100);
	    				 drawView.addToPath(newx, newy-300);
	    	    }
	    			
	    			break;
	    	
          
	    		}
	    		case MotionEvent.ACTION_UP: {
	    		
	    			break;
	    			
       	       }
         
	    		case MotionEvent.ACTION_MOVE: {
	    			Log.v("Testing", "debug"+icon);
	    			
	    			if(icon==false){
	    		   newx = event.getX();
		    	   newy = event.getY();
       	            drawView.addToPath(newx, newy-300);
	    			}
	    				
	    	  }
       }
       return true;
	  }
	
}
		
	
		
		
		

		
		


	
	
	
	
