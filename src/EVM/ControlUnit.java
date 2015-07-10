package EVM;

public class ControlUnit {
	Candidate c[] = new Candidate[5];
	BallotUnit ballot = new BallotUnit();
	Button totalButton;
	Button resetButton;
	Button ballotButton;
	
	int i;
	int total=0;
	String status;
	
	private ControlState cState;

	
	ControlUnit()
	{
	   cState = null;
	   
	}
	
	void registerCandidate()
	{
		 for(i=0;i<5;i++)
		   {
			   c[i] = new Candidate("Candidate"+i,0);
		   }
	}
	
	int getTotalNumberOfVotes()
	{
		for(i=0;i<5;i++)
		{
			total = total + c[i].getCount();
		}
		return total;
	}
	
	void closePoll()
	{
		System.out.println("Poll Closed!!");
	}

	void displayCandidateVotes()
	{
		for(i=0;i<5;i++)
		{
			System.out.println("\nCandidate Name: " + c[i].getName() + " --> Votes: " + c[i].getCount());
		}
	}
	
	void resetCounter()
	{
		for(i=0;i<5;i++)
		{
			c[i].setCount(0);
		}
	}
	

	 public void setState(ControlState cState){
	    this.cState = cState;		
	 }

	 public ControlState getState(){
		 return cState;
   }

	public void setStatus(String status) {
		// TODO Auto-generated method stub
		this.status = status;
		
	}

	public String getStatus() {
		return status;
	}
	
	void changeBallotState()
	{
		ballotButton.pressButton();
	}
	
}
