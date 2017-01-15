package fr.negrello.proto.webapp;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by franck on 1/15/17.
 */
@ApplicationPath("/")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( ProtoEndpoint.class );
        return h;
    }

}
