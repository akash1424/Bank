
public class Account {
	/*private int accNo;
	private double balance;
	private String ifsc;
	private String accType;
	public Account(int accNo, double balance, String ifsc, String accType) {
		this.accNo = accNo;
		this.balance = balance;
		this.ifsc = ifsc;
		this.accType = accType;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}*/
	
	
	private int accountNo;
	private double accountBalance;
	
	

	public double getAccountBalance() {
		return accountBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public Account(int accountNo,double accountBalance) {
		
		this.accountNo = accountNo;
		this.accountBalance=accountBalance;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
		
}
