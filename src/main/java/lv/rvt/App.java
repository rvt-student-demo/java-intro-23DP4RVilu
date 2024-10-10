package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )

    {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        Integer number = Integer.valueOf(scanner.nextLine());

        int start = number;
        int end = 101;
        for (int i = start; i < end; i++) {
            System.out.println(i);
            }

        }
}

