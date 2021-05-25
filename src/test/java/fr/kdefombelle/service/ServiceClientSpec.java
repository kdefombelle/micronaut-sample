package fr.kdefombelle.service;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

import javax.inject.Inject;

@MicronautTest
public class ServiceClientSpec {

  @Inject
  private ServiceClient client;

  //  @Test
  //  public void testHelloWorldResponse() {
  //    assertEquals("Hello kdefombelle", client.hello("kdefombelle"));
  //  }
}
