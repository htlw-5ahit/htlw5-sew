package product.apple;

import product.Mouse;

public class AppleMouse implements Mouse {

    private String type;

    public AppleMouse(String type) {
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
