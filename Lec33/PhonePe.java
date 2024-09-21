package Lec33;

public class PhonePe extends Abstract_Demo {

	public boolean MetroRecharge() {
		System.out.println("Recharge Hogya ");
		return true;
	}

	public boolean LICPayment() {
		System.out.println("LIC ka payment Hogya ");
		return true;
	}

	@Override
	public boolean Payment() {
		// TODO Auto-generated method stub
		return false;
	}

}
