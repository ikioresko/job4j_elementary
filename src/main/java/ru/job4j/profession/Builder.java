package ru.job4j.profession;

public class Builder extends Engineer {
    private String build;

    public Builder() {

    }

    public Builder(String name, String surname, String education, String birthday, String work, String relax, String build) {
        super(name, surname, education, birthday, work, relax);
        this.build = build;
    }

    public String getBuild() {
        return null;
    }
}