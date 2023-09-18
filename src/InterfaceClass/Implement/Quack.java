package InterfaceClass.Implement;
import InterfaceClass.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void sound() {
        System.out.println("Quack quack");
    }
}
