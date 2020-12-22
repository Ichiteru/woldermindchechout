package repo;

import entity.Person;
import entity.Whore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WhoreRepo implements Repo, Serializable {
    private static WhoreRepo instance;

    private final List<Whore> whores;

    private WhoreRepo() {
        whores = new ArrayList<>();
    }

    public static WhoreRepo getInstance() {
        if (instance == null) {
            instance = new WhoreRepo();
        }
        return instance;
    }

    public List<Whore> getAll() {
        return whores;
    }

    public void add(Whore whore) {
        whores.add(whore);
    }
}
