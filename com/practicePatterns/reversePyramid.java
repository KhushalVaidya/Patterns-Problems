package com.practicePatterns;
 import java.util.Scanner;
public class reversePyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--) {
			for(int k=1;k<=i;k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
	}

}
