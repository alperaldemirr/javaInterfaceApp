package sale;
import customer.Customer;
import game.Game;

public interface SaleService {
    void sold(Game game, Customer customer);
    void gameReturn(Game game, Customer customer);
    void campaignForGame(Game game, Customer customer);
}

