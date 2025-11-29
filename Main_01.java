package com.codegnan.exceptions;

import java.util.Scanner;

public class Main_01 {
	public static int parseNumber(String str) {
		try {
			return Integer.parseInt(str);

		} catch (NumberFormatException e) {
			throw new NumberFormatException();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			int result = parseNumber(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("NumberFormatException");
		}
		sc.close();

	}
}
