package hashmap;

public class CustomObject{
private String name;
private int age;

public CustomObject (String name, int age) {
this.name = name;
this.age = age;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
public String toString() {
return "CustomObject{name='" + name + "', age=" + age + "}";
}
}
