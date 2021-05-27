package com.lab.Assignments;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CubeSeries {
		public int SumOfCube(int n){
			int sum = 0;
			for(int i =0;i<=n;i++) {
				int k = i*i*i;
				sum = sum + k ;
			}
				return sum;
		}
	public static void main(String[] args) throws Exception {
		CubeSeries cs = new CubeSeries();
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter The Number");
		 String s = br.readLine();
		 int n = Integer.parseInt(s);
		 int result = cs.SumOfCube(n);
		 System.out.println("CubeOfSumOfSeries:  "+result);
		 
		 
		
	}

}
