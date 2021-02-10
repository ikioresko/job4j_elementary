package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student st = new Student();
        st.setFio("Семенов Вячеслав Михайлович");
        st.setGroupNum(515);
        st.setRegDate("5 февряля 2005 года");
        System.out.println("ФИО : " + st.getFio() + System.lineSeparator() + "Номер группы : " + st.getGroupNum()
                + System.lineSeparator() + "Дата поступления : " + st.getRegDate());
    }
}