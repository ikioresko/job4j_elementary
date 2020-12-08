package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        int count = 1;
            for (int i = index; i < products.length; i++) {
                if (i == products.length - 1) {
                    products[i] = null;
                } else {
                products[i] = products[count + index];
            }

        }
        return products;
    }
}
