package product.apple;

import product.PowerSupply;

public class ApplePowerSupply implements PowerSupply {

    private int watt;

    public ApplePowerSupply(int watt) {
        this.watt = watt;
    }

    @Override
    public int getWatt() {
        return watt;
    }

    @Override
    public void setWatt(int watt) {
        this.watt = watt;
    }
}
