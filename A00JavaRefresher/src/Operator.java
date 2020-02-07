
public class Operator extends Person {
	void topUpATM (ATM atm)
	{
		if (atm.getServiceStatus())
		{
			atm.changeServiceStatus();
		}

		System.out.println("The current cash amount is $" + atm.queryCash());
		if (atm.queryCash() < 5000) {
			atm.increaseCash(5000);
		}
		System.out.println("The new cash amount is $" + atm.queryCash());
		atm.changeServiceStatus();
	}
}
