package jvminternals.core;


public class RequestPayload {
    final String body;

    public RequestPayload(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
