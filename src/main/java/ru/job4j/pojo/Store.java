package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product[] prods = new Product[5];
        prods[0] = new Product("Milk", 10);
        prods[1] = new Product("Bread", 4);
        prods[2] = new Product("Egg", 19);
        for (int i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}