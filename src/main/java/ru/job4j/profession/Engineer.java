package ru.job4j.profession;

public class Engineer extends Profession {
    private String work;
    private String relax;

    public Engineer() {
    }

    public Engineer(String name, String surname, String education, String birthday, String work, String relax) {
        super(name, surname, education, birthday);
        this.work = work;
        this.relax = relax;
    }

    public String getWork() {
        return null;
    }

    public String getRelax() {
        return null;
    }
}