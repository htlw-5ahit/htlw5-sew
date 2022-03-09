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

    public Number calculate(String s1, String s2) {
        Number n1 = getNumber(s1), n2 = getNumber(s2);
        return n1.doubleValue() + n2.doubleValue();
    }
}
