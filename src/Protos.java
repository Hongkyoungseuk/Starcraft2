public enum Protos {
    Zealot(5,20,false,false),
    Dragoon(3,15,false,true),
    HighTempler(10,2,false,false),
    Scout(5,10,true,true),
    Corsair(4,12,true,true);
    
    private int attack;
    private int defense;
    private boolean fly;
    private boolean flyAttack;

    Protos(int attack, int defense, boolean fly, boolean flyAttack) {
        this.attack = attack;
        this.defense = defense;
        this.fly = fly;
        this.flyAttack = flyAttack;
    }
}
