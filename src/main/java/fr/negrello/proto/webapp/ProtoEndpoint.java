package fr.negrello.proto.webapp;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by franck on 10/30/16.
 */
@Path("/protos")
public class ProtoEndpoint {

    @Inject
    TestService service;

    @GET
    @Produces("application/json")
    public String getProto() {
        return service.test("toto");
    }

}
