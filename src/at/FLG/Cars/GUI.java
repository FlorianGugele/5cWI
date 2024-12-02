package at.FLG.Cars;

import at.FLG.Cars.exceptions.CarException;
import at.FLG.Cars.exceptions.EngineException;

public class GUI {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Car c1 = new Car("red", e1);

        try {
            c1.startCar(); 
        } catch (EngineException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch(CarException c){
            System.out.println(c.getMessage());
        }
        
              
    }


}
