package greeting.logic;

import javax.enterprise.context.ApplicationScoped;

/**
 * This is an example business logic class.
 */
@ApplicationScoped
public class GreetingManagement {

  public String greetingHello() {

    return "Hello World!";
  }

  public String greeting(String name) {

    return "Hello " + name + "!";
  }
}
