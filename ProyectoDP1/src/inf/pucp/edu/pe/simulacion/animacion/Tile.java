/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inf.pucp.edu.pe.simulacion.animacion;



import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author juancarlos
 */
public class Tile {
    
    public static int[] blank = {-1,-1};
    
    //background
    public static int[] grass = {0,0};
    public static int[] road = {1, 0};
    public static int[] leaves = {2, 0};
    
    //collision
    
    //characters
    public static int size= 100;
    public static BufferedImage terrain, background, items, characters;
    //public static BufferedImage background;
    
    
    public Tile() throws URISyntaxException{
    
     
            try {
                Tile.background=ImageIO.read(new File(getClass().getResource("/inf/pucp/edu/pe/animacion/imagenes/carretera2.png").toURI()));
                Tile.characters=ImageIO.read(new File(getClass().getResource("/inf/pucp/edu/pe/animacion/imagenes/apuntador.png").toURI()));
             // Tile.terrain=ImageIO.read(new File("file/bk.png"));//se debe cambiar
             // Tile.items=ImageIO.read(new File("file/bk.png"));//se debe cambiar
            } catch (IOException ex) {
                Logger.getLogger(Tile.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        
        
    }
}
