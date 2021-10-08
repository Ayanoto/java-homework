package com.example;

import java.util.*;

public class code2_4 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for thr circle of radius " + radius + " is " + area);
    }
}
