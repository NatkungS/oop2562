package Chap5.Last;

public class LivingThing {

    protected String name = "LivingThing";

    public void grow() {
        System.out.println("LivingThing : grow()");

    }

    public void reproduce() {
        System.out.println("LivingThing : reproduce()");

    }

}

class Plant extends LivingThing {
}

class Animal extends LivingThing {

    private String color;
    protected int leg;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Animel : move");

    }
}

class Dog extends Animal{
    protected int leg = 4;
    public void bark(){
        System.out.println("Dog : bark");
    }

    @Override
    public void move() {
        System.out.println("Dog : walk and run");
    }
    
}