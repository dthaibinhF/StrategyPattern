package ModelDuck;
import InterfaceClass.FlyBehavior;
import InterfaceClass.Implement.Quack;
import InterfaceClass.QuackBehavior;
import InterfaceClass.Implement.FlyWithWings;

public class MallardDuck extends Duck{
    public MallardDuck(){ // constructor
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");

    }
}
