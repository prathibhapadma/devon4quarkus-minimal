package greeting.logic;

import javax.enterprise.context.ApplicationScoped;

/**
 * This is an example business logic class.
 */
@ApplicationScoped
public class GreetingManagement {

  /**
   * Returns the String "Hello world!".
   *
   * @return The String "Hello world!".
   */
  public String greetingHello() {

    return "Hello World!";
  }

  /**
   * Return the String "Hello <<name>>!".
   *
   * @param name The name to greet.
   * @return The String "Hello <<name>>!".
   */
  public String greetingHelloName(String name) {

    return "Hello " + name + "!";
  }
}
