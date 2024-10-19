package CricketTeam;
import java.util.ArrayList;





public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private static int playerCounter = 11;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        initializePreAddedPlayers();
    }

    public void addPlayer(Player player) {
        players.add(player);
        playerCounter++;
        System.out.println("Player added successfully.");
    }

    private void initializePreAddedPlayers() {
        players.add(new Player(31, "Martin Guptill", "Batsman", "New Zealand"));
        players.add(new Player(10, "Alex Hales", "Batsman", "England"));
        players.add(new Player(82, "Colin Munro", "Batsman", "New Zealand"));
        players.add(new Player(67, "Salman Ali Agha", "All Rounder", "Pakistan"));
        players.add(new Player(77, "Azam Khan", "Wicket Keeper", "Pakistan"));
        players.add(new Player(46, "Haider Ali", "Batsman", "Pakistan"));
        players.add(new Player(9, "Imad Wasim", "All Rounder", "Pakistan"));
        players.add(new Player(7, "Shadab Khan", "All Rounder", "Pakistan"));
        players.add(new Player(41, "Faheem Ashraf", "All Rounder", "Pakistan"));
        players.add(new Player(71, "Naseem Shah", "Bowler", "Pakistan"));
        players.add(new Player(72, "Tymal Mills", "Bowler", "England"));
    }

    public void removePlayer(int jerseyNo) {
        Player toRemove = null;
        for (Player player : players) {
            if (player.getJerseyNo() == jerseyNo) {
                toRemove = player;
                break;
            }
        }
        if (toRemove != null) {
            players.remove(toRemove);
            System.out.println("Player removed successfully.");
        } else {
            System.out.println("Player not found.");
        }
    }

    public void replacePlayer(int jerseyNo, Player newPlayer) {
        Player toReplace = null;
        for (Player player : players) {
            if (player.getJerseyNo() == jerseyNo) {
                toReplace = player;
                break;
            }
        }
        if (toReplace != null) {
            players.remove(toReplace);
            players.add(newPlayer);
            System.out.println("Player replaced successfully.");
        } else {
            System.out.println("Player not found.");
        }
    }

    public Player searchPlayer(int jerseyNo) {
        for (Player player : players) {
            if (player.getJerseyNo() == jerseyNo) {
                return player;
            }
        }
        return null;
    }

    public void displayAllPlayers() {
        System.out.println("Team: " + teamName);
        System.out.printf("%-5s %-15s %-20s %-20s %-20s\n", "No", "Jersey No", "Name", "Role", "Country");
        int index = 1;
        for (Player player : players) {
            player.displayPlayerDetails(index++);
        }
    }
}



