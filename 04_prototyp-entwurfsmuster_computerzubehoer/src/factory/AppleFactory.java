package factory;

import product.Mouse;
import product.NetworkAdapter;
import product.PowerSupply;
import product.apple.AppleMouse;
import product.apple.AppleNetworkAdapter;
import product.apple.ApplePowerSupply;

public class AppleFactory implements AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new AppleMouse("Apple Mouse spacegray");
    }

    @Override
    public NetworkAdapter createNetworkAdapter() {
        return new AppleNetworkAdapter("Apple Thunderbolt Ethernet Adapter", "Thunderbolt");
    }

    @Override
    public PowerSupply createPowerSupply() {
        return new ApplePowerSupply(150);
    }
}
