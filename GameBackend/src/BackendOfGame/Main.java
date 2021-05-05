package BackendOfGame;

import java.time.LocalDate;

import BackendOfGame.adapters.MernisServiceAdapter;
import BackendOfGame.concretes.GameSaleManager;
import BackendOfGame.entities.concretes.Campaign;
import BackendOfGame.entities.concretes.Customer;
import BackendOfGame.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "23154648999787", "Talha", "KOCA", LocalDate.of(1996, 01, 01));
		Game game = new Game(1, "CallOfDuty", 44);
		Campaign campaign = new Campaign(1, 50, "Sezon Sonu", LocalDate.of(2021, 01, 01));
		GameSaleManager gameSaleManager = new GameSaleManager(new MernisServiceAdapter());
		gameSaleManager.Sale(customer, game, campaign);
	}

}
