import java.io.*;
import java.util.Iterator;

public class IterableBufferedReader implements Iterable<String>, AutoCloseable {

    private BufferedReader reader;

    public IterableBufferedReader(InputStream inputStream) throws IOException {
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public IterableBufferedReader(String filename) throws IOException {
        reader = new BufferedReader(new FileReader(filename));
    }

    @Override
    public Iterator<String> iterator() {
        return new BufferedReaderIterator(reader);
    }

    @Override
    public void close() throws Exception {
        if (reader != null)
            reader.close();
    }
}
