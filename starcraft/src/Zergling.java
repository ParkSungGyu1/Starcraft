public class Zergling {
    int hp;
    int dmg;
    public Zergling(int hp, int dmg){
        this.hp = hp;
        this.dmg = dmg;
    }
    public int attack(){
        return dmg;
    }
    //공격받다
    public void beAttacked(int dmg){
        this.hp = this.hp - dmg;
    }

    public void attackedByMarin(Marin marin){
        this.hp = this.hp - (marin.attack()+2);
    }

    public void attackedByZealot(Zealot zealot){
        this.hp = this.hp - (zealot.attack()-2);
    }

    public void status(){
        System.out.println("저글링 현재 체력 : " + hp);
    }
}
