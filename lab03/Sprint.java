public class Sprint {
    private int maxEstimate;
    private int maxTickets;

    private Ticket[] tickets;
    private int count;

    public Sprint(int maxEstimate, int maxTickets) {
        this.maxEstimate = maxEstimate;
        this.maxTickets = maxTickets;
        this.tickets = new Ticket[maxTickets];
        this.count = 0;
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bug) {
        return addTicket(bug);
    }

    private boolean addTicket(Ticket ticket) {
        if (ticket == null) return false;
        if (ticket.isCompleted()) return false;
        if (count >= maxTickets) return false;

        if (getTotalEstimate() + ticket.getEstimate() > maxEstimate) {
            return false;
        }

        tickets[count] = ticket;
        count++;
        return true;
    }

    public Ticket[] getTickets() {
        Ticket[] copy = new Ticket[count];
        for (int i = 0; i < count; i++) {
            copy[i] = tickets[i];
        }
        return copy;
    }

    public int getTotalEstimate() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += tickets[i].getEstimate();
        }
        return sum;
    }
}