public class Main {
    public static void main(String[] args) {
        Team team1 = new Team('t');
        Team team2 = new Team('t');

        mapString(team1, team2);

    }

    public static void mapString(Team team1, Team team2) {
        System.out.println("적군 : " + team2.toStringTeamName());
        System.out.println(team1.getUnit(0));

    }

    public void teamString(Team team) {
        // iterator 써도 되겠다.
        for (int i = 0 ; i < team.getUnits().size() ; i++) {

        }
        
    }
}
