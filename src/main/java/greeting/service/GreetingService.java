package greeting.service;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import greeting.logic.GreetingManagement;

/**
 * Greeting REST endpoint.
 *
 */
@Path("/hello")
public class GreetingService {

  @Inject
  GreetingManagement greetingService;

  /**
   * {@InheritDoc}
   */
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {

    return this.greetingService.greetingHello();
  }

  /**
   * {@InheritDoc}
   */
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/greeting/{name}")
  public String greeting(@PathParam String name) {

    return this.greetingService.greeting(name);
  }

}