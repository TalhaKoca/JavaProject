package BackendOfGame.concretes;

import BackendOfGame.abstracts.CampaignService;
import BackendOfGame.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya bilgileri eklendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya bilgileri silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri güncellendi.");
		
	}
	
}
