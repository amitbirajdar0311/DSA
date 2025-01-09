public class Constructor {
    public static void main(String[] args){
        //1) This is a default constructor which is provided by java if we don't provide any constructor
        //if you provide any constructor then java will not provide any default constructor
        // Pen p1 = new Pen();

        //2) This is a non-parameterized constructor
        // Pen p2 = new Pen();

        //3) This is a parameterized constructor
        // Pen p3 = new Pen(10, "Red");
        // System.out.println(p3.price);
        // System.out.println(p3.color);

        //4) This is copy constructor

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Rahul";
        s1.password = "rahul123";
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;

        Student s2 = new Student(s1);
        s2.password = "rahul1234";
        s1.marks[0] = 100;
        //chaned in s1 will not reflect in s2 but it is reflecting because we are copying the reference of s1 to s2
        for(int i=0;i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student {
    int rollNo;
    String name;
    String password;
    int[] marks;

    Student(){
        marks = new int[3];
        System.out.println("This is non-parameterized constructor");
    }

    Student(Student s){
        marks = new int[3];
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.password = s.password;
        // this.marks = s.marks;    //this is shallow copy
        //this is deep copy 
        for(int i=0;i<s.marks.length;i++){
            this.marks[i] = s.marks[i];
        }

    }
}
class Pen{
    int price;
    String color;

    Pen(){
        System.out.println("This is non parameterized constructor");
    }
    Pen(int price, String color){
        this.price = price;
        this.color = color;
        System.out.println("This is parameterized constructor");
    }
}