package homework7.wargame;


public class Player {
	String name;
	Card[] playCards;
	Card[] collectedCards;
	int countOfCollectedCards = 0;
	static Card[] pot;
	static int cardsInPot = 0;
	static int currentCard = Dealer.CARDS_TOTAL_COUNT/2;
	
	Player(String name) {
		if (name != null && name.length() > 1) {
			this.name = name;
		}
	}

	static void playCard(Player player1, Player player2){
		currentCard--;
		if (player1.playCards[currentCard].value.ordinal() > player2.playCards[currentCard].value.ordinal()) {
			collectCards(player1, player2);
			showCards(player1, '>', player2);
		} else {
			if ((player1.playCards[currentCard].value.ordinal() == player2.playCards[currentCard].value.ordinal())) {
				addCardsToPot(player1, player2);
				showCards(player1, '=', player2);
				war(player1, player2);
				
			} else {
				collectCards(player2, player1);
				showCards(player1, '<', player2);
			}
		}
	}
	
	static void war(Player player1, Player player2) {
		if (currentCard == 0) {
			splitPot(player1, player2);
			currentCard--;
		} else {
			int countOfCardsInWar = (currentCard < 3) ? currentCard : 3;
			while (countOfCardsInWar > 0) {
				currentCard--;
				addCardsToPot(player1, player2);
				if (countOfCardsInWar > 1) {
				showCards(player1, '?', player2);
				}
				countOfCardsInWar--;
			}
			if (player1.playCards[currentCard].value.ordinal() > player2.playCards[currentCard].value.ordinal()) {
				showCards(player1, '>', player2);
				Player.collectPot(player1);
			} else {
				if (player1.playCards[currentCard].value.ordinal() == player2.playCards[currentCard].value.ordinal()) {
					showCards(player1, '=', player2);
					war(player1, player2);
				} else {
					showCards(player1, '<', player2);
					Player.collectPot(player2);
				}
			}			
		}
	}
	
	static void collectCards(Player player1, Player player2) {
		player1.collectedCards[player1.countOfCollectedCards] = player1.playCards[currentCard];
		player1.countOfCollectedCards ++;
		player1.collectedCards[player1.countOfCollectedCards] = player2.playCards[currentCard];
		player1.countOfCollectedCards ++;
	}
	static void addCardsToPot(Player player1, Player player2) {
		pot[cardsInPot] = player1.playCards[currentCard];
		cardsInPot++;
		pot[cardsInPot] = player2.playCards[currentCard];
		cardsInPot++;
	}
	
	static void splitPot(Player player1, Player player2) {
		while (cardsInPot >= 2) {
			cardsInPot--;
			player2.collectedCards[player2.countOfCollectedCards] = pot[cardsInPot];
			player2.countOfCollectedCards ++;
			cardsInPot--;
			player1.collectedCards[player1.countOfCollectedCards] = pot[cardsInPot];
			player1.countOfCollectedCards ++;	
		}
	}
	
	static void collectPot(Player player) {
		while (cardsInPot >= 1) {
			cardsInPot--;
			player.collectedCards[player.countOfCollectedCards] = pot[cardsInPot];
			player.countOfCollectedCards ++;
		}
	}
	
	static void showCards (Player player1, char resultChar, Player player2) {
		System.out.println(player1.name + ": " +  player1.playCards[currentCard].value + " " + player1.playCards[currentCard].color + " " +
				resultChar + " " + player2.name + ": " + player2.playCards[currentCard].value + " " + player2.playCards[currentCard].color);		
	}
	
	static void showResult(Player player1, Player player2) {
		System.out.println(player1.name + " has " + player1.countOfCollectedCards + " cards.");
		System.out.println(player2.name + " has " + player2.countOfCollectedCards + " cards.");
		if (player1.countOfCollectedCards > player2.countOfCollectedCards) {
			System.out.println(player1.name + " wins!");
		} else {
			if (player1.countOfCollectedCards == player2.countOfCollectedCards) {
				System.out.println("Draw.");
			} else {
				System.out.println(player2.name + " wins!");
			}
		}
	}
	
	void showCollectedCards() {
		int countOfCollectedCards = this.countOfCollectedCards;
		System.out.println("Cards collected by: " + this.name);
		while (countOfCollectedCards > 0) {
			countOfCollectedCards--;
			System.out.println(this.collectedCards[countOfCollectedCards].value + " " 
		+ this.collectedCards[countOfCollectedCards].color);
		}
	}
	
}
