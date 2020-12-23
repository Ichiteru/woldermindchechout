package service;

import entity.Pimp;
import entity.Whore;
import repo.PimpRepo;

import java.util.List;

public class PimpService {

    private PimpRepo repo;
    public PimpService(){
        repo= PimpRepo.getInstance();
    }

    public void addPimp(Pimp pimp){
        repo.add(pimp);
    }

    public List<Pimp> getAllPimps(){
        return repo.getAllPimps();
    }

    public double countRevenue(Pimp pimp){

        double revenue=0;

        for(Whore whore: pimp.getWhores()){
            revenue += pimp.getRate()* whore.getPrice();
        }
        return revenue;
    }
}
