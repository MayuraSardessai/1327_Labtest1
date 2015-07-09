package EVM;

public class ControlUnit {
	Candidate c[] = new Candidate[5];
	BallotUnit ballot = new BallotUnit();
	int i;
	int total=0;
	
	ControlUnit()
	{
		
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
}
