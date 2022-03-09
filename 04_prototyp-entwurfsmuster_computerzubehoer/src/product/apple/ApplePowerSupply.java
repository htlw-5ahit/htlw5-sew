package product.apple;

import product.Component;
import product.PowerSupply;

public class ApplePowerSupply extends Component implements PowerSupply {

    private int watt;

    public ApplePowerSupply() {
    }

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
