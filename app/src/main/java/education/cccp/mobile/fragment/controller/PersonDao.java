package education.cccp.mobile.fragment.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import education.cccp.mobile.fragment.model.PersonEntity;

public class PersonDao {
    private static final List<PersonEntity> PERSON_ENTITIES = new ArrayList<>();

    static {
        PERSON_ENTITIES.add(new PersonEntity(
                1,
                "John",
                "Doe",
                new Date()
        ));
        PERSON_ENTITIES.add(new PersonEntity(
                2,
                "Jane",
                "Doe",
                new Date()
        ));
        PERSON_ENTITIES.add(new PersonEntity(
                3,
                "Karl",
                "Cox",
                new Date()
        ));
        PERSON_ENTITIES.add(new PersonEntity(
                4,
                "Sidney",
                "Poitier",
                new Date()
        ));
    }

    public static List<PersonEntity> getAll() {
        return PERSON_ENTITIES;
    }

    public static PersonEntity findOneById(int id) {
        PersonEntity person = null;
        for (PersonEntity p : PERSON_ENTITIES) {
            if (p.getId() == id) person = p;
        }
        return person;
    }

    public static int count() {
        return PERSON_ENTITIES.size();
    }
}