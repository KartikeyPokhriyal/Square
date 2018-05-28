public class Square {
    private double side;

    public Square(double side) throws IllegalArgumentException {
        if(side < 0)
            throw new IllegalArgumentException();
        else
            this.side = side;
    }


    public double calculateArea() {
        return side * side;
    }
}
