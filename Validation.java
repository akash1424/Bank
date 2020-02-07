import java.util.regex.*;
public class Validation {

	public static boolean isValidMobile(String s) 
	{ 

		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(s); 
		return (m.find() && m.group().equals(s)); 
	} 
	public static boolean isValidEmail(String email) 
	{ 
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 

		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) 
			return false; 
		return pat.matcher(email).matches(); 
	}
	
	
	public static boolean Login(Customer[] c1,int accountNo,String password, boolean b) {
		int username=c1[accountNo].getAcc().getAccountNo();
		String pass=c1[accountNo].getPassword();

		if(accountNo==username && password.equals(pass))
		{
			System.out.println("*************************************************");
			System.out.println("WELCOME: "+c1[accountNo].getCustName().toUpperCase()+"\n");
			b=true;
		}
		else{
			System.out.println("Incorrect Credentials....Please enter valid credentials.");
			System.out.println("*************************************************");
			b=false;
		}
		return b;
	}

}