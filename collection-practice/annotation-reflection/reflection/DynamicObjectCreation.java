package Reflextion;
class Student {
    void display() {
        System.out.println("Student object created dynamically");
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Student");
        Student obj = (Student) cls.getDeclaredConstructor().newInstance();

        obj.display();
    }
}
