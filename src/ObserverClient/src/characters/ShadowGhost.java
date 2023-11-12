package characters;

import graphics.Skins;
import main.Game;

import java.awt.*;

//Shadow ghost obvserved in the main Game

public class ShadowGhost extends Ghost {

    //Constructor method

    public ShadowGhost(double x, double y, Skins tex, Game game) {
        super(x, y, tex, game);
    }

    //Draw the Shadow image on screen

    public void render(Graphics g){
        if(x != 0 && y != 0){
            if(!game.getSkaredFlag()) {
                g.drawImage(tex.shadow[0], (int)x, (int)y, null);
            }
            else {
                g.drawImage(tex.scaredGhost[0], (int)x, (int)y, null);
            }
        }
    }
}
