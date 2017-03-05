package com.exeption.assignment2;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) throws NegetiveAgeExeption {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scr.next();
		System.out.println("Enter the age");
		int age = scr.nextInt();
		try {
			if (age < 0) {
				throw new NegetiveAgeExeption();
			} else {
				System.out.println(" Enterd name is :" + name);
				System.out.println("Enterd age is :" + age);
			}
		} catch (NegetiveAgeExeption ex) {
			System.out.println("age cannot be less than negetive");
		}

	}

}
