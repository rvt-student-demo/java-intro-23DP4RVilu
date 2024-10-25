package lv.rvt;

import java.util.*;

public class App {

    public static void main(String[] args) {

        printStars(3);
        System.out.println(" ");
        printSquare(4);
        System.out.println(" ");
        printRectangle(17, 3);
        System.out.println(" ");
        printTriangle(4);
        System.out.println(" ");
        printRevtriangle(4);
        System.out.println(" ");
        christmasTree(4);
        System.out.println(" ");
        christmasTree(10);
        
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        } 
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
   
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(" ");
            }
    }   
    public static void printRevtriangle(int size) {
        int counter = 1;
        while (counter <= size) {
            printSpaces(size - counter);
            printStars(counter);
            counter++;
        }
    }

    public static void christmasTree(int height) {
        int counter = 1;
        while(counter <= height) {
            printSpaces(height - counter);
            printStars(2 * counter - 1);
            counter++;
        }

        for(int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}
