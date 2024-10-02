public class Zergling extends AbstractUnit {

    public Zergling(int hp, int dmg){
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

/*    public void attackedByMarin(Marin marin){
        this.hp = this.hp - (marin.attack()+2);
    }

    public void attackedByZealot(Zealot zealot){
        this.hp = this.hp - (zealot.attack()-2);
    }

    public void status(){
        System.out.println("저글링 현재 체력 : " + hp);
    }*/
}
