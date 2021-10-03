package com.dileep;

import java.util.Scanner;

public class Maths_Formulas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("enter ur requirement : ");
        String f = "";
//        System.out.println(f);
        float r = 0;
        float area = 0;
        float perimeter = 0;
        while (true) {
            System.out.println();
            System.out.print("enter ur requirement : ");
            f = new String(in.next());
            switch (f) {
                case "circle":
                case "Circle": {
                    System.out.print("Enter the radius:");
                    r = in.nextFloat();
                    area = 3.14f * r * r;
                    perimeter = 2 * 3.14f * r;
                    System.out.println("Area is:" + area);
                    System.out.println("Perimeter is:" + perimeter);
                    break;
                }
                case "rectangle":
                case "Rectangle":
                    System.out.print("Enter the length of Rectangle:");
                    float l = in.nextFloat();
                    System.out.print("Enter the breadth of Rectangle:");
                    float b = in.nextFloat();
                    area = l * b;
                    perimeter = 2 * (l + b);
                    System.out.println("Area of Rectangle:" + area);
                    System.out.println("Perimeter is:" + perimeter);
                    break;
                case "triangle":
                case "Triangle":
                    System.out.print("Enter the height of Triangle:");
                    float height = in.nextFloat();
                    System.out.print("Enter the length of base:");
                    int base = in.nextInt();
                    area = 0.5f * base * height;
                    System.out.println("Area of Triangle is:" + area);
                    break;
                case "equilateral triangle":
                case "Equilateral Triangle":
                    System.out.print("Enter the side of triangle:");
                    float side = in.nextFloat();
                    area = 0.433f * side * side;        //root3/4 = 0.433
                    perimeter = 3 * side;
                    System.out.println("Area of Equilateral Triangle is:" + area);
                    System.out.println("Perimeter of Equilateral Triangle is:" + perimeter);
                    break;
                case "isosceles triangle":
                case "Isosceles Triangle ":
                    System.out.print("Enter the height of Triangle:");
                    height = in.nextInt();
                    System.out.print("Enter the length of base:");
                    base = in.nextInt();
                    area = 0.5f * base * height;
                    System.out.println("Area of Isosceles Triangle is:" + area);
                    break;
                case "rhombus":
                case "Rhombus":
                    System.out.print("Enter diagonal d1:");
                    float d1 = in.nextFloat();
                    System.out.print("Enter diagonal d2:");
                    float d2 = in.nextFloat();
                    area = 0.5f * d1 * d2;
                    perimeter = (float) (2 * Math.sqrt(d1 * d1 + d2 * d2));
                    System.out.println("Area of Rhombus is:" + area);
                    System.out.println("Perimeter of Rhombus is:" + perimeter);
                    break;
                case "parallelogram":
                case "Parallelogram":
                    System.out.print("Enter base:");
                    base = in.nextInt();
                    System.out.print("Enter the height:");
                    height = in.nextInt();
                    area = base * height;
                    System.out.println("Area of parallelogram is:" + area);
                    break;
                case "square":
                case "Square":
                    System.out.print("Enter the side of Square:");
                    side = in.nextFloat();
                    area = side * side;
                    perimeter = 4 * side;
                    System.out.println("Area of Square is:" + area);
                    System.out.println("Perimeter of square is:" + perimeter);
                    break;
                case "cone":
                case "Cone":
                    System.out.print("Enter the Radius of base:");
                    r = in.nextFloat();
                    System.out.print("Enter the height of cone:");
                    height = in.nextFloat();
                    float volume = (3.14f * r * r * height) / 3;
                    System.out.println("Volume of cone is:" + volume);
                    break;
                case "prism":
                case "Prism":
                    System.out.println("Please enter the base area of prism:");
                    area = in.nextFloat();
                    System.out.print("Enter the height of prism:");
                    height = in.nextFloat();
                    volume = area * height;
                    System.out.println("Volume of prism is:" + volume);
                    break;
                case "cylinder":
                case "Cylinder":
                    System.out.print("Enter the base radius of cylinder:");
                    r = in.nextFloat();
                    System.out.print("Enter the height of cylinder:");
                    height = in.nextFloat();
                    float csa = 2 * 3.14f * r * height;
                    volume = 3.14f * r * r * height;
                    System.out.println("CSA of cylinder is:" + csa);
                    System.out.println("Volume of cylinder is:" + volume);
                    break;
                case "sphere":
                case "Sphere":
                    System.out.print("Enter the radius of sphere:");
                    r = in.nextFloat();
                    volume = 1.33f * 3.14f * r * r * r;
                    System.out.println("Volume of sphere is:" + volume);
                    break;
                case "pyramid":
                case "Pyramid":
                    System.out.print("Enter the base length of pyramid:");
                    l = in.nextFloat();
                    System.out.print("Enter the base width of pyramid:");
                    b = in.nextFloat();
                    System.out.print("Enter the height of pyramid");
                    height = in.nextFloat();
                    volume = (l * b * height) / 3;
                    System.out.println("Volume of Pyramid is:" + volume);
                    break;
                case "cube":
                case "Cube":
                    System.out.print("Enter the side of cube");
                    side = in.nextFloat();
                    volume = side * side * side;
                    area = 6 * side * side;
                    System.out.println("Volume of Cube is:" + volume);
                    System.out.println("Surface area of Cube is:" + area);
                    break;
                case "x":
                case "X" :
                    System.out.println("Bye...!");
                    System.exit(0);
                default:
                    System.out.print("Invalid input !!!");
                    System.out.println();
                    break;
            }
        }
    }
}

//output
//
//    enter ur requirement : cube
//        Enter the side of cube4
//        Volume of Cube is:64.0
//        Surface area of Cube is:96.0
//
//        enter ur requirement : pyramid
//        Enter the base length of pyramid:2
//        Enter the base width of pyramid:5
//        Enter the height of pyramid4
//        Volume of Pyramid is:13.333333
//
//        enter ur requirement : circle
//        Enter the radius:8
//        Area is:200.96
//        Perimeter is:50.24
//
//        enter ur requirement : kfl
//        Invalid input !!!
//
//        enter ur requirement : x
//        Bye...!
//
//        Process finished with exit code 0
