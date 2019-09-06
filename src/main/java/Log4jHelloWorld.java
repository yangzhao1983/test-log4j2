import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by kaiser_zhao on 2019/9/4.
 */
public class Log4jHelloWorld {
    public static void main(String...strings){
        Logger logger = LogManager.getLogger();
        logger.error("trace level");
    }
}
