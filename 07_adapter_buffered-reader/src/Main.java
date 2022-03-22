import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        try (IterableBufferedReader reader = new IterableBufferedReader("languages.txt")) {
            /* for (String s : reader)
                System.out.println(s); */

            Iterator<String> i = reader.iterator();

            while(i.hasNext())
                System.out.println(i.next());

        } catch (Exception e) {
            e.printStackTrace();
        } catch (Error e) {
            Throwable t = e.getCause();
            if (t != null) t.printStackTrace();
            else e.printStackTrace();
        }
    }

}
