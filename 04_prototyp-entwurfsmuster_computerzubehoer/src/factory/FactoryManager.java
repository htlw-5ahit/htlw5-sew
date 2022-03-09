package factory;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class FactoryManager {

    private static AbstractFactory instance;
    private static Properties props;

    public static AbstractFactory getInstance() {
        return getInstance(FactoryType.APPLE);
    }

    public static AbstractFactory getInstance(String propertyFile) throws Exception {
        if (instance == null) {
            // thread safe
            synchronized (FactoryManager.class) {
                if (instance == null) { // check if instance is created
                    try (FileReader reader = new FileReader(propertyFile)) { // try-with-resources => closing stream
                        props = new Properties(); // create properties object
                        props.load(reader); // read from file stream
                        String clsName = props.getProperty("factory"); // get class name from given properties object
                        Class<?> cls = Class.forName(clsName); // get default constructor object
                        Constructor<?> cst = cls.getConstructor(); // invoke default constructor (no arguments!) and assign
                        instance = (AbstractFactory) cst.newInstance();
                    }
                }
            }
        }
        return instance;
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

    public static Properties getProps() {
        return props;
    }
}
