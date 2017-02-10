package ru.vetalshev.collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class FindOrder {




    public List<Order> findBiggerAmountOrder(float bigAmount, List<? extends Order> orders) {
        ArrayList<Order> bigPrices = new ArrayList<>();

       // orders.add(new Order( 1, 2));

      /*  while (it.hasNext()) {
            Order current = it.next();
            if (current.getAmount() >= bigAmount) {
                bigPrices.add(current);
            }
        }*/

        return bigPrices;
    }

    public static void main(String[] args) {
        // FindOrder xxx = new FindOrder();


        Order my = new Order(1, 2);

        Order my2 = new Order(1, 2);

        List<Order> asd = new ArrayList<Order>();

        asd.add(my);

        boolean contains = asd.contains(my2);
        System.out.println(contains);

        //xxx.findBiggerAmountOrder(1, asd);

    }
}
