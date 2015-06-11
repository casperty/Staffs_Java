package shapesapplication;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Alexandre Ravaux
 */
public class ShapesDriver extends JFrame{
    private ArrayList<Drawable> drawList=new ArrayList<Drawable>();
    public ShapesDriver() {
        super("Shapes Driver");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void paint (Graphics g){
        Color colorRect, colorCircle;
        colorRect = Color.BLACK;
        colorCircle = Color.ORANGE;
        DrawableCircle c=new DrawableCircle(50, 50, 100.0,colorCircle);
        DrawableRectangle r=new DrawableRectangle(60, 70, 100,80,colorRect);
        drawList.add(c);
        drawList.add(r);
        
        for(Drawable d:drawList){
            d.draw(g);
        }

        
    }
    public static void main(String[] args) {
        ShapesDriver animation = new ShapesDriver();
    }
}
