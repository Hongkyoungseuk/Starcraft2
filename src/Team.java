import java.util.ArrayList;

public class Team {
    ArrayList<Enum> units = new ArrayList<>();

    Team() {
        int random = (int)(Terran.values().length * Math.random());
        units.add(Terran.values()[random]);
    }
}
