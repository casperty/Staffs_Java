package shapesapplication;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alexandre Ravaux
 */
public interface Drawable {
    public void setColour(Color c);
    public void setPosition(int x, int y);
    public void draw(Graphics g);
    public String toString();
}
