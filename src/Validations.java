
public class Validations {
    private String number;

    public int validator(String number) {
	if (this.number.equals(number))
	    return 1;
	else {
	    System.out.println("The card number is incorrect, please re-enter it again.");
	    return 0;
	}
    }
}