
public class Appliance {

    String brand;
    int power;
    boolean status;
    String color;

    public Appliance(String brand, int power, boolean status, String color){
        this.brand=brand;
        this.power=power;
        this.status=status;
        this.color=color;
    }

    public String getBrand(){
        return brand;
    }
    public int getPower(){
        return power;
    }
    public boolean getStatus(){
        return status;
    }
    public String getColor(){
        return color;
    }

    public void turnOn(){
        this.status=true;
    }

    public void turnOf(){
        this.status=false;
    }

    public void displayInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Power: "+power);
        System.out.println("Color:"+ color);
        if(status=true){
            System.out.println("Status: On");
        }
        else{
            System.out.println("Status: Off");
        }
    }




}
