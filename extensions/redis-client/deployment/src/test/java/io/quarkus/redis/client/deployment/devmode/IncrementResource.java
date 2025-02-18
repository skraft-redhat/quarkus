package io.quarkus.redis.client.deployment.devmode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.redis.datasource.RedisDataSource;
import io.quarkus.redis.datasource.keys.KeyCommands;
import io.quarkus.redis.datasource.value.ValueCommands;

@Path("/inc")
public class IncrementResource {

    public static final long INCREMENT = 1;
    private final ValueCommands<String, Integer> commands;
    private final KeyCommands<String> keys;

    public IncrementResource(RedisDataSource ds) {
        commands = ds.value(Integer.class);
        keys = ds.key();
    }

    @GET
    public int increment() {
        return (int) commands.incrby("counter-dev-mode", INCREMENT);
    }

    @GET
    @Path("/keys")
    public int verifyPreloading() {
        return keys.keys("*").size();
    }

}
