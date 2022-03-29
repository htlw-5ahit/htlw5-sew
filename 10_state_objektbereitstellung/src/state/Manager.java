package state;

import logger.Logger;

public class Manager {

    private static StateBase state = new CreatorState();

    public static Logger getLogger() {
        return state.getInstance();
    }

    public static void setState(StateBase newState) {
        state = newState;
    }
}
