package state;

import logger.Logger;

public class CreatorState extends StateBase {

    private static Logger instance;

    @Override
    public Logger getInstance() {
        if (instance == null) {
            .......


            Manager.setState(new SupplyState(instance));
            return instance;
        }
    }
}
