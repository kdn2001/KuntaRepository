package org.howard.edu.lsp.assignment2.test;

public class DriverClass {

public static void main(String args[])
    {
       int Array[] = { 3, 7, 36, 8, 19, -12 };
       int n = 26;
       int array_length = Array.length;
       
       // Used to create the array and set array length
       
       if (ArrayCalculator(Array, array_length, n))
           System.out.println("Array has two integers with given sum");
       else
           System.out.println("Array has no integers with given sum");
   }
}

