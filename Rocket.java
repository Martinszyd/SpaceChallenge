public class Rocket implements SpaceShip{

    double cost;
    double weight;
    double maxWeight;
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
        return false;
    }

    public int carry(Item item){
        return 0;
    }
}
