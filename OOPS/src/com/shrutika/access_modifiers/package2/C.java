package com.shrutika.access_modifiers.package2;
import com.shrutika.access_modifiers.package1.A;
import com.shrutika.access_modifiers.package1.B;
import org.w3c.dom.ls.LSOutput;


public class C extends B{

    public C(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(10,"shri");
        System.out.println(obj.getNum());
//        System.out.println(obj.name); //error bcoz name is default data member

        C obj2 = new C(111,"jhg");
        System.out.println(obj2.num);
//        System.out.println(obj2.name);//error

        B obj3 = new B(15,"aaru");
//        System.out.println(obj3.num); // error because only subclasses of B can access num as it
        // is protected. not even the class itself can access num in different package

        System.out.println(obj2 instanceof B); //instanceof oprator
    }


}

class subclass extends C{
//this is inheritance as subclass is a child class of C so it can access members of
// c and subclass is also a child class of b so it can also access members of b
    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass ob = new subclass(20,"baba");
        System.out.println(ob.num);

        System.out.println(ob instanceof B);
        System.out.println(ob.getClass());
    }

}
