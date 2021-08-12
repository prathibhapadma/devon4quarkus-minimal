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
@Path("/greeting")
public class GreetingRestService {

  @Inject
  GreetingManagement greetingService;

  /**
   * Returns the String "Hello world!".
   *
   * @return The String "Hello world!".
   */
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {

    return this.greetingService.greetingHello();
  }

  /**
   * Return the String "Hello <<name>>!".
   *
   * @param name The name to greet.
   * @return The String "Hello <<name>>!".
   */
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/{name}")
  public String greeting(@PathParam String name) {

    return this.greetingService.greetingHelloName(name);
  }

}