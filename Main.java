public class Main {
    public static void main(String[] args) {

Kettle k1=new Kettle("WestPoint",300,false,"red");
k1.addHeater(new Heater(false));
k1.addLid(new Lid());

TempSensor ts1=new TempSensor(10,0, k1.getHeater(),k1);
WaterLevelSensor wl1=new WaterLevelSensor(1000);

k1.addTempSensor(ts1);
k1.addWaterLevelSensor(wl1);



Kettle k2=new Kettle("KenWood",400,false,"Black");
k2.addHeater(new Heater(false));
k2.addLid(new Lid());
TempSensor ts2=new TempSensor(15,0,k2.getHeater(),k2);
WaterLevelSensor wl2=new WaterLevelSensor(1000);

k2.addTempSensor(ts2);
k2.addWaterLevelSensor(wl2);



k1.addWater(500);
k2.addWater(800);

k1.startBoiling();
k2.startBoiling();




    }
}