
public class ATM {
	protected int cash;
	protected boolean inService;
	public ATM()
	{
		cash =0;
		inService = false;
	}
	public ATM(int x, boolean y) 
	{
		cash = x;
		inService = y;
	}
	public int queryCash()
	{
		return cash;
	}
	
	public void increaseCash(int x)
	{
		cash += x;
	}
	public void reduceCash(int x)
	{
		cash -= x;
	}
	boolean getServiceStatus()
	{
		return inService;
	}
	void changeServiceStatus()
	{
		if (inService)
		{
			inService = false;
		}
		else
		{
			inService = true;
		}
	}
	public class CashDispenser{
		void dispenseCash(int x)
		{
			reduceCash(x);
			System.out.println(x +"dollars has been dispensed.");
		}
	}
	public class ReceiptPrinter{
		void printReciept() {
			System.out.println("Reciept has been printed");
		}
	}
	public class CardReader{
		void readCard()
		{
			System.out.println("Reciept has been printed");
		}
	}
	public class KeypadDisplay{
		void displayPINverification() {
			System.out.println("PIN has been verified");
		}
	}
	
	CashDispenser dispenser = new CashDispenser();
	ReceiptPrinter printer = new ReceiptPrinter();
	CardReader reader = new CardReader();
	KeypadDisplay display = new KeypadDisplay();
	
}
