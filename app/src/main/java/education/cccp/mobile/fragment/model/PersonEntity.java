package education.cccp.mobile.fragment.model;

import java.time.LocalDate;

public class PersonEntity {
    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public PersonEntity(Integer id,
                        String firstName,
                        String lastName,
                        LocalDate dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDob() {
        return dob;
    }
}
