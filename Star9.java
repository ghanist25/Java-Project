package com.groot;
import java.util.Scanner;

public class Star9 {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of rows:");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=a;j++) {
			if(i==1||i==a||j==1||j==a||i==j||j==a-i+1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}System.out.println();
	}
}
}
