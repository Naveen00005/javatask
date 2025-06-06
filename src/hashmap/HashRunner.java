package hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import utils.UtilTask;

public class HashRunner{
static Scanner scanner = new Scanner(System.in);
public static void main(String args[]){
HashMapTask hashTask = new HashMapTask();
int choice;
try{
do{
System.out.println("\nSelect a operation:");
System.out.println("1.Create an empty HashMap and print its size.  ");
System.out.println("2.Add key-value pairs (String, String) to a HashMap.  ");
System.out.println("3.Add key-value pairs (Integer, Integer) to a HashMap.  ");
System.out.println("4.Add key-value pairs (String, Integer) to a HashMap.  ");
System.out.println("5.Add key-value pairs (String, Custom Object) to a HashMap.  ");
System.out.println("6.Add keys (String) with one null value to a HashMap.  ");
System.out.println("7.Add a null key and a non-null value to a HashMap.  ");
System.out.println("8.Check if a key exists in a HashMap.  ");
System.out.println("9.Check if a value exists in a HashMap.  ");
System.out.println("10.Create a HashMap, update all values, and print before & after.  ");
System.out.println("11.Retrieve the value of an existing key in a HashMap.  ");
System.out.println("12.Retrieve the value of a non-existing key in a HashMap.  ");
System.out.println("13.Retrieve the value of a non-existing key, return a default value, and add it to the HashMap.  ");
System.out.println("14.Remove an existing key from a HashMap.  ");
System.out.println("15.Remove a key only if its value matches the given value.  ");
System.out.println("16.Replace the value of an existing key in a HashMap.  ");
System.out.println("17.Replace the value of an existing key only if its value matches a given value.  ");
System.out.println("18.Transfer all keys and values from one HashMap to another.  ");
System.out.println("19.Iterate over a HashMap and print all its keys and corresponding values.  ");
System.out.println("20.Remove all entries in a HashMap  ");
System.out.println("0. Exit");
System.out.println("Enter you choice...");
choice = scanner.nextInt();scanner.nextLine();
switch (choice)
{
case 1:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println(" Printing the hashmap :" + map );
System.out.println(" Size of the hashmap : " + UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 2:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of values to add ");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.println(" Printing the hashmap :" + map );
System.out.println(" Size of the hashmap : " + UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 3:
try{
Map<Integer,Integer> map = UtilTask.createHashMap();
System.out.println("Enter the number of values to add ");
int number = scanner.nextInt();scanner.nextLine();
for(int i=0 ; i <  number ; i++){ 
 System.out.print("Enter a key (Integer)"+ (i+1) +"= " );
 int key =scanner.nextInt();scanner.nextLine();
 System.out.print("Enter a values (Integer)"+ (i+1) +"= " );
 int value = scanner.nextInt();scanner.nextLine();
 map = hashTask.putMapElement(map,key,value);
}
System.out.println(" Printing the hashmap :" + map );
System.out.println(" Size of the hashmap : " + UtilTask.findSize(map));
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 4:
try{
Map<String,Integer> map = new HashMap<>();
System.out.println("Enter the number of values to add ");
int number = scanner.nextInt();scanner.nextLine();
for(int i=0 ; i <  number ; i++){ 
 System.out.print("Enter a key (String)"+ (i+1) +"= " );
 String key = scanner.nextLine();
 System.out.print("Enter a values (Integer)"+ (i+1) +"= " );
 Integer value = scanner.nextInt();scanner.nextLine();
 map = hashTask.putMapElement(map,key,value);
}
System.out.println(" Printing the hashmap :" + map );
System.out.println(" Size of the hashmap : " +   UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 5:
try{
Map<String, CustomObject> map = new HashMap<>();
System.out.println("Enter the number of values to add ");
int number = scanner.nextInt();scanner.nextLine();
for (int i = 0; i < number; i++) {
 System.out.print("Enter a key (String): ");
 String key = scanner.nextLine();
 System.out.print("Enter name for the Person: ");
 String name = scanner.nextLine();
 System.out.print("Enter age for the Person: ");
 int age = scanner.nextInt();scanner.nextLine();
 CustomObject customObject = new CustomObject(name, age);
 map = hashTask.putMapElement(map, key, customObject);
}
System.out.println(" Printing the hashmap :" + map );
System.out.println(" Size of the hashmap : " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 6:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of keys to add ");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.print("Enter a key (String) for Null value : ");
String key1 = scanner.nextLine();
map.put( key1, null);
System.out.println(" Printing the hashmap :" + map );
System.out.println(" Size of the hashmap : " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 7:
try{
Map<String, String> map = UtilTask.createHashMap();
String key = null;
System.out.print("Enter a value (String) for the null key: ");
String value = scanner.nextLine();
map = hashTask.putMapElement(map, key , value);
System.out.println(" Printing the hashmap :" + map );
System.out.println(" Size of the hashmap : " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 8:
try{
Map<String,String> map =UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.print("Enter the key to check: ");
String keyToCheck = scanner.nextLine();
String exists = hashTask.getValueByKey(map, keyToCheck);
if (exists != null) {
    System.out.println("The key exists in the HashMap. Associated value: " + exists);
} else {
    System.out.println("Key not found.");
}
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 9:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.print("Enter the value to check: ");
String valueToCheck = scanner.nextLine();
boolean exists = hashTask.checkValueExists(map, valueToCheck);
System.out.print(" The Entered the value : "+exists);
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 10:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.println("HashMap before changes: " + map);
System.out.println("Size of HashMap before changes: " +  UtilTask.findSize(map));
for (String key : map.keySet()) {
 System.out.print("Enter a new value for key \"" + key + "\": ");
 String newValue = scanner.nextLine();
 map = hashTask.putMapElement(map, key, newValue);
}
System.out.println("HashMap after changes: " + map);
System.out.println("Size of HashMap after changes: " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 11:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.print("Enter the key to get its value: ");
String keyToGet = scanner.nextLine();

String value = hashTask.getValueByKey(map, keyToGet);
System.out.println("The value for the key \"" + keyToGet + "\" is: " + value);
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 12:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.print("Enter the key to get its value (non-existing key): ");
String keyToGet = scanner.nextLine();
 String value = hashTask.getValueByKey(map, keyToGet);
 System.out.println(value);
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 13:
try{

System.out.print("\nEnter a defaultvalue for non-existing key: ");
String defaultValue = scanner.nextLine();
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
map = getString(map,number);
System.out.print("\nEnter a key to retrieve its value (non-existing key): ");
String searchKey = scanner.nextLine();
System.out.println("\nHashMap before retrieving non-existing key:");
System.out.println("HashMap: " + map);
System.out.println("Size of HashMap: " +  UtilTask.findSize(map));
String value = hashTask.getDefaultValue(map, searchKey, defaultValue);
System.out.println("\nValue retrieved: " + value);
System.out.println("\nHashMap after default value:");
System.out.println("HashMap: " + map);
System.out.println("Size of HashMap: " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 14:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.println("HashMap before removing key: " + map);
System.out.println("Size of HashMap before removing key: " +  UtilTask.findSize(map));
System.out.print("Enter the key to remove: ");
String keyToRemove = scanner.nextLine();
String result = hashTask.removeKey(map, keyToRemove);
// System.out.println(result);
System.out.println("HashMap after removing key: " + map);
System.out.println("Size of HashMap after removing key: " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 15:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.println("HashMap before conditional removal: " + map);
System.out.println("Size of HashMap before conditional removal: " +  UtilTask.findSize(map));
System.out.print("Enter the key to remove: ");
String keyToRemove = scanner.nextLine();
System.out.print("Enter the value to match: ");
String valueToMatch = scanner.nextLine();
map = hashTask.removeKeyIfValueMatches(map, keyToRemove, valueToMatch);
System.out.println("HashMap after conditional removal: " + map);
System.out.println("Size of HashMap after conditional removal: " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 16:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.println("HashMap before replacement: " + map);
System.out.println("Size of HashMap before replacement: " +  UtilTask.findSize(map));
System.out.print("Enter the key to replace its value: ");
String keyToReplace = scanner.nextLine();
System.out.print("Enter the new value: ");
String newValue = scanner.nextLine();
String result = hashTask.replaceValue(map, keyToReplace, newValue);
//System.out.println(result);
if (result == null) {
    System.out.println("Key does not exist in the HashMap.");
}
System.out.println("HashMap after replacement: " + map);
System.out.println("Size of HashMap after replacement: " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 17:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.println("HashMap before replacement: " + map);
System.out.println("Size of HashMap before replacement: " +  UtilTask.findSize(map));
System.out.print("Enter the key to replace its value: ");
String keyToReplace = scanner.nextLine();
System.out.print("Enter the value that must be matched to replace: ");
String oldValue = scanner.nextLine();
System.out.print("Enter the new value to replace with: ");
String newValue = scanner.nextLine();
map = hashTask.replaceValueIfMatch(map, keyToReplace, oldValue, newValue);
System.out.println("HashMap after replacement: " + map);
System.out.println("Size of HashMap after replacement: " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 18:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
Map<String,String> map2 = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int numbers = scanner.nextInt();scanner.nextLine();
 map2 = getString(map2,numbers);
System.out.println(" Before transfer ");
System.out.println("HashMap in map one : " + map);
System.out.println("HashMap in map two : " + map2);
System.out.println("HashMap in map one : " +  UtilTask.findSize(map));
System.out.println("HashMap in map two : " +  UtilTask.findSize(map2));
map = hashTask.transferMap(map,map2);
System.out.println(" After transfer " );
System.out.println("HashMap in map one : " + map);
System.out.println("HashMap in map two : " + map2);
System.out.println("HashMap in map one : " +  UtilTask.findSize(map));
System.out.println("HashMap in map two : " +  UtilTask.findSize(map2));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 19:
try{
Map<String,String> map =UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.println("\nHashMap before iteration:");
System.out.println("HashMap: " + map);
System.out.println("Size of HashMap: " + UtilTask.findSize(map));
System.out.println("\nIterating over the HashMap:");

for (Map.Entry<String, String> entry : map.entrySet()) {
System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
scanner.nextLine();
}
break;

case 20:
try{
Map<String,String> map = UtilTask.createHashMap();
System.out.println("Enter the number of key-value pairs to add:");
int number = scanner.nextInt();scanner.nextLine();
 map = getString(map,number);
System.out.println(" Before remove ");
System.out.println("HashMap in map one : " + map);
System.out.println("HashMap in map one : " +  UtilTask.findSize(map));
map = hashTask.removeAll(map);
System.out.println(" After remove ");
System.out.println("HashMap in map one : " + map);
System.out.println("HashMap in map one : " +  UtilTask.findSize(map));
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage()); 
scanner.nextLine();
}
break;

case 0:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice. Please try again.");
} //switch 
}while(choice !=0);
}
finally {
scanner.close();
}
}

public static Map<String,String> getString(Map<String,String> map, int number) {
HashMapTask hashTask = new HashMapTask();
try{
for(int i=0 ; i <  number ; i++){ 
 System.out.print("Enter a key (String)"+ (i+1) +"= " );
 String key = scanner.nextLine();
 System.out.print("Enter a values (String)"+ (i+1) +"= " );
 String value = scanner.nextLine();
 map = hashTask.putMapElement(map,key, value);
}
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
return map;
}

}



