public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.log(LogType.ERROR, "das ist ein fehler!");
        logger.log(LogType.INFO, "das ist eine info!");

        Logger.getInstance().log(LogType.DEBUG, "Debugging");

    }

}
