package logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(LogType type, String message) {
        System.out.println(type  + ":\t" + message);
    }

}
