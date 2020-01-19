package day3.loggerTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    private void showLoggers() {
        logger.error("error logger");
        logger.warn("warn logger");
        logger.info("info logger");
        logger.debug("debug logger");
        logger.trace("trace logger");
    }

    public static void main(String[] args) {
        new LoggerTest().showLoggers();
    }
}
