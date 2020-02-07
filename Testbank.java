import java.util.Scanner;
//import java.lang.*;

public class Testbank {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Account a1=null;
		Customer c1=null;
		int accountNo=0;
		int custId=100;
		String custName;
		String password;
		String custMobile;
		String custEmail=null;
		double amount=0;
		int accountNo1=0;
		double accountBalance=0;
		Customer arr[]=new Customer[1000];
		String str=null;
		int min=100,max=999;
		int range=max-min+1;
		String line="*************************************************";

		do
		{	
			System.out.println("************Welcome to Bank************");
			System.out.println("1:Register\n2:Login");
			System.out.println("Enter Ur Choice:");
			int ch=sc.nextInt();

			switch(ch){
			case 1:
				System.out.println(line);
				System.out.println("Customer ID:"+custId);
				sc.nextLine();
				System.out.println("Enter Customer Name:");
				custName=sc.nextLine();
				System.out.println("Enter Customer 10 Digit Mobile No:");
				custMobile=sc.next();
				System.out.println("Enter Valid Email Id:");
				custEmail = sc.next(); 
				String valid,valid1;
				do {

					if (Validation.isValidMobile(custMobile)) {
						valid="yes";
					}         
					else {
						System.out.println("Invalid Number......Please Enter Valid 10 Digit Mobile Number:");
						custMobile=sc.next();
						valid="not";
					}
					if (Validation.isValidEmail(custEmail)) {
						valid1="yes";
					} 
					else {
						System.out.println("Invalid Email......Please Enter Valid Email Id:");
						custEmail=sc.next();
						valid1="no";
					} 
				}while(valid=="not"||valid1=="no");

				accountNo=(int)((Math.random()*range)+min);
				System.out.println("Thank You Your Account Number is: '"+accountNo+"' \nNote Down Account Number For Future login.");
				System.out.println("Enter Password:");
				password=sc.next();
				a1=new Account(accountNo, accountBalance);

				c1=new Customer(custId, custName, custMobile, password, a1, custEmail);
				arr[accountNo]=c1;
				System.out.println("Successfully registered....");
				custId++;
				System.out.println(line);
				break;
			case 2:
				System.out.println("1.Customer\n2.Admin");
				int in=sc.nextInt();
				switch(in)
				{
				case 1:
					 try {
						 boolean b=false;
							while(b==false){
								System.out.println("Enter Account Number:");
								accountNo1=sc.nextInt();
								System.out.println("Enter Password:");
								String password1=sc.next();
								if(Validation.Login(arr,accountNo1,password1,b)) {
									b=true;	
								}
							}
				            
				        }
				        catch(Exception e) {
				            System.out.println("Invalid Details.....");
				            break;
				        }
					
					do
					{
						System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Transfer\n5.Display\n6.Logout");
						int cho=sc.nextInt();
						switch(cho)
						{
						case 1:
							System.out.println("Enter Amount To Be Deposit:");
							amount=sc.nextDouble();
							if(amount>0) {
								Transaction.Deposit(arr,amount,accountNo1);
							}
							else {
								System.out.println("You Can't Deposit this ("+amount+") Amount...Please Enter Valid Amount.");
							}
							break;
						case 2:
							System.out.println("Enter Amount to be Withdraw:");
							amount=sc.nextDouble();
							if(amount>0) {
								Transaction.withdraw(arr,amount,accountNo1);	
							}
							break;
						case 3:
							Transaction.checkBal(arr, accountNo1);
							break;
						case 4:
							System.out.println("Enter Account No To Which Amount Transfer:");
							int accountNo2=sc.nextInt();
							int acc2=arr[accountNo2].getAcc().getAccountNo();
							if(accountNo2==acc2) {
								transfer(accountNo1,accountNo2,arr);
							}
							break;
						case 5:
							System.out.println("Enter Account Number:");
							int search=sc.nextInt();
							display(search,arr);
							break;
						case 6:
							str="6";
						}
						if(str=="6") {
							System.out.println("You Are Successfully Logout..........");
							System.out.println(line);
							break;						
						}
						str="yes";
						System.out.println("Enter Your Choice:");

					}while(str.equals("yes"));
					System.out.println("You Are Logout.........");
					break;
				case 2:
					
					break;
				default:
					System.out.println("Please Enter Valid Credentials..........");
				}
			}
			System.out.println("Do You Want to continue: Yes/No\nIf 'Yes' Press '1'");
			int n=sc.nextInt();
			if(n==1) {
				str="yes";
			}
			else {
				str="no";
			}
		}while(str.equals("yes"));
		System.out.println("Thanks Please Visit Again........");
		sc.close();
	}

	public static void display(int accountNo,Customer[] c1) {
		System.out.println("*************************************************");
		System.out.println("****************Customer Details*****************");
		System.out.println("Customer ID		:"+c1[accountNo].getCustId());
		System.out.println("Customer Name		:"+c1[accountNo].getCustName().toUpperCase());
		System.out.println("Customer Email		:"+c1[accountNo].getCustEmail());
		System.out.println("Customer Mobile No	:"+c1[accountNo].getCustMobile());
		System.out.println("Account Balance		:"+c1[accountNo].getAcc().getAccountBalance());
		System.out.println("*************************************************");
	}

	public static void transfer(int accountNo1,int accountNo2, Customer[] c1) {
		Scanner sc =new Scanner(System.in);
		if(accountNo2==c1[accountNo2].getAcc().getAccountNo()) {
			System.out.println("Enter Amount To Transfer:");
			double amount=sc.nextDouble();
			Transaction.withdraw(c1,amount,accountNo1);
			Transaction.Deposit(c1,amount,accountNo2);
			sc.close();
		}
		else {
			System.out.println("Invalid Account Number........");
		}
	}
}