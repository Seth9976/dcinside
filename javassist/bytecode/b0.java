package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class b0 extends d {
    public static final String d = "NestMembers";

    b0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    private b0(t t0, byte[] arr_b) {
        super(t0, "NestMembers", arr_b);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        byte[] arr_b = this.c();
        byte[] arr_b1 = new byte[arr_b.length];
        t t1 = this.d();
        int v = 0;
        int v1 = g.d(arr_b, 0);
        g.e(v1, arr_b1, 0);
        for(int v2 = 2; v < v1; v2 += 2) {
            g.e(t1.y(g.d(arr_b, v2), t0, map0), arr_b1, v2);
            ++v;
        }
        return new b0(t0, arr_b1);
    }

    public int t(int v) {
        return g.d(this.c, v * 2 + 2);
    }

    public int u() {
        return g.d(this.c, 0);
    }
}

