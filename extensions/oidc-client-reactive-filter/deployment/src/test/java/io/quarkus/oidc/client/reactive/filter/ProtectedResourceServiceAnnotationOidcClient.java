package io.quarkus.oidc.client.reactive.filter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkus.oidc.client.filter.OidcClientFilter;

@OidcClientFilter("annotation")
@RegisterRestClient
@Path("/")
public interface ProtectedResourceServiceAnnotationOidcClient {

    @GET
    String getUserName();
}
