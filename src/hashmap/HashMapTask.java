package hashmap;
import java.util.Map;
import utils.CustomExceptions;
import utils.UtilTask;
public class HashMapTask {

public <K, V> Map<K, V> putMapElement(Map<K, V> map, K key, V value) throws CustomExceptions {
UtilTask.validateNull(map);
map.put(key, value);
return map;
}

public boolean checkValueExists(Map<String, String> map, String value)   throws CustomExceptions{
UtilTask.validateNull(map);
return map.containsValue(value);
}

public String getValueByKey(Map<String, String> map, String key)  throws CustomExceptions {
	UtilTask.validateNull(map);
	return map.get(key);
}

public String getDefaultValue (Map<String, String> map, String key, String defaultValue) throws CustomExceptions {
UtilTask.validateNull(map);
return map.getOrDefault(key, defaultValue);
}

public String removeKey(Map<String, String> map, String key) throws CustomExceptions {
	UtilTask.validateNull(map);
return map.remove(key);
}


public Map<String, String> removeKeyIfValueMatches(Map<String, String> map, String key, String value) throws CustomExceptions {
UtilTask.validateNull(map);
map.remove(key, value);
return map;
}

public String replaceValue(Map<String, String> map, String key, String newValue) throws CustomExceptions {
UtilTask.validateNull(map);
return map.replace(key, newValue);
}


public Map<String, String> replaceValueIfMatch(Map<String, String> map, String key, String oldValue, String newValue) throws CustomExceptions {
UtilTask.validateNull(map); 
map.replace(key, oldValue, newValue);
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