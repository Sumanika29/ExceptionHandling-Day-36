package com.codegnan.exceptions;

import java.util.Scanner;

public class NumberChecker {
	public static String checkPositive(int a) {
		try {
			if(a>0)
			return "valid";
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException();
		}
		return "IllegalArgumentException";
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 try {
		String result=checkPositive(a); 
		System.out.println(result);
	 }catch(Exception e) {
		 System.out.println("IllegalArgumentException");
	 }
	 sc.close();

	}

}
