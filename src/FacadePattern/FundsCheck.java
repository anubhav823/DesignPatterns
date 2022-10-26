package FacadePattern;

public class FundsCheck {

	private double cashInAccount = 1000;

	private double getCashInAccount() {
		return cashInAccount;
	}

	public void decreaseCashInAccount(double cashWithdrawn) {
		if (getCashInAccount() > cashWithdrawn) {
			cashInAccount -= cashWithdrawn;
		} else {
			System.out.println("You dont have sufficient balance");
			System.out.println("Current balance "+getCashInAccount());
		}
	}

	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
		System.out.println("Deposited $"+cashDeposited);
		System.out.println("New balance "+getCashInAccount());
	}

}
