package org.designpatterns.structural.decorator_7.example2_communicators.communicator_decorators_impl;

import org.designpatterns.structural.decorator_7.example2_communicators.Communicator;
import org.designpatterns.structural.decorator_7.example2_communicators.CommunicatorDecorator;

public class SlackDecorator extends CommunicatorDecorator {
    public SlackDecorator(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void send(String target, String message) {
        System.out.println("Pinging via slack.."); // ARE U SEEING ANY ISSUE HERE, YES!! CODE DUPLICATION of Slack send's method
        if(this.innerCommunicator!=null) {
            this.innerCommunicator.send(target, message);
        }
    }
}
// So to avoid code duplication, we need to extend the Slack Decorator from Slack class, but multiple inheritance is not allowed no
// So we need to ignore CommunicatorDecorator abstract class and directly use the inner Communicator reference locally in all decorators -> still a code dup
// so one way is to refactor like this
//     Communicator interface <- Abstract class CommunicatorDecorator extends <- Concrete Communicators extends <- Concrete Decorators extends
// But refactoring like above is changing whole a lot of code which is not necessary
// So the simple way is, in Concrete Communicator decorators hold the reference of Concrete communicators, u can get it via injection as well
//  i.e for ex Email email = new Email(), then in send call email.send() and then do innerCommunicator.send()