package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String operation;
    private String autopsy;

    public Surgeon() {
    }

    public Surgeon(String name, String surname, String education, String birthday, String diagnosis, String inspect, String operation, String autopsy) {
        super(name, surname, education, birthday, diagnosis, inspect);
        this.operation = operation;
        this.autopsy = autopsy;
    }

    public String getOperation() {
        return null;
    }

    public String getAutopsy() {
        return null;
    }
}