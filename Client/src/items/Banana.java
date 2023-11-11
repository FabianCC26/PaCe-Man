package items;

import graphics.Skins;


import java.awt.*;

//Banana fruit item.

public class Banana extends Item {

    //Constructor method

    public Banana(Integer x, Integer y, Skins tex, String id, Integer quadrant, Integer value) {
        super(x, y, tex, id, quadrant, value);

    }

    //Draw the Banana on screen

    public void render(Graphics g){
        g.drawImage(tex.banana, (int)x, (int)y, null);
    }
}