package at.FLG.Java.Cars;

import java.util.Random;

import at.FLG.Java.Cars.exceptions.CarException;
import at.FLG.Java.Cars.exceptions.EngineException;

public class Car{
    private Engine engine;
    private String color;

    public Car(String color, Engine e){
        this.engine = e;
        this.color = color;
    }

    public void startCar()throws EngineException, CarException{
        engine.start();
        Random r = new Random();

        if(r.nextBoolean()){
            throw new CarException("Auto isch abgsoffa");
        }
    }

}

