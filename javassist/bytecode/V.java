package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class v extends d {
    public static final String d = "Deprecated";

    public v(t t0) {
        super(t0, "Deprecated", new byte[0]);
    }

    v(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        return new v(t0);
    }
}

