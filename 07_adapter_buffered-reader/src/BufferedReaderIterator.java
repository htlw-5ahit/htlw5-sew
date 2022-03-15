import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class BufferedReaderIterator implements Iterator<String> {

    private BufferedReader reader;
    private String line;

    public BufferedReaderIterator(BufferedReader reader) {
        this.reader = reader;
        readNextLine();
    }

    @Override
    public boolean hasNext() {
        return line != null;
    }

    @Override
    public String next() {
        String line2 = line;
        readNextLine();
        return line2;
    }

    private void readNextLine() {
        try {
            line = reader.readLine();
        } catch (IOException e) {
            throw new Error(e);
        }
    }
}
