package FacadePattern;

public class BankAccountFacade {

	private int accountNumber;
	private int securityNumber;
	AccountNumberCheck accountNumberCheck;
	SecurityNumberCheck securityNumberCheck;
	WelcomeToBank welcomeToBank;
	FundsCheck fundsCheck;

	/**
	 * @param accountNumber
	 * @param securityNumber
	 */
	public BankAccountFacade(int accountNumber, int securityNumber) {
		this.accountNumber = accountNumber;
		this.securityNumber = securityNumber;

		accountNumberCheck = new AccountNumberCheck();
		securityNumberCheck = new SecurityNumberCheck();
		welcomeToBank = new WelcomeToBank();
		fundsCheck = new FundsCheck();
	}

	public void withdrawCash(double cashToWithdraw) {
		if (accountNumberCheck.isAccountActive(accountNumber) && securityNumberCheck.isCodeCorrect(securityNumber)) {
			fundsCheck.decreaseCashInAccount(cashToWithdraw);
			System.out.println("Transaction complete");
		} else {
			System.out.println("Transaction Failed");
		}
	}

	public void depositCash(double depositCash) {
		if (accountNumberCheck.isAccountActive(accountNumber) && securityNumberCheck.isCodeCorrect(securityNumber)) {
			fundsCheck.increaseCashInAccount(depositCash);
		}
	}
}
