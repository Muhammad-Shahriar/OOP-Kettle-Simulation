public class TempSensor extends Thread {

    int threshold;
    int currentTemp;
    Heater heater;
    Kettle kettle;

    public TempSensor(int threshold, int currentTemp, Heater heater, Kettle kettle){
        this.threshold=threshold;
        this.currentTemp=currentTemp;
        this.heater=heater;
        this.kettle=kettle;
    }

public void run() {

        System.out.println();
        while (currentTemp < threshold) {
            currentTemp++;
            System.out.println("\t\t\t"+"Heating... "+kettle.getBrand() +" Temp:" + currentTemp + " Celcius");
            try {
                Thread.sleep(1200);
            } catch (Exception e) {
                System.out.println("Boiling interupted...");
            }
        }
        System.out.println("\t\t\t"+"Water in "+kettle.getBrand()+" has boiled");
        heater.turnHeaterOf();
    }



    public int getCurrentTemp(){
        return currentTemp;
    }

    public int getThreshold(){
        return threshold;
    }




}
