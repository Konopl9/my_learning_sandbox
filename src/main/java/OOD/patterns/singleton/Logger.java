package OOD.patterns.singleton;

import java.time.LocalDateTime;

public final class Logger {
    private static volatile Logger logger;

    private Logger(){}

    public static Logger getLogger() {
        synchronized (Logger.class) {
            if(logger == null) {
                logger = new Logger();
            }
        }
        return logger;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
