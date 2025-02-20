package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


public class UtilTask{

//stringbuilder

public static void validateNullString(Object input)throws CustomExceptions {
if (input == null) {
 throw new CustomExceptions("Input cannot be null.");
}
}

public static int lengthOfTheString(String stringLength) throws CustomExceptions {
 validateNullString(stringLength);
 return stringLength.length();
}

public static char[] convertIntoCharacterArray(String character) throws CustomExceptions {
 validateNullString(character);
 return character.toCharArray();
}

public static int getLength(StringBuilder sb) throws CustomExceptions{
 validateNullString(sb);
 return sb.length();
}

public static void validateIndices(int initial, int end, int length) throws CustomExceptions {
 if (initial < 0 || end < 0 || initial > end || end > length) {
 throw new CustomExceptions("Invalid indices: initial = " + initial + ", end = " + end);
}
}

//string
public static void validatePosition(int position, int length) throws CustomExceptions {
 if (position <= 0 || position > length) {
 throw new CustomExceptions("Position must be greater than zero and less than or equal to the length of the string.");
 }
}

//hashmap

public static <K,V> int findSize(Map<K,V> hashmap) throws CustomExceptions  {
validateNullString(hashmap); 
return hashmap.size();
}

public static <K,V> Map<K,V> createHashMap(){
Map<K,V> map = new HashMap<>();
return map;
}

//ArrayList

public static <T> int findSize(List<T> arrayList)throws CustomExceptions{
validateNullString(arrayList);
return arrayList.size();
}

public static <T> List<T> createArrayList(){
List<T> array = new ArrayList<>();
return array;
}

}