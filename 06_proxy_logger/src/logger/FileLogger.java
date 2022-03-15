package logger;

import java.io.*;

public class FileLogger implements Logger {

    private FileWriter writer;

    public FileLogger(String logFile) throws IOException {
        this.writer = new FileWriter(logFile, true);
    }

    @Override
    public void log(LogType type, String message) {
        try {
            this.writer.write(type  + ":\t" + message + "\n");
            this.writer.flush();
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        this.writer.close();
    }
}
