package service;

import entity.Whore;
import repo.WhoreRepo;

import java.util.List;

public class WhoreService {

    private WhoreRepo repo;

    public WhoreService() {
        repo = WhoreRepo.getInstance();
    }

    public void addWhore(Whore whore) {
        repo.add(whore);
    }

    public List<Whore> getAll() {
        return repo.getAll();
    }

    public void fuckTheWholeHotel() {
        for (Whore whore : repo.getAll()) {
            whore.fuck();
        }
    }

    public void show(){
        for (Whore whore :
                repo.getAll()) {
            System.out.println(whore);
        }
    }

}
