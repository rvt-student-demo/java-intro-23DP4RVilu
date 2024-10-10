package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )

    {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");

        Integer num = Integer.valueOf(scanner.nextLine());
        
        int fact = 1;
    
        for (int i = 1; i <= num; i++) {
            fact = i * fact;
            System.out.println(i);
        }
    }
}

