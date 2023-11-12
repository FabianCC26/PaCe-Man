package graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

//Load image using their file path

public class ImageLoader {

    //Image object
    private BufferedImage image;

    //Loads an image from file path

    public BufferedImage loadImage(String path) throws IOException {
        image = ImageIO.read(getClass().getResource(path));
        return image;
    }
}
