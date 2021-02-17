package fr.kdefombelle.service;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("/service")
public interface ServiceClient {

  @Post("execute")
  Single<Result> execute(@Body Request request);

  @Get("{name}")
  String hello(String name);

}
