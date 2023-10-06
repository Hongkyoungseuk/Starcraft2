import java.util.ArrayList;

public class Team {
    private ArrayList<Enum> units = new ArrayList<>();
    private int teamSize;

    Team(char t) {
        int random;
        if (t == 'T' || t == 't') { // Terran
            this.teamSize = 5;
            for (int i = 0; i < this.teamSize; i ++) {
                random = (int)(Terran.values().length * Math.random());
                units.add(Terran.values()[random]);
            }
        } else if (t == 'Z' || t == 'z') {  // Zerg
            this.teamSize = 8;
            random = (int)(Zerg.values().length * Math.random());
            units.add(Zerg.values()[random]);
        } else if (t == 'P' || t == 'p') {  // Protos
            this.teamSize = 4;
            random = (int)(Protos.values().length * Math.random());
            units.add(Protos.values()[random]);
        } else {
            this.teamSize = 0;
            System.out.println("팀이 만들어지지 않았습니다.");
        }

        //todo
    }


    public ArrayList<Enum> getUnits() {
        return units;
    }

    public Enum getUnit(int i) {
        return units.get(i);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String toStringTeamName() {
        return getUnit(0).getClass().getTypeName();
    }
}
