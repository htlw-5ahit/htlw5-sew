import factory.AbstractFactory;
import factory.FactoryManager;
import factory.FactoryType;
import product.Mouse;
import product.NetworkAdapter;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryManager.getInstance(FactoryType.APPLE);

        NetworkAdapter networkAdapter = factory.createNetworkAdapter();
        Mouse mouse = factory.createMouse();

        System.out.println(networkAdapter.getType());
        System.out.println(mouse.getType());

        System.out.println(networkAdapter.getClass().getSimpleName());
    }
}
