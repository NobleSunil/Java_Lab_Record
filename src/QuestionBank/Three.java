package QuestionBank;

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    int rollno;
    int marks;

    Student(String name, int age, int rollno, int marks){
        super(name, age);
        this.rollno = rollno;
        this.marks = marks;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no: " + rollno);
        System.out.println("Marks: " + marks);
    }
}

public class Three{
    public static void main(String[] args){
        Student s1 = new Student("S1", 10, 10, 50);
        s1.display();
    }
}