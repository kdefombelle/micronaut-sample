package fr.kdefombelle.service;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class ServiceClientSpec {

  @Inject
  private ServiceClient client;

  @Test
  public void testHelloWorldResponse() {
    assertEquals("Hello kdefombelle", client.hello("kdefombelle"));
  }
}
