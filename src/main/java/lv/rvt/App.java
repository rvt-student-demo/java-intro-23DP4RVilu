package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )

    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        Integer number = Integer.valueOf(scanner.nextLine());
        int times = 1;

        while (times <= number) {
            printText();
            times++;
        }

    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
