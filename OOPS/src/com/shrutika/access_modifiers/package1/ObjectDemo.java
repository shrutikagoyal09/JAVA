package com.shrutika.access_modifiers.package1;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num){
        this.num = num;
    }
    @Override
    public String toString() {
        return super.toString();
    }


//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }




    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(34);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
