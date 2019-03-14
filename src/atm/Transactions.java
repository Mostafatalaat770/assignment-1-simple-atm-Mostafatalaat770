package atm;

public class Transactions {

    private double balance = 0;
    private String number1 = "123456789";


    public boolean validator(String number) {
        return number1.equals(number);
    }

    public double stringToNumber(String str) {
        double number = 0;
        int c = 1;
        for (int i = str.length() - 1; i >= 0; i--, c *= 10) {
            number += (str.charAt(i)-48) * c;
        }
        return number;

    }


    public boolean withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;}
            return (amount <= balance);
    }
    public void deposit(double amount) {
            balance += amount;
    }


    public double getBalance() {
        return balance;
    }

}

