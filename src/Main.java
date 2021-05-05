import adapters.MernisServiceAdapter;
import campaign.Campaign;
import campaign.GtaCampaign;
import campaign.PubgCampaign;
import customer.Customer;
import customer.CustomerManager;
import game.Game;
import game.GameManager;

public class Main {

    public static void main(String[] args) throws Exception {

        Customer alper = new Customer(1, "Alper", "Aldemir", "11111111111", "alperaldemirr@gmail.com", "05393906064", 2002);


        CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
        customerManager.add(alper);





        Game pubg = new Game();
        pubg.setName("PUBG");
        pubg.setPrice(100);

        GameManager gameManager = new GameManager();
        gameManager.addCart(pubg);

        Campaign pubgCampaign = new PubgCampaign();
        pubgCampaign.campaignIsOver("PUBG");

        System.out.println("Oyunun Fiyati: " + pubg.getPrice());
        System.out.println("Indirimli Yeni Fiyat: " + pubg.getPriceDiscounted(20));



    }
}
