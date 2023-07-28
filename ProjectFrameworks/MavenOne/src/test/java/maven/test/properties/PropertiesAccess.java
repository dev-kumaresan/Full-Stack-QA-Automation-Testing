package maven.test.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesAccess {

	public static void main(String[] args) throws IOException {

		File file = new File("/home/kumaresan/git/Full-Stack-QA-Automation-Testing/ProjectFrameworks/MavenOne/src/test/resources/credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();
		p.load(fis);
		String name = p.getProperty("name");
		String age = p.getProperty("age");
		System.out.println(name);
		System.out.println(age);
		

	}

}
