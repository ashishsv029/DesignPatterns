package org.designpatterns.structural.adapter_8.example1_logger;

public class LegacyLoggerAdapter implements Logger{
    public LegacyLogger logger;
    public LegacyLoggerAdapter(LegacyLogger logger) {
        this.logger = logger;
    }
    @Override
    public void logIt(String msg) {
        logger.logMessage(msg);
    }
}
