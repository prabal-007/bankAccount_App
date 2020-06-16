package bankaccount_app;

public class BankAccount_app {

	public static void main(String[] args) {
		
		checking check1 = new checking("Prabal Gupta", "1234567890", 2000);
				
		saveings savcc1 = new saveings("tony Stark", "1234567891", 1500);
		
		savcc1.compound();
		
		savcc1.showInfo();
		System.out.println("**********************************");
		check1.showInfo();
		
//		savcc1.deposit(2000);
//		savcc1.withdrawl(200);
//		check1.transfer("tony", 500);
		
	
		
		// Reads CSV file then creates new account based on that data

	}

}
