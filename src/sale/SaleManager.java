package sale;

import customer.Customer;
import game.Game;

public class SaleManager implements SaleService{

    @Override
    public void sold(Game game, Customer customer) {
        System.out.println(game.getName() + " adli oyun" + customer.getFirstName() + " isimli kullaniciya satildi.");
    }

    @Override
    public void gameReturn(Game game, Customer customer) {
        System.out.println(game.getName() + " adli oyun" + customer.getFirstName() + " isimli kullanici tarafindan iade edildi.");
    }

    @Override
    public void campaignForGame(Game game, Customer customer) {
        System.out.println(game.getName() + " adli oyun" + customer.getFirstName() + " isimli kullanici tarafindan iade edildi.");
    }
}

