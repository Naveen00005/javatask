package task8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import utils.CustomExceptions;
import utils.UtilTask;

public class PropertiesTask {
	
public String savePropertiesToFile(String fileName1, Properties props) throws IOException, CustomExceptions {
	UtilTask.validateNull(fileName1);
	UtilTask.validateNull(props);
try (FileOutputStream out = new FileOutputStream(fileName1)) {
props.store(out, "stored propertis to myprops.txt ");
}
return "Properties successfully saved";
}

public Properties loadPropertiesFromFile(String fileName) throws IOException, CustomExceptions {
UtilTask.validateNull(fileName);
Properties props = new Properties();
try (FileInputStream in = new FileInputStream(fileName)) {
props.load(in);
}
return props;
}

}
