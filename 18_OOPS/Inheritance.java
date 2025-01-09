public class Inheritance{
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
    }
}
// Single Level : 
//Base/parent  class 
 class Animal{
    String skinColor;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("breaths");
    }
 }
//Derived/Child class 
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}