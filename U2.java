public class U2 extends Rocket{

    private int cost = 120000000;
    private int weight = 18000;
    private int maxWeight = 29000;
    private double CoLE;
    private double CoLC;

    Item item = new Item();
    @Override
    public boolean launch(){
        CoLE = (4/100)*(item.getWeight()/11);
        if (CoLE>=Math.random());
        return false;
    }

    @Override
    public boolean land(){
        CoLC = (8/100)*(item.getWeight()/11);
        if (CoLC>=Math.random());
        return false;
    }


}
