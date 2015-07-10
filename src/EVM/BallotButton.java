package EVM;

public class BallotButton implements Button{
	BallotState bs;
	public void pressButton(BallotUnit b) {
		// TODO Auto-generated method stub
		bs.action(b);
	}
	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		
	}

}
