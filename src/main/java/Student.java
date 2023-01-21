public class Student {
    private Long id;
    private String firstname;
    private String lastname;
    private Integer birtYear;

    public Student(Long id, String firstname, String lastname, Integer birtYear) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birtYear = birtYear;
    }

    public Student() {
    }


    public Student(String firstname, String lastname, Integer birtYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birtYear = birtYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getBirtYear() {
        return birtYear;
    }

    public void setBirtYear(Integer birtYear) {
        this.birtYear = birtYear;
    }

    @Override
    public String toString() {
        return id+" "+firstname+" "+lastname+" "+birtYear;
    }
}
