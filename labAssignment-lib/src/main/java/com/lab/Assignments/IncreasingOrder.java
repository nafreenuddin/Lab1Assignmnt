package com.lab.Assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IncreasingOrder {

		 public static void main (String[] args) throws Exception{
		        int number;
		        boolean increasingNumber=false;
		  	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  	  System.out.println("Enter the series");
		        String s = br.readLine();
		        number = Integer.parseInt(s);
		        increasingNumber = checkNumber(number);
		        System.out.println(increasingNumber);
		    }
		    public static boolean checkNumber(int number) {
		        boolean increasing = false;
		        while(number>0) {
		            int lastDigit = number % 10;
		            number /= 10;
		            int nextLastDigit = number % 10;
		            
		            if(nextLastDigit<=lastDigit) {
		                increasing=true;
		            }
		            else {
		                increasing=false;
		                break;
		            }
		            
		        }
		        return increasing;
		    }

}
