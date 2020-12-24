package repo;

import entity.Person;
import entity.Whore;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WhoreRepo implements Repo, Serializable {
    private static WhoreRepo instance;
    private String filePath = "whores.txt";
    private List<Whore> whores;

    private WhoreRepo() {
        whores = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            this.whores = (ArrayList<Whore>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
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
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(whores);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
