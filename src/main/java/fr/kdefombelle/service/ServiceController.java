package fr.kdefombelle.service;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/service")
public class ServiceController {

  private final Logger logger = LoggerFactory.getLogger(ServiceController.class);

  @Operation(summary = "Double the value provided by the requester", description = "Showcase of the creation of a webservice")
  @ApiResponse(
    responseCode = "201",
    description = "Result object correctly created",
    content = @Content(mediaType = "application/json",
      schema = @Schema(type = "Result")))
  @ApiResponse(
    responseCode = "400",
    description = "Result object correctly created",
    content = @Content(mediaType = "application/json",
      schema = @Schema(type = "Result")))
  @Post("execute")
  @Status(HttpStatus.CREATED)
  public Single<Result> execute(@Body Request request) {
    Result result = new Result();
    result.setValue(request.getValue() * 2);
    result.setRequester(request.getRequester());
    logger.info("*********HHHHHHHHHHAAAAAAAAAAAAAAAAAAAAAAA****");
    return Single.just(result);
  }

  @Get("{name}")
  public String hello(String name) {
    logger.info("*********HHHHHHHHBBBBBBBBBBBBBBBB****");
    return "Hello " + name;
  }

}
