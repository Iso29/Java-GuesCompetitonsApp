package util;

import java.util.Scanner;

import config.Config;

public class MenuUtil {
	public static void showAllMenu() throws Exception {
		if(Config.isLoggedIn()) {
			System.out.println("Select operation : \n");
			Menu.showMenu();
			Scanner sc = new Scanner(System.in);
			int selectedNumber = sc.nextInt();
			Menu selectedMenu = Menu.chooseMenu(selectedNumber);
			selectedMenu.process();
		}
		else {
			Menu.Login.process();
		}
	}
}
