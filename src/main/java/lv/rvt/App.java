package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100] ");
        int points = Integer.valueOf(scanner.nextLine());

        if (points > 100) {
            System.out.println("Grade: Incredible!");
        }

        else if (points >= 90) {
            System.out.println("Grade: 5");
        }

        else if (points >= 80) {
            System.out.println("4");
        }

        else if (points >= 70) {
            System.out.println("3");
        }

        else if (points >= 60) {
            System.out.println("2");
        }

        else if (points >= 50) {
            System.out.println("1");
        }

        else if (points == 49) {
            System.out.println("Failed");
        }
        else if (points < 49 && points > 0 ) {
            System.out.println("Failed");
        }

        else if (points <= 0) {
            System.out.println("Grade impossible!");
        }
    }
    
}
