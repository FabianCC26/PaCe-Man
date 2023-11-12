package graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

//Load the images reading the file paths

public class ImageLoader {

    //image object
    private BufferedImage image;

    //Load an image and prepare it to drawing

    public BufferedImage loadImage(String path) throws IOException {
        image = ImageIO.read(getClass().getResource(path));
        return image;
    }
}
