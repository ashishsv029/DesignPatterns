package org.designpatterns.structural.adapter_8.example1_logger;

public class NewLogger implements Logger{
    @Override
    public void logIt(String msg) {
        System.out.println(msg);
    }
}
