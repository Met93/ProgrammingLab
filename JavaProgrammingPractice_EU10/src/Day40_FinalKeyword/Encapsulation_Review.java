package Day40_FinalKeyword;
import Day39_EncapsulationAndInheritancePractice.shape_Task.Circle;
import Day39_EncapsulationAndInheritancePractice.shape_Task.Square;



public class Encapsulation_Review {
    private Circle circle;
    private Square square;
    public Circle getCircle(){
        return circle;
    }
    public void setCircle(Circle circle){
        if(circle.getRadius()<5){
            return;
        }
        this.circle=circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
