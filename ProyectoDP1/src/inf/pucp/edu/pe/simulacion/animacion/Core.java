/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inf.pucp.edu.pe.simulacion.animacion;

import inf.pucp.edu.pe.vista.simulacion.MenuPrincipalSimulacion;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Image;
import java.net.URISyntaxException;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author juancarlos
 */
public class Core extends Applet implements Runnable{
 // private static final long serialVersionID=1l;
  
  public static final int res=1;
  
  public static double oY=0, oX=0;
  public static int dir=0;
  
  public static boolean moving= false;
  public static boolean run = false;
          
   private Image screen;
   public static movimiento player;
   
   public Level level;
        
  public static Dimension screenSize = new Dimension(800, 500);
  public static Dimension pixel = new Dimension(screenSize.width, screenSize.height);
  public static Dimension Size ;
  
  public static String name = "mapa simulacion";
  
  //contructor
  public Core(){
      setPreferredSize(screenSize);
      addKeyListener(new InputManager());
  }
  

  
  public void start(){
      requestFocus();
      //define class
      level = new Level(2);
      player= new movimiento();
      try {
          new Tile();
      } catch (URISyntaxException ex) {
          Logger.getLogger(Core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      
      run = true;
      new Thread(this).start();
  }
  
    
  public void stop(){
       run=false;
  }
   
  public void tick(){
      MenuPrincipalSimulacion.iframe.pack();
      player.tick();
      level.tick();
  }
   
  public void render(){
      Graphics g= screen.getGraphics();
      
      Level.render(g, (int)oX, (int)oY, (pixel.width /Tile.size)+2 , (pixel.height/Tile.size)+2);
      player.render(g);
      
      g= this.getGraphics();
      boolean drawImage;
      drawImage = g.drawImage(screen, 0, 0, screenSize.width, screenSize.height, 0, 0, pixel.width, pixel.height, null);
      g.dispose();
              
  }
  public void run(){
   screen = createVolatileImage(pixel.width, pixel.height);
   
   while(run){
       tick();
       render();
       
       try{
           Thread.sleep(5);
           
       }
       catch(Exception e){
           System.out.println("sleeping thread Error");
       }
   
   }
  }   
}
