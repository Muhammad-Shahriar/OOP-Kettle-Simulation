public class Heater {
    boolean isOn;

    public Heater(boolean isOn){
        this.isOn=isOn;
    }

    public void turnHeaterOn(){
        isOn=true;
    }

    public void turnHeaterOf(){
        isOn=false;
    }


        public boolean getIsOn(){
            return isOn;
        }

        public String toString() {
        return "Heater Status: "+ isOn;
    }


    }






