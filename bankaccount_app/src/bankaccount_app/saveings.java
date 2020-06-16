package bankaccount_app;

public class saveings extends Account{
	
	// list properties specific to saving account
	
	int safetyDepositBoxKey;
	int safetyDepositBoxID;
	
	// constructor to initialize settings of the savings account
	public saveings(String name,  String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		
		setSafetyDepositBox();
		
		setRate();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	
	// list any method specific to saving account
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		System.out.println("Account Type : SAVINGS");
		super.showInfo();
		System.out.println("Your Savings account features - " +
		"\nSafety Deposit Box ID : " + safetyDepositBoxID +
		"\nSafety Deposit Box Key : " + safetyDepositBoxKey);
	}
	

}
