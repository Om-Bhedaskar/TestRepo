package com.user.controller;

import java.util.Scanner;

import com.user.service.UserService;
import com.user.serviceImpl.UserServiceImpl;
import com.user.validaton.Validators;

public class UserController {

	
	public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== User Management =====");
            System.out.println("1. Create user");
            System.out.println("2. Display user");
            System.out.println("3. Update user");
            System.out.println("4. Delete user");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.createUser();
                    break;
                case 2:
                    service.displayUserInfo();
                    break;
                case 3:
                    service.updateUserInfo();
                    break;
                case 4:
                    service.deleteUserInfo();
                    break;
                case 5:
                    System.out.println("Thank you. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}


