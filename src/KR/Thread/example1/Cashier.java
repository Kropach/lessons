package KR.Thread.example1;

import java.util.Arrays;

public class Cashier extends Thread{
    private int cashierId;
    private Ticket[] tickets;

    public Cashier() {
    }

    public Cashier(int cashierId, Ticket[] tickets) {
        this.cashierId = cashierId;
        this.tickets = tickets;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < tickets.length; i++) {
//            if(!tickets[i].getBought()){
//                try{
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(e);
//                }
//            }
//            tickets[i].setBought(true);
//            System.out.println("Cashier " + cashierId + " ticket " + tickets[i].getPlace());
            tickets[i].buy(this);
        }

    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + cashierId +
                ", tickets=" + Arrays.toString(tickets) +
                '}';
    }

    public int getCashierId() {
        return cashierId;
    }

    public void setCashierId(int id) {
        this.cashierId = cashierId;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }
}
