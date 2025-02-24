package arraylist;
import java.util.Iterator;
import java.util.List;

import utils.CustomExceptions;
import utils.UtilTask;

public class ArrayListTask {

public <T> List<T> addElement(List<T> list, T element) throws CustomExceptions {
UtilTask.validateNullString(list);
UtilTask.validateNullString(element);
list.add(element);
return list;
}
 
public int findIndex(List<Object> array, String searchString) throws CustomExceptions {
UtilTask.validateNullString(searchString);
return array.indexOf(searchString);
}

public List<Object> iterator (List<Object> array) throws CustomExceptions {
List<Object> stringLists =  UtilTask.createArrayList();
Iterator<Object> it = array.iterator();
while (it.hasNext()) {
stringLists.add(it.next()); 
}
return stringLists;
}

public Object getStringAtIndex(List<Object> array, int index) throws CustomExceptions {
int size = UtilTask.findSize(array);
if (index < 0 || index >= size) {
throw new CustomExceptions("Invalid index. Index should be between 0 and " + ( size - 1));
}
return array.get(index);
}

public int findFirstIndex(List<Object> array, String str)throws CustomExceptions {
UtilTask.validateNullString(str); 
return array.indexOf(str);

}
public int findLastIndex(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNullString(str);
return array.lastIndexOf(str);

}
 
public List<Object> addStringAtPosition(List<Object> array, String str, int position) throws CustomExceptions {
UtilTask.validateNullString(str);
if (position >= 0 || position <= UtilTask.findSize(array)) {
 array.add(position, str);
}
return array;
}

public List<Object> addInSecondArrayList(List<Object> array, int initial, int end) throws CustomExceptions{
List<Object> secondArrayList = UtilTask.createArrayList();
for (int i=initial;i<=end;i++){
secondArrayList.add(array.get(i));
}
return secondArrayList ;
}

public List<Object> mergeArrayLists(List<Object> first, List<Object> second) throws CustomExceptions {
List<Object> mergedArrayList = UtilTask.createArrayList();
mergedArrayList.addAll(first);
mergedArrayList.addAll(second);
return mergedArrayList ;
}

public List<Object> removeDecimalAtPosition(List<Object> array, int position) throws CustomExceptions {
array.remove(position);
return array;
}

public List<Object> removeCommonElements(List<Object> first, List<Object> second) throws CustomExceptions {
first.removeAll(second);
return first;
}

public List<Object>retainCommonElements(List<Object> first, List<Object> second) throws CustomExceptions  {
first.retainAll(second);
return first;
}

public List<Object> removeAllLongValues(List<Object> array) throws CustomExceptions {
array.clear();
return array;
}

public boolean checkStringPresence(List<Object> array, String str) throws CustomExceptions {
UtilTask.validateNullString(str);
return array.contains(str);
}
}
