package OOD.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log("Hello");
        Logger logger1 = Logger.getLogger();
        logger1.log("Hello1");
        System.out.println(logger1 == logger);
    }
}
