package creational;

import java.io.*;

public class StreamCreator {

    private static StreamCreator instance; // = new StreamCreator();

    protected StreamCreator() {
    }

    public static StreamCreator getInstance() {
        // instance null check, because synchronized is slow
        // only one synchronized call
        if (instance == null) {
            // thread safe
            synchronized (StreamCreator.class) {
                if (instance == null) { // check if instance is created
                    instance = new BAStreamCreator(); // create instance if not exists
                }
            }
        }
        return instance;
    }

    public InputStream createInputStream() throws IOException {
        return new FileInputStream("unbenannt.txt");
    }

    public OutputStream createOutputStream() throws IOException {
        return new FileOutputStream("unbenannt.txt");
    }

}
