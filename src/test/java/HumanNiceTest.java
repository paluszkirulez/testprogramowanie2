import Human.Implementations.ManOfCulture;
import org.junit.Assert;
import org.junit.Before;
import Human.Abstracts.Human;
import org.junit.Test;

public class HumanNiceTest {
    private Human przyjemniaczek;

    @Before
    public void setup(){
        przyjemniaczek = new ManOfCulture.ManOfCultureBuilder()
                .withName("Bartek")
                .withSurName("Dawid").CreateHuman();
    }

    @Test
    public void TestZwykly(){
        Assert.assertEquals("Nice to see you".equals(przyjemniaczek.sayHello()),false);
    }
    @Test
    public void TestPrzywitania(){
        Assert.assertEquals(przyjemniaczek.introduceYourself().contains("My name is Bartek"),true);
    }
}
