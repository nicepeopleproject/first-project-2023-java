package org.example;

public class FanTest {
    // psvm + Tab
    public static void main(String[] args) {
        Fan modelEkonom = new Fan(7, 3, 4); // создание нового экземпляра

        Fan modelStandart = new Fan(15, 5, 10);
//        modelStandart.bladeCount = 15;
//        modelStandart.maxMode = 5;
//        modelStandart.potreblenieElektroenergii = 10;

//        printFanInfo(modelStandart);
//        modelStandart.modeDown();
        modelEkonom.info();

    }


}
