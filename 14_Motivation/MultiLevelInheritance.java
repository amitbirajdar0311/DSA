public class MultiLevelInheritance {
    public static void main(String[] args){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 2;
        dobby.breed = "Gavran";
    }
}
class Animal{
    String skinColor;
    void eat(){
        System.out.println("Eats");
    }
}
class Mamel extends Animal{
    int legs;
}
class Dog extends Mamel{
    String breed;
}