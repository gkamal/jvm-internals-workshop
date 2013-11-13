package jvminternals.resources;

import jvminternals.core.RequestPayload;
import jvminternals.core.ResponsePayload;
import org.apache.commons.lang.RandomStringUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/payload")
@Produces(MediaType.APPLICATION_JSON)
public class PayloadResource {

    @GET
    public ResponsePayload getDefaultPayload(@QueryParam("payload_size") int payloadSize) {
      return new ResponsePayload(RandomStringUtils.random(payloadSize));
    }


}
