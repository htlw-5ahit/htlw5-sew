package product.dell;

import product.NetworkAdapter;

public class DellNetworkAdapter implements NetworkAdapter {

    private String type;
    private String socket;

    public DellNetworkAdapter(String type, String socket) {
        this.type = type;
        this.socket = socket;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getSocket() {
        return socket;
    }

    @Override
    public void setSocket(String socket) {
        this.socket = socket;
    }
}
