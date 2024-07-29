package com.shrutika.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player;
    public NiceCar(){
        engine = new PowerEngine();
        player = new CDPlayer();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.starts();
    }
    public void stopMusic(){
        player.stops();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
