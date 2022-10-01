package service;

import serviceInter.MenuServiceUnknownInter;

public class MenuServiceUnknown implements MenuServiceUnknownInter{

	@Override
	public void processAbstract() {
		System.out.println("Operation is not defined");
		
	}

}
