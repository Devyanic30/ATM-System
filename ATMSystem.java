import java.util.Scanner;

class Bank {
	private int Balance = 1000;
	private int pin = 1234;
	
	public void withdraw() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw:");
		int withdrawAmt = input.nextInt();
		if(withdrawAmt <= Balance) {
			Balance = Balance - withdrawAmt;
			System.out.println("Rs. " + withdrawAmt + " has been withdrawn from your account");
			System.out.print("Your Current Balance is: Rs. " + Balance);
			System.out.println(" ");
		} else {
			System.out.print("Insufficient Balance");
		}
	}

	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter Amount to deposit:");
		Scanner input = new Scanner(System.in);
		int depositAmt = input.nextInt();
		
		System.out.println("Enter your 4 digit secret pin:");
		int enteredPin = input.nextInt();
//		if(enteredPin >= 4) {
//			System.out.print("Please Enter valid 4 digit pin");
//			return;
//		} else 
		if(enteredPin == pin) {
			System.out.println("Entered pin is correct");
			Balance = Balance + depositAmt;
			System.out.print("Your current Balance is: " + Balance);
			System.out.println(" ");
		}
		else {
			System.out.print("Entered pin is incorrect");
			return;
		}
	}

	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.print("Your Current Balance is " + Balance);
		System.out.println(" ");
	}
	
}

public class ATMSystem {
	public static void main(String args[]) {
		Bank b1 = new Bank();
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n Welcome !!");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check your Bank Balance");
			System.out.println("4. Exit");
			System.out.println("Choose the operation you want to perform:");
			
			int num = sc.nextInt();
			
			//switch case 
			switch(num) {
			case 1: 
				//withdraw option
				b1.withdraw();
				break;
			case 2:
				//Deposit option 
				b1.deposit();
				break;
			case 3:
				//check bank balance
				b1.checkBalance();
				break;
			case 4: 
				//exit
				System.exit(0);
			}
		}
	}
	
}
