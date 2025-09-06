package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class u extends d {
    public static final String d = "ConstantValue";

    public u(t t0, int v) {
        super(t0, "ConstantValue");
        this.q(new byte[]{((byte)(v >>> 8)), ((byte)v)});
    }

    u(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        return new u(t0, this.d().y(this.t(), t0, map0));
    }

    public int t() {
        return g.d(this.c(), 0);
    }
}

