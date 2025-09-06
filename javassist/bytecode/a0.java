package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class a0 extends d {
    public static final String d = "NestHost";

    private a0(t t0, int v) {
        super(t0, "NestHost", new byte[2]);
        g.e(v, this.c(), 0);
    }

    a0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        return new a0(t0, this.d().y(g.d(this.c(), 0), t0, map0));
    }

    public int t() {
        return g.d(this.c, 0);
    }
}

