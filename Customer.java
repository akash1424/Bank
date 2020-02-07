
public class Customer {
	private int custId;
	private String custName;
	private String custMobile;
	private String password;
	private Account acc;
	private String custEmail;
	
	public Customer(int custId, String custName, String custMobile, String password, Account acc,String custEmail) {
		this.custId = custId;
		this.custName = custName;
		this.custMobile = custMobile;
		this.password = password;
		this.acc = acc;
		this.custEmail=custEmail;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	
	
}
