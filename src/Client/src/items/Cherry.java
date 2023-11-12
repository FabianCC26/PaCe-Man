package items;

import graphics.Skins;


import java.awt.*;

//Cherry fruit item.

public class Cherry extends Item {

    //Constructor method

    public Cherry(Integer x, Integer y, Skins tex, String id, Integer quadrant, Integer value) {
        super(x, y, tex, id, quadrant, value);
    }

    //Draw the Cherry on screen

    public void render(Graphics g){
        g.drawImage(tex.cherry, (int)x, (int)y, null);
    }
}