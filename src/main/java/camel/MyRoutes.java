package camel;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:foo").to("bean:timerReceiver?method=doCall()");
    }
}
