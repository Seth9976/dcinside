package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class z extends d {
    public static final String d = "EnclosingMethod";

    z(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    public z(t t0, String s) {
        super(t0, "EnclosingMethod");
        int v = t0.a(s);
        this.q(new byte[]{((byte)(v >>> 8)), ((byte)v), 0, 0});
    }

    public z(t t0, String s, String s1, String s2) {
        super(t0, "EnclosingMethod");
        int v = t0.a(s);
        int v1 = t0.u(s1, s2);
        this.q(new byte[]{((byte)(v >>> 8)), ((byte)v), ((byte)(v1 >>> 8)), ((byte)v1)});
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        return this.w() == 0 ? new z(t0, this.u()) : new z(t0, this.u(), this.x(), this.v());
    }

    public int t() {
        return g.d(this.c(), 0);
    }

    public String u() {
        return this.d().A(this.t());
    }

    public String v() {
        t t0 = this.d();
        return t0.p0(t0.i0(this.w()));
    }

    public int w() {
        return g.d(this.c(), 2);
    }

    public String x() {
        t t0 = this.d();
        int v = this.w();
        return v == 0 ? "<clinit>" : t0.p0(t0.j0(v));
    }
}

