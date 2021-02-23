package fr.kdefombelle.service;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest
public class ServiceControllerSpec {

  @Inject
  private ServiceClient client;

  @Test
  void testService() {
    Request request = new Request();
    request.setRequester("kdefombelle");
    request.setValue(1);
    Result result = client.execute(request).blockingGet();
    assertTrue(request.getValue() * 2 == result.getValue());
  }

  @Test
  void testTest() {
    String response = client.hello("kdefombelle");
    assertEquals("Hello kdefombelle", response);
  }

}
