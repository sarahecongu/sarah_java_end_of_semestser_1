

public class VotingMachine {
    private String name;
    private double number_of_votes;

    public VotingMachine(String name,double number_of_votes){
        this.name = name;
        this.number_of_votes = number_of_votes;

    }
    // getters and setters generation
    public String getName() {
        return name;
    }
    public double getNumber_of_votes() {
        return number_of_votes;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber_of_votes(double number_of_votes) {
        this.number_of_votes = number_of_votes;
    }
    

    
}
