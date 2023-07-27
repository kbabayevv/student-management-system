package bean;

import java.util.List;

public class Teacher extends Person {
    private String schoolName;
    private Integer salary;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name = " + super.getName() +
                " surname = " + super.getSurname() +
                " schoolName = " + schoolName +
                " salary = " + salary;
    }
}
