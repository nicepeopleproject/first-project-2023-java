package org.example;

public class Fan {
    private final int bladeCount; // - количество лопастей
    private int mode = 1; // номер режима [1 - maxMode]
    private int maxMode; // количество доступных режимов
    private int potreblenieElektroenergii;
    private int oborotovVMinutu = 2000;// 1500 + 500*mode
    public int minut;


    public Fan(int bladeCount, int maxMode, int potreblenieElektroenergii, int minut) {
        // & && - и
        // | || - или
        if  (bladeCount > 0 & bladeCount < 100) {
            this.bladeCount = bladeCount;
        } else{
            throw new RuntimeException("bladeCount should be > 0 and < 100, current value = " + bladeCount);
        }
        if (maxMode > 0 & maxMode < 10){
        this.maxMode = maxMode;
        } else{
            throw new RuntimeException("maxMode should be > 0 and < 10, current value = " + maxMode);
        }
        if  ( potreblenieElektroenergii> 0 & potreblenieElektroenergii < 15) {
            this.potreblenieElektroenergii = potreblenieElektroenergii;
        } else{
            throw new RuntimeException("potreblenieElektroenergii should be > 0 and < 15, current value = " + potreblenieElektroenergii);
        }
        if  (minut > 0 & minut < 100) {
            this.minut = minut;
        } else {
            throw new RuntimeException("bladeCount should be > 0 and < 100, current value = " + bladeCount);
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
    public  void printInfo(Fan fan) {
        System.out.println("Количество оборотов: "+fan.oborotovVMinutu+" : " + " Режим: " + fan.mode+ "Потребление электроэнергии" + fan.potreblenieElektroenergii);
    }
    public  void printOborotovZaMinut(Fan fan){
         System.out.println("Количество оборотов за" + fan.minut +":" + fan.minut * fan.oborotovVMinutu);
    }
}
