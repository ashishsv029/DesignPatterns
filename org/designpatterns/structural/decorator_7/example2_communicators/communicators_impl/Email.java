package org.designpatterns.structural.decorator_7.example2_communicators.communicators_impl;

import org.designpatterns.structural.decorator_7.example2_communicators.Communicator;

public class Email implements Communicator {
    @Override
    public void send(String target, String message) {
        System.out.println("Sending email to..");
    }
}
