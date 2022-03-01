package creational;

import java.io.*;

public class BAStreamCreator extends StreamCreator {

    @Override
    public InputStream createInputStream() throws IOException {
        return new ByteArrayInputStream(new byte[100]);
    }

    @Override
    public OutputStream createOutputStream() throws IOException {
        return new ByteArrayOutputStream();
    }
}
