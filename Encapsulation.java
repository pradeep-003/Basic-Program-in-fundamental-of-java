class Score{
    private int score ;
    private String Team ;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Score team1 = new Score();
        Score team2 = new Score();
        team1.setScore(277);
        team1.setTeam("CSK");
        team2.setScore(217);
        team2.setTeam("MI");
        System.out.println(team1.getTeam());
        System.out.println(team1.getScore());
        System.out.println(team2.getTeam());
        System.out.println(team2.getScore());
    }
}
