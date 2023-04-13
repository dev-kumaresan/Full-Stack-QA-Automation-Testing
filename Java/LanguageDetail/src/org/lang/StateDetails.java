package org.lang;

public class StateDetails {
		public void southIndia()
		{
			System.out.println("South india : Tamilnadu");
		}
		public void northIndia()
		{
			System.out.println("North india : Jammu");
		}
	public static void main(String[] args) {
		StateDetails SD = new StateDetails();
        LanguageInfo LI = new LanguageInfo();
        LI.tamilLanguage();
        LI.englishLanguage();
        LI.hindiLanguage();
        SD.southIndia();
        SD.northIndia();
	}

}
