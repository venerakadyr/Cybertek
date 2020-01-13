package arrList;

import classes.Item;

public class Mall {
    public static void main(String[] args) {
        Store zara=new Store("zara","312 main str");
        Item item1=new Item("socks",15);
        Item item2=new Item("dress",89);

        zara.addItem(item1);
        zara.addItem(item2);
        System.out.println(zara.numOfItems);


//        zara.addItem();
        zara.sellItem("socks");

    }
}
