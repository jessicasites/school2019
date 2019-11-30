//Jessica Sites, 11/30/19
//Practice Problem Exercise 8.11: transactionFeeBankAccount

public abstract class BankAccount {

	private String id;
	private double balance;
	private int transactions;

	public abstract double getBalance();

	public abstract String getID();

	public abstract String getTransactions();

	public BankAccount(String id) {
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public boolean transactionFee(double fee) {

		double cost = (fee * transactions * (transactions + 1)) / 2;

		if (cost < balance) {
			balance -= cost;
			return true;
		}
		balance = 0.0;
		return false;
	}
}