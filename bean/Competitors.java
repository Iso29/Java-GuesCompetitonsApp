package bean;

import simpleAnnotationProcessor.WritingStyleForCompetitior;

public class Competitors extends Person {
	@WritingStyleForCompetitior
	public String competitiorID ;
	public Competitors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Competitors(String name, String surname, String eMail, int age) {
		super(name, surname, eMail, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName() + "  " + getSurname() ;
	}
	
	
	
}
