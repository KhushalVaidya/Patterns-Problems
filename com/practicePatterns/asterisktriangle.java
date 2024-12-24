package com.practicePatterns;

import java.util.Scanner;

public class asterisktriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
		System.out.println();
	}}
}
