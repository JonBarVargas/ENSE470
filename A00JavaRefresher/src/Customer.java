
public class Customer extends Person {
	void withdrawCash(ATM atm, int amount)
	{
		System.out.print("Is the atm running? " + atm.getServiceStatus());
		System.out.print("This ATM has $" +atm.queryCash());
		if (atm.queryCash() < amount)
		{
			System.out.println("ATM has insufficient cash");
		}
		else
		{
			atm.reader.readCard();
			atm.display.displayPINverification();
			atm.dispenser.dispenseCash(amount);
			atm.printer.printReciept();
			System.out.println(amount + " succesfully withdrawn from ATM");
			
		}
	}
}
