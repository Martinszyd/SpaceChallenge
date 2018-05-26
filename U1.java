public class U1 extends Rocket {


    private int cost = 100000000;
    private int weight = 10;
    private int maxWeight = 18;
    private double CoLE;
    private double CoLC;

    @Override
    public boolean launch(){
        CoLE = (5/100)*(Item.getWeight()/8);
        if (CoLE>=Math.random());
        return false;
    }

    @Override
    public boolean land(){
        CoLC = (1/100)*(Item.getWeight()/8);
        if (CoLC>=Math.random());
        return false;
    }
}
