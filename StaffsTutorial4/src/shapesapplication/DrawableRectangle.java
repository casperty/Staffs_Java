package shapesapplication;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alexandre Ravaux
 */
public class DrawableRectangle extends Rectangle implements Drawable{
    private Color color;
    private int x,y,length,width;

    public DrawableRectangle(int x, int y, int width, int length, Color color){
        super(length, width);
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
        g.setColor(this.color);
        g.drawRect(this.x, this.y, this.getWidth(), this.getLength());
    }

    @Override
    public String toString() {
        return "DrawableRectangle{" + "color=" + color + ", x=" + x + ", y=" + y + ", length=" + this.getLength() + ", width=" + this.getWidth() + '}';
    }
    
    
}
