package items;

import graphics.Skins;

import java.awt.*;

//Pac dot item, is the pac man objective.

public class PacDot extends Item {

    //Constructor method

    public PacDot(Integer x, Integer y, Skins tex, String id, Integer quadrant, Integer value) {
        super(x, y, tex, id, quadrant, value);
    }

    //Draw the PacDot on screen

    public void render(Graphics g){
        g.drawImage(tex.pacDot, (int)x, (int)y, null);
    }
}
