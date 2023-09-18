package InterfaceClass.Implement;

import InterfaceClass.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void sound() {
        System.out.println("<<silence>>");
    }
}
