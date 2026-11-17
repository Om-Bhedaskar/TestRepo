package com.user.validaton;

import java.util.Scanner;

public class Validators {

	public static Scanner sc = new Scanner(System.in);

	public static int readUid() {
		while (true) {
			System.out.print("Enter UID: ");
			String s = sc.nextLine().trim();
			if (s.matches("\\d{1,9}") && Integer.parseInt(s) > 0) {
				return Integer.parseInt(s);
			}
			System.out.println("Invalid UID. Enter a positive number.");
		}
	}

	public static String readName() {
		while (true) {
			System.out.print("Enter name: ");
			String s = sc.nextLine().trim();
			if (s.matches("[A-Za-z ]{2,50}")) {
				return s;
			}
			System.out.println("Invalid name (letters and spaces only).");
		}
	}

	public static String readAddress() {
		while (true) {
			System.out.print("Enter address: ");
			String s = sc.nextLine().trim();
			if (!s.isEmpty()) {
				return s;
			}
			System.out.println("Address cannot be empty.");
		}
	}

	public static String readMobile() {
		while (true) {
			System.out.print("Enter mobile no (10 digits): ");
			String s = sc.nextLine().trim();
			if (s.matches("[6-9]\\d{9}")) {
				return s;
			}
			System.out.println("Invalid mobile number.");
		}
	}

	public static String readAadhar() {
		while (true) {
			System.out.print("Enter Aadhar card no (12 digits): ");
			String s = sc.nextLine().trim();
			if (s.matches("[2-9]\\d{11}")) {
				return s;
			}
			System.out.println("Invalid Aadhar number.");
		}
	}

	public static String readPan() {
		while (true) {
			System.out.print("Enter PAN card no (e.g. ABCDE1234F): ");
			String s = sc.nextLine().trim().toUpperCase();
			if (s.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
				return s;
			}
			System.out.println("Invalid PAN number.");
		}
	}

	public static String readEmail() {
		while (true) {
			System.out.print("Enter email: ");
			String s = sc.nextLine().trim();
			if (s.matches("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$")) {
				return s;
			}
			System.out.println("Invalid email.");
		}
	}
}
