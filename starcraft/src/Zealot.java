public class Zealot extends AbstractUnit{


    //특수한 무기를 강화
    public Zealot(int hp, int dmg){
        super(hp,dmg);
    }

    @Override
    public int attack(){
        return dmg;
    }

    @Override
    public void beAttacked(AbstractUnit unit) {
        this.hp -= unit.attack();
    }
    //공격받다
   /* public void attackedByZergling(Zergling zergling){
        this.hp = this.hp - (zergling.attack()*2);
    }

    public void attackedByMarin(Marin marin){
        this.hp = this.hp - (marin.attack()+2);
    }
*/
/*    public void status(){
        System.out.println("질럿 현재 체력 : " + hp);
    }*/
}
