package service.menu;

import bean.Config;
import services.menu.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void process() {
        System.out.println(Config.instance().getTeachers());
    }
}
