package FacadePattern;

public class SecurityNumberCheck {

	private int securityNumber = 1234;

	public int getSecurityNumber() {
		return securityNumber;
	}

	public boolean isCodeCorrect(int securityNumberToCheck) {
		return securityNumberToCheck == getSecurityNumber();
	}

}
