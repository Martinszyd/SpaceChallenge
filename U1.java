import java.util.Random;

public class U1 extends Rocket {


    U1() {
        rocketCost = 100;                    // Rocket cost = $100 Million
        rocketWeight = 10000;                // Rocket weight = 10000 kilograms
        maxWeight = 18000;             // Rocket Max weight (with cargo) = 18000 kilograms
        rateExplosion = 0.05;                // 5% rate of launch explosion
        rateCrash = 0.01;                    // 1% rate of landing crash
        cargoLimit = maxWeight - rocketWeight;
        currentWeight = rocketWeight;
        random = new Random().nextDouble();     // generates a new random number between 0 and 0.9999999999....
    }

    @Override
    public boolean launch(){
        this.CoLE = rateExplosion*(cargoCarried/cargoLimit);
        return !(this.CoLE >= this.random);
    }

    @Override
    public boolean land(){
        this.CoLC = rateCrash*(cargoCarried/cargoLimit);
        return !(this.CoLC >= this.random);
    }
}
