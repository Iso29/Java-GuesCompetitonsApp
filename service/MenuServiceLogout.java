package service;

import config.Config;
import serviceInter.MenuServiceLogoutInter;
import util.Menu;

public class MenuServiceLogout implements MenuServiceLogoutInter{

	@Override
	public void processAbstract() {
		Config.setLoggedIn(false);
		System.out.println("logged out");
		
	}

}
