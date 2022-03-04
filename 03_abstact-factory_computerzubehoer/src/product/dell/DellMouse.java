package product.dell;

import product.Mouse;

public class DellMouse implements Mouse {

    private String type;

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
