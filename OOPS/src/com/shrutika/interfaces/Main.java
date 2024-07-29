package com.shrutika.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine careng = new Car();
//        System.out.println(careng.A);// error because what to access depends on lhs and which version to access depends
        // on rhs. a is declared in Car class not engine


//        Engine carr = new Car();
//        carr.a;
//         carr.brake();//error
//         carr.accelerate();

//        Car car = new Car();
//        car.accelerate();
//        car.brake();
//        car.start();
//        car.stop();


        NiceCar car= new NiceCar();
        car.start();
        car.stop();
        car.startMusic();
        car.stopMusic();
        car.upgradeEngine();
        car.start();
        car.stop();
        car.startMusic();
        car.stopMusic();
    }
}
