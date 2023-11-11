package graphics;

import java.awt.image.BufferedImage;

//Loads Sprite Sheets images into Buffered Images and grab images

public class SpriteSheet {

    //The sprite sheet
    private BufferedImage image;

    //Constructor method

    public SpriteSheet(BufferedImage image){
        this.image = image;
    }

    //Determines the size of the sprites

    public BufferedImage grabImage(Integer row, Integer col, Integer width, Integer height){
        BufferedImage img = image.getSubimage((col * 47) - 47, (row * 50) - 50, width, height);
        return img;
    }

}
