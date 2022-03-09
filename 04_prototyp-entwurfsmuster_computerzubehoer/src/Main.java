import factory.AbstractFactory;
import factory.FactoryManager;
import product.Mouse;
import product.NetworkAdapter;

public class Main {

    public static void main(String[] args) {
        try {
            AbstractFactory factory = FactoryManager.getInstance("./app.properties");

            NetworkAdapter networkAdapter = factory.createNetworkAdapter();
            Mouse mouse = factory.createMouse();

            System.out.println(networkAdapter.getClass());
            System.out.println(mouse.getClass());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
