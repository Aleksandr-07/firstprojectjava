public class Fan {
    int bladeCount;//-количество лопастей
    int mode;
    int maxMode;
    int potreblenieElektroenergii;
    int oborotovvMinutu = 2000;

    public void modeUp (){
        mode = mode % maxMode +1;
        oborotovvMinutu = 1500 + 500 * mode;
    }
    public void modeDown (){
        if (mode == 1) {
            mode = maxMode;
        }else{
            mode--;
        }
        oborotovvMinutu = 1500 + 500 * mode;
    }
}
