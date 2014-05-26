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
public class Background extends Rectangle {
    public int[] id= {-1, -1};
    
    public Background(Rectangle rect, int id[]){
        setBounds(rect);
        this.id= id;
    }
    
    public void render(Graphics g){
        g.drawImage(Tile.background, x-(int)Core.oX, y-(int)Core.oY, x +width -(int)Core.oX, y +height -(int)Core.oY, id[0]*Tile.size, id[1]*Tile.size, id[0]*Tile.size +Tile.size, id[1]*Tile.size + Tile.size, null);
    }
}
