import controller.WhoreController;
import entity.Whore;

public class Application {
    public static void main(String[] args) {
        System.out.println("Whorehouse is running");

        Whore currentWhore = new Whore("tamara", 50);
        WhoreController whoreController = new WhoreController();
        whoreController.addWhore(currentWhore);
        whoreController.addWhore(currentWhore);
        whoreController.addWhore(currentWhore);
        whoreController.fuckTheWholeHotel();
    }
}
