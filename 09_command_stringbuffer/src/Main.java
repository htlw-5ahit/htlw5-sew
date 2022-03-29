public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        AppendCommand ac = new AppendCommand(sb, "hello world");
        ac.execute();
        System.out.println(sb);

        InsertStringCommand isc = new InsertStringCommand(sb, sb.length(), " welt");
        isc.execute();
        System.out.println(sb);

        DeleteCommand dc = new DeleteCommand(sb, 3,5);
        dc.execute();
        System.out.println(sb);

        isc.undo();
        System.out.println("isc undo: " + sb);
    }
}
