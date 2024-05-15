package task1;

public class SoccerPlayer extends Player {
    public String clubName;

    {
        title = "Soccer Player ";
        System.out.println(title);
    }
    public SoccerPlayer(String name, int age, String clubName) {
        super(name, age);
        this.clubName = clubName;
    }

    @Override
    public void say() {
        say("SUUUUUUUUUUUUUI!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Clubname: " + clubName);
    }

    public String getClubName() {
        return clubName;
    }
}
