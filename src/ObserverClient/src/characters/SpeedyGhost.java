package characters;

import graphics.Skins;
import main.Game;

import java.awt.*;

//Speedy ghost observed in the main Game

public class SpeedyGhost extends Ghost {

    //Constructor method
    public SpeedyGhost(double x, double y, Skins tex, Game game) {
        super(x, y, tex, game);
    }

    //Draw Shadow image on screen

    public void render(Graphics g){
        if(x != 0 && y != 0){
            if(!game.getSkaredFlag()) {
                g.drawImage(tex.speedy[0], (int)x, (int)y, null);
            }
            else {
                g.drawImage(tex.scaredGhost[0], (int)x, (int)y, null);
            }
        }
    }
}
