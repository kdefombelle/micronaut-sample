package fr.kdefombelle.service;

public class Request {
  private int value;
  private String requester;

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getRequester() {
    return requester;
  }

  public void setRequester(String requester) {
    this.requester = requester;
  }
}
