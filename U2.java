public class U2 extends Rocket{

    private int cost = 120000000;
    private int weight = 18;
    private int maxWeight = 29;
    private double CoLE;
    private double CoLC;

    @Override
    public boolean launch(){
        CoLE = (4/100)*(Item.getWeight()/11);
        if (CoLE>=Math.random());
        return false;
    }

    @Override
    public boolean land(){
        CoLC = (8/100)*(Item.getWeight()/11);
        if (CoLC>=Math.random());
        return false;
    }


}
