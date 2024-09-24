package org.designpatterns.structural.decorator_7.example2_communicators.communicator_decorators_impl;

import org.designpatterns.structural.decorator_7.example2_communicators.Communicator;
import org.designpatterns.structural.decorator_7.example2_communicators.CommunicatorDecorator;

public class EmailDecorator extends CommunicatorDecorator {
    public EmailDecorator(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void send(String target, String message) {
        System.out.println("Sending Email"); // ARE U SEEING ANY ISSUE HERE, YES!! CODE DUPLICATION of Email send's methiod
        if(this.innerCommunicator!=null) {
            innerCommunicator.send(target, message);
        }
    }
}
