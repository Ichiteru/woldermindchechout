package controller;

import entity.Pimp;
import service.PimpService;

public class PimpController {

    private PimpService pimpService;

    public  PimpController(){
        pimpService = new PimpService();
    }

    public void addPimp(Pimp pimpFromMenuInput){
        pimpService.addPimp(pimpFromMenuInput);
    }

    public double countRevenue(Pimp pimpFromMenuInput){return pimpService.countRevenue(pimpFromMenuInput);}
}
