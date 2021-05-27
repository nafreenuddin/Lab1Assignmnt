package com.lab.Assignments;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PrimInteger {
	 public static void main(String[] args) throws Exception
	 {
	     int i,j,count=0;
	 System.out.println("prime number between 1 to 100\n");
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter The Number");
	 String s = br.readLine();
	 int n = Integer.parseInt(s);
	 for(i=2;i<=n;i++)
	 {
	 for(j=1;j<=i;j++)
	 {
	 if(i%j==0)
	 count++;
	 }
	 if(count==2)
		 System.out.print(" "+i);
	 count=0;
	 }
	 }
}
