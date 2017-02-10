package ru.vetalshev.collections.arrayList;

public class Item implements Comparable<Item> {
    private int itemId;
    private double price;
    private String name;

    public Item(int itemId, double price, String name) {
        this.itemId = itemId;
        this.price = price;
        this.name = name;
    }

    public int getItemId() {
        return itemId;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item [itemId =" + itemId + ", price=" + price + ", name=" + name + "]\n";
    }

    @Override
    public int compareTo(Item o) {
        return 0;
    }
}