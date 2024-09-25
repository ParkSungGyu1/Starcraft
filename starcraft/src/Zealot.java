public class Zealot {
    int hp;
    int dmg;

    //특수한 무기를 강화
    public Zealot(int hp, int dmg){
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

    public void attackedByMarin(Marin marin){
        this.hp = this.hp - (marin.attack()+2);
    }

    public void status(){
        System.out.println("질럿 현재 체력 : " + hp);
    }
}
