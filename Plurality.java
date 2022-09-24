import java.util.Arrays;

public class Plurality 
{
    /*  The RoHawks are holding an election to decide the next Captain! They're going to hold a 
    Plurality election, a type of election where every voter only gets to vote for one candidate.
    Once the election has ended, whichever candidate has the most votes will win the election! 

    Implement the Plurality class which contins all the steps of a plurality election:
        Plurality(String[] candidates)
        void vote(String candidate)
        String[] getWinner()

    Tip: Feel free to make as many instance varibles as you want! They are necessary for a neat implementation.
    Tip: I've imported java.util.Arrays for its Arrays.toString() method. It can take in an array and turn it
         to a String, which is great for debugging. 
            ex: String[] s = {"one", "two"};
                System.out.println(Arrays.toString(s)) --> [one, two]

    */

    private String[] candidates; 
    private int[] votes;

    // Use the main method for debugging
    public static void main(String[] args) 
    {
        String [] s = {"Parth", "Eric", "Jonathan"};
        Plurality election = new Plurality(s);

        election.vote("Parth");
        election.vote("Parth");
        election.vote("Eric");
        election.vote("Eric");

        System.out.println(Arrays.toString(election.getWinner()));
     
   
    }
    
    // Construcut the class by inializing all the candidates in an election
        // Input: String[] candidates - a String array that contains all the candidates of an election
    public Plurality(String[] candidates)
    {
        this.candidates = candidates;
        this.votes = new int[candidates.length];

    }

    // Implement a method that will vote for a candidate, recording the vote
        // Input: String candidate - the name of a candidate in the election
        // Output: No returned value
    public void vote(String candidate)
    {
        // I know this implementation is inefficient but it's easier to implement 
        int idx = -1;
        for (int i = 0; i < candidates.length; i ++)
        {
            if (candidate.equals(candidates[i]))
            {
                idx = i;
                break;
            }
        }
        
        if (idx != -1)
        {
            votes[idx] += 1;
        }

    }

    /* Implement a method that will return the current winner of the election
        If there's a tie, return all of the tied candidates*/
        // Input: No input
        /* Output:  A String array which contains all the current winners of the election.
                    If there is one clear winner, return a String array with one element, that 
                    only contains the one winner. If there is a tie, return a String array
                    with all of the tied candidates. The order of candidates does not matter.

                    ex. Jonathan: 9 votes
                        Parth: 8 votes       
                        Eric: 8 votes
                    
                        getWinner() --> ["Jonathan"]

                    ex. Jonathan: 9 votes
                        Parth: 9 votes       
                        Eric: 8 votes
                    
                        getWinner() --> ["Jonathan", "Parth"]
 
                    ex. Jonathan: 9 votes
                        Parth: 9 votes       
                        Eric: 9 votes
                    
                        getWinner() --> ["Jonathan", "Parth", "Eric"]
    
        */
    public String[] getWinner()
    {
        // Get the max votes of any candidate

        int max = Integer.MIN_VALUE;

        int idx = 0;
        for (String candidate : candidates)
        {
            max = Math.max(max, votes[idx]);
            idx++;
        }

        // Record how many candidates have the max # of votes
        
        int winnersCount = 0;
        idx = 0;
        for (String candidate: candidates)
        {
            if (votes[idx] == max)
            {
                winnersCount++;
            }
            idx++;
        }
        
        // Init final array and put all candidates w/ max votes in the final array

        String[] winnersArray = new String[winnersCount];
        int winnersIdx = 0;
        idx = 0;
        for (String candidate : candidates)
        {
            if (votes[idx] == max)
            {
                winnersArray[winnersIdx] = candidate;
                winnersIdx++;
            }
            idx++;
        }

        return winnersArray;

    }


    
}
