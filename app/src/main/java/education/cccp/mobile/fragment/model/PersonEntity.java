package education.cccp.mobile.fragment.model;

import java.util.Date;

public class PersonEntity {
    private Integer id;
    private String firstName;
    private String lastName;
    private Date dob;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonEntity{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", dob=").append(dob);
        sb.append('}');
        return sb.toString();
    }

    public PersonEntity(Integer id,
                        String firstName,
                        String lastName,
                        Date dob) {
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

    public Date getDob() {
        return dob;
    }
}
