public class Lid {

    boolean isClosed;

    public Lid(){
        isClosed=false;
    }

    public void closeLid(){
        isClosed=true;
    }

    public void openLid(){
        isClosed=false;
    }

    public boolean getIsClosed(){
        return  isClosed;
    }

    public String toString(){
        return "Is Lid Closed:"+ isClosed;
    }



}
