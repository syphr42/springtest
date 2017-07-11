package org.syphr.springtest.model;

import java.net.URI;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.syphr.springtest.api.Colors;
import org.syphr.springtest.api.Reverse;

public class Api
{
    private final URI baseUri;

    private final String version = "0.1.0";
    private final SortedMap<String, String> endpoints = new TreeMap<>();

    public Api(UriInfo uriInfo)
    {
        baseUri = uriInfo.getAbsolutePath();

        endpoints.put("colors", UriBuilder.fromUri(baseUri).path(Colors.class).toTemplate());
        endpoints.put("reverse", UriBuilder.fromUri(baseUri).path(Reverse.class).toTemplate());
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
