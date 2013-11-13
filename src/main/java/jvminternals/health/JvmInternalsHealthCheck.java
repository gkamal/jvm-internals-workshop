package jvminternals.health;


import com.yammer.metrics.core.HealthCheck;

public class JvmInternalsHealthCheck extends HealthCheck {

    public JvmInternalsHealthCheck() {
        super("simple-check");
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
