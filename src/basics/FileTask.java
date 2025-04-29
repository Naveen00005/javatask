package basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import utils.CustomExceptions;
import utils.UtilTask;

public class FileTask {
		
public String writeLinesToFile(String fileName, String[] lines) throws IOException, CustomExceptions   {
	UtilTask.validateNull(fileName);
	UtilTask.validateNull(lines);
FileWriter writer = new FileWriter(fileName);
 for (String line : lines) {
 writer.write(line + "\n");
 }
writer.close();
return "Successfully written to the file.";
}

public void createDirectoryIfNotExists(String dirPath) throws CustomExceptions {
try {
File dir = new File(dirPath);
if (!dir.exists()) {
boolean created = dir.mkdir();
if (!created) {
throw new CustomExceptions("Failed to create directory: " + dirPath);
}
}
}catch(Exception e) {
	throw new CustomExceptions("Exception while creating directory: " + e.getMessage());
	}
}


public static class Singleton {
private static Singleton instance;
private Singleton() {
}
public static Singleton getInstance() {
if (instance == null) {
instance = new Singleton();
}
return instance;
}
public String getMessage() {
return "Singleton Message!";
}
}

}