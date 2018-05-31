public interface SpaceShip {

    boolean launch();

    boolean land();

    boolean canCarry(Item cargo);

    void carry(Item cargo);
}
