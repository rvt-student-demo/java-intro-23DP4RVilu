package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )

    {

    Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amt = 0;

        while (true) {
            System.out.println("Give a number: ");

            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                System.out.println("Number of numbers: " + amt );
                    System.out.println("Sum of the numbers: " + sum);
                        break;
                }
                else {
                    sum = sum + number;
                    amt = amt + 1;
                }
        }
    }
}
