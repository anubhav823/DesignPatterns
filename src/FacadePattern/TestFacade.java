package FacadePattern;

public class TestFacade {
	public static void main(String[] args) {
		BankAccountFacade facade = new BankAccountFacade(12345678, 1234);
		facade.withdrawCash(500);
		facade.withdrawCash(200);
		facade.depositCash(500);
		facade.withdrawCash(500);
	}
}
