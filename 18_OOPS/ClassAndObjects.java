public class ClassAndObjects{
    public static void main(String[] args) {
        // Creating object of Pen class
        Pen p = new Pen();
        p.setTip(5);
        p.setColor("Blue");
        System.out.println("Tip of the pen is: " + p.tip);
        System.out.println("Color of the pen is: " + p.color);
        // Changing the color of the pen directly since the variables are public
        p.color = "Red";
        System.out.println("Color of the pen is: " + p.color);
    }
}


// Pen class
class Pen{
    int tip;
    String color;
    void setTip(int tip){
        this.tip = tip;
    }
    void setColor(String color){
        this.color = color;
    }
}