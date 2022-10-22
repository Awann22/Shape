package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length; 
    private int breadth; 
    
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public int getArea() { 
         int area = length *breadth;
       return area; // write code to calculate area here
    } 
    public int getPerimeter()  { 
           int perimeter = 2*(length+breadth);
           return perimeter;
    // write code to calculate perimeter here
    // getPerimeter()
    
}}