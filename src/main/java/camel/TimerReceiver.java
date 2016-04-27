package camel;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Named;

@ApplicationScoped
@Named
public class TimerReceiver {
    public void doCall() {
        CDI.current().select(AnotherBean.class).get().doSomething();
    }
}
