import Human.Behaviours.NiceHello;
import Human.Behaviours.PrickHello;
import Human.Behaviours.RegularHello;
import Human.Implementations.PuppetCreature;
import org.junit.Assert;
import org.junit.Test;

public class PuppetTest {
    private PuppetCreature puppetCreature;

    @Test
    public void testRegularHello(){
        puppetCreature = new PuppetCreature(new RegularHello());
        Assert.assertEquals(puppetCreature.sayHello().equals("Hi!"),true);
    }
    @Test
    public void testNiceHello(){
        puppetCreature = new PuppetCreature(new NiceHello());
        Assert.assertEquals(puppetCreature.sayHello().equals("Very nice to see you!"),true);
    }
    @Test
    public void testPrickHello(){
        puppetCreature = new PuppetCreature(new PrickHello());
        Assert.assertEquals(puppetCreature.sayHello().equals("why you want to bother me so much?"),true);
    }
}
