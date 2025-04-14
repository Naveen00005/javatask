package task8;

import utils.CustomExceptions;
import utils.UtilTask;

public class CustomStringHolderTask {
private String value;
public CustomStringHolderTask(String value) throws CustomExceptions {
	UtilTask.validateNull(value);
this.value = value;
}
public String toString() {
return value;
}
}
