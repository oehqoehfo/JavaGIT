package GIT;

public class QueueTicketDispenser {
    private int nr;
    
    public QueueTicketDispenser(){
        nr = 1;
    }
    
    public int getNextNumber(){
        return nr++;
    }
    
    
}
