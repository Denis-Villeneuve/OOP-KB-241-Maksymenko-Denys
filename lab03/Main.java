public class Main {
    public static void main(String[] args) {

        UserStory us1 = new UserStory(1, "Реєстрацiя", 5, null);
        UserStory us2 = new UserStory(2, "Логiн", 3, new UserStory[]{us1});

        us1.complete();
        us2.complete();

        Bug bug1 = Bug.createBug(1, "Помилка пароля", 2, us2);

        Sprint sprint = new Sprint(10, 5);

        sprint.addUserStory(us1);
        sprint.addUserStory(us2);
        sprint.addBug(bug1);

        Ticket[] tickets = sprint.getTickets();

        for (int i = 0; i < tickets.length; i++) {
            System.out.println(tickets[i]);
        }

        System.out.println("Total estimate: " + sprint.getTotalEstimate());
    }
}