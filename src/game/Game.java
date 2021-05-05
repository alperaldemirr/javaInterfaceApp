package game;

import java.time.LocalDate;

public class Game {
    private int id;
    private String name;
    private LocalDate releaseDate;
    private float price;
    private float priceDiscounted;
    private String ageLimit;
    private String category;
    private String numberOfPlayer;

    public void Game(){

    }

    public void game(int id, String name, LocalDate birthDay, float price, float priceDiscounted, String ageLimit, String category, String numberOfPlayer) {
        this.id = id;
        this.name = name;
        this.releaseDate = birthDay;
        this.price = price;
        this.priceDiscounted = priceDiscounted;
        this.ageLimit = ageLimit;
        this.category = category;
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(String numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPriceDiscounted(int discount) {
        float sayi = getPrice()-getPrice()*discount/100;
        System.out.println("%" + discount + " indirim uygulandi.");
        return sayi;
    }
}
