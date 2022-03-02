public class DoubleFactory extends Factory {

    @Override
    public Number getNumber(String s) throws NumberFormatException {
        return Double.parseDouble(s);
    }
}
