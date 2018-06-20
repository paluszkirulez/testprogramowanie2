package Human.Implementations;
import Human.Abstracts.Human;
import Human.Behaviours.NiceHello;
import Human.Behaviours.PrickHello;

public class Maintest {
    public static void main(String[] args) {
        CulturalCensus culturalCensus = CulturalCensus.culturalCensus();
        culturalCensus.addHumanToCultural("N,Bartek,Dawid,28;N,Maria,Kierach,28;P,Michal,Boniek;P,Bartek,Niedobry,55");
        culturalCensus.getCensusList().stream().forEach(x-> System.out.println(x));
        culturalCensus.getCensusList().stream().forEach(x-> System.out.println(x.getClass()));
        System.out.println(culturalCensus.getCensusList().toString());

        System.out.println(culturalCensus.listOfPeaopleBelowGienAge(50));

    }
}
