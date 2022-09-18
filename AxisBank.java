package Week3day1;

public class AxisBank extends BankInfo {

	
	public void deposit()
	{
		System.out.println("Deposit amount rejected");
	}
	public static void main(String[] args) {
		
AxisBank bk=new AxisBank();
bk.deposit();
bk.fixed();
bk.saving();

	}

}
