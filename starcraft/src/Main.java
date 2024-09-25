public class Main {
    public static void main(String[] args) {

        Marin marin = new Marin(10,20);
        Zealot zealot = new Zealot(10,30);
        Zergling zergling = new Zergling(5,3);

        marin.status();
        zealot.status();
        zergling.status();

        marin.attackedByZergling(zergling);
        marin.attackedByZealot(zealot);
        zealot.attackedByZergling(zergling);


        System.out.println("=================");

        marin.status();
        zealot.status();
        zergling.status();



    }
}