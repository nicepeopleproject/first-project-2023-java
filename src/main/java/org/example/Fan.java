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
        if (bladeCount > 0 & bladeCount < 100) {
            this.bladeCount = bladeCount;
        } else {
            throw new RuntimeException("bladeCount should be > 0, current value = " + bladeCount);
        }
        if (potreblenieElektroenergii > 500 & potreblenieElektroenergii < 10000) {
            this.potreblenieElektroenergii = potreblenieElektroenergii;
        } else {
            throw new RuntimeException("potreblenieElektroenergii should be > 0, current value = " + bladeCount);
        }

        this.maxMode = maxMode;


    }

    public int getmode() {
        return mode;
    }

    public int getbladeCount() {
        return bladeCount;
    }

    public int getoborotovVMinutu() {
        return oborotovVMinutu;
    }

    public int getpotreblenieElektroenergii() {
        return potreblenieElektroenergii;
    }

    public void modeUp() {
        mode = mode % maxMode + 1;
        oborotovVMinutu = 1500 + 500 * mode;
    }

    public void modeDown() {
        if (mode == 1) {
            mode = maxMode;
        } else {
            mode--;
        }
        //mode = maxMode - (maxMode - 1) * (mode - 1) % maxMode;
        oborotovVMinutu = 1500 + 500 * mode;
    }


    public void getinformation() {
        System.out.println("Потребление элетричества " + getpotreblenieElektroenergii());
        System.out.println("Количетсво лопастей " + getbladeCount());
        System.out.println("Режим работы " + getmode());
    }

    public int countRotMin(int minu) throws Exception {
        if (minu <= 0) {
            throw new RuntimeException("Вы вне времени");
        } else {
            System.out.println("Обороты за " + minu + " минуты :");
            return minu * oborotovVMinutu;
        }
    }


}

