package internature.gateway.service;

public class UnauthorizedException extends RuntimeException {

  public UnauthorizedException(String message) {
    super(message);
  }
}
