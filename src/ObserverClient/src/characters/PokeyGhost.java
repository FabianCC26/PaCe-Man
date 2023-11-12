package characters;

import graphics.Skins;
import main.Game;

import java.awt.*;

//Pokey Ghost observed in the main Game

public class PokeyGhost extends Ghost {

    //Constructor method

    public PokeyGhost(double x, double y, Skins tex, Game game) {
        super(x, y, tex, game);
    }

    //Draw the Pokey image on screen

    public void render(Graphics g){
        if(x != 0 && y != 0){
            if(!game.getSkaredFlag()) {
                g.drawImage(tex.pokey[0], (int)x, (int)y, null);
            }
            else {
                g.drawImage(tex.scaredGhost[0], (int)x, (int)y, null);
            }
        }
    }
}
