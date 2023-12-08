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
        if  (maxMode > 0 & maxMode <= 16) {
            this.maxMode = bladeCount;
        } else{
            throw new RuntimeException("maxMode should be > 0, current value = " + maxMode);
        }
        if  (potreblenieElektroenergii > 0 & potreblenieElektroenergii < 100) {
            this.potreblenieElektroenergii = potreblenieElektroenergii;
        } else{
            throw new RuntimeException("potreblenieElektroenergii should be > 0, current value = " + potreblenieElektroenergii );
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
    public void getFanInfo() {
        System.out.println("bladeCount: "+bladeCount+", mode: "+mode+", maxMode: "+maxMode+", potreblenieElektroenergii: "+potreblenieElektroenergii+", oborotovVMinutu: "+oborotovVMinutu);
    }

    public int oborotovZaMinutes(int minutes) {
        return oborotovVminutu*minutes;
    }

    public void getBladeCount() {
        System.out.println("bladeCount: "+bladeCount);
    }

    public void getMode() {
        System.out.println("mode: "+mode);
    }

    public void getMaxMode() {
        System.out.println("maxMode: "+maxMode);
    }

    public void getPotreblenieElektroenergii() {
        System.out.println("potreblenieElektroenergii: "+potreblenieElektroenergii);
    }

    public void getOborotovVMinutu() {
        System.out.println("oborotovVMinutu: "+oborotovVMinutu);
    }

}
