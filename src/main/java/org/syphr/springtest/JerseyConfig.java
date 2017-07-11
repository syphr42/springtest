package org.syphr.springtest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import org.syphr.springtest.api.Api;
import org.syphr.springtest.api.Colors;
import org.syphr.springtest.api.Reverse;

@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(Api.class);
        register(Colors.class);
        register(Reverse.class);
    }
}
