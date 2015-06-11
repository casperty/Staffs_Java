package shapesapplication;

/**
 *
 * @author Alexandre Ravaux
 */
public class Rectangle implements Shape{
    private int length,width;
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    public double area(){
        return length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
}
