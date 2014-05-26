/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inf.pucp.edu.pe.simulacion.animacion;

import java.awt.Graphics;
import java.awt.Rectangle;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author juancarlos
 */
public final class Level {
    public static int width = 600, height = 400;
    public static Background[][] bg= new Background[width][height];
//    public static Solid[][] solid= new Solid[width][height];
//    public static Item[][] item= new Item[width][height];
    
    public final String Dpath = "inf/pucp/edu/pe/animacion/imagenes/level_";
    public String path= Dpath;
    
    public TiledMap map= null;
    
    public Level(int id){
        //abertura de archivo tmx
        path = Dpath + Integer.toString(id)+ ".tmx";
        System.out.println(path);
        
        try{
            map = new TiledMap(path, false);
            
        }catch(SlickException e){
            System.out.println("Error loading Map");
        }
        
        for(int x=0; x<bg.length; x++){
            for(int y=0; y<bg[0].length; y++){
                bg[x][y]= new Background(new Rectangle(x* Tile.size, y*Tile.size, Tile.size, Tile.size), Tile.blank);
//                solid[x][y]= new Solid(new Rectangle(x* Tile.size, y*Tile.size, Tile.size, Tile.size), Tile.blank);
//                item[x][y]= new Item(new Rectangle(x* Tile.size, y*Tile.size, Tile.size, Tile.size), Tile.blank);
            }
        }
        loadWorld();
    }
    public void loadWorld(){
        int background = map.getLayerIndex("background");
//        int solids = map.getLayerIndex("collision");
//        int items = map.getLayerIndex("object");
        
        for(int x=0; x<bg.length; x++){
            for(int y=0; y<bg[0].length; y++){
                
                //background 
                if(map.getTileId(x, y, background)==1){//obtiene el valor en txt posicion x, y y compara.
                    bg[x][y].id= Tile.grass; //es grass
                }
//                if(map.getTileId(x, y, background)==2){
//                    bg[x][y].id= Tile.road; //son rocas
//                }
//                if(map.getTileId(x, y, background)==3){
//                    bg[x][y].id= Tile.leaves; //son hojas
//                }
//                
//                //solids
//                  if(map.getTileId(x, y, solids)==65){
//                    solid[x][y].id= Tile.grass;
//                }
//                
//                //item
//                  if(map.getTileId(x, y, items)==129){
//                    item[x][y].id= Tile.grass;
//                }
                  }
            }
        }
    
    
    public void tick(){}
    
    public static void render(Graphics g, int camX, int camY, int renX, int renY){
        for(int x= (camX/Tile.size); x< (camX/Tile.size)+renX; x++ ){
            for(int y= (camY/Tile.size); y< (camY/Tile.size)+ renY; y++){
                if(x >= 0 && y>=0 && x<width && y<height){
                    bg[x][y].render(g);
                }
            }
        }
    
    
    }
}
