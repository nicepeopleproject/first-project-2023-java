package org.example;

public class Fan {
    private int bladeCount; // - количество лопастей
    private int mode = 1; // номер режима [1 - maxMode]
    private int maxMode; // количество доступных режимов
    private int potreblenieElektroenergii;
    private int oborotovVMinutu = 2000; // 1500 + 500*mode


    public Fan(int bladeCount, int maxMode, int potreblenieElektroenergii) {
        // & && - и
        // | || - или
        if  (bladeCount > 0 & bladeCount < 100) {
            this.bladeCount = bladeCount;
        } else{
            throw new RuntimeException("bladeCount should be > 0 and < 100, current value = " + bladeCount);
        }
        if  (maxMode > 0 & maxMode < 20) {
            this.maxMode = maxMode;
        } else{
            throw new RuntimeException("maxMose should be > 0 and < 20, current value = " + maxMode);
        }
        if  (potreblenieElektroenergii > 0 & potreblenieElektroenergii < 300) {
            this.potreblenieElektroenergii = potreblenieElektroenergii;
        } else {
            throw new RuntimeException("potreblenieElektroenergii should be > 0 and < 300, current value = " + potreblenieElektroenergii);
        }
    }

    public void modeUp() {
        mode = mode % maxMode + 1;
        oborotovVMinutu = 1500 + 500 * mode;
    }

    public void modeDown() {
        mode = maxMode - (maxMode - 1) * (mode - 1) % maxMode;
        oborotovVMinutu = 1500 + 500 * mode;
    }
    public void printFanInfo(){
        System.out.println("Количество лопостей: " + bladeCount + " Режим: "  + mode +
                " Количество режимов: " + maxMode + " Потребление энергии: " + potreblenieElektroenergii +
                " Оборотов в минуту: " + oborotovVMinutu);
    }
    public void printBladeCount(){
        System.out.println(bladeCount);
    }
    public void printMode(){
        System.out.println(mode);
    }
    public void printMaxMode(){
        System.out.println(maxMode);
    }
    public void printPotreblenieElektroenergii(){
        System.out.println(potreblenieElektroenergii);
    }
    public void printOborotovVMinutu(){
        System.out.println(oborotovVMinutu);
    }
}
