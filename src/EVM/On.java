package EVM;

public class On implements ControlState{

	public void action(ControlUnit c) {
		// TODO Auto-generated method stub
		Busy busy = new Busy();
		c.setState(busy);
		c.setStatus("Busy!!");
		
		
	}

}
