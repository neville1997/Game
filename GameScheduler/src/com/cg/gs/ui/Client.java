package com.cg.gs.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.gs.beans.Game;
import com.cg.gs.beans.Player;
import com.cg.gs.service.ServiceLayer;
import com.cg.gs.service.ServiceLayerImp;

public class Client {

	public static void main(String[] args) {
		ServiceLayer ser = new ServiceLayerImp();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
		System.out.println("Menu");
		System.out.println("1. Add Player");
		System.out.println("2. Add Game");
		System.out.println("3. Add Day");
		System.out.println("4. Get Player Information");
		System.out.println("5. Get Game Information");
		System.out.println("6. Get Day Information");
		System.out.println("7. Exit Application");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Player Name: ");
			String name1 = sc.next();
			break;
		case 2:
			System.out.println("Enter Game Name: ");
			String name2 = sc.next();
			Game game2 = new Game(name2);
			break;
		case 3:
			System.out.println("Enter Day: ");
			String name3 = sc.next();
//			Day day = new Day(name3, games);
			break;
		case 4:
			System.out.println("Enter Player Name: ");
			String name4 = sc.next();
			break;
		case 5:
			System.out.println("Enter Game Name: ");
			String name5 = sc.next();
			break;
		case 6:
			System.out.println("Enter Day: ");
			String name6 = sc.next();
			break;
		default:
			System.out.println("Invalid Input! Please enter a digit from 1-7");
		}
	} while(choice!=7);
	System.out.println("Thank You for using the application");		
	sc.close();
	}

}
