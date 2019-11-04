package com.example;

/**
 * @author      Immanuel Lokzinsky <immanuel@live.dk>
 * @version     1.6                 (current version number of program)
 * @since       1.2          (the version of the package this class was first added to)
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  public String greet(String someonee) {
    return String.format("Hello, %s!", someonee);
  }
}
