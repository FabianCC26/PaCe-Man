package items;

import graphics.Skins;


import java.awt.*;

//Apple fruit item.
public class Apple extends Item {

    //Constructor method

    public Apple(Integer x, Integer y, Skins tex, String id, Integer quadrant, Integer value) {
        super(x, y, tex, id, quadrant, value);
    }

    //Draw the Apple on screen

    public void render(Graphics g){
        g.drawImage(tex.apple, (int)x, (int)y, null);
    }

}