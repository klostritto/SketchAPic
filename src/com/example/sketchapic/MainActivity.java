package com.example.sketchapic;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
//import android.util.Log;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Bitmap;
import android.widget.Button;




public class MainActivity extends Activity {
	
 
	
    public DrawView drawView;
	private float newx;
	private float newy;
	public Bitmap mBitmap;
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    drawView=(DrawView) findViewById (R.id.paper);
	    
		
		final Button clearbutton = (Button) findViewById(R.id.clearbutton);
		clearbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.clearsheet();
            }
		});
	
		final Button redbackgroundbutton = (Button) findViewById(R.id.redbackground);
		redbackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.RED);	
            }
		});
		
		final Button bluebackgroundbutton = (Button) findViewById(R.id.bluebackground);
		bluebackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.BLUE);
            }
		});
		
		final Button yellowbackgroundbutton = (Button) findViewById(R.id.yellowbackground);
		yellowbackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.YELLOW);
            }
		});
		
		final Button greenbackgroundbutton = (Button) findViewById(R.id.greenbackground);
		greenbackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.GREEN);
            }
		});
		
		final Button redpenbutton = (Button) findViewById(R.id.redpen);
		redpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	drawView.setPenColor(Color.RED);
            }
		});
		
		final Button bluepenbutton = (Button) findViewById(R.id.bluepen);
		bluepenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setPenColor(Color.BLUE);
            }
		});
		
		final Button yellowpenbutton = (Button) findViewById(R.id.yellowpen);
		yellowpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {	
            	drawView.setPenColor(Color.YELLOW);
            }
		});
		
		final Button greenpenbutton = (Button) findViewById(R.id.greenpen);
		greenpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setPenColor(Color.GREEN);
            }
		});
		
		final Button iconbutton = (Button) findViewById(R.id.iconbutton);
		iconbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
		});
		
	
		
	}
	
	   public boolean onTouchEvent(MotionEvent event) {
	    	super.onTouchEvent(event);
	    	switch (event.getAction()) {
	    		case MotionEvent.ACTION_DOWN: {
	    		
	    		
	    			drawView.createNewPath(event.getX(), event.getY()-300);
	    			
	    			break;
	    	
          
	    		}
	    		case MotionEvent.ACTION_UP: {
	    		
	    			break;
	    			
       	       }
         
	    		case MotionEvent.ACTION_MOVE: {
	    			
	    			newx = event.getX();
	    			newy = event.getY();
       	            drawView.addToPath(newx, newy-300);
	    				
	    	  }
       }
       return true;
	  }
	
}
		
	
		
		
		

		
		


	
	
	
	
