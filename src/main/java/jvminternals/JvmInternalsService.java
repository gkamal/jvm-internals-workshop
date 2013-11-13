package jvminternals;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import jvminternals.health.JvmInternalsHealthCheck;
import jvminternals.resources.PayloadResource;

public class JvmInternalsService extends Service<JvmInternalsConfiguration> {

    public static void main(String[] args) throws Exception {
        new JvmInternalsService().run(args);
    }

    @Override
    public void initialize(Bootstrap<JvmInternalsConfiguration> jvmInternalsConfigurationBootstrap) {

    }

    @Override
    public void run(JvmInternalsConfiguration jvmInternalsConfiguration, Environment environment) throws Exception {
       environment.addResource(new PayloadResource());
       environment.addHealthCheck(new JvmInternalsHealthCheck());
    }
}
