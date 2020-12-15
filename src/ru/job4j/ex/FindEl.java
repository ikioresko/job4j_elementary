package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int temp = -1;
        for (String v : value) {
            temp++;
            if (v.equals(key)) {
                rsl = temp;
            }
        } if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] st = {"Sam", "Call", "Truth", "Jp"};
        try {
        System.out.println(indexOf(st, "Jo"));
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
