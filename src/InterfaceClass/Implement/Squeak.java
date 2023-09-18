package InterfaceClass.Implement;

import InterfaceClass.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void sound() {
        System.out.println("Squeak squeak");
    }
}