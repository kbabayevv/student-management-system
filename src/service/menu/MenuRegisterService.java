package service.menu;

import services.menu.inter.MenuRegisterServiceInter;


public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void process() {
        System.out.println("register");
    }
}
