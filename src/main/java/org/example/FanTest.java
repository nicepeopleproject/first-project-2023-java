package org.example;

public class FanTest {
    // psvm + Tab
    public static void main(String[] args) {
        Fan modelEkonom = new Fan(7, 3, 4); // создание нового экземпляра

        Fan modelStandart = new Fan(15, 5, 10);

        modelEkonom.printFanInfo();

        modelEkonom.printBladeCount();
        modelEkonom.printMode();
        modelEkonom.printMaxMode();
        modelEkonom.printPotreblenieElektroenergii();
        modelEkonom.printOborotovVMinutu();
    }
}
