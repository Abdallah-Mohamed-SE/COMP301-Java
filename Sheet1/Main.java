package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int first = 1;
        int next =1;
        int sum;
        for (int i = 0; i < n; i++) {
            System.out.print(first+" ");
            sum = first + next;
            first = next;
            next = sum;
        }
    }
}