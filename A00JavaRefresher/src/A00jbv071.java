
import java.util.Scanner;
public class A00jbv071 {
	public static void main(String[] args) {
		int userCashIn = 0;
		String operatorName = "";
		String customerName ="";
		Scanner input = new Scanner(System.in);
		Scanner nameInput = new Scanner(System.in);
		System.out.println("Please enter an interger between 0 - 10,000");
		userCashIn = input.nextInt();
		ATM atm1 = new ATM();
		ATM atm2 = new ATM(userCashIn, true);
		
		System.out.print("Operator, please enter your name: ");
		
		Operator worker = new Operator();
		operatorName = nameInput.nextLine();
		worker.setName(operatorName);
		System.out.println("Processing ATM 1");
		worker.topUpATM(atm1);
		System.out.println("Processing ATM 2");
		worker.topUpATM(atm2);
		
		System.out.print("Customer, enter your name:");
		customerName = nameInput.nextLine();
		Customer userCust = new Customer();
		userCust.setName(customerName);
		System.out.println("Hello " + customerName +", how much money would you like to withdraw?");
		userCashIn = input.nextInt();
		userCust.withdrawCash(atm2, userCashIn);
	}
}
