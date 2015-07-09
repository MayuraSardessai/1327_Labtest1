package EVM;

public class Busy implements ControlState{

	public void action(ControlUnit c) {
		// TODO Auto-generated method stub
		On on = new On();
		c.setState(on);
		c.setStatus("On!!");
	}

}
