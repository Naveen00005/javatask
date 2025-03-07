package hashmap;
import java.util.Map;

import utils.CustomExceptions;
import utils.UtilTask;
public class HashMapTask {

public <K, V> Map<K, V> putMapElement(Map<K, V> map, K key, V value) throws CustomExceptions {
UtilTask.validateNull(map);
UtilTask.validateNull(key);
UtilTask.validateNull(value);
map.put(key, value);
return map;
}

public boolean checkKeyExists(Map<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNull(map);
UtilTask.validateNull(key);
return map.containsKey(key);
}

public boolean checkValueExists(Map<String, String> map, String value)   throws CustomExceptions{
UtilTask.validateNull(map);
UtilTask.validateNull(value);
return map.containsValue(value);
}

public String getValueByKey(Map<String, String> map, String key)  throws CustomExceptions {
UtilTask.validateNull(map);
UtilTask.validateNull(key);
if (checkKeyExists(map, key)) {
return "The value for the key \"" + key + "\" is: " + map.get(key);
 } else {
 throw new CustomExceptions ("The key \"" + key + "\" does not exist in the HashMap.");
}
}

public String getDefaultValue (Map<String, String> map, String key, String defaultValue) throws CustomExceptions {
UtilTask.validateNull(map);
UtilTask.validateNull(key);
UtilTask.validateNull(defaultValue);
return map.getOrDefault(key, defaultValue);
}

public String removeKey(Map<String, String> map, String key) throws CustomExceptions {
UtilTask.validateNull(map);
UtilTask.validateNull(key);
if (checkKeyExists(map,key)) {
map.remove(key);
return "Key \"" + key + "\" removed successfully." ;
} else {
 throw new CustomExceptions ("The key \"" + key + "\" does not exist in the HashMap.");
}
}

public Map<String, String> removeKeyIfValueMatches(Map<String, String> map, String key, String value) throws CustomExceptions {
UtilTask.validateNull(map);	
UtilTask.validateNull(key);
UtilTask.validateNull(value); 
map.remove(key, value);
return map;
}

public String replaceValue(Map<String, String> map, String key, String newValue) throws CustomExceptions {
UtilTask.validateNull(map);
UtilTask.validateNull(key);
UtilTask.validateNull(newValue);
if (checkKeyExists(map,key)) {
map.replace(key, newValue);
return "Value for key \"" + key + "\" replaced successfully.";
}else {
throw new CustomExceptions ("Key \"" + key + "\" does not exist in the HashMap.");
}
}

public Map<String, String> replaceValueIfMatch(Map<String, String> map, String key, String oldValue, String newValue) throws CustomExceptions {
UtilTask.validateNull(map);
UtilTask.validateNull(key);
UtilTask.validateNull(oldValue);
UtilTask.validateNull(newValue);
if (checkKeyExists(map,key) && map.get(key).equals(oldValue)) {
 map.replace(key, newValue);
}
return map;
}

public Map<String, String> transferMap(Map<String, String> map,Map<String, String> map2)  throws CustomExceptions  {
UtilTask.validateNull(map);
UtilTask.validateNull(map2);
map.putAll(map2);
return map;
}


public Map<String, String>  removeAll(Map<String, String> map)  throws CustomExceptions  {
UtilTask.validateNull(map);
map.clear();
return map;
}

}

