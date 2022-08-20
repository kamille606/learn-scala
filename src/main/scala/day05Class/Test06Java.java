package day05Class;

public class Test06Java {
    public static void personInfo(PersonJava person6) {
        person6.printInfo();
    }

    public static void main(String[] args) {
        PersonJava student = new StudentJava();
        PersonJava teacher = new TeacherJava();
        personInfo(student);
        System.out.println(student.name);
        personInfo(teacher);
        System.out.println(teacher.name);
    }
}

class PersonJava {
    String name = "person";
    void printInfo() {
        System.out.println(name);
    }
}

class StudentJava extends PersonJava {
    String name = "student";
    void printInfo() {
        System.out.println(name);
    }
}

class TeacherJava extends PersonJava {
    String name = "teacher";
    void printInfo() {
        System.out.println(name);
    }
}