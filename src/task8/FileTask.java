package task8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
//import task8.UtilTask;
//import task8.CustomExceptions;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

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
}
}

public enum RainbowColor {
    VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
private final int colorCode;
RainbowColor(int code) {
this.colorCode = code;
}
public int getColorCode() {
 return colorCode;
}
}

public LocalDateTime getCurrentDateTime() {
 return LocalDateTime.now();
}
public long getCurrentTimeInMillis() {
    return System.currentTimeMillis();
}
public ZonedDateTime getTimeInZone(String zoneId) {
    return ZonedDateTime.now(ZoneId.of(zoneId));
}
public String getWeekDayFromMillis(long millis) {
	LocalDate today = LocalDate.now();
    DayOfWeek dayOfWeek = today.getDayOfWeek();
    return dayOfWeek.toString();
   }
public String getMonthFromMillis(long millis) {
    Instant instant = Instant.ofEpochMilli(millis);
    return instant.atZone(ZoneId.systemDefault()).getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
}
public int getYearFromMillis(long millis) {
    Instant instant = Instant.ofEpochMilli(millis);
    return instant.atZone(ZoneId.systemDefault()).getYear();
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