package org.designpatterns.structural.decorator_7.example2_communicators.communicators_impl;

import org.designpatterns.structural.decorator_7.example2_communicators.Communicator;

public class Phone implements Communicator {

    @Override
    public void send(String target, String message) {
        System.out.println("Making a phone call..");
    }
}
