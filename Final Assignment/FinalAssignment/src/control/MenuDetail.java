package control;

import adt.ArrayList;
import adt.ArrayListInterface;
import entity.Menu;

import java.util.Iterator;

public class MenuDetail {
    ArrayListInterface<Menu> menuList = new ArrayList<Menu>();

    public void main(){
        Iterator<Menu> menuIterator = menuList.getIterator();
        System.out.println("\nMenu list: ");
        while (menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            System.out.printf(menu.getMenuID(), menu.getMenuName(), menu.getMenuDesc(), menu.getMenuPrice());
        }
    }
}
