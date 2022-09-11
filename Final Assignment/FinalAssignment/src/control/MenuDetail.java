package control;

import adt.ArrayList;
import adt.ArrayListInterface;
import entity.Menu;

import java.util.Iterator;

public class MenuDetail {
    ArrayListInterface<Menu> menuList = new ArrayList<Menu>();

    public void MenuList(){
        ArrayListInterface<Menu> menuList = new ArrayList<>();
        Menu menu;
        menuList.add(menu = new Menu("M001","Black pepper Steak","Steak with black pepper","Inv001",45));
        menuList.add(menu = new Menu("M002","Black pepper Pork","Pork with black pepper","Inv002", 45));
        menuList.add(menu = new Menu("M001","Black pepper Steak","Steak with black pepper","Inv001", 45));
    }

    public void Main(){
        Iterator<Menu> menuIterator = menuList.getIterator();
        System.out.println("\nMenu list: ");
        while (menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            System.out.printf(menu.getMenuID(), menu.getMenuName(), menu.getMenuDesc(), menu.getMenuPrice());
        }
    }
}
