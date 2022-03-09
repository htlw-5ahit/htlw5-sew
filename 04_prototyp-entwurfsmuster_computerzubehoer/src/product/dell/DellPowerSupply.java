package product.dell;

import product.Component;
import product.PowerSupply;

public class DellPowerSupply extends Component implements PowerSupply {

    private int watt;

    public DellPowerSupply() {
    }

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
