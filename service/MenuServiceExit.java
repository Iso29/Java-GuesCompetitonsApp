package service;

import serviceInter.MenuServiceExitInter;

public class MenuServiceExit implements MenuServiceExitInter{

	@Override
	public void processAbstract() {
		System.out.println("exit");
		System.exit(0);
		
	}

}
