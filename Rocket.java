public class Rocket implements SpaceShip{

    int cost;
    int weight;
    int maxWeight;
    double CoLE;
    double CoLC;

    public Rocket(){

    }

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item) {
        if (maxWeight<=weight+item.getWeight());
        return true;
    }

    public int carry(Item item){
        int currentWeight = weight + item.getWeight();
        return currentWeight;
    }
}
