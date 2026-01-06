import java.util.*;
class Voter{
    private String id;
    private String name;

    public Voter(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
class Candidate{
    private String id;
    private String name;
    public Candidate(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return this.id;

    }
    public String getName(){
        return this.name;
    }
}
class DataStore<T>{
    private HashMap<String, T> data = new HashMap<>();
    public void add(String k, T value){
        data.put(k,value);
    }
    public T get(String k){
        return data.get(k);
    }
    public boolean available(String k){
        return data.containsKey(k);
    }
    public Map<String,T> fetchAll(){
        return data;
    }
}
abstract class ElectionServices{
    protected DataStore<Voter> voterStore = new DataStore<>();
    protected DataStore<Candidate> candidateStore = new DataStore<>();
    protected HashMap<String ,Integer> voteCount = new HashMap<>();
    protected HashMap<String , Boolean> isVoted = new HashMap<>();
    public abstract void addVoter(Voter voter);
    public abstract void addCandidate(Candidate candidate);
    public abstract void castVote(String voterId, String candidateId) throws DuplicateVoteException;
    public abstract void printResult();
}

class SimpleElectionService extends ElectionServices{
    @Override
    public void addVoter(Voter voter){
         if (!voterStore.available(voter.getId())) {
            voterStore.add(voter.getId(), voter);
            isVoted.put(voter.getId(), false);
        } else {
            System.out.println("Voter already registered: " + voter.getId());
        }
    }
    @Override
    public void addCandidate(Candidate candidate){
        if(!candidateStore.available(candidate.getId())){
            candidateStore.add(candidate.getId(),candidate);
            voteCount.put(candidate.getId(), 0);
        }else{
            System.out.println("Candidate already exists"+candidate.getId());
        }
    }
    @Override
    public void castVote(String voterId, String candidateId) throws DuplicateVoteException {
        if (!voterStore.available(voterId)) {
            throw new IllegalArgumentException("Voter not registered: " + voterId);
        }
        if (!candidateStore.available(candidateId)) {
            throw new IllegalArgumentException("Candidate not found: " + candidateId);
        }
        if (isVoted.get(voterId)) {
            throw new DuplicateVoteException("Voter has already voted: " + voterId);
        }
        voteCount.put(candidateId, voteCount.get(candidateId) + 1);
        isVoted.put(voterId, true);
    }
    @Override
    public void printResult(){
        System.out.println("Elections Result ");
        for(Map.Entry<String,Integer> entry: voteCount.entrySet()){
            Candidate candidate = candidateStore.get(entry.getKey());
            System.out.println(candidate.getName()+" :"+ entry.getValue() + "  votes got");
        }
    }

}
public class OnlineVotingSystem {
    public static void main(String[] args) {
        ElectionServices election = new SimpleElectionService();
        Voter voter1 = new Voter("1","Hemant");
        Voter voter2 = new Voter("2","Sparsh");
        Voter voter3 = new Voter("3","Priyanshu");
        Voter voter4 = new Voter("4","Prerit");
        Voter voter5 = new Voter("5","Abhishek");
        election.addVoter(voter1);
        election.addVoter(voter2);
        election.addVoter(voter3);
        election.addVoter(voter4);
        election.addVoter(voter5);

        Candidate candidate1 = new Candidate("1","BJP");
        Candidate candidate2 = new Candidate("2","Congress");
        election.addCandidate(candidate1);
        election.addCandidate(candidate2);

         try {
            election.castVote("1", "1");
            election.castVote("2", "1");
            election.castVote("3", "2");
            election.castVote("4", "2");
            election.castVote("5", "2");
          
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        election.printResult();

    }
}
