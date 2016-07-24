package BlackJack;


import java.util.Scanner;

public class Blackjack implements Runnable {

	
		

		
	

    @Override
    public void run() {
        		System.out.println("******************"+ "\n"+ "Welcome to LSBlackjack"+"\n"+ "******************");
		ASCIIArt a = new ASCIIArt();
		//playingDeck will be the deck the dealer holds
		Deck playingDeck = new Deck();
		playingDeck.createFullDeck();
		playingDeck.shuffle();
		boolean firsttime = true;
		boolean extra = false;
		//playerCards will be the cards the player has in their hand
		Deck playerCards = new Deck();
		//playerMoney holds players cash - we will be lazy and use doubles instead of bigdecimals
		double playerMoney = 100.0; //Get from server
		//dealerCards will be the cards the dealer has in their hand
		Deck dealerCards = new Deck();
		
		//Scanner for user input
		Scanner userInput = new Scanner(System.in);
		
		//Play the game while the player has money
		//Game loop
while(playerMoney>0){
	extra = false;
	boolean endRound = false;
	//Take Bet
	System.out.println("You have $" + playerMoney + ", how much would you like to bet?");
	double playerBet = userInput.nextDouble();
	
	while((playerBet > playerMoney) || playerBet < 10){
		if(playerBet > playerMoney){
			System.out.println("You cannot bet more than you have.");
		}
		if(playerBet < 10){
			System.out.println("Bet must be higher than 10 coins.");
		}
		System.out.println("You have $" + playerMoney + ", how much would you like to bet?");
		playerBet = userInput.nextDouble();
	}
	System.out.println("Dealing...");
	//Player gets two cards
	playerCards.draw(playingDeck);
	playerCards.draw(playingDeck);

	//Dealer gets two cards
	dealerCards.draw(playingDeck);
	dealerCards.draw(playingDeck);
			
			//While loop for drawing new cards
			while(true)
			{	
				//Display player cards
				System.out.println("Your Hand:" + playerCards.toString());
				
				//Display Value
				System.out.println("Your hand is currently valued at: " + playerCards.cardsValue());
				
				//Display dealer cards
				System.out.println("Dealer Hand: " + dealerCards.getCard(0).toString() + " and [hidden]");
				
				//What do they want to do
				if(playerCards.cardsValue() == 21){
					a.ASCII();
					playerMoney = playerMoney + 2* playerBet;
					endRound = true;
					break;
				}else{
				System.out.println("Would you like to (1)Hit or (2)Stand");
				int response = userInput.nextInt();	
				//They hit
				if(response == 1){
					firsttime = false;
					playerCards.draw(playingDeck);
					System.out.println("You draw a:" + playerCards.getCard(playerCards.deckSize()-1).toString());
					//Bust if they go over 21
					if(playerCards.cardsValue() > 21){
						System.out.println("Bust. Currently valued at: " + playerCards.cardsValue());
						playerMoney -= playerBet;
						endRound = true;
						break;
					}
				}
				
				//Stand
				if(response == 2){
						if(playerCards.cardsValue() == 21 && firsttime == true){
							extra = true;
						}
					break;
				}
				}
			}
				
			//Reveal Dealer Cards
			System.out.println("Dealer Cards:" + dealerCards.toString());
			//See if dealer has more points than player
			if((dealerCards.cardsValue() > playerCards.cardsValue())&&endRound == false){
				System.out.println("Dealer beats you " + dealerCards.cardsValue() + " to " + playerCards.cardsValue());
				playerMoney -= playerBet;
				endRound = true;
			}
			//Dealer hits at 16 stands at 17
			while((dealerCards.cardsValue() < 17) && endRound == false){
				dealerCards.draw(playingDeck);
				System.out.println("Dealer draws: " + dealerCards.getCard(dealerCards.deckSize()-1).toString());
			}
			//Display value of dealer
			System.out.println("Dealers hand value: " + dealerCards.cardsValue());
			//Determine if dealer busted
			if((dealerCards.cardsValue()>21)&& endRound == false){
				System.out.println("Dealer Busts. You win!");
				if (extra == true){
					playerMoney = playerMoney + playerBet * 2.5;
				}else{
					playerMoney =playerMoney + playerBet * 2;
				}
				endRound = true;
			}
			//Determine if push
			if((dealerCards.cardsValue() == playerCards.cardsValue()) && endRound == false){
				System.out.println("Push.");
				endRound = true;
			}
			//Determine if player wins
			if((playerCards.cardsValue() > dealerCards.cardsValue()) && endRound == false){
				System.out.println("You win the hand.");
				if (extra == true){
					playerMoney =playerMoney + playerBet * 2.5;
				}else{
					playerMoney =playerMoney+ playerBet * 2;
				}
				endRound = true;
			}
			else if(endRound == false) //dealer wins
			{
				System.out.println("Dealer wins.");
				playerMoney -= playerBet;
			}

			//End of hand - put cards back in deck
			playerCards.moveAllToDeck(playingDeck);
			dealerCards.moveAllToDeck(playingDeck);
			System.out.println("End of Hand.");
			
		}
		//Game is over
		System.out.println("Game over! You lost all your money. :(");
		
		//Close Scanner
		userInput.close();
    }
	
	
}
