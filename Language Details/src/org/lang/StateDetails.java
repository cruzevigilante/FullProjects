package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("southindia speaks english and tamil");
		

	}
	public void northIndia() {
		System.out.println("north india speaks english and hindi");
	

	}
	public static void main(String[] args) {
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		
		
	}

}
