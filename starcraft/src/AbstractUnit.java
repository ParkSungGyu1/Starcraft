public abstract class AbstractUnit {
    protected int hp;
    protected int dmg;

    public AbstractUnit(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    public abstract int attack();
    public abstract void beAttacked(AbstractUnit unit);

    public void status(){
        System.out.println(this.getClass().getName() + " hp "+ hp);
    }
}
