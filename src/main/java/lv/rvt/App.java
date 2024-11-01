package lv.rvt;

import java.util.*;

public class App {
    
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 
    int temp;
   
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   
    // reverse the order of the numbers in the array
   for (int i = 0; i < val.length; i++) {
    System.out.println(val[i]); 
   }
  
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    for (int i = val.length-1; i >= 0; i--){
      System.out.println(val[i]);
    }         
  }
}  



