package product.dell;

import product.PowerSupply;

public class DellPowerSupply implements PowerSupply {

    private int watt;

    public DellPowerSupply(int watt) {
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
