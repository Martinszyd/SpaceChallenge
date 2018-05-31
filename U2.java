import java.util.Random;

public class U2 extends Rocket{

    U2() {
        rocketCost = 120;                    // Rocket cost = $120 Million
        rocketWeight = 18000;                // Rocket weight = 18000 kilograms
        maxWeight = 29000;             // Rocket Max weight (with cargo) = 29000 kilograms
        rateExplosion = 0.04;                // 4% rate of launch explosion
        rateCrash = 0.08;                    // 8% rate of landing crash
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
