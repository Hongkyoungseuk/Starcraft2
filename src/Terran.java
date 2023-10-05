public enum Terran {
    Marine(3,10,false,false),
    Tank(7,15,false,false),
    Goliath(5,15,false,true),
    Wraith(3,10,true,true),
    Valkyrie(4,12,true,true);

    private int attack;
    private int defense;
    private boolean fly;
    private boolean flyAttack;

    Terran(int attack, int defense, boolean fly, boolean flyAttack) {
        this.attack = attack;
        this.defense = defense;
        this.fly = fly;
        this.flyAttack = flyAttack;
    }

    public void damage(int n) {
        this.defense -= n;
        if (this.defense < 0 ) {
            this.defense = 0;
        }
    }


    //get
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    
    

}
