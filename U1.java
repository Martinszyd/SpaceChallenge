public class U1 extends Rocket {


    private int cost = 100000000;
    private int weight = 10000;
    private int maxWeight = 18000;
    private double CoLE;
    private double CoLC;

    Item item = new Item();
    @Override
    public boolean launch(){
        CoLE = (5/100)*(item.getWeight()/8);
        if (CoLE>=Math.random());
        return false;
    }

    @Override
    public boolean land(){
        CoLC = (1/100)*(item.getWeight()/8);
        if (CoLC>=Math.random());
        return false;
    }
}
