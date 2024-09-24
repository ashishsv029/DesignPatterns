package org.designpatterns.structural.adapter_8.example1_logger;
/*
Currentlu u r working with a logger and you want to change with a legacy logger system that uses a different interface.
The Adapter Pattern can help you integrate these systems without changing the legacy code and our application.
 */
public class Client {
    public static void main(String[] args) {
        Logger currentLogger = new NewLogger();
        LegacyLogger oldLogger = new LegacyLogger(); //incompatible with the below client call
        currentLogger.logIt("Hello World");
        // now cant cant replace currentLogger with instance of legacy logger
        // so will use an adapter
        currentLogger = new LegacyLoggerAdapter(oldLogger);
        currentLogger.logIt("Hello World");
    }
}
