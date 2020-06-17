package bankaccount_app;

import java.util.LinkedList;
import java.util.List;

public class BankAccount_app {

	public static void main(String[] args) {		
	/*
		checking check1 = new checking("Tony Stark", "1234567890", 2000);
				
		saveings savcc1 = new saveings("Steve Rogers", "1234567891", 1500);
		
//		savcc1.compound();
		
		savcc1.showInfo();
		System.out.println("**********************************");
		check1.showInfo();
		
		savcc1.deposit(2000);
		savcc1.withdrawl(200);
		check1.transfer("tony", 500);
	*/
		
		List<Account> accounts = new LinkedList<Account>();
	
		
		// Reads CSV file then creates new account based on that data
		
		String file = "******//***************//**************/bankfile.csv";           // .csv file path 
		
		
			
			List<String[]> newAccountHolder = utility.CSV.read(file);
			for (String[] accountHolder : newAccountHolder) {
				System.out.println("NEW ACCOUNT ");
				String name = accountHolder[0];
				String sSN = accountHolder[1];
				String accountType = accountHolder[2];
				double initDeposit = Double.parseDouble(accountHolder[3]);
				System.out.println(name+" "+sSN+" "+accountType+" "+initDeposit);
				if (accountType.equals("Savings")) {
					accounts.add(new saveings(name, sSN, initDeposit));
				}
				else if (accountType.equals("Checking")) {
					accounts.add(new checking(name, sSN, initDeposit));
				}
				else {
					System.out.println("ERROR IN READING ACCOUNT TYPE!");
				}
			}
		
		for (Account acc : accounts) {
			System.out.println("////////////////////////");
			acc.showInfo();
		}
	}

}
