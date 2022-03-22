public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser(".");
        System.out.println(parser.getRootDirectory());
        System.out.println(parser.getRootDirectory().getSize());
        System.out.println(parser.getRootDirectory().getSize() / (1024L * 1024L) + " MB");

        System.out.println("_____________________");
        parser.printFileTree();
    }
}
