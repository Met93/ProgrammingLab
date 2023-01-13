package Day31_CustomClassConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("Antalya","Protet","Mühendis",15000,true,true,true,true);
        Offer offer2=new Offer();
        offer2.setInfo("Istanbul","Yaşar","Avukat",35000,true,false,true,true);
        Offer offer3=new Offer();
        offer3.setInfo("Hannover","Altessolution","TestEngineer",55000,true,false,false,false);
        Offer offer4=new Offer();
        offer4.setInfo("Berlin","DB","TestEnginner",46000,true,false,true,true);
        Offer offer5=new Offer();
        offer5.setInfo("Izmir","TarımDanşmanlık","Bauer",50000,false,false,true,true);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        Offer[]myOffers={offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime);//removes if the offer is not full time
        System.out.println(fullTimeOffers.size());
        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!p.location.equals("Antalya"));// remove the offer if the offer is not from local area
        System.out.println(localOffers.size());
        for (Offer each : localOffers) {
            System.out.println(each.companyName+" : "+each.salary);
        }





    }
}
