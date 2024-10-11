package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )

    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amt = 0;
        double avg = 0.0;
        int odd = 0;
        int even = 0;

        System.out.println("Give a number: ");

        while (true) {


            Integer number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + amt );
                Double doublenumber = Double.valueOf(number);

                if (amt > 0) {
                    avg = (double) sum / amt;

                System.out.println("Average: " + avg);
                
                }
                if (number % 2 == 0) {
                    even++;
                } if (!(number % 2 == 0)) {
                    odd++;
                }
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);

                break;
                }
                else {
                    sum = sum + number;
                    amt = amt + 1;
                }
        }
    }
}
