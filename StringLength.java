package com.codegnan.exceptions;

import java.util.Scanner;

public class StringLength {
	public static int getLength(String str) {
		try {
			return str.length();
		}catch(NullPointerException e) {
			throw new NullPointerException();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		try {
			int result=getLength(str);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("NullPointerException");
		}
		sc.close();

	}

}
