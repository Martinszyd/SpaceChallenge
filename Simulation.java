import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {

    private List<Item> items = new ArrayList();
    try
    {
        public List<Item> loadItems () {
        File ph1 = new File("phase-1.txt");
        Scanner scan1 = new Scanner(ph1);

        return items;
    }
    }
    catch (FileNotFoundException e){
        e.getMessage();
    }
}
