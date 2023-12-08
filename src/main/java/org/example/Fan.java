package org.example;

public class Fan {
    private final int bladeCount; // - количество лопастей
    private int mode = 1; // номер режима [1 - maxMode]
    private final int maxMode; // количество доступных режимов
    private final int potreblenieElektroenergii;
    private int oborotovVMinutu = 2000; // 1500 + 500*mode
    public int time;


    public Fan(int bladeCount, int maxMode, int potreblenieElektroenergii) {
        // & && - и
        // | || - или
        if (bladeCount > 0) {
            this.bladeCount = bladeCount;
        } else {
            throw new RuntimeException("bladeCount should be > 0, current value = " + bladeCount);
        }
        if (maxMode > 0) {
            this.maxMode = maxMode;
        } else {
            throw new RuntimeException("maxMode should be > 0, current value = " + maxMode);
        }
        if (potreblenieElektroenergii > 0) {
            this.potreblenieElektroenergii = potreblenieElektroenergii;
        } else {
            throw new RuntimeException("potreblenieElektroenergii should be > 0, current value = " + potreblenieElektroenergii);
        }

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

    public void info() {
        System.out.println("Количество лопастей = " + bladeCount);
        System.out.println("Количество режимов = " + maxMode);
        System.out.println("Текущий режим = " + mode);
        System.out.println("Количество потребляемой энергии = " + potreblenieElektroenergii);
    }

    public int infoBlade() {
        return bladeCount;
    }
    public int infomaxMode() {
        return maxMode;
    }
    public int infoMode() {
        return mode;
    }
    public int infoEnergy() {
        return potreblenieElektroenergii;
    }

    public int rabota(int time){
        return time*oborotovVMinutu;
    }
}
