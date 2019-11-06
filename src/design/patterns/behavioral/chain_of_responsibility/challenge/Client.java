package design.patterns.behavioral.chain_of_responsibility.challenge;

public class Client {

    public static void main(String args[]) {
        System.out.println("*** Chain of Responsibility Challenge");

        ReceiverInterface faxHandler, emailHandler;

        emailHandler = new EmailErrorHandler();

        faxHandler = new FaxErrorHandler();
        faxHandler.setNextChain(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax is reaching late", MessagePriority.NORMAL);
        Message m2 = new Message("Email is not going", MessagePriority.HIGH);
        Message m3 = new Message("In Email, BCC field is disabled", MessagePriority.NORMAL);
        Message m4 = new Message("Fax is  not reaching destination", MessagePriority.HIGH);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
        raiser.raiseMessage(m1);

    }
}
