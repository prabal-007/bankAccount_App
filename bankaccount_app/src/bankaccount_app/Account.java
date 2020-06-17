package bankaccount_app;

public abstract class Account implements interestRate{
	// list common properties for savings and checking accounts
	
	private String name;
	private String sSN;
	protected String accountNumber;
	private static int index = 10000;
	private double balance;
	protected double rate;
	
	
	// Constructor to set base properties & initialize the account
	
	public Account (String name,  String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwosSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNo = (int) (Math.random() * Math.pow(10, 3)); 
		return lastTwosSN + uniqueID + randomNo;
		
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest : Rs."+accruedInterest);
	}
	
	// list common methods - Transactions
	
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Depositing Rs."+amount);
		printBalance();
	}
	public void withdrawl(int amount) {
		balance = balance - amount;
		System.out.println("Withdrawl of Rs."+amount);
		printBalance();
	}
	public void transfer(String towho, int amount) {
		balance = balance - amount;
		System.out.println("Transfering Rs."+amount+" to "+towho);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your current balance is Rs."+balance);
	}
	
	
	public void showInfo() {
		System.out.println(
				"Name : "+name+
				"\nAccount Number : "+accountNumber+
				"\nBalance : "+balance+
				"\nRate : "+rate+"%"
				);
	}

}
