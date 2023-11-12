package items;

import interfaces.Obstacle;

import java.awt.*;

//Wall obstacle, block pac man movement when collides with him.

public class Wall implements Obstacle {

    //Wall position
    private Integer x;
    private Integer y;

    //Wall dimensions
    private Integer width;
    private Integer height;

    //Constructor method

    public Wall(Integer x, Integer y, Integer width, Integer height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //Creates an invisible rectangle of the wall

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x,y,width,height);
    }
}
