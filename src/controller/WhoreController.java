package controller;

import entity.Whore;
import service.WhoreService;

public class WhoreController {

    private WhoreService whoreService;

    public WhoreController() {
        whoreService = new WhoreService();
    }

    public void fuckTheWholeHotel() {
        whoreService.fuckTheWholeHotel();
    }

    public void addWhore(Whore whoreFromMenuInput) {
        whoreService.addWhore(whoreFromMenuInput);
    }

    public void showHotel(){
        whoreService.show();
    }


}
