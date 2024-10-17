package lv.rvt;

import java.util.*;

public class App 
{

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    
        Scanner scanner = new Scanner(System.in);
    }

    public static void divisibleByThreeInRange(int beginning, int end)
    {
    for (int iteration = beginning; iteration <= end; iteration++){
        if(iteration % 3 == 0) {
            System.out.println(iteration);
        }
    }  
    }
}
