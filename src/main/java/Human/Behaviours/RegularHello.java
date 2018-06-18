package Human.Behaviours;

public class RegularHello implements SayHelloStrategy {
    @Override
    public String introduceYourselfAsYouWant() {
        return "Hi!";
    }
}
