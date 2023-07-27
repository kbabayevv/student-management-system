package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import services.menu.inter.MenuAddTeacherServiceInter;

import java.util.List;
import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = sc.nextLine();
        System.out.println("enter surname: ");
        String surname = sc.nextLine();
        System.out.println("enter school name: ");
        String schoolName = sc.nextLine();
        System.out.println("enter salary: ");
        Integer salary = sc.nextInt();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setSchoolName(schoolName);
        t.setSalary(salary);

        Config.instance().getTeachers().add(t);
        System.out.println("Teacher added successfully!");
    }
}
