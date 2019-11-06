package design.patterns.behavioral.chain_of_responsibility.example;

import java.util.Scanner;

public class Client {
    private DispenseChain chain;

    public Client() {
        this.chain = new Dollar50Dispensor();

        DispenseChain chain2 = new Dollar20Dispensor();
        DispenseChain chain3 = new Dollar10Dispensor();

        chain.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {

        Client atmDispensor = new Client();
        while (true) {
            int amount = 0;
            System.out.println("Enter amoun to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s");
                return;
            }

            atmDispensor.chain.dispense(new Currency(amount));
        }
    }

}
