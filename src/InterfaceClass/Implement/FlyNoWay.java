package InterfaceClass.Implement;

import InterfaceClass.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("can't fly");
    }
}
