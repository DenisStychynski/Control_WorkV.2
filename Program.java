import Controller.PetController;
import Model.Pet;
import Serv.IRepository;
import Serv.PetRepository;
import Interface.Menu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}    