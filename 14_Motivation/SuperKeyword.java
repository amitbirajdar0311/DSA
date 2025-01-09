public class SuperKeyword {
    public static void main(String[] args){
        Horse mustang = new Horse();
        System.out.println(mustang.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called!!");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        super.color = "brown";
        System.out.println("Horse constructor is called!!");
    }
}