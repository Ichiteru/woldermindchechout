package repo;

import entity.Pimp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PimpRepo implements Serializable {
    private static PimpRepo instance;
    private List<Pimp> pimps;



    private PimpRepo() {
        pimps = new ArrayList<>();
    }

    public static PimpRepo getInstance(){
        if(instance == null){
            instance = new PimpRepo();
        }
        return instance;
    }

    public List<Pimp> getAllPimps(){
        return pimps;
    }

    public void add(Pimp pimp){
        pimps.add(pimp);
    }
}
