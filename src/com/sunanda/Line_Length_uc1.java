package com.sunanda;
import java.util.Objects;
import java.util.Scanner;

public class Line_Length_uc1 {
    public static void main(String[] args)
    {
        double length;
        Scanner ln=new Scanner(System.in);
        System.out.println("Enter the value of coordinates");
        System.out.println("Enter the value of x1= ");
        int x1=ln.nextInt();
        System.out.println("Enter the value of x2= ");
        int x2=ln.nextInt();
        System.out.println("Enter the value of y1= ");
        int y1=ln.nextInt();
        System.out.println("Enter the value of y2= ");
        int y2=ln.nextInt();


        length= Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Length of line is = "+length);

        double length1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of coordinates");
        System.out.println("Enter the value of x1= ");
        int x3=sc.nextInt();
        System.out.println("Enter the value of x2= ");
        int x4=sc.nextInt();
        System.out.println("Enter the value of y1= ");
        int y3=sc.nextInt();
        System.out.println("Enter the value of y2= ");
        int y4=sc.nextInt();


        length1=Math.sqrt((x4-x3)^2+(y4-y3)^2);
        System.out.println("Length of line is = "+length1);

        //Check the line length are equal or not if equal print true if not print false
        System.out.println(length==length1);



    }
}
