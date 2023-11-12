package characters;

import graphics.Skins;
import main.Game;

import java.awt.*;

//Parent ghost class, defines the structure and basic behavior of observed ghosts objects

public class Ghost {

    //Ghost positions
    public double x, y;

    //Game access
    public Game game;

    //Textures access
    public Skins tex;

    //Constructor method

    public Ghost(double x, double y, Skins tex, Game game) {
        this.x = x;
        this.y = y;
        this.game = game;
        this.tex = tex;
    }

    //Draw the ghost image on screen


    public void render(Graphics g){

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}
