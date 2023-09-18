package MiniDuckSIm;
import InterfaceClass.Implement.FlyRocketPowered;
import InterfaceClass.Implement.Squeak;
import ModelDuck.Duck;
import ModelDuck.MallardDuck;
import ModelDuck.ModelDuck;

public class MiniDuckSim {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println("------------------");

    }
}