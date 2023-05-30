package task.files;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileIO {
	public static void main(String[] args) throws IOException {
		File file = new File("");
		System.out.println(file.mkdir());

		File file1 = new File("");
		boolean createNewFile = file1.createNewFile();
		System.out.println(createNewFile);

		FileUtils f = new FileUtils();
		f.write(file1, "October java Batch Six");

		System.out.println(f.readFileToString(file1));

		File file2 = new File("E://FileOperation//selenium.txt");
		boolean createNewFile2 = file2.createNewFile();
		System.out.println(createNewFile2);

		f.copyFile(file1, file2);

	}

}