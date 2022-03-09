package product.dell;

import product.Component;
import product.Mouse;

public class DellMouse extends Component implements Mouse {

    private String type;

    public DellMouse() {
    }

    public DellMouse(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
