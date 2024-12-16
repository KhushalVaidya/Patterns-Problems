package com.practicePatterns;

import java.util.Scanner;

public class pyramid {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
