package com.example.Test;

/**
 * klasseeeeee
 */
public class Greeter implements GreeterI {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /** (@inheritDoc) */
  @Override
  public String greet(String someonee) {
    return String.format("Hello, %s!", someonee);
  }
}
