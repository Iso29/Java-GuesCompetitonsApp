package main;

import config.Config;
import util.MenuUtil;

public class Main {
	public static void main(String[] args) throws Exception {
		Config.initialize();
		MenuUtil.showAllMenu();
	}
}
