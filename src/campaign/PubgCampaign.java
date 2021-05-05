package campaign;

public class PubgCampaign implements Campaign{
    @Override
    public void campaign(String message) {
        System.out.println("MUJDE! " + message +  " oyununa kampanya geldi.");
    }

    @Override
    public void campaignIsOver(String message) {
        System.out.println(":( " + message +  " oyunundaki kampanya sona erdi.");
    }

    @Override
    public void campaignHasChanged(String message) {
        System.out.println("Bilgilendirme! " + message +  " oyunundaki kampanyada degisiklik yasandi.");
    }
}
