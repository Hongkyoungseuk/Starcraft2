public enum Zerg {
    Zergling(2,2,false,false),
    Hydralisk(3,7,false,true),
    Ultralisk(5,15,false,false),
    Mutalisk(2,8,true,true),
    Guardian(3,6,true,true);

    private int attack;
    private int defense;
    private boolean fly;
    private boolean flyAttack;

    Zerg(int attack, int defense, boolean fly, boolean flyAttack) {
        this.attack = attack;
        this.defense = defense;
        this.fly = fly;
        this.flyAttack = flyAttack;
    }
}