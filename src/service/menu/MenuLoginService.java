package service.menu;

import bean.Config;
import services.menu.inter.MenuLoginServiceInter;

import java.util.Scanner;


public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("password:");
        String password = sc.nextLine();

        if (!(username.equals("user") && password.equals("11111"))) {
            throw new IllegalArgumentException("user or password is invalid!");
        }
        Config.setLoggedIn(true);
    }
}
