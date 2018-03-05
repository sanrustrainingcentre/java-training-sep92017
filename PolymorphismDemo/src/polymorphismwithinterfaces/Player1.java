package polymorphismwithinterfaces;

public class Player1 extends Player implements CanPlayCricket, CanPlayTennis {

	
	public void bat() {
		System.out.println("Player1 can bat");
	}

	
	public void bowl() {
		System.out.println("Player1 can throw a ball, and he/she knows the rules of the game");
	}

	
	public void field() {
		System.out.println("Player1 can field/catch the ball");
	}

	
	public void wicketKeeper() {
		System.out.println("Player1 can wicket keep behind the bats man");
	}

	
	public void hitBall() {
		
		System.out.println("Player1 knows to play tennis: Hit Ball behavior");
		
	}

	
	public void defend() {
		System.out.println("Player1 knows to play tennis: Knows to defend the ball");
		
	}
	
	
	

}
