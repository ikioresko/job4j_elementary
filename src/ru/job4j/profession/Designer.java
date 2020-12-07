package ru.job4j.profession;

public class Designer extends Engineer {
    private String develop;

    public Designer() {
    }

    public Designer(String name, String surname, String education, String birthday, String work, String relax, String develop) {
        super(name, surname, education, birthday, work, relax);
        this.develop = develop;
    }

    public String getDevelop() {
        return null;
    }
}