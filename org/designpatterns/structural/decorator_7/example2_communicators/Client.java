package org.designpatterns.structural.decorator_7.example2_communicators;

import org.designpatterns.structural.decorator_7.example2_communicators.communicator_decorators_impl.PhoneDecorator;
import org.designpatterns.structural.decorator_7.example2_communicators.communicators_impl.Email;
import org.designpatterns.structural.decorator_7.example2_communicators.communicators_impl.Slack;

public class Client {
    public static void main(String[] args) {
        // Earlier
        Communicator emailCommunicator = new Email();
        emailCommunicator.send("ashish", "pls join meet");

        // Earlier to also send via slack along with mail, we need to add this below code manually violating SRP
        Communicator slackCommunicator = new Slack();
        slackCommunicator.send("ashish", "pls join meet");

        // But with the help of decorators we can make like this
        Communicator sender = new Email();
        sender = new PhoneDecorator(sender); // this is wrapping email inside phone i.e the phone decorator calls phone.send and after that calls email.send
        sender.send("ashish", "pls join"); // got combined behaviour -> make phone then send mail

        // to make email first then phone next , wrap in the order u want
        /*
            Communicator sender = new Phone();
            sender = new EmailDecorator(sender);
            sender.send(); // got combined behaviour -> send mail then make phone
         */


    }
}
