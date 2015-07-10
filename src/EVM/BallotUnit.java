package EVM;

public class BallotUnit {
	private BallotState state;
	CandidateButton candButton[] = new CandidateButton[5];
	
	String status;

	   public BallotUnit(){
	      state = null;
	   }

	   public void setState(BallotState state){
	      this.state = state;		
	   }

	   public BallotState getState(){
	      return state;
	   }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
