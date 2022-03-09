import logger.LogType;
import logger.Logger;
import logger.LoggerType;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Logger logger = new LoggerBridge(LoggerType.FILE);

            logger.log(LogType.ERROR, "das ist ein fehler!");
            logger.log(LogType.INFO, "das ist eine info!");
            logger.log(LogType.DEBUG, "Debugging");

            ((LoggerBridge) logger).switchLogger(LoggerType.CONSOLE);

            logger.log(LogType.ERROR, "das ist ein fehler!");
            logger.log(LogType.INFO, "das ist eine info!");
            logger.log(LogType.DEBUG, "Debugging");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
