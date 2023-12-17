package org.example;

public class FanTest {
    public static void main(String[] args) throws Exception {
        Fan modelEkonom = new Fan(7, 3, 4000); // создание нового экземпляра

        Fan modelStandart = new Fan(15, 5, 1000);


        System.out.println("Для экономной модели");
        modelEkonom.getinformation();
        System.out.println(modelEkonom.countRotMin(3));
        modelEkonom.modeDown();
        modelEkonom.getinformation();
        System.out.println(modelEkonom.countRotMin(3));

        System.out.println("");
        System.out.println("Для стандартной модели");

        modelStandart.getinformation();
        System.out.println(modelStandart.countRotMin(3));
        modelStandart.modeDown();
        modelStandart.getinformation();
        System.out.println(modelStandart.countRotMin(-1));

//        modelStandart.bladeCount = 15;
//        modelStandart.maxMode = 5;
//        modelStandart.potreblenieElektroenergii = 10;

//        printFanInfo(modelStandart);
//        modelStandart.modeDown();


    }

//    public static void printFanInfo(Fan fan) {
//        System.out.println("количество оборотов: " + fan.oborotovVMinutu + " : "
//                + " режим: " + fan.mode);
//    }
}
