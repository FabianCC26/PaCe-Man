package items;

import graphics.Skins;

import java.awt.*;

//Energizer item, when pac man eats this item can kill ghosts.

public class Energizer extends Item {

    //Constructor method

    public Energizer(Integer x, Integer y, Skins tex, String id, Integer quadrant, Integer value) {
        super(x, y, tex, id, quadrant, value);
    }

    //Draw the Energizer on screen

    public void render(Graphics g){
        g.drawImage(tex.energizer, (int)x, (int)y, null);
    }
}