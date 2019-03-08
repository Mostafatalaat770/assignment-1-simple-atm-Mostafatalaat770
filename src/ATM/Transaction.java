package ATM;

public class Transaction {

    private double balance = 0;
    private String number = "123456789123456";


    public boolean validator(String number) {
        if (this.number.equals(number))
            return true;
        else {
            System.out.println("The card number is incorrect, please re-enter it again.");
            return false;
        }
    }

    public void withdrawal(double amount) {
	if (amount <= this.balance && amount >= 0)
	    this.balance -= amount;
	else
	    System.out.println("Withdrawal amount is less than the current balance.\nCancelling...");
    }

    public void deposit(double amount) {
	if (amount > 0)
	    this.balance += amount;
	else
	    System.out.println("deposit amount is less than the minmum amount.\nCancelling...");
    }

    public void balanceInquiry() {
	System.out.println("Balance = "+balance);
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

}
