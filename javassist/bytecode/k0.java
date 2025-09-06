package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class k0 extends d {
    public static final String d = "Synthetic";

    public k0(t t0) {
        super(t0, "Synthetic", new byte[0]);
    }

    k0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        return new k0(t0);
    }
}

