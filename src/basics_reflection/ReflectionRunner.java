package basics_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionRunner {
public static void main(String[] args) {
try {
Class<?> pojoReflection = Class.forName("task8.PojoTask");

Object obj1 = pojoReflection.getDeclaredConstructor().newInstance();
System.out.println("Default Constructor: " + obj1);

Constructor<?> paramConstructor = pojoReflection.getConstructor(String.class, int.class);
Object obj2 = paramConstructor.newInstance("Naveen", 25);
System.out.println("Overloaded Constructor: " + obj2);

Method setName = pojoReflection.getMethod("setName", String.class);
setName.invoke(obj2, "Updated Naveen");

Method getName = pojoReflection.getMethod("getName");
Object nameValue = getName.invoke(obj2);
System.out.println("Name after update: " + nameValue);

} catch (Exception e) {
e.printStackTrace();
}
}
}
