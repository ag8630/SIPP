package SIPP;

public class oops {
    class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2 ){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }
}



public class students {
    public static void main(String[] args) {
        Student s1= new Student;//constructor,non parameters,parameterized,copy constructor
        s1.name = "John";
        s1.age = 20;
        
        Student s2 = new Student(s1);
        s2.printInfo();
    }
    
}

    
}
