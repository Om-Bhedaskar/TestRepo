package com.user.serviceImpl;

import java.util.Scanner;

import com.user.constant.Constant;
import com.user.model.User;
import com.user.service.UserService;
import com.user.validaton.Validators;

public class UserServiceImpl implements UserService {

	Scanner sc = new Scanner(System.in);
	private User[] users = new User[Constant.max_Size];
	private int count = 0;

	@Override
	public void createUser() {
		if (count >= Constant.max_Size) {
			System.out.println("Storage full! Maximum " + Constant.max_Size + " users allowed.");
			return;
		}

		int uid = Validators.readUid();
		for (int i = 0; i < count; i++) {
			if (users[i].getUid() == uid) {
				System.out.println("User with this UID already exists.");
				return;
			}
		}

		User user = new User();
		user.setUid(uid);
		user.setUname(Validators.readName());
		user.setAddress(Validators.readAddress());
		user.setMobileno(Validators.readMobile());
		user.setAddharcard(Validators.readAadhar());
		user.setPancard(Validators.readPan());
		user.setEmail(Validators.readEmail());

		users[count++] = user;
		System.out.println("User created successfully.");
	}

	@Override
	public void displayUserInfo() {
		for (int i = 0; i < users.length; i++) {

			if (users[i] != null) {
				System.out.println(users[i]);

			}

		}
	}

	@Override
	public void updateUserInfo() {

		System.out.println("Enter user Id : ");
		int uid = sc.nextInt();

		for (int i = 0; i < count; i++) {
			if ((users[i] != null) && users[i].getUid() == uid) {

				System.out.println("Which field do you want to update?");
				System.out.println("1. Name");
				System.out.println("2. Address");
				System.out.println("3. Mobile Number");
				System.out.println("4. Email");
				System.out.print("Enter your choice: ");

				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					users[i].setUname(Validators.readName());
					System.out.println("Name updated successfully.");
					break;

				case 2:
					users[i].setAddress(Validators.readAddress());
					System.out.println("Address updated successfully.");
					break;

				case 3:
					users[i].setMobileno(Validators.readMobile());
					System.out.println("Mobile number updated successfully.");
					break;

				case 4:
					users[i].setEmail(Validators.readEmail());
					System.out.println("Email updated successfully.");
					break;

				default:
					System.out.println("Invalid choice.");
				}

			} else {
				System.out.println("User not found.");
			}
		}

	}

	@Override
	public void deleteUserInfo() {
		System.out.println("Enter User Id :");
		int uid = sc.nextInt();
		for (int i = 0; i < users.length; i++) {
			if ((users[i] != null) && users[i].getUid() == uid) {
				users[i] = null;
				System.out.println("User deleted successfully.");
				break;
			} else {
				System.out.println("User not found.");
			}
		}

	}
}
