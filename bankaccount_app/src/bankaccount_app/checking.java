package bankaccount_app;

public class checking extends Account{
	
	// list  properties specific to checking account
	
	private int debitCardNumber;
	private int debitCardPIN;
	
	// constructor to initilize checking account properties
	
	public checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		
		setDebitCard();
		
		setRate();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// list of any method specific to checking account
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10,12));
		debitCardPIN = (int) (Math.random() * Math.pow(10,4));
	}
	
	
	public void showInfo() {
		System.out.println("Account Type : CHECKING");
		super.showInfo();
		System.out.println("Checking Account Features - " +
		"\nDebit Card Number : "+debitCardNumber+
		"\nDebit Card PIN : "+debitCardPIN);
	}
	
}
