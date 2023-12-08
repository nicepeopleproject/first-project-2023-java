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
        if  (bladeCount > 0 & bladeCount < 100) {
            this.bladeCount = bladeCount;
        } else{
            throw new RuntimeException("bladeCount should be > 0, current value = " + bladeCount);
        }
        if (maxMode > 0 & maxMode < 10)
        {
            this.maxMode = maxMode;
        }
        else{
            throw new RuntimeException("maxMode should be > 0, current value = " + maxMode);
        }
        if (potreblenieElektroenergii > 0 & potreblenieElektroenergii < 100)
        {
            this.potreblenieElektroenergii = potreblenieElektroenergii;
        }
        else{
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
    public void info()
    {
        System.out.println("Количесвто лопастей: " + bladeCount + " Количество доступных режимов: " + maxMode + " Потребление электроэнергии: " + potreblenieElektroenergii + " Текущий режим: " + mode + " Оборотов в минуту: " + oborotovVMinutu);
    }

    public void count(int a)
    {
         System.out.println("Оборотов за " + a + " минут = " + a * oborotovVMinutu);
    }

    public int infoBladeCount()
    {
        return bladeCount;
    }

    public int infoMaxMode()
    {
        return maxMode;
    }

    public int infoPotreblenieElektroenergii()
    {
        return potreblenieElektroenergii;
    }

    public int infoMode()
    {
        return mode;
    }

    public int infoOborotovVMinutu()
    {
        return oborotovVMinutu;
    }

}
