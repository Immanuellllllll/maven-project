package com.example.Test;

public class Greeter implements GreeterI {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  @Override
  public String greet(String someonee) {
    return String.format("Hello, %s!", someonee);
  }
}
