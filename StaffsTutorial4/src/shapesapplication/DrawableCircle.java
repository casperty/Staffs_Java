package shapesapplication;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alexandre Ravaux
 */
public class DrawableCircle extends Circle implements Drawable {
    private Color color;
    private int x,y;
    private double radius;

    public DrawableCircle(int x, int y, double radius, Color color) {
        super(radius);
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void setColour(Color c) {
        this.color=c;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public void draw(Graphics g) {
        int width=(int)this.getRadius();
        int length=(int)this.getRadius();
        g.setColor(this.color);
        g.drawOval(this.x, this.y, width, length);

    }

    @Override
    public String toString() {
        return "DrawableCircle{" + "color=" + color + ", x=" + x + ", y=" + y + ", radius=" + this.getRadius() + '}';
    }
    
    
}
