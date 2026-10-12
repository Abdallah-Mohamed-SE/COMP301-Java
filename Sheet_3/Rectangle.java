package org.example;
// question 3 done
class RectangleWrapper {
    Rectangle rectangle;
    RectangleWrapper(Rectangle rectangle) { this.rectangle = rectangle; }
}
public class Rectangle {
    private double length ;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    public double getArea(){
        return  (length * width);
    }
    public static void swap(RectangleWrapper R1, RectangleWrapper R2){
        if(R1.rectangle.length==R2.rectangle.length){
            Rectangle temp = R1.rectangle;
            R1.rectangle = R2.rectangle;
            R2.rectangle = temp;
        }
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
