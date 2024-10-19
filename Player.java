package CricketTeam;



public class Player {
    private int jerseyNo;
    private String name;
    private String role;
    private String country;

    public Player(int jerseyNo, String name, String role, String country) {
        this.jerseyNo = jerseyNo;
        this.name = name;
        this.role = role;
        this.country = country;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getCountry() {
        return country;
    }

    public void displayPlayerDetails(int index) {
        System.out.printf("%-5d %-15d %-20s %-20s %-20s\n", index, jerseyNo, name, role, country);
    }
}
