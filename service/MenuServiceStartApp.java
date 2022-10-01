package service;

import java.util.Random;
import java.util.Scanner;

import bean.Competitors;
import config.Config;
import serviceInter.MenuServiceStartCompetitionInter;

public class MenuServiceStartApp implements MenuServiceStartCompetitionInter {

	@Override
	public void processAbstract() {
		System.out.println("starting compatition... \n");
		Competitors[] cps =Config.createObj().getCompetitiors();
		if(cps.length>1) {
			System.out.println("Enter your guess");
			Scanner sc = new Scanner(System.in);
			int guess = sc.nextInt();
			Random r = new Random(cps.length);
			int position = r.nextInt(cps.length);
			int winner = position+1;
			if(guess==winner) {
				System.out.println("winner is  "+(winner)+". "+cps[position]+"\n you chose right person");
			}
			else {
				System.out.println("winner is  "+(winner)+". "+cps[position]+"\n Ypur guess is wrong");
			}


		}
		else {
			System.out.println("There is not enough person to start competition");
		}
		
	}

}
