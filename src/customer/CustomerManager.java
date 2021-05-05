package customer;

public class CustomerManager {

    CustomerCheckService customerCheckService;

    public CustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public void add(Customer customer) throws Exception {
        if (customerCheckService.checkIfRealPerson(customer)) {
            System.out.println(customer.getFirstName() + " adli kullanici dogrulanmistir. Kullanici sisteme eklendi");
        }else{
            System.out.println(customer.getFirstName() + " adli kullanici dogrulanmamistir. Kullanici sisteme eklenemedi.");
        }
    }

    public void delete(Customer customer) {
        System.out.println("Kullanici sistemden silindi: " + customer.getFirstName());
    }

    public void update(Customer customer) {
        System.out.println("Kullanici guncellendi: " + customer.getFirstName());
    }
}
