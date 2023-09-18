package InterfaceClass.Implement;

import InterfaceClass.FlyBehavior;

public class FlyWithWings  implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("flying");
    }
}