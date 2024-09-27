package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Answers are: ");

        Integer result1 = first + second;
        System.out.println(first + " + " + second + " = " + result1);

        Integer result2 = first - second;
        System.out.println(first + " - " + second + " = " + result2);

        Integer reslt3 = first * second;
        System.out.println(first + " * " + second + " = " + reslt3);

        double result4 = (double) first / second;
        System.out.println(first + " / " + second + " = " + result4);
         
    }
}
