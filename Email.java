package emailapp;
import java.util.*;
public class Email {
	private String FirstName;
	private String LastName;
	private String Password;
	private String department;
	private String e_mail;
	private int mailboxCapacity=40;
	private String alternativeEmail;
	private int passwordLength=10;
	private String CompanyName="XYZ";
	
	//constructor method
	public Email(String FirstName,String LastName) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		System.out.println("Email is created Successfully"+this.FirstName+" "+this.LastName);
		this.department=setDepartment();
		System.out.println(department);
		//call a method for password
		this.Password=randomPassword(passwordLength);
		System.out.println("Your Password is :"+Password);
		//create E-mail for employees
		e_mail=FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+department+"."+CompanyName;
		System.out.println("Your email id is :" +e_mail);
	}
	//ask for department
	private String setDepartment() {
		System.out.print("Enter the department\n 1 for Devloper\n 2 for tester\n 3 for Maneger\n 0 for None");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) return "Developer";
		else if(n==2) return "Tester";
		else if(n==3) return "Manager";
		return "";
	}
	//now for password
	private String randomPassword(int length) {
		String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()_+|}{";
		char[]password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordset.length());
			password[i]=passwordset.charAt(rand);
		}
		return new String(password);
	}
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternativeEmail=altEmail;
	}
	public void changePassword(String password) {
		this.Password=password;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternativeEmail;
	}
	public String getPassword() {
		return Password;
	}
	public String show() {
		return "Name : "+FirstName+" "+LastName+ 
				"Department :"+department+ 
				"E-Mail ID :" +e_mail+ 
				"Generated Password :"+Password+ 
				"MailBoxCapacity :" +mailboxCapacity ;
	}
}
