package javax.xml.bind;

import java.io.IOException;
import javax.xml.transform.Result;

public abstract class SchemaOutputResolver {
    public abstract Result createOutput(String arg1, String arg2) throws IOException;
}

