package hdfc;

public class Account {

	private int accNo;
	private String accHolderName;
	private double bal;

	public Account() {
		System.out.println("This is My Default Constructors");
		accNo = 0;
		accHolderName = "null";
		bal = 0.0;

	}

	public Account(int accNo, String accHolderName, double bal) {
		System.out.println("This Parameterized Constructors");
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.bal = bal;

	}

	public int getaccNo() {
		return accNo;
	}

	public void setaccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getaccHolderName() {
		return accHolderName;
	}

	public void setaccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getbal() {
		return bal;
	}

	public void setbal(double bal) {
		this.bal = bal;
	}

	public boolean withdraw(double amount) {
		if (amount < 0) {
			System.out.println("amount cant't be less than zero");
			return false;
		} else if (bal < amount) {
			System.out.println("balance cannot be less than amount");
			return false;
		} else {
			bal = bal - amount;
			return true;
		}
	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			System.out.println("amount cant't be less than zero");
			return false;
		} else {
			bal = bal + amount;
			return true;
		}
	}
	
	public boolean transfer(Account account,Account account2,double amount) {
		if (account.getbal()<amount) {
			System.out.println("amount cant't be less than zero");
			return false;
		} else {
			double bal1=account.getbal();
			account.setbal(bal1- amount);
			
			double bal2= account2.getbal();
			account2.setbal(bal2+amount);
			return true;
		}
	}

	public void display() {
		System.out.println("accNo is :" + accNo);
		System.out.println("accHolderName is : " + accHolderName);
		System.out.println("bal is : " + bal);
	}

	public String toString() {
		return "accNo is :" + accNo + "\naccHolderName is : " + accHolderName + "\nbal is : " + bal;
	}

}
