public class MultipleInheritanceByInterface {
    public static void main(String[] args) {
        Human beer = new Human();
        beer.eat();
        beer.walk();
    }
}
interface Harbivorus{
    void eat();
}
interface Carnivorus{
    void walk();
}
class Human implements Harbivorus,Carnivorus{
    public void eat(){
        System.out.println("eat Grass");
    }
    public void walk(){
        System.out.println("Walks");
    }
}
