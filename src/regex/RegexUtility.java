package regex;

import java.util.*;
import java.util.regex.*;

public class RegexUtility {

    public static boolean isValidMobileNumber(String mobile) {
        return mobile.matches("^[0-9]{10}$");
    }

    public static boolean isAlphaNumeric(String input) {
        return input.matches("^[a-zA-Z0-9]+$");
    }

    public static boolean startsWith(String given, String match) {
    	Pattern pattern = Pattern.compile("^" + match);
        Matcher matcher = pattern.matcher(given);
        return matcher.find();
        // given.startsWith(match);
    }

    public static boolean contains(String given, String match) {
    	Pattern pattern = Pattern.compile(".*" + match+".*");
        Matcher matcher = pattern.matcher(given);
        return matcher.find();
        //return given.contains(match);
    }
    
    public static boolean endsWith(String given, String match) {
    	Pattern pattern = Pattern.compile(match+"$");
        Matcher matcher = pattern.matcher(given);
        return matcher.find();
       // return given.endsWith(match);
    }

    public static boolean exactMatch(String given, String match) {
    	Pattern pattern = Pattern.compile("^" + match + "$");
        Matcher matcher = pattern.matcher(given);
        return matcher.find();
    	//return given.equals(match);
    }

    public static boolean listContainsIgnoreCase(List<String> list, String match) {
        return list.stream().anyMatch(s -> s.equalsIgnoreCase(match));
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
    }

    public static boolean filterStringsByLength(String str) {
        return str.matches("^[a-zA-Z]{1,6}$");
    }

    public static boolean isMatchIgnoreCase(String value1, String value2) {
    	Pattern pattern = Pattern.compile(value2,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value1);
        return matcher.find();
    	// return value1.equalsIgnoreCase(value2);
    }

    public static List<String> extractHTMLTags(String html) {
        List<String> tags = new ArrayList<>();
        Matcher matcher = Pattern.compile("</?\\w+>").matcher(html);
        while (matcher.find()) {
            tags.add(matcher.group());
        }
        return tags;
    }
}
