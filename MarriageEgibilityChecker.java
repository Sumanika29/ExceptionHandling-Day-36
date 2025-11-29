package com.codegnan.exceptions;

public class MarriageEgibilityChecker {
	public void checkEligibility(int age) throws TooYoungException, TooOldException {
		if(age<18) {
			throw new TooYoungException("Marriage cannot be approved: age is below 18 years");
		}else {
			if(age>60) {
				throw new TooOldException("Marriage cannot be approved: age is above 60 years");
			}else {
				System.out.println("Marriage Approved! Details will be processed soon");
			}
		}
	}

	public static void main(String[] args) {
		MarriageEgibilityChecker checker=new MarriageEgibilityChecker();
		try {
			checker.checkEligibility(65);
		} catch (TooYoungException | TooOldException e) {
			e.printStackTrace();
		}

	}

}
