public class Car{

   private  int speed;
   private  String color;

   public Car(String color){
    this.color = color;
   }

    public void setSpeed(int speed){
        if(speed<0){
            System.err.println("Not possible..!");
        }
        else{
            this.speed = speed;
            System.err.println("Max Speed possible...");
        }

    }

}
