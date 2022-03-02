public abstract class Factory {

    private static Factory instance;

    public static Factory getInstance() {
        return getInstance(FactoryType.INT);
    }

    public static Factory getInstance(FactoryType type) {
        if (instance == null) {
            // thread safe
            synchronized (Factory.class) {
                if (instance == null) { // check if instance is created
                    if (type == FactoryType.DOUBLE) instance = new DoubleFactory();
                    else instance = new IntFactory();
                }
            }
        }
        return instance;
    }

    public abstract Number getNumber(String s) throws NumberFormatException;
}
