package basics;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.time.ZonedDateTime;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Logger;

import basics.FileTask.RainbowColor;

import java.util.logging.Level;

public class FileRunner {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
FileTask filetask = new FileTask(); 
final Logger LOGGER = Logger.getLogger(FileRunner.class.getName() );
PropertiesTask propertytask = new PropertiesTask();

int choice;
try{
do{
	LOGGER.info("\nSelect a task to perform::");
	LOGGER.info("1. Create & write to sample.txt\n" +"2. Store Properties\n" +"3. Load Properties\n" +"4. Repeat tasks under /home/INC*/myDir\n" +"5. CustomStringHolder\n" +"6. POJO with constructor\n" +"7. POJO with default + setters\n" +"8. Reflection POJO\n" +"9. Rainbow enum\n" +"10. Singleton class\n" +"11. Date & Time tasks\n" +"12. LOGGER\n" +"0. Exit");

choice = scanner.nextInt();scanner.nextLine();
switch (choice)
{
case 1:

try {
	LOGGER.info("How many lines would you like to write to the file? ");
int numLines = scanner.nextInt();scanner.nextLine();
String[] lines = new String[numLines];
 for (int i = 0; i < numLines; i++) {
 LOGGER.info("Enter Line " + (i + 1) + ": ");
 lines[i] = scanner.nextLine();
 }
String fileName = "sample.txt";
String result = filetask.writeLinesToFile(fileName, lines);
LOGGER.info(result);
} catch (Exception e) {
LOGGER.log(Level.SEVERE,"An error occurred while writing to the file: " + e.getMessage());
}
break;

case 2:
try
{
LOGGER.info("Enter the number of values to add ");
int number = scanner.nextInt();scanner.nextLine();
Properties props = new Properties();
for (int i = 1; i <= number; i++) {
LOGGER.info("Enter key " + i + ": ");
String key = scanner.nextLine();
LOGGER.info("Enter value " + i + ":");
String value = scanner.nextLine();
props.setProperty(key, value);
}
String fileName1 = "myprops.txt";
String result1 = propertytask.savePropertiesToFile(fileName1, props);
LOGGER.info(result1);
} catch (Exception e) {
LOGGER.log(Level.SEVERE,"Error saving properties: " + e.getMessage());
}
break;

case 3:
try {
LOGGER.info("/nloading property from file");
String fileNameToRead = "myprops.txt";
Properties loadedProps = propertytask.loadPropertiesFromFile(fileNameToRead);
LOGGER.info("\nLoaded properties from file (value):");
for (String key : loadedProps.stringPropertyNames()) {
LOGGER.info(loadedProps.getProperty(key));
}
} catch (Exception e) {
LOGGER.log(Level.SEVERE,"Error reading properties: " + e.getMessage());
}
break;

case 4:
try {   
String baseDir = null ;//"C:\\Users\\91801\\Desktop\\eclipse\\task8\\src\\task8";
filetask.createDirectoryIfNotExists(baseDir);
LOGGER.info("How many lines would you like to write to the file? ");
int numLines = scanner.nextInt();scanner.nextLine();
String[] lines = new String[numLines];
 for (int i = 0; i < numLines; i++) {
 LOGGER.info("Enter Line " + (i + 1) + ": ");
 lines[i] = scanner.nextLine();
 }
String fullSamplePath = baseDir + "/sample.txt";
LOGGER.info(filetask.writeLinesToFile(fullSamplePath, lines));

LOGGER.info("Enter the number of values to add ");
int number = scanner.nextInt();scanner.nextLine();
Properties props = new Properties();
for (int i = 1; i <= number; i++) {
LOGGER.info("Enter key " + i + ": ");
String key = scanner.nextLine();
LOGGER.info("Enter value " + i + ":");
String value = scanner.nextLine();
props.setProperty(key, value);
}
String fullPropsPath = baseDir + "/myprops.txt";
propertytask.savePropertiesToFile(fullPropsPath, props);
LOGGER.info("\nReading from " + fullPropsPath + ":");
Properties loadedProps =  propertytask.loadPropertiesFromFile(fullPropsPath);
LOGGER.info("\nLoaded properties from file (value):");
for (String key : loadedProps.stringPropertyNames()) {
LOGGER.info(loadedProps.getProperty(key));
}
} catch (Exception e) {
LOGGER.log(Level.SEVERE, e.getMessage());
}
break;

case 5:
try {
LOGGER.info("Enter a string to pass to the object: ");
String inputString = scanner.nextLine();
CustomStringHolderTask holder = new CustomStringHolderTask(inputString);
LOGGER.info("Printing the object: " + holder);
} catch (Exception e) {
LOGGER.log(Level.SEVERE, e.getMessage());
}
break;

case 6:
try {
LOGGER.info("POJO Constructor Case");
System.out.print("How many persons do you want to create? ");
int count = scanner.nextInt();scanner.nextLine();
for (int i = 1; i <= count; i++) {
System.out.print("Enter name for person " + i + ": ");
String name = scanner.nextLine();
System.out.print("Enter age for person " + i + ": ");
int age = scanner.nextInt(); scanner.nextLine();
PojoTask pojo = new PojoTask(name, age);
LOGGER.info("Person " + i + ": " + pojo); 
}
} catch (Exception e) {
LOGGER.log(Level.SEVERE,"Error creating PersonDetails object: " + e.getMessage());
}
break;

case 7:
try {
LOGGER.info("Using Default Constructor and Setters");
LOGGER.info("How many persons do you want to enter? ");
int count = scanner.nextInt();scanner.nextLine();
for (int i = 1; i <= count; i++) {
PojoTask pojo = new PojoTask();
LOGGER.info("Enter name " + i + ": ");
pojo.setName(scanner.nextLine());
LOGGER.info("Enter age " + i + ": ");
pojo.setAge(scanner.nextInt());scanner.nextLine();
LOGGER.info("Person " + i + ": Name = " + pojo.getName() + ", Age = " + pojo.getAge());
}
} catch (Exception e) {
LOGGER.log(Level.SEVERE,e.getMessage());
}
break;

case 8:
try {
	Class<?> pojoReflection = Class.forName("task8.PojoTask");

	Object obj1 = pojoReflection.getDeclaredConstructor().newInstance();
	LOGGER.info("Default Constructor: " + obj1);

	Constructor<?> paramConstructor = pojoReflection.getConstructor(String.class, int.class);
	Object obj2 = paramConstructor.newInstance("Naveen", 25);
	LOGGER.info("Overloaded Constructor: " + obj2);

	Method setName = pojoReflection.getMethod("setName", String.class);
	setName.invoke(obj2, "Updated Naveen");

	Method getName = pojoReflection.getMethod("getName");
	Object nameValue = getName.invoke(obj2);
	LOGGER.info("Name after update: " + nameValue);
} catch (Exception e) {
LOGGER.log(Level.SEVERE,e.getMessage());
}
break;

case 9:
try {
LOGGER.info("Rainbow Colors with Codes:");
for (RainbowColor color : RainbowColor.values()) {
LOGGER.info("Color: " + color +", Code: " + color.getColorCode() +", Ordinal: " + color.ordinal());
}
} catch (Exception e) {
LOGGER.log(Level.SEVERE,e.getMessage());
}
break;

case 10:
try {
FileTask.Singleton singleton1 = FileTask.Singleton.getInstance();
FileTask.Singleton singleton2 = FileTask.Singleton.getInstance();
LOGGER.info(singleton1.getMessage());
if (singleton1 == singleton2) {
LOGGER.info("Only one instance exists.");
} else {
LOGGER.info("Different instances exist!");
}
}catch (Exception e) {
	LOGGER.log(Level.SEVERE,e.getMessage());
}
break;

case 11:
try {
	LOGGER.info("Current DateTime: " + filetask.getCurrentDateTime());
	LOGGER.info("Current Time in Millis: " + filetask.getCurrentTimeInMillis());
	LOGGER.info("Enter  time zone (e.g., America/New_York): ");
    String zone = scanner.nextLine();	
    ZonedDateTime time = filetask.getTimeInZone(zone);
    LOGGER.info("Time in " + zone + ": " + time);
    long millis = filetask.getCurrentTimeInMillis();
    LOGGER.info("Weekday: " + filetask.getWeekDayFromMillis(millis));
    LOGGER.info("Month: " + filetask.getMonthFromMillis(millis));
    LOGGER.info("Year: " + filetask.getYearFromMillis(millis));
}catch (Exception e) {
	LOGGER.log(Level.SEVERE,e.getMessage());
}
break;


case 0:
LOGGER.info("Exiting...");
break;
default:
LOGGER.info("Invalid choice. Please try again.");
}
}while(choice !=0);
} finally {
scanner.close();
}
}}