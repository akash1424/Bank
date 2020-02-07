
public class Transaction {
	public static void Deposit(Customer[] c1,double amount,int accountNo) {
		double finalam=c1[accountNo].getAcc().getAccountBalance();//Initial Amount
		System.out.println("*************************************************");
		System.out.println("Initial Amount		:"+finalam);
		finalam+=amount;
		c1[accountNo].getAcc().setAccountBalance(finalam);//Updated Amount	
		System.out.println("New Amount		:"+finalam);
		System.out.println("*************************************************");

	}
	public static void withdraw(Customer[] c1,double amount,int accountNo) {
		double finalam=c1[accountNo].getAcc().getAccountBalance();//Initial Amount
		if(finalam<=0||finalam<amount) {
			System.out.println("Sorry.....You can't withdraw .......Please Enter Valid Amount.");
			System.out.println("*************************************************");
			return;
		}
		else {
			System.out.println("*************************************************");
			System.out.println("Initial Amount		:"+finalam);
			finalam-=amount;
			c1[accountNo].getAcc().setAccountBalance(finalam);//Updated Amount	
			System.out.println("withdrawed amount	:"+amount);
			System.out.println("New Amount		:"+finalam);
			System.out.println("*************************************************");
		}
	}
	public static void checkBal(Customer[] c1,int accountNo){
		System.out.println("*************************************************");
		System.out.println("Customer ID		:"+c1[accountNo].getCustId());
		System.out.println("Customer Name		:"+c1[accountNo].getCustName().toUpperCase());
		System.out.println("Account Balance		:"+c1[accountNo].getAcc().getAccountBalance());
		System.out.println("*************************************************");
	}
}
