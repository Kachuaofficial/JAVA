public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "shivam";
        s1.roll = 456;
        s1.password = "abcd";

        Student s2 = new Student();
        s2.password = "1122";


        System.out.println(s2.name);

    }
}

class Student{
    int roll;
    String name;
    String password;

    //copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;

    }

    Student() {
        System.out.println("Constructor called");

    }

    Student(String name) {
        this.name = name;

    };

    Student(int roll) {
        this.roll = roll;
    }

 
}
