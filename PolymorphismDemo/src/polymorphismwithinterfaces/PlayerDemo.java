package polymorphismwithinterfaces;

public class PlayerDemo {

	public static void main(String[] args) {
		
		Player player1 = new Player1();
		Player player2 = new Player2();
		
		CanPlayCricket cricketPlayer1 = new Player1();
		CanPlayTennis tennisPlayer1 = new Player1();
		
//		CanPlayCricket cricketPlayer2 = new Player2();
		CanPlayTennis tennisPlayer2 = new Player2();
		
		//int marks = new int[5];
		
		Player[] players = new Player[2];
		players[0] = player1;
		players[1] = player2;
		
		int cricketPlayerCount = 0;
		int tennisPlayerCount = 0;
		
		for (int i = 0; i < players.length; i++) {
			
			Player player = players[i];
			
//			CanPlayCricket cricketPlayer45 = (CanPlayCricket) player;
			
			if (player instanceof CanPlayCricket) {
				cricketPlayerCount++;
				CanPlayCricket cricketPlayer = (CanPlayCricket) player;
				
				cricketPlayer.bat();
				cricketPlayer.bowl();
				cricketPlayer.field();
				cricketPlayer.wicketKeeper();
				
			}
			
			if (player instanceof CanPlayTennis) {
				tennisPlayerCount++;
				CanPlayTennis canPlayTennis = (CanPlayTennis) player;
				
				canPlayTennis.hitBall();
				canPlayTennis.defend();
			}
			
			if (player instanceof Player) {
				System.out.println("[player] variable reference is instanceof Player class.");
			}
			
		}
		
		System.out.println("Number of Cricket Players = " + cricketPlayerCount);
		System.out.println("Number of Tennis Players = " + tennisPlayerCount);

	}

}
