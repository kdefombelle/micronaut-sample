package fr.kdefombelle;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import io.swagger.v3.oas.annotations.tags.Tag;

@OpenAPIDefinition(
  info = @Info(
    title = "app-service",
    version = "1.0",
    description = "My API Server",
    license = @License(name = "Apache 2.0"),
    contact = @Contact(name = "Karim de Fombelle", email = "karim.defombelle@gmail.com")
  ),
  servers = {
    @Server(
      description = "test server",
      url = "http://localhost:8080"
    )
  }
)
public class Application {

  public static void main(String[] args) {
    Micronaut.run(Application.class, args);
  }
}
