public class FanTest {
    public static void main(String[] args) {
        Fan modelEconom = new Fan(); // создание нового экземпляра
        modelEconom.bladeCount = 7;
        modelEconom.maxMode= 3;
        modelEconom.potreblenieElektroenergii = 4;

        Fan modelStandart = new Fan();
        modelStandart.bladeCount = 15;
        modelStandart.maxMode = 5;
        modelStandart.potreblenieElektroenergii = 16;

    }
    public static void printFanInfo(Fan fan){
        System.out.println("oboroti: " + fan.oborotovvMinutu + " : " + "+regime:" +fan.mode);
    }
}
