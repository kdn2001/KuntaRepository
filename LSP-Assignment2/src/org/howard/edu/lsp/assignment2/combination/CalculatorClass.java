package org.howard.edu.lsp.assignment2.combination;

import java.util.*;

//This imports the utilities package and allows us to solve below

public class CalculatorClass {
    // CalculatorClass is the function made to find solution
    // This is used to find the correct sum info
    static boolean ArrayCalculator(
        int Array[],
        int array_length, int sum)
    
   //This is used to form the array and create two new variables
    {
        int x,y;
        //This is used to create two place holding variables 
  
      
        Arrays.sort(Array);
 
        //This is used to sort the array values
        
        x = 0;
        y = array_length - 1;
        
        // This is used to define the variables
        
        while (x < y) {
        	// 
            if (sum == Array[x] + Array[y])
                return true;
            // This is used to create first condition 
            else if (sum > Array[x] + Array[y])
                x++;
         // This is used to create the second condition 
            else // Array[i] + Array[j] > sum
                y--;
            
           // This is used to create the last condition 
        }
        return false;
        
        // if all the conditional statements are passed then return false
    }
 
    
}
