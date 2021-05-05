package adapters;

import customer.Customer;
import customer.CustomerCheckService;
import mernisReference.HVUKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        HVUKPSPublicSoap client = new HVUKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getBirthYear());
    }
}
