import logger.*;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class LoggerProxy implements Logger {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    private Logger instance;

    public LoggerProxy() {
        instance = new ConsoleLogger();
    }

    public LoggerProxy(LoggerType type) throws IOException {
        switchLogger(type);
    }

    public void switchLogger(LoggerType type) throws IOException {
        instance = (type == LoggerType.FILE ? new FileLogger("./log.txt") : new ConsoleLogger());
    }

    @Override
    public void log(LogType type, String message) {
        message = sdf.format(new Timestamp(System.currentTimeMillis())) + "\t\t" + message;
        instance.log(type, message);
    }
}
