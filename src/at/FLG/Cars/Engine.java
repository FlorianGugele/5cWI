package at.FLG.Cars;

import java.util.Random;

import at.FLG.Cars.exceptions.EngineException;

public class Engine {
    public void start () throws EngineException{
        Random r = new Random();
        r.nextBoolean();

        if(r.nextBoolean()){
            System.out.println("Engine started");
        }
        else{
            throw new EngineException("Kolba isch hi");
        }
    }
}