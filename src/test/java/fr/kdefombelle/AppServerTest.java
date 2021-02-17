package fr.kdefombelle;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class AppServerTest {

  @Inject
  private EmbeddedApplication<?> application;

  @Test
  void testItWorks() {
    Assertions.assertTrue(application.isRunning());
  }

}
