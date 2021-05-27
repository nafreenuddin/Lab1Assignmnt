package com.lab.Assignments;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateSum {
	int sum = 0;
		public int CulculateNumber(int n) {
			for(int i = 1;i<=n;i++) {
				if(i%3==0 || i%5==0) {
					System.out.println(i);
					int count = i ; 
					sum = sum + count ;
				}	
			}
				System.out.println("the of natural number divisible by 3 and 5: " +sum);
			    return sum ;
		}
	public static void main(String[] args) throws Exception{	
		CalculateSum cs = new CalculateSum();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number");
		String s = br.readLine();
	     int n = Integer.parseInt(s);
		cs.CulculateNumber(n);
	}

}


