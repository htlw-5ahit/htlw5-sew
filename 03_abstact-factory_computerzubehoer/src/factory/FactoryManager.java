package factory;

public class FactoryManager {

    private static AbstractFactory instance;

    public static AbstractFactory getInstance() {
        return getInstance(FactoryType.APPLE);
    }

    public static AbstractFactory getInstance(FactoryType type) {
        if (instance == null) {
            // thread safe
            synchronized (FactoryManager.class) {
                if (instance == null) { // check if instance is created
                    if (type == FactoryType.DELL) instance = new DellFactory();
                    else instance = new AppleFactory();
                }
            }
        }
        return instance;
    }

}
