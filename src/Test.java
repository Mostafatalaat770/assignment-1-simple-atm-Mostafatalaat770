import ATM.Transaction;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Transaction t = new Transaction();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your card's number: ");
        String number;
        do {
            number = in.next();
        } while (!t.validator(number));
        System.out.println("Enter amount of withdrawal: ");
        double withdrawal = in.nextDouble();
        t.withdrawal(withdrawal);
        t.balanceInquiry();
        System.out.println("Enter amount of withdrawal: ");
        double withdrawal1 = in.nextDouble();
        t.withdrawal(withdrawal1);
        t.balanceInquiry();
        in.close();


    }

}
