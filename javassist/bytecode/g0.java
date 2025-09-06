package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class g0 extends d {
    public static final String d = "SourceFile";

    g0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    public g0(t t0, String s) {
        super(t0, "SourceFile");
        int v = t0.x(s);
        this.q(new byte[]{((byte)(v >>> 8)), ((byte)v)});
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        return new g0(t0, this.t());
    }

    public String t() {
        return this.d().p0(g.d(this.c(), 0));
    }
}

