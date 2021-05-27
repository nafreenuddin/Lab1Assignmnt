package com.lab.Assignments;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibWithRecurssion {
	   int fib(int n)
	    {
	        if (n <= 1)
	            return n;
	        return fib(n - 1)+ fib(n - 2);
	    }   
	 public static void main(String args[])throws Exception{ 
	  FibWithRecurssion fb = new FibWithRecurssion();
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter the number ");
	  String s = br.readLine();
	  int N= Integer.parseInt(s);
	  for (int i = 0; i < N; i++) {
		  
          System.out.print(fb.fib(i) + " ");
      }
	 }  

}
