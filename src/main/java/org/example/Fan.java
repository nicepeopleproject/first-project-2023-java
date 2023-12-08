package org.example;

public class Fan {
    private final int bladeCount; // - количество лопастей
    private int mode = 1; // номер режима [1 - maxMode]
    private final int maxMode; // количество доступных режимов
    private final int potreblenieElektroenergii;
    private int oborotovVMinutu = 2000; // 1500 + 500*mode


    public Fan(int bladeCount, int maxMode, int potreblenieElektroenergii) {
        // & && - и
        // | || - или
        if  (bladeCount > 0 & bladeCount < 100 & maxMode > 0 & potreblenieElektroenergii > 0) {
            this.bladeCount = bladeCount;
            this.maxMode = maxMode;
            this.potreblenieElektroenergii = potreblenieElektroenergii;
        } else{
            throw new RuntimeException("peremenie should be > 0, current value = + your dates");
        }
    }

    public void displayfaninfo() {
        System.out.println("Bladecount: " + bladeCount + " maxMode: " + maxMode + " Potreblenie Energii:" + potreblenieElektroenergii);
    }

    public void getbladeCount() {
        System.out.println(bladeCount);
    }
    public void getmaxMode() {
        System.out.println(maxMode);
    }

    public void getpotreblenieElektroenergii() {
        System.out.println(potreblenieElektroenergii);
    }

    public void calculateoborotivminute() {
        oborotovVMinutu = 1500 + 500 * mode;
    }

    public void modeUp() {
        mode = mode % maxMode + 1;
        oborotovVMinutu = 1500 + 500 * mode;
    }

    public void modeDown() {
//        if (mode == 1) {
//            mode = maxMode;
//        }else{
//            mode--;
//        }
        mode = maxMode - (maxMode - 1) * (mode - 1) % maxMode;
        oborotovVMinutu = 1500 + 500 * mode;
    }
}
