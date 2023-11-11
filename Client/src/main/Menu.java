package main;

import java.awt.*;

//Shows the game menu, create buttons, texts and draw the menu background

public class Menu {

    //The play Button
    public Rectangle playButton = new Rectangle(559, 250, 150, 70);

    //The Quit Button
    public Rectangle quitButton = new Rectangle(559, 400, 150, 70);


    //Draw the buttons and text of the menu

    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        //setting up the font and color
        Font font1 = new Font("arial", Font.BOLD, 50);
        g.setFont(font1);
        g.setColor(Color.YELLOW);

        Font font2 = new Font("arial", Font.BOLD, 30);
        g.setFont(font2);

        //draw the button text
        g.drawString("PLAY", playButton.x + 35, playButton.y + 45);

        //draw the buttons
        g2d.draw(playButton);

    }
}
