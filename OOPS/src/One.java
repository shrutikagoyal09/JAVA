class Student{
    final int age;
    String name;
    float sal;

//    Student(){
//        this.age=13;
//        this.name="Shrutika";
//        this.sal=2000000;
//    }
    Student(int age,String name,float sal){
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
    Student(){
        this(11,"arr",3000);
    }
}

public class One {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.sal);



        Student s2 = new Student(14,"Abhi",200000);
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println(s2.sal);


        s2.name = "ron";
        System.out.println(s2.name);
    }
}
