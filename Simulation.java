import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {

    private List<Item> items = new ArrayList();

        public List<Item> loadItems () {
            File ph1 = new File("phase-1.txt");
            try {
                Scanner scan1 = new Scanner(ph1);
                while (scan1.hasNextLine()){
                    items = items.add(scan1.nextLine(), scan1.nextInt());
                }


            } catch (FileNotFoundException e) {
                e.getMessage();
            }
            return items;
        }

        List<U1> u1 = new ArrayList<>();
        public List<U1> loadU1() {

            return u1;
        }

    List<U2> u2 = new ArrayList<>();
    public List<U2> loadU2() {

        return u2;
    }
}
