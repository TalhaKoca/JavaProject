package BackendOfGame.concretes;

import BackendOfGame.abstracts.CustomerCheckService;
import BackendOfGame.abstracts.GameSaleService;
import BackendOfGame.entities.concretes.Campaign;
import BackendOfGame.entities.concretes.Customer;
import BackendOfGame.entities.concretes.Game;

public class GameSaleManager implements GameSaleService {

	CustomerCheckService customerCheckService;

	public GameSaleManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Sale(Customer customer, Game game,Campaign campaign) {
		// TODO Auto-generated method stub
		if (this.customerCheckService.checkIfRealPerson(customer)) {
			double lastPrice = game.getPrice() - game.getPrice()*campaign.getPercentOfDiscount()/100;
			
			System.out.println("Oyun satýþý gerçekleþti. " + "Kampanya sonrasý oyun fiyatý: " + lastPrice  );

		} else {
			System.out.println("Oyun satýþý gerçekleþmedi. Kullanýcý bilgileri geçersiz");

		}

	}	

}
