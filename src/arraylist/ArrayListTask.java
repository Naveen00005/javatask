package arraylist;
import java.util.List;

import utils.CustomExceptions;
import utils.UtilTask;

public class ArrayListTask {
	
public <T> List<T> addElement(List<T> list, T element) throws CustomExceptions {
UtilTask.validateNull(list);
UtilTask.validateNull(element);
list.add(element);
return list;
}
 
public int findIndex(List<Object> array, String searchString) throws CustomExceptions {
UtilTask.validateNull(array);
UtilTask.validateNull(searchString);
return array.indexOf(searchString);
}

public List<Object> iterator (List<Object> array) throws CustomExceptions {
UtilTask.validateNull(array);
return array;
}

public Object getStringAtIndex(List<Object> array, int index) throws CustomExceptions {
UtilTask.validatePositionInList(array, index);
return array.get(index);
}

public int findFirstIndex(List<Object> array, String str)throws CustomExceptions {
UtilTask.validateNull(array);
UtilTask.validateNull(str); 
return array.indexOf(str);

}
public int findLastIndex(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNull(array);
UtilTask.validateNull(str);
return array.lastIndexOf(str);

}
 
public List<Object> addStringAtPosition(List<Object> array, String str, int position) throws CustomExceptions {
UtilTask.validateNull(str);
UtilTask.validatePositionInList(array, position);
array.add(position, str);
return array;
}

public List<Object> addInSecondArrayList(List<Object> array, int initial, int end) throws CustomExceptions{
UtilTask.validateIndices(initial, end, UtilTask.findSize(array));
return array.subList(initial, end + 1);
}

public List<Object> mergeArrayLists(List<Object> first, List<Object> second) throws CustomExceptions {
UtilTask.validateNull(first);
UtilTask.validateNull(second);
first.addAll(second);
return first;
}

public List<Object> removeDecimalAtPosition(List<Object> array, int position) throws CustomExceptions {
UtilTask.validatePositionInList(array, position);
array.remove(position);
return array;
}

public List<Object> removeCommonElements(List<Object> first, List<Object> second) throws CustomExceptions {
UtilTask.validateNull(first);
UtilTask.validateNull(second);
first.removeAll(second);
return first;
}

public List<Object>retainCommonElements(List<Object> first, List<Object> second) throws CustomExceptions  {
UtilTask.validateNull(first);
UtilTask.validateNull(second);
first.retainAll(second);
return first;
}

public List<Object> removeAllLongValues(List<Object> array) throws CustomExceptions {
UtilTask.validateNull(array);
array.clear();
return array;
}

public boolean checkStringPresence(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNull(array);
UtilTask.validateNull(str);
return array.contains(str);
}
}
