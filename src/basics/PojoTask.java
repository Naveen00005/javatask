package basics;

public class PojoTask {
private String name;
private int age;

public PojoTask() {
}

public PojoTask(String name, int age) {
this.name = name;
this.age = age;
}
public String getName() {
 return name;
}
public int getAge() {
 return age;
}
public void setName(String name) {
 this.name = name;
}
public void setAge(int age) {
 this.age = age;
}
public String toString() {
 return "Name: " + name + ", Age: " + age;
}
}
