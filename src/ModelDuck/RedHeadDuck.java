package ModelDuck;

import InterfaceClass.Implement.FlyWithWings;
import InterfaceClass.Implement.Quack;

class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Red Head Duck");
    }


}