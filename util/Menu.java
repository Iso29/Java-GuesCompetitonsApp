package util;

import service.MenuServiceExit;
import service.MenuServiceLogin;
import service.MenuServiceLogout;
import service.MenuServiceRegister;
import service.MenuServiceStartApp;
import service.MenuServiceUnknown;
import servicePprocess.Process;

public enum Menu {
	Login(0,"Login",new MenuServiceLogin()),
	RegisterCompetitors(1,"Register Competitiors",new MenuServiceRegister()), 
	StartCompetition(2,"Start Competition",new MenuServiceStartApp()), 
	Logout(3,"Logout",new MenuServiceLogout()),
	Exit(4,"Exit",new MenuServiceExit()),
	Unkwon(new MenuServiceUnknown());
	
	private int position;
	private Process service;
	private String label;

	Menu(Process service) {
		this.service=service;
	}
	
	Menu(int position,String label,Process service){
		this.position=position;
		this.label=label;
		this.service= service;
	}
	
	public void process() throws Exception {
		service.process();
		MenuUtil.showAllMenu();
	}
	
	public String toString() {
		return label;
	}
	
	public static void showMenu() {
		Menu[] menus = Menu.values();
		for(int i=0;i<menus.length-1;i++) {
			if(menus[i]!=Menu.Login) {
				System.out.println(i+"."+menus[i]);
			}
		}System.out.println("\n");
	}
	
	public static Menu chooseMenu(int n) {
		Menu[] menus = Menu.values();
		for(int i=1;i<menus.length;i++) {
			if(menus[i].position==n) {
				return menus[i];
			}
		}return Unkwon;
	}
	
	
	
}
