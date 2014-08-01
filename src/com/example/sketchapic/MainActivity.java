package com.example.sketchapic;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.util.Log;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Bitmap;
//import android.widget.Button;
import android.widget.ImageButton;




public class MainActivity extends Activity {
	
 
	
    public DrawView drawView;
	private float newx;
	private float newy;
	public Bitmap mBitmap;
	private String icon="none";
	

	

	
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
		
		final ImageButton whitebackgroundbutton = (ImageButton) findViewById(R.id.whitebackground);
		whitebackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.WHITE);	
            }
		});
		
		final ImageButton blackbackgroundbutton = (ImageButton) findViewById(R.id.blackbackground);
		blackbackgroundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setBackgroundColor(Color.BLACK);	
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
		
		final ImageButton whitepenbutton = (ImageButton) findViewById(R.id.whitepen);
		whitepenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	drawView.setPenColor(Color.WHITE);
            	icon="none";
            }
		});
		
		final ImageButton blackpenbutton = (ImageButton) findViewById(R.id.blackpen);
		blackpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	drawView.setPenColor(Color.BLACK);
            	icon="none";
            }
		});
		
		final ImageButton redpenbutton = (ImageButton) findViewById(R.id.redpen);
		redpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	drawView.setPenColor(Color.RED);
            	icon="none";
            }
		});
		
		final ImageButton bluepenbutton = (ImageButton) findViewById(R.id.bluepen);
		bluepenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setPenColor(Color.BLUE);
            	icon="none";
            }
		});
		
		final ImageButton yellowpenbutton = (ImageButton) findViewById(R.id.yellowpen);
		yellowpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {	
            	drawView.setPenColor(Color.YELLOW);
            	icon="none";
            }
		});
		
		final ImageButton greenpenbutton = (ImageButton) findViewById(R.id.greenpen);
		greenpenbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	drawView.setPenColor(Color.GREEN);
            	icon="none";
            }
		});
		
		final ImageButton squarebutton = (ImageButton) findViewById(R.id.squarebutton);
		squarebutton.setOnClickListener(new View.OnClickListener() {
		  public void onClick(View v) {
			  
			icon="square";
			 
		  }
		  });
		final ImageButton trianglebutton = (ImageButton) findViewById(R.id.trianglebutton);
		trianglebutton.setOnClickListener(new View.OnClickListener() {
		  public void onClick(View v) {
			  
			icon="triangle";
			 
		  }
		  });
		final ImageButton starbutton = (ImageButton) findViewById(R.id.starbutton);
		starbutton.setOnClickListener(new View.OnClickListener() {
		  public void onClick(View v) {
			  
			icon="star";
			 
		  }
		  });
		final ImageButton circlebutton = (ImageButton) findViewById(R.id.circlebutton);
		circlebutton.setOnClickListener(new View.OnClickListener() {
		  public void onClick(View v) {
			  
			icon="circle";
			 
		  }
		  });
		
		
		
	
		
	}
	
	   public boolean onTouchEvent(MotionEvent event) {
	    	super.onTouchEvent(event);
	    	switch (event.getAction()) {
	    		case MotionEvent.ACTION_DOWN: {
	    	    newx=event.getRawX();
	    	    newy=event.getRawY();
	    	    Log.v("Testing", "X coor is "+newx);
	    	    Log.v("Testing", "Y coor is "+newy);
	    	    final int offset=460;
	    	    if(icon=="none"){
	    		drawView.createNewPath(newx, newy-offset);
	    	    } else if (icon=="square"){
	    				
	    				 drawView.createNewPath(newx-100, newy-offset+100);
	    				 drawView.addToPath(newx+100, newy-offset+100);
	    				 drawView.addToPath(newx+100, newy-offset-100);
	    				 drawView.addToPath(newx-100, newy-offset-100);
	    				 drawView.addToPath(newx-100, newy-offset+100);
	    	    } else if (icon=="triangle"){
	    	    	drawView.createNewPath(newx, newy-offset-100);
   				    drawView.addToPath(newx-100, newy-offset+100);
   				    drawView.addToPath(newx+100, newy-offset+100);
   				    drawView.addToPath(newx, newy-offset-100);
	    	    	
	    	   } else if (icon=="star"){
	    		   drawView.createNewPath(newx, newy-offset-100);
  				   drawView.addToPath(newx+29, newy-offset-29);
  				   drawView.addToPath(newx+100, newy-offset-21);
  				   drawView.addToPath(newx+50, newy-offset+29);
  				   drawView.addToPath(newx+71, newy-offset+100);
  				   drawView.addToPath(newx, newy-offset+64);
  				   drawView.addToPath(newx-71, newy-offset+100);
  				   drawView.addToPath(newx-50, newy-offset+29);
  			       drawView.addToPath(newx-100, newy-offset-21);
  			       drawView.addToPath(newx-29, newy-offset-29);
  			       drawView.addToPath(newx, newy-offset-100);
	    		   
	    		   
	    	   } else if (icon=="circle"){
	    		   
	    		   drawView.addCircle(newx, newy-offset, 100);
	    	   }
	    	   
	    			
	    			break;
	    	
          
	    		}
	    		case MotionEvent.ACTION_UP: {
	    		
	    			break;
	    			
       	       }
         
	    		case MotionEvent.ACTION_MOVE: {
	    			Log.v("Testing", "debug"+icon);
	    			
	    			if(icon=="none"){
	    		   newx = event.getX();
		    	   newy = event.getY();
       	            drawView.addToPath(newx, newy-460);
	    			}
	    				
	    	  }
       }
       return true;
	  }
	
}
		
	
		
		
		

		
		


	
	
	
	
