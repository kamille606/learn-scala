package day05Class;

public class Test13 {
    public static void main(String[] args) {
        Student13Java student13Java = new Student13Java();
        student13Java.sayHello();
    }
}

interface TalentJava {
    void singing();
    void dancing();
}

class Student13Java extends Person12 implements TalentJava {
    @Override
    public void singing() {
        System.out.println("唱歌");
    }
    @Override
    public void dancing() {
        System.out.println("跳舞");
    }
}