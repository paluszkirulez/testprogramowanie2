package Human.Behaviours;

public class NiceHello implements SayHelloStrategy {
    @Override
    public String introduceYourselfAsYouWant() {
        return "Very nice to see you!";
    }
}
