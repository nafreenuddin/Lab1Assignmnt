package com.lab.Assignments;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerOfTwoMain{ 
	
	 public  boolean powerOfTwo(int n)
	 {
	  while(n%2==0)
	  {
	   n=n/2;
	  }
	  if(n==1)
	  {
	   return true;
	  }
	  else
	  {
	   return false;
	  }
	 }
	  public static void main(String[] args)throws Exception {
		  PowerOfTwoMain pt = new PowerOfTwoMain();
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter The Number");
		  String s = br.readLine();
		  int n = Integer.parseInt(s);
		 System.out.println( pt.powerOfTwo(n));
		  
		 }
}
