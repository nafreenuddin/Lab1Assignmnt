package com.lab.Assignments;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class DifferenceOfNumbers{
public int Difference(int n) {
	
    int sumSquareNaturalNumbers = (n * (n + 1) * (2 * n + 1)) / 6;
    int sumNaturalSqaures = (n * (n + 1)) / 2;
    int squareSumN =sumNaturalSqaures * sumNaturalSqaures;
    return Math.abs(sumSquareNaturalNumbers  - squareSumN);
 }
	public static void main(String[] args)throws Exception {
		DifferenceOfNumbers NB = new DifferenceOfNumbers();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		String s = br.readLine();
		int n = Integer.parseInt(s);
		System.out.println("Number: " + n);
	     System.out.println("Difference: " + NB.Difference(n));
	}
}

