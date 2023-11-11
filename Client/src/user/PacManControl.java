package user;

import main.Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//Listen the keyboard events and send the events to the Game class to perform pac man movement actions

public class PacManControl extends KeyAdapter {

    //The game instance
    Game game;

    //Constructor method

    public PacManControl(Game game){
        this.game = game;
    }

    //When the a key is pressed, trigger the game keyPressed Method

    public void keyPressed(KeyEvent e){
        game.keyPressed(e);
    }

    //When the a key is released, trigger the game keyRelease Method

    public void keyReleased(KeyEvent e){
        game.keyReleased(e);
    }
}
