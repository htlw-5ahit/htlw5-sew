public class Main {

    public static void main(String[] args) {

        try {
            Factory factory = Factory.getInstance(FactoryType.DOUBLE);

            System.out.println(factory.getNumber("111.3"));

            System.out.println(Factory.getInstance().getClass());

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
