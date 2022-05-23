public class Car {
    String color;
    Car(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Car is of "+color;
    }
}
