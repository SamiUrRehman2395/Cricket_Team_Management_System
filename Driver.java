package CricketTeam;


public class Driver {
    public static void main(String[] args) {
        int choice;
        do {
            IslamabadUnitedTeamManagement.displayMenu();
            choice = IslamabadUnitedTeamManagement.scanner.nextInt();
            IslamabadUnitedTeamManagement.handleMenuChoice(choice);
        } while (choice != 6);
    }
}

