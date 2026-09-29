package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("a must not be zero");
            a = in.nextInt();
        }while(a==0);
        b = in.nextInt();
        c = in.nextInt();
        double d = b*b-4*a*c;
        double result1;
        double result2;
        double real;
        double imaginray;
        System.out.println(d);
        if(d>0){
            result1 = ((double)(-b)/(2*a))+(Math.sqrt(d)/(2*a));
            result2 = ((double)(-b)/(2*a))-(Math.sqrt(d)/(2*a));
            System.out.println(result1);
            System.out.println(result2);
        }
        else if (d<0) {
            real = (((double)(-b)/(2*a))) ;
            if(real == 0){
                real= 0;
            }
            imaginray = Math.sqrt(-d)/(2*a);
            System.out.println(real+" + "+imaginray+" i");
            System.out.println(real+" - "+imaginray+" i");
        }
        else{
            result1 = (((double)(-b)/(2*a)));
            System.out.println(result1);
        }
    }
}