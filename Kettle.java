public class Kettle extends Appliance{

   Heater heater;
   Lid lid;
   TempSensor tempSensor;
   WaterLevelSensor waterLevelSensor;

    public Kettle(String brand, int power,boolean status, String color){
        super(brand,power,status,color);

    }

   public void addHeater(Heater heater){
       this.heater=heater;
   }
    public void addLid(Lid lid){
        this.lid =lid;
    }
    public void addTempSensor(TempSensor tempSensor){
        this.tempSensor=tempSensor;
    }
    public void addWaterLevelSensor(WaterLevelSensor waterLevelSensor){
        this.waterLevelSensor=waterLevelSensor;
    }


    public Heater getHeater(){
       return heater;
    }
    public Lid getLid(){
       return lid;
    }
    public TempSensor getTempSensor(){
       return tempSensor;
    }
    public WaterLevelSensor getWaterLevelSensor(){
       return waterLevelSensor;
    }


   public void addWater(int water){

        if(water<0){
            throw new RuntimeException("Plz enter a positive value");
        }
        else if(waterLevelSensor.currentLevel+water>waterLevelSensor.maxLevel){

            throw new RuntimeException("Overflowing");
        }
        else{
            waterLevelSensor.currentLevel+=water;
            System.out.println("\t\t\t"+water+"ml water added in "+this.getBrand()+" ("+waterLevelSensor.currentLevel+"ml water is present in "+this.getBrand()+")");
        }

   }

   public void pourWater(int water){

        if(water<0){
            throw new RuntimeException("Plz enter a positive value!");
        }
        else if(water>waterLevelSensor.currentLevel){
            throw new RuntimeException("Not enough water to be poured!");
        }
        else{
        waterLevelSensor.currentLevel-=water;
       System.out.println("\t\t\t"+water+"ml water poured out of "+this.getBrand()+" ("+waterLevelSensor.currentLevel+"ml water left)");
        }
   }


    public void startBoiling(){
        if(waterLevelSensor.isWaterEnough()){
            lid.closeLid();
            turnOn();
            heater.turnHeaterOn();
            tempSensor.start();
        }
    }

    public void resetKettle(){

       turnOf();
        waterLevelSensor.currentLevel=0;
        tempSensor.currentTemp=0;
        heater.turnHeaterOf();
        lid.openLid();
    }


    public String toString(){
        return "Brand: "+brand+"     Power:"+power+"    Status: "+status+"      Color:"+color;

    }



}
