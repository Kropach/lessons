package KR.Thread.example1;

public class Ticket {
    private int place;
    private boolean bought;

    public Ticket() {
    }

    public Ticket(int place) {
        this.place = place;
        bought = false;
    }

    public synchronized void buy(Cashier c){
        if (!bought){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            bought = true;
            System.out.println("Cashier " + c.getCashierId() + " ticket " + place);
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "place=" + place +
                '}';
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public boolean getBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
}
