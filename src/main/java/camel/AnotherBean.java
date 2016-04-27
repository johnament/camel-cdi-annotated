package camel;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AnotherBean {
    public void doSomething() {
        System.out.println("I'm called.");
    }
}
