import java.util.Random;

public class Rocket implements SpaceShip{

    int rocketCost;
    int rocketWeight;
    int maxWeight;
    int cargoCarried;
    int currentWeight;
    int cargoLimit;
    double rateExplosion;
    double rateCrash;
    double CoLE;
    double CoLC;
    double random;

    String rocketStatus;

    Rocket() {
        currentWeight = 0;
        cargoCarried = 0;
        CoLE = 0.0;         // Chance of launch explosion = 5% * (cargo carried / cargo limit)
        CoLC = 0.0;            // Chance of landing crash = 1% * (cargo carried / cargo limit)
        cargoLimit = 0;                      // in kilograms
        rocketStatus = "not loaded";
        random = new Random().nextDouble();     // generates a new random number between 0 and 0.9999999999....
    }

    public boolean launch(){ return true; }

    public boolean land(){
        return true;
    }

    public boolean canCarry(Item cargo) {
        return (this.currentWeight + cargo.weight) <= maxWeight;
    }

    public void carry(Item cargo){
        this.currentWeight = this.currentWeight + cargo.weight;
        this.cargoCarried =  this.currentWeight - this.rocketWeight;         // and update rocket cargo carried
    }
}
