package com.savefile;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
	public static void saveOutput(Object[] output, String fileName) {
		
        try (FileWriter fileWriter = new FileWriter(fileName)) {
        	fileWriter.write("Outputs :-\n\n");
            for (int i = 0; i < output.length; i++) {
                fileWriter.write(output[i] + "\n");
            }
            System.out.println("Saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
