package org.example;
/*
public class Fan {
    private final int bladeCount; // - количество лопастей
    private int mode = 1; // номер режима [1 - maxMode]
    private final int maxMode; // количество доступных режимов
    private final int potreblenieElektroenergii;
    private int oborotovVMinutu = 2000; // 1500 + 500*mode


    public Fan(int bladeCount, int maxMode, int potreblenieElektroenergii) {
        // & && - и
        // | || - или
        if  (bladeCount > 0 & bladeCount < 100) {
            this.bladeCount = bladeCount;
        } else{
            throw new RuntimeException("bladeCount should be > 0, current value = " + bladeCount);
        }
        this.maxMode = maxMode;
        this.potreblenieElektroenergii = potreblenieElektroenergii;

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
}*/
public class Ventilator {
    private int minRPM;
    private int maxRPM;
    private boolean isOn;

    public Ventilator(int minRPM, int maxRPM) {
        if (minRPM < 0 || maxRPM <= 0 || maxRPM <= minRPM) {
            throw new IllegalArgumentException("Invalid RPM values");
        }
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
        this.isOn = false;
    }

    public void displayInfo() {
        System.out.println("Min RPM: " + minRPM + ", Max RPM: " + maxRPM + ", Is On: " + isOn);
    }

    public int calculateRotations(int minutes) {
        if (!isOn) {
            return 0;
        }
        return (maxRPM * minutes);
    }

    public int getMinRPM() {
        return minRPM;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public boolean isOn() {
        return isOn;
    }
}
