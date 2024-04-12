package Classroom3;		//Que 6
class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
}

public class SavingsAccoun {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.03);
        
        System.out.println("Initial balance:");
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("\nBalances after one month 3% annual interestrate:");
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());
        
        SavingsAccount.modifyInterestRate(0.04);
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("\nBalances after another month 4% annual interestrate:");
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());
    }
}
