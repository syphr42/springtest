package org.syphr.springtest.model;

import java.util.SortedMap;
import java.util.TreeMap;

import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.syphr.springtest.api.Reverse;

public class Api
{
    private final UriBuilder builder;

    private final String version = "0.1.0";
    private final SortedMap<String, String> endpoints = new TreeMap<>();

    public Api(UriInfo uriInfo)
    {
        builder = UriBuilder.fromUri(uriInfo.getAbsolutePath());

        endpoints.put("reverse", builder.path(Reverse.class).toTemplate());
    }

    public String getVersion()
    {
        return version;
    }

    public SortedMap<String, String> getEndpoints()
    {
        return endpoints;
    }
}
