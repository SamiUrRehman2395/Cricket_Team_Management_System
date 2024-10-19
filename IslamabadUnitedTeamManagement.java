package CricketTeam;
import java.util.Scanner;


public class IslamabadUnitedTeamManagement {
    public static final Scanner scanner = new Scanner(System.in);
    private static final Team team = new Team("ISLAMABAD UNITED");

    public static void displayMenu() {
        System.out.println("\nISLAMABAD UNITED Team Management System");
        System.out.println("1. Add Player");
        System.out.println("2. Remove Player");
        System.out.println("3. Replace Player");
        System.out.println("4. Search Player");
        System.out.println("5. Display All Players");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addPlayer();
                break;
            case 2:
                removePlayer();
                break;
            case 3:
                replacePlayer();
                break;
            case 4:
                searchPlayer();
                break;
            case 5:
                displayAllPlayers();
                break;
            case 6:
                System.out.println("Exiting system...");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }

    public static void addPlayer() {
        System.out.print("Enter Jersey No: ");
        int jerseyNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Player Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Player Role: ");
        String role = scanner.nextLine();

        System.out.print("Enter Player Country: ");
        String country = scanner.nextLine();

        Player player = new Player(jerseyNo, name, role, country);
        team.addPlayer(player);
    }

    public static void removePlayer() {
        System.out.print("Enter Jersey No of Player to remove: ");
        int jerseyNo = scanner.nextInt();
        team.removePlayer(jerseyNo);
    }

    public static void replacePlayer() {
        System.out.print("Enter Jersey No of Player to replace: ");
        int jerseyNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter New Player's Jersey No: ");
        int newJerseyNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter New Player's Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter New Player's Role: ");
        String role = scanner.nextLine();
        System.out.print("Enter New Player's Country: ");
        String country = scanner.nextLine();

        Player newPlayer = new Player(newJerseyNo, name, role, country);
        team.replacePlayer(jerseyNo, newPlayer);
    }

    public static void searchPlayer() {
        System.out.print("Enter Jersey No of Player to search: ");
        int jerseyNo = scanner.nextInt();
        Player player = team.searchPlayer(jerseyNo);
        if (player != null) {
            player.displayPlayerDetails(-1);
        } else {
            System.out.println("Player not found.");
        }
    }



    public static void displayAllPlayers() {
        team.displayAllPlayers(); // Display all players, including pre-added ones
    }
}

