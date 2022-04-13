package education.cccp.mobile.fragment.controller;


import android.os.Build;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import education.cccp.mobile.fragment.model.PersonEntity;

public class PersonDao {
    static List<PersonEntity> listePersonnes =
            new ArrayList<PersonEntity>() {
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        add(new PersonEntity(
                                1,
                                "John",
                                "Doe",
                                LocalDate.now().minusYears(25)
                        ));
                        add(new PersonEntity(
                                2,
                                "Jane",
                                "Doe",
                                LocalDate.now().minusYears(26)
                        ));
                        add(new PersonEntity(
                                3,
                                "Karl",
                                "Cox",
                                LocalDate.now().minusYears(27)
                        ));
                        add(new PersonEntity(
                                4,
                                "Sidney",
                                "Poitier",
                                LocalDate.now().minusYears(28)
                        ));
                    }
                }
            };


    public static List<PersonEntity> getAll() {
        return listePersonnes;
    }
}