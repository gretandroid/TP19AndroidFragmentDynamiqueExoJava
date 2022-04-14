package education.cccp.mobile.fragment.controller;


import android.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import education.cccp.mobile.fragment.model.PersonEntity;

public class PersonDao {
    private static final List<PersonEntity> listePersonnes = new ArrayList<>();

    static {
        listePersonnes.add(new PersonEntity(
                1,
                "John",
                "Doe",
                new Date()
        ));
        listePersonnes.add(new PersonEntity(
                2,
                "Jane",
                "Doe",
                new Date()
        ));
        listePersonnes.add(new PersonEntity(
                3,
                "Karl",
                "Cox",
                new Date()
        ));
        listePersonnes.add(new PersonEntity(
                4,
                "Sidney",
                "Poitier",
                new Date()
        ));
    }

    public static List<PersonEntity> getAll() {
        Log.d(PersonDao.class.getSimpleName(), listePersonnes.get(0).toString());
        return listePersonnes;
    }

    public static int count() {
        return listePersonnes.size();
    }
}