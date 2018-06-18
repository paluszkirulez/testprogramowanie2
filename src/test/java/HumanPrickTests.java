import Human.Abstracts.Human;
import Human.Implementations.Prick;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HumanPrickTests {
    private Human prick;

    @Before
    public void setup(){
        prick = new Prick.PrickBuilder().withName("Jankiel").withSurName("Szopa").withAge(22).CreateHuman();
    }

    @Test
    public void TestZwykly(){
        Assert.assertEquals("Nice to see you".equals(prick.sayHello()),false);
    }
    @Test
    public void TestPrzywitania(){
        Assert.assertEquals(prick.introduceYourself().contains("My name is Jankiel"),true);
    }
}
