package org.all;

import org.telgu.Telgu;

public class LanguageClass extends Telgu {
	public void alllanguage() {
		System.out.println("All Languages : Tamil,English,Telgu");
	}

	public static void main(String[] args) {

		LanguageClass lc = new LanguageClass();
		lc.alllanguage();
		lc.tamillanguage();
		lc.englishlanguage();
		lc.telgulanguage();

	}
}
