package BackendOfGame.adapters;
import java.rmi.RemoteException;

import BackendOfGame.abstracts.CustomerCheckService;
import BackendOfGame.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getBirthOfYear().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
