package campaign;

public abstract interface Campaign {
    void campaign(String message);
    void campaignIsOver(String message);
    void campaignHasChanged(String message);
}
