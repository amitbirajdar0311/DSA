public class Interface {
    public static void main(String[] args){
        King amit = new King();
        amit.moves();
    }
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left, right,top , bottom, diagonally");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,top,bottom");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("single step left ,right,top ,bottom by king");
    }
}