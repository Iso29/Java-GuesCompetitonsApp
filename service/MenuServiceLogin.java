package service;

import java.util.Scanner;

import config.Config;
import serviceInter.MenuServiceLoginInter;
import util.Menu;

public class MenuServiceLogin implements MenuServiceLoginInter{

	
	@Override
	public void processAbstract() throws Exception {
		System.out.println("Enter username");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		
		
		System.out.println("Enter password");
		Scanner sc1 = new Scanner(System.in);
		String password = sc1.nextLine();
		
		if(Config.getCount()<2) {
			if(username.equals("Sarkhan") && password.equals("12345")) {
				Config.setLoggedIn(true);
				System.out.println("Login succesfully");
			}
			else {
				System.out.println("Incorrect username or password");
				Config.setCount();
			}
		}
		else {
			System.out.println("you banned");
			Menu.Exit.process();
		}
		
		
			
	}

}
