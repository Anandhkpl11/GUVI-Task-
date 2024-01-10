package Task10;

public class Account {
	//Q.no 4
	
	private double Balance;
	
	// No-argument constructor
	public Account() {
		
		this.Balance =5000;
		
	}
	// Two-argument constructor
     public Account(double balance) {
		
		this.Balance=Balance;
		
	}
     // deposit
     public void deposit(double amount) {
    	 
    	 if (amount >0) {
    		  Balance +=amount;
    		  System.out.println("Deposit successful. New balance: $" + Balance);
			
		} else {
			System.out.println("Invalid deposit amount.");
		}
    	 
	}
     // withdraw
     public void Withdraw(double amount) {
    	 
    	 if (amount > 0 && amount <=Balance) {
    		 Balance -=amount;
    		 System.out.println("Withdrawal successful. New balance: $" + Balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");

		}
		
	}
     
     
     public static void main(String[] args) {
		Account ac1=new Account();
		Account ac2=new Account(2000.0);
		
		System.out.println("balance of account1: "+ac1.Balance);
		System.out.println("balance of account2: "+ac2.Balance);
		
		//deposit
		ac2.deposit(1000.0);
		
		//withdraw
		ac1.Withdraw(1000.0);
	}

}
