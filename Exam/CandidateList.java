import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CandidateList {
  
    private ArrayList <VotingMachine> candidates = new ArrayList<>();

// constructor

// methods
  public  void addCandidate( VotingMachine candidate) {
    candidates.add(candidate);
  }

  public void castingVotes(VotingMachine candidate) {
    candidates.castVotes(candidate);
  }
  public void printResults(VotingMachine candidate){
    candidates.print(candidate);
  }

  public void CandidateList() {
    for (VotingMachine k: candidates) {
    System.out.println(k.getNumber_of_votes());
      
    
  }
}
    
}
