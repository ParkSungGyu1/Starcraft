public class Marin {
    int hp;
    int dmg;

    public Marin(int hp, int dmg){
        this.hp = hp;
        this.dmg = dmg;
    }
    public int attack(){
        return dmg;
    }
    //공격받다
    public void attackedByZergling(Zergling zergling){
        this.hp = this.hp - (zergling.attack()*2);
    }

    public void attackedByZealot(Zealot zealot){
        this.hp = this.hp - (zealot.attack()/2);
    }

    public void status(){
        System.out.println("마린 현재 체력 : " + hp);
    }
}
