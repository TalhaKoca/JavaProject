package BackendOfGame.abstracts;

import BackendOfGame.entities.concretes.Campaign;
import BackendOfGame.entities.concretes.Customer;
import BackendOfGame.entities.concretes.Game;

public interface GameSaleService {
	void Sale(Customer customer, Game game, Campaign campaign);
}
