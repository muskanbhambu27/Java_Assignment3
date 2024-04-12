package hdfc;

import java.util.Scanner;

public class TestAccount1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double amount;
		boolean result;
		Account account = new Account(1021, "Imran Asnari", 20000);
		System.out.println(account);
		System.out.println();

		System.out.print("Enter the withdraw amount : ");
		amount = sc.nextInt();

		System.out.println("called Withdraw method ");
		result = account.withdraw(amount);
		if (result == true) {
			System.out.println("withdrawal successfully.");
		} else
			System.out.println("Not Available Balance.");
		System.out.println("current balance : " + account.getbal());
		System.out.println("-----------------------------------------");
		System.out.print("Enter the deposit amount : ");
		amount = sc.nextInt();

		result = account.deposit(amount);
		if (result == true) {
			System.out.println("deposit successfully");
		} else
			System.out.println("invalid amount");
		System.out.println("current deposit balance : " + account.getbal());

		System.out.println("------------------------------");
		System.out.println("calling the transfer method");

		Account account2 = new Account(102, "Spidy", 10000);
		System.out.println("Enter the amount :");
		amount = sc.nextInt();
		result = account2.transfer(account, account2, amount);
		if (result == true)
			System.out.println("transfer is successful");
		else
			System.out.println("there is an error.");
		System.out.println("------------------------------");

		System.out.println("new balance of account 1:" + account.getbal());
		System.out.println("new balance of account 2:" + account2.getbal());
	}

}
