package basics;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimeTask {
public LocalDateTime getCurrentDateTime() {
		 return LocalDateTime.now();
		}
	
public long getCurrentTimeInMillis() {
		    return System.currentTimeMillis();
		}
		
public ZonedDateTime getTimeInZone(String zoneId) {
		    return ZonedDateTime.now(ZoneId.of(zoneId));
		}
		
public String getWeekDayFromMillis() {
			LocalDate today = LocalDate.now();
		    DayOfWeek dayOfWeek = today.getDayOfWeek();
		    return dayOfWeek.toString();
		   }

public String getMonthFromMillis(long millis, Locale language) {
    Instant instant = Instant.ofEpochMilli(millis);
    
    return instant.atZone(ZoneId.systemDefault()).getMonth().getDisplayName(TextStyle.FULL, language);
}

public int getYearFromMillis(long millis) {
		    Instant instant = Instant.ofEpochMilli(millis);
		    return instant.atZone(ZoneId.systemDefault()).getYear();
		}
}
