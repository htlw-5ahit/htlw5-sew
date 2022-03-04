package factory;

import product.Mouse;
import product.NetworkAdapter;
import product.PowerSupply;
import product.dell.DellMouse;
import product.dell.DellNetworkAdapter;
import product.dell.DellPowerSupply;

public class DellFactory implements AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse("Dell Mouse");
    }

    @Override
    public NetworkAdapter createNetworkAdapter() {
        return new DellNetworkAdapter("Dell USB Ethernet Adapter", "USB");
    }

    @Override
    public PowerSupply createPowerSupply() {
        return new DellPowerSupply(600);
    }
}
