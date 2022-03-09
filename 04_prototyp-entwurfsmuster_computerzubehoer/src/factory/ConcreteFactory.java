package factory;

import product.Component;
import product.Mouse;
import product.NetworkAdapter;
import product.PowerSupply;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConcreteFactory implements AbstractFactory {

    private static HashMap<String, Component> objectStore = new HashMap<>();
    private static Properties props = FactoryManager.getProps();

    public ConcreteFactory() throws Exception {
        if (props != null) {
            for (Map.Entry<Object, Object> entry : props.entrySet()) {
                if (entry.getKey().toString().startsWith("class_")) {
                    Class<?> cls = Class.forName(String.valueOf(entry.getValue()));
                    Constructor<?> cst = cls.getConstructor();
                    objectStore.put(String.valueOf(entry.getKey()), (Component) cst.newInstance());
                }
            }
        }
    }

    @Override
    public Mouse createMouse() {
        try {
            return (Mouse) objectStore.get("class_mouse").clone();
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }

    @Override
    public NetworkAdapter createNetworkAdapter() {
        try {
            return (NetworkAdapter) objectStore.get("class_network_adapter").clone();
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }

    @Override
    public PowerSupply createPowerSupply() {
        try {
            return (PowerSupply) objectStore.get("class_power_supply").clone();
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }
}
