import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class tic_tac extends PApplet {

boolean tic1 = mouseX < width/3 && mouseY < height/3;
public void setup () {
  
}
public void draw () {
  line(20, height/3, width-20, width/3);
  line(20, height/1.5f, width-20, width/1.5f);
  
  line(height/3, 20, width/3, width-20);
  line(height/1.5f, 20, width/1.5f, width-20);
  
  if (mouseX > 20 && mouseY > 20 && mousePressed) {
    if (tic1) {
      rect(mouseX, mouseY, 10, 10);
    }
  }
}
  public void settings() {  size (300, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "tic_tac" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
