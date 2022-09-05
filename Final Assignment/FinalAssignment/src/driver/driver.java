package driver;

import adt.SortedArrayListInterface;
import adt.SortedArrayList;
import java.util.Iterator;
import adt.LinkedStack;
import entity.Inventory;

public class driver {

        public static void main(String[] args) {
            SortedArrayListInterface<Inventory> invList = new SortedArrayList<>();
            // this.invCode = invCode;
            // this.invName = invName;
            // this.quantity = quantity;
            // this.price = price;
            invList.add(new Inventory("inv001"));
            invList.add(new Inventory("inv002"));
            invList.add(new Inventory("inv003"));
            invList.add(new Inventory("inv004"));
            invList.toString();

            Iterator<Inventory> invIterator = invList.getIterator();
            while(invIterator.hasNext()){
                Inventory inv = invIterator.next();
                System.out.println(inv.getInvCode());
        }

    }
}
