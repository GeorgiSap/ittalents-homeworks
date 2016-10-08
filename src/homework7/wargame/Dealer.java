package homework7.wargame;


public class Dealer {
	 static final int CARDS_TOTAL_COUNT = 52;
	
	
	static void deal(Player player1, Player player2){
		Card[] allCards = new Card[CARDS_TOTAL_COUNT];
		int index = 0;
		for (CardValue value : CardValue.values()) {
			for (Color color : Color.values()) {
				allCards[index] = new Card(value, color);
				index++;
			}
		}
		player1.playCards = new Card[CARDS_TOTAL_COUNT/2];
		player2.playCards = new Card[CARDS_TOTAL_COUNT/2];	
		Player.pot = new Card[CARDS_TOTAL_COUNT];
		player1.collectedCards = new Card[CARDS_TOTAL_COUNT];
		player2.collectedCards = new Card[CARDS_TOTAL_COUNT];
		
		int cardsToDeal = CARDS_TOTAL_COUNT;
		int cardsToDealEach = CARDS_TOTAL_COUNT/2;
		boolean dealToFirstPlayer = true;
		
		for (int i = 0; i < allCards.length; i++) {
			int randomCard = (int)(Math.random()*(cardsToDeal));
			if (dealToFirstPlayer) {
			player1.playCards[CARDS_TOTAL_COUNT/2 - cardsToDealEach] = new Card(allCards[randomCard].value, allCards[randomCard].color);	
			allCards[randomCard] = allCards[cardsToDeal - 1];
			dealToFirstPlayer = false;
			} else {
			player2.playCards[CARDS_TOTAL_COUNT/2 - cardsToDealEach] = new Card(allCards[randomCard].value, allCards[randomCard].color);
			allCards[randomCard] = allCards[cardsToDeal - 1];
			cardsToDealEach--;
			dealToFirstPlayer = true;
			}
			cardsToDeal--;	
		}
	}
}
