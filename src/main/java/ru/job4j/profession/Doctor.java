package ru.job4j.profession;

import javax.print.Doc;

public class Doctor extends Profession {
    private String diagnosis;
    private String inspect;

    public Doctor() {
    }

    public Doctor(String name, String surname, String education, String birthday, String diagnosis, String inspect) {
        super(name, surname, education, birthday);
        this.diagnosis = diagnosis;
        this.inspect = inspect;
    }

    public String getDiagnosis() {
        return null;
    }

    public String getInspect() {
        return null;
    }
}