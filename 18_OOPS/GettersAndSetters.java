public class GettersAndSetters {
    public static void main(String[] args){

        Pen pen = new Pen();
        pen.setTip(10);
        pen.setColor("Blue");

        System.out.println("Tip: " + pen.getTip());
        System.out.println("Color: " + pen.getColor());

        // p.tip = 20; // Error: tip has private access in Pen
        // p.color = "Red"; // Error: color has private access in Pen
    
    }
}

class Pen{
    private int tip;
    private String color;

    // Setters 
    public void setTip(int tip){
        this.tip = tip;
    }
    public void setColor(String color){
        this.color = color;
    }

    // Getters

    public int getTip(){
        return this.tip;
    }
    public String getColor(){
        return this.color;
    }
}