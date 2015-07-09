package EVM;

public class Inactive implements BallotState{

	@Override
	public void action(BallotUnit b) {
		// TODO Auto-generated method stub
		
		Active act = new Active();
		b.setState(act);
		b.setStatus("Active!!");
		
	}

}
