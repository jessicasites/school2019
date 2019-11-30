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
		double cost = 0.0;

		for (int i = 1; i <= transactions; i++) {
			cost += i * fee;
		}

		if (cost < balance) {
			balance -= cost;
			return true;
		}
		balance = 0.0;
		return false;
	}
}