package jvminternals.core;

public class ResponsePayload {
    final String body;

    public ResponsePayload(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
