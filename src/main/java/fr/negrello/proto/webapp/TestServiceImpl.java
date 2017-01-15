package fr.negrello.proto.webapp;

/**
 * Created by franck on 12/11/16.
 */
public class TestServiceImpl implements TestService {

    @Override
    public String test(String s) {
        return "hello " + s;
    }
}
