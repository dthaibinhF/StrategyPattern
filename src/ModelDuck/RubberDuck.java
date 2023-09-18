package ModelDuck;

import InterfaceClass.Implement.FlyNoWay;
import InterfaceClass.Implement.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("I'm a real Rubber Duck");
    }
}
