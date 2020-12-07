package ru.job4j.profession;

public class Therapist extends Doctor {
    private String heal;
    private String route;

    public Therapist() {
    }

    public Therapist(String name, String surname, String education, String birthday, String diagnosis, String inspect, String heal, String route) {
        super(name, surname, education, birthday, diagnosis, inspect);
        this.heal = heal;
        this.route = route;
    }

    public String getHeal() {
        return null;
    }

    public String getRoute() {
        return null;
    }
}