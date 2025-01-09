public class Abstract {
    public static void main(String[] args){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        Mustang m = new Mustang();
        m.skinColor = "black";
    }
}
abstract class Animal{
    String skinColor;
    Animal(){
        System.out.println("Animal constructor is called ");
    }
    //non-abstract metnod 
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constuctor is called");
    }
    void walk(){
        System.out.println("Walks of 4 leg");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}