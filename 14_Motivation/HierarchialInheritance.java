public class HierarchialInheritance {
    public static void main(String[] args) {
        Fish tunna = new Fish();
        tunna.eat();
        Human amit = new Human();
        amit.breath();
        Bird crow = new Bird();
        crow.skinColor = "black";
        System.out.println(crow.skinColor);
    }
}
class Animal{
    String skinColor;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Human extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}