/*
-------------------------------------------------------------------------
Name:		Sketch.java

Purpose: Using variables to scale an image based on size of frame. Using variables for 5.3 Proccesing Task.

Author:	Chan. A

Created:	date in 02/23/2022
-------------------------------------------------------------------------
*/

import processing.core.PApplet;

public class Sketch extends PApplet {
	

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
      //()
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(163,203,240);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    //draw ground

    noStroke();

    fill(113, 81, 55);
    rect(0, height/1.23f, width/1f, height/4);
    grass(0, height/1.23f);
    grass(width/4f, height/1.23f);
    grass(width/2f, height/1.23f);
    grass(width/1.33f, height/1.23f);
    grass(width/1.0667f, height/1.23f);

    fill(147, 192, 97);
    rect(0, height/1.23f, width/1f, height/17.78f);


    stroke(0, 0, 0);
    strokeWeight(1);

    //draw sun 
    fill(255, 255, 35);
    ellipse(width/8f, height/8f, width/10.667f, height/10.667f);

    line(width/5.797f, height/8f, width/4.324f, height/8f);
    line(width/8f, height/5.797f, width/8f, height/4.324f);

    line(width/6.299f, height/6.299f, width/5f, height/5f);

    //draw house
    fill(168, 97, 87);
    rect(width/3.555f, height/2.46f, width/2.2857f, height/2.4615f);

    //draw roof
    fill(124, 117, 110);
    triangle(width/2f, height/4.571f, width/4.848f, height/2.461f, width/1.26f, height/2.4615f);

    //draw left window
    fill(122, 184, 221);
    ellipse(width/2.556f, height/1.9f, width/16f, height/10.67f);
    line(width/2.78f, height/1.9f, width/2.367f, height/1.9f);
    line(width/2.56f, height/2.089f, width/2.56f, height/1.75f);

    //draw right window
    ellipse(width/1.639f, height/1.9f, width/16f, height/10.67f);
    line(width/1.724f, height/1.904f, width/1.559f, height/1.904f);
    line(width/1.639f, height/2.089f, width/1.639f, height/1.754f);

    //draw door
    fill(123, 68, 29);
    rect(width/2.286f, height/1.6f, width/8f, height/5.333f);

    //draw door knob
    fill(70, 71, 77);
    ellipse(width/2.133f, height/1.4159f, width/53.33f, height/53.33f);

    noStroke();

    //draw clouds
    fill(255, 255, 255);
    ellipse(width/2.667f, height/16f, width/8f, height/16f);
    ellipse(width/2.2857f, height/11.428f, width/8f, height/16f);

    ellipse(width/1.4545f, height/16f, width/8f, height/16f);
    ellipse(width/1.333f, height/11.4285f, width/8f, height/16f);
    ellipse(width/1.2698f, height/16, width/8f, height/16f);



  }


  
  // define other methods down here.
  public void grass(float x, float y) {


    fill(147, 192, 97);
    rect(x, y, width/16f, height/10.667f);
  
    }


  
}

