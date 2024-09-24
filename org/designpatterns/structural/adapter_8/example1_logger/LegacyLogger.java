package org.designpatterns.structural.adapter_8.example1_logger;

public class LegacyLogger {
    public void logMessage(String msg) {
        System.out.println("Old logger: " + msg);
    }
}
