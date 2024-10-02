public class Marin extends AbstractUnit {

    public Marin(int hp, int dmg) {
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
}