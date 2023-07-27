package bean;

public class Student extends Person {
    private String schoolName;
    private Integer scholarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getScholarship() {
        return scholarship;
    }

    public void setScholarship(Integer scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "name = " + super.getName() +
                " surname = " + super.getSurname() +
                " schoolName = " + schoolName +
                " scholarship = " + scholarship;
    }
}
