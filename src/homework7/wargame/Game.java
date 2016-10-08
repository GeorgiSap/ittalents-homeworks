package homework7.wargame;


public class Game {

	public static void main(String[] args) {

		Player mitko = new Player("Dimitar");
		Player ico = new Player("Hristo");
		Dealer.deal(mitko, ico);
		while (Player.currentCard > 0) {
			Player.playCard(mitko, ico);
		}
		Player.showResult(mitko, ico);
		System.out.println();
		mitko.showCollectedCards();
		System.out.println();
		ico.showCollectedCards();

	}

}
