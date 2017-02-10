package ru.vetalshev.collections.arrayList;

import java.util.List;
import java.util.ArrayList;

public class RunIterator {
    public static void main(String[] args) {
        List<? extends Order> orders = new ArrayList<DiscountOrder>(){
            {
                add(new DiscountOrder(231, 12.f));
                add(new DiscountOrder(389, 10.9f));
                add(new DiscountOrder(217, 1.7f));
            }

            @Override
            public boolean add(DiscountOrder discountOrder) {
                return super.add(discountOrder);
            }
        };

        System.out.println(orders.getClass());

//        for (Order item : orders) {
//            System.out.println(item);
//        }

//        FindOrder fo = new FindOrder();
//        List<Order> res = fo.findBiggerAmountOrder(10f, orders);
//        System.out.println(res);
    }
}