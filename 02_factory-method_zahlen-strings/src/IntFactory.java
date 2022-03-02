public class IntFactory extends Factory {

    @Override
    public Number getNumber(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}
