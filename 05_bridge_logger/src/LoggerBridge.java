import logger.*;

import java.io.IOException;

public class LoggerBridge implements Logger {

    private Logger instance;

    public LoggerBridge() {
        instance = new ConsoleLogger();
    }

    public LoggerBridge(LoggerType type) throws IOException {
        switchLogger(type);
    }

    public void switchLogger(LoggerType type) throws IOException {
        instance = (type == LoggerType.FILE ? new FileLogger("./log.txt") : new ConsoleLogger());
    }

    @Override
    public void log(LogType type, String message) {
        instance.log(type, message);
    }
}
