package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Rectangle.swap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle[] rectangles = {new Rectangle(100 , 50),new Rectangle(100 , 20),};
        for(Rectangle rectangle : rectangles){
            if(rectangle.getArea()>1500){
                System.out.println(rectangle);
            }
        }
        RectangleWrapper sw1 = new RectangleWrapper(rectangles[0]);
        RectangleWrapper sw2 = new RectangleWrapper(rectangles[1]);
        System.out.println("Before exchange:");
        System.out.println(sw1.rectangle);
        System.out.println(sw2.rectangle);

        Rectangle.swap(sw1, sw2);

        System.out.println("After exchange:");
        System.out.println(sw1.rectangle);
        System.out.println(sw2.rectangle);

    }
}
/// public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
/// public static type[] copyOfRange(type[] original_array, int from_index, int to_index)
/// type[] copyOf(type[] src, int length)