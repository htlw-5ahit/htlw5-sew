package state;

import logger.Logger;

public class SupplyState extends StateBase {

    private Logger instance;

    public SupplyState(Logger instance) {
        this.instance = instance;
    }

    @Override
    public Logger getInstance() {
        return instance;
    }
}
