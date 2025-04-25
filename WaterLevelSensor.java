public class WaterLevelSensor {

   int maxLevel;
   int currentLevel;

   public WaterLevelSensor(int maxLevel){
       this.maxLevel=maxLevel;
   }


   public boolean isWaterEnough(){
       if(currentLevel>0){
           return true;
       }
       else{
           return false;
       }
   }

   public int getMaxLevel(){
       return maxLevel;
   }

   public int getCurrentLevel(){
       return currentLevel;
   }


}
