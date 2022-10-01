package config;

import java.io.Serializable;

import bean.Competitors;
import bean.User;
import writeToFileMethod.Methods;

public class Config implements Serializable{
	
	private static Config config = null;
	private Competitors[] competitiors = new Competitors[0];
	private static boolean loggedIn ;
	private static int count =0;
	private static final String fileName = "config.obj";
	
	public static void initialize() throws Exception {
		Object obj = Methods.readDeseralizable(fileName);
		if(obj==null) {
			return;
		}
		if((obj instanceof Config)) {
			config = (Config) obj;
		}
	}
	
	public static void save() throws Exception {
		Methods.writeSerializable(Config.createObj(),fileName);
	}
	
	private Config() {
		
	}
	
	public static Config createObj() {
		if(config==null) {
			config = new Config();
		}
		return config;
	}

	public Competitors[] getCompetitiors() {
		return competitiors;
	}

	public void setCompetitiors(Competitors[] competitiors) {
		this.competitiors = competitiors;
	}
	
	public void appendCompetitors(Competitors cp) {
		Competitors[] newCompetitors = new Competitors[competitiors.length+1];
		for(int i=0;i<competitiors.length;i++) {
			newCompetitors[i]=this.competitiors[i];
		}newCompetitors[newCompetitors.length-1]=cp;
		competitiors= newCompetitors;
	}

	public static boolean isLoggedIn() {
		return loggedIn;
	}

	public static void setLoggedIn(boolean loggedIn) {
		Config.loggedIn = loggedIn;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount() {
		Config.count++;
	}
}
