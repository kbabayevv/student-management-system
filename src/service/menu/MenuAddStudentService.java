package service.menu;

import bean.Config;
import bean.Student;
import services.menu.inter.MenuAddStudentServiceInter;

import java.util.List;
import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = sc.nextLine();
        System.out.println("enter surname: ");
        String surname = sc.nextLine();
        System.out.println("enter school name: ");
        String schoolName = sc.nextLine();
        System.out.println("enter scholarship: ");
        Integer scholarship = sc.nextInt();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setSchoolName(schoolName);
        s.setScholarship(scholarship);

        Config.instance().getStudents().add(s);
        System.out.println("Student added successfully!");
    }
}
