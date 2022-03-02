public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            // thread safe
            synchronized (Logger.class) {
                if (instance == null) { // check if instance is created
                    instance = new Logger(); // create instance if not exists
                }
            }
        }
        return instance;
    }

    public void log(LogType type, String message) {
        System.out.println(type  + ":\t" + message);
    }

}
