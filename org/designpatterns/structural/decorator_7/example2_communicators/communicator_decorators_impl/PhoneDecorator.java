package org.designpatterns.structural.decorator_7.example2_communicators.communicator_decorators_impl;

import org.designpatterns.structural.decorator_7.example2_communicators.Communicator;
import org.designpatterns.structural.decorator_7.example2_communicators.CommunicatorDecorator;

public class PhoneDecorator extends CommunicatorDecorator{
    public PhoneDecorator(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void send(String target, String message) {
        System.out.println("Making a phone call.."); // ARE U SEEING ANY ISSUE HERE, YES!! CODE DUPLICATION of Phone send's method
        if(this.innerCommunicator!=null) {
            this.innerCommunicator.send(target, message);
        }
    }
}
