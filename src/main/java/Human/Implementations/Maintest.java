package Human.Implementations;
import Human.Abstracts.Human;
import Human.Behaviours.NiceHello;
import Human.Behaviours.PrickHello;

public class Maintest {
    public static void main(String[] args) {
        Human bartek = new ManOfCulture.ManOfCultureBuilder()
                .withName("Bartek")
                .withAge(22)
                .withSurName("Dawid")
                .CreateHuman();

        System.out.println(bartek.sayHello());
        System.out.println(bartek.introduceYourself());
        Human drwal = new Prick.PrickBuilder()
                .withName("Bardzo")
                .withSurName("Ponury")
                .CreateHuman();

        System.out.println(drwal.sayHello());
        System.out.println(drwal.introduceYourself());

        PuppetCreature puppetCreature = new PuppetCreature(new NiceHello());
        System.out.println(puppetCreature.sayHello());
        PuppetCreature puppetCreature2 = new PuppetCreature(new PrickHello());
        System.out.println(puppetCreature2.sayHello());

    }
}
