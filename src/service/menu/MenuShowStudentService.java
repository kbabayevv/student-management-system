package service.menu;

import bean.Config;
import bean.Student;
import services.menu.inter.MenuShowStudentServiceInter;

import java.util.List;

public class MenuShowStudentService implements MenuShowStudentServiceInter {
    @Override
    public void process() {
        System.out.println(Config.instance().getStudents());
    }
}
