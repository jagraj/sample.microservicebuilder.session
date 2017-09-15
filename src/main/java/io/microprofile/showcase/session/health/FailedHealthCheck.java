package io.microprofile.showcase.session.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

/**
 * 
 * @author jagraj
 *
 */
@Health
@ApplicationScoped
public class FailedHealthCheck implements HealthCheck{
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("Session:failed-check").down().build();
    }

}
