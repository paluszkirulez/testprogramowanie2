package Human.Implementations;

import Human.Abstracts.Human;
import Human.Behaviours.SayHelloStrategy;

public class PuppetCreature extends Human {
    private SayHelloStrategy sayHelloStrategy;
    @Override
    public String sayHello() {
        return this.sayHelloStrategy.introduceYourselfAsYouWant();
    }

    public PuppetCreature(SayHelloStrategy sayHelloStrategy){
        this.sayHelloStrategy = sayHelloStrategy;
    }
}
