package service;

import java.util.Scanner;

import bean.Competitors;
import config.Config;
import main.MyException;
import serviceInter.MenuServiceRegisterCompetitiorsInter;
import writeToFileMethod.Methods;

public class MenuServiceRegister implements MenuServiceRegisterCompetitiorsInter{

	@Override
	public void processAbstract() throws Exception{
 		System.out.println("How many person will take part in competition ?");
 		Scanner sc = new Scanner(System.in);
 		int num = sc.nextInt();
 		for(int i=0;i<num;i++) {
 			System.out.println("\n Enter name of competitior");
 			Scanner sc1 = new Scanner(System.in);
 			String name = sc1.nextLine();
 			
 			System.out.println("\n Enter surname of competitior");
 			Scanner sc2 = new Scanner(System.in);
 			String surname = sc2.nextLine();
 			
 			System.out.println("\n Enter age of competitior");
 			Scanner sc3 = new Scanner(System.in);
 			int age = sc3.nextInt();
 			
 			System.out.println("\n Enter e-mail of competitior");
 			Scanner sc4 = new Scanner(System.in);
 			String eMail = sc4.nextLine();
 			
 			Competitors cp = new Competitors(name,surname,eMail,age);
 			Config.createObj().appendCompetitors(cp);
 		}
 		
		System.out.println("Registration is completed ");
		
	}

}
