package ATM;

public class Validations {
    private String number="123456789123456";

    public int validator(String number) {
	if (this.number.equals(number))
	    return 1;
	else {
	    System.out.println("The card number is incorrect, please re-enter it again.");
	    return 0;
	}
    }
}
