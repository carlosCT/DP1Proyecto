/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inf.pucp.edu.pe.simulacion.animacion;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author juancarlos
 */
public class movimiento extends Rectangle{
    
    public double moveSpeed = 3.2;
    public static int[] pImg={0,0};
        public static boolean isMoving= false;
        public static boolean up= false;
        public static boolean down= false;
        public static boolean left= false;
        public static boolean right= false;
        
        
    public int aniFrame=1;
    public int aniDelta=0;
    
    public movimiento(){
            width=400;
            height=400;
            //ubica al jugador en lugar determinado
            setBounds((Core.pixel.width/2)- (width/2), (Core.pixel.height/2)-(height/2), width, height);
    }
    
    public void tick(){
        if(up){
          Core.oY-=moveSpeed;
        }else if(down){
         Core.oY+=moveSpeed;
        }
        if(left){
            Core.oX-=moveSpeed;
        }else if(right){
            Core.oX+=moveSpeed;
        }
    }
    
    public void render(Graphics g){
        if(aniFrame==1){
             g.drawImage(Tile.characters, this.x, this.y, x +width , y +height , pImg[0]*Tile.size, pImg[1]*Tile.size, pImg[0]*Tile.size +Tile.size, pImg[1]*Tile.size + Tile.size, null);
        }
    }
}
