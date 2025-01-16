package com.matthew.main;

import java.util.Scanner;

import com.matthew.exceptions.EvenNumberExceptions;

public class Simulation {

	public static void main(String[] args) {
		try {
			getInput();
		} catch (EvenNumberExceptions e) {
			e.printStackTrace();
		}
	}

	public static void getInput() throws EvenNumberExceptions {

		Scanner in = new Scanner(System.in);

		// get input from user
		System.out.println("Type in a number and press Enter...");
		String line = in.nextLine();
		System.out.println("You've typed: " + line);

		// test if number is even, throw exception if true
		if (isEven(line)) {
			throw new EvenNumberExceptions();
		}
		// close resources
		in.close();
	}

	public static boolean isEven(String num) {
		// convert value to a number
		int value = Integer.parseInt(num);

		return (value % 2 == 0);
	}
}
