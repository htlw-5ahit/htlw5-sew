package product.apple;

import product.Component;
import product.Mouse;

public class AppleMouse extends Component implements Mouse {

    private String type;

    public AppleMouse() {
    }

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
