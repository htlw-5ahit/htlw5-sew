package factory;

import product.Mouse;
import product.NetworkAdapter;
import product.PowerSupply;

public interface AbstractFactory {

    public Mouse createMouse();
    public NetworkAdapter createNetworkAdapter();
    public PowerSupply createPowerSupply();

}
