package org.designpatterns.structural.decorator_7.example2_communicators;

public abstract class CommunicatorDecorator implements Communicator{
    protected Communicator innerCommunicator; //holding a reference of target communicator which facilitates combined behaviour
    public CommunicatorDecorator(Communicator communicator) {
        this.innerCommunicator = communicator;
    }
}
