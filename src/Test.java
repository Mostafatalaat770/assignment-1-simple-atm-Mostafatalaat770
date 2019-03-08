import ATM.Transaction;
import ATM.Validations;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Validations v = new Validations();
        Transaction t = new Transaction();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your card's number: ");
        String number;
        do {

            number = in.next();
        } while (v.validator(number) != 1);
        t.balanceInquiry();
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
