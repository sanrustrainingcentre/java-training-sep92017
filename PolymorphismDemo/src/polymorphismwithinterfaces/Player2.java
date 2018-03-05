package polymorphismwithinterfaces;

public class Player2 extends Player implements CanPlayTennis {

	public void hitBall() {	
		System.out.println("Player2 knows to play tennis: Hit Ball behavior");
	}

	public void defend() {
		System.out.println("Player2 knows to play tennis: Knows to defend the ball");
	}

}
