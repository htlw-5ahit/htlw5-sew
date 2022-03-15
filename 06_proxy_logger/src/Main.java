import logger.LogType;
import logger.Logger;
import logger.LoggerType;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Logger logger = new LoggerProxy(LoggerType.FILE);

            logger.log(LogType.ERROR, "das ist ein fehler!");
            Thread.sleep(1000);
            logger.log(LogType.INFO, "das ist eine info!");
            Thread.sleep(1000);
            logger.log(LogType.DEBUG, "Debugging");

            ((LoggerProxy) logger).switchLogger(LoggerType.CONSOLE);

            Thread.sleep(2000);
            logger.log(LogType.ERROR, "das ist ein fehler!");
            Thread.sleep(500);
            logger.log(LogType.INFO, "das ist eine info!");
            Thread.sleep(1200);
            logger.log(LogType.DEBUG, "Debugging");

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
