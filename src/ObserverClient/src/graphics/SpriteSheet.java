package graphics;

import java.awt.image.BufferedImage;

//Extract the exact image from a sprite sheet


public class SpriteSheet {

    //Image object
    private BufferedImage image;

    //Constructor method

    public SpriteSheet(BufferedImage image){
        this.image = image;
    }

    //Extract the character images using the row and column number, with and height

    public BufferedImage grabImage(Integer row, Integer col, Integer width, Integer height){
        BufferedImage img = image.getSubimage((col * 47) - 47, (row * 50) - 50, width, height);
        return img;
    }
}
