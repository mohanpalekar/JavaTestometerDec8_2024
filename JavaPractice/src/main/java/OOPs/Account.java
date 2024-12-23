package OOPs;

public class Account {

	/*
	 * number
	 * type
	 * bankName
	 * balance
	 */

	private long accountNumber;

	private String type;

	private String bankName;

	private float balance;

	public Account(long accountNumber, String type, String bankName, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.type = type;
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public Account(long accountNumber, String type) {
		super();
		this.accountNumber = accountNumber;
		this.type = type;
	}
	
	public Account() {
		super();
	}


	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", type=" + type + ", bankName=" + bankName + ", balance="
				+ balance + "]";
	}

	public String getData(long number, float balance) {

		if(this.accountNumber == number) {
			return this.accountNumber+" : "+this.balance;
		}
		else return "Account Number Does Not Exist";

	}

	public String getData(String bankName) {

		return this.bankName;

	}


}
