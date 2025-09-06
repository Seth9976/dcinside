package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;

public class f extends d {
    public static class a {
        public int a;
        public int[] b;

        public a(int v, int[] arr_v) {
            this.a = v;
            this.b = arr_v;
        }
    }

    public static final String d = "BootstrapMethods";

    f(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    public f(t t0, a[] arr_f$a) {
        super(t0, "BootstrapMethods");
        int v = 2;
        int v2 = 2;
        for(int v1 = 0; v1 < arr_f$a.length; ++v1) {
            v2 += arr_f$a[v1].b.length * 2 + 4;
        }
        byte[] arr_b = new byte[v2];
        g.e(arr_f$a.length, arr_b, 0);
        for(int v3 = 0; v3 < arr_f$a.length; ++v3) {
            g.e(arr_f$a[v3].a, arr_b, v);
            g.e(arr_f$a[v3].b.length, arr_b, v + 2);
            int[] arr_v = arr_f$a[v3].b;
            v += 4;
            for(int v4 = 0; v4 < arr_v.length; ++v4) {
                g.e(arr_v[v4], arr_b, v);
                v += 2;
            }
        }
        this.q(arr_b);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        a[] arr_f$a = this.t();
        t t1 = this.d();
        for(int v = 0; v < arr_f$a.length; ++v) {
            a f$a0 = arr_f$a[v];
            f$a0.a = t1.y(f$a0.a, t0, map0);
            for(int v1 = 0; true; ++v1) {
                int[] arr_v = f$a0.b;
                if(v1 >= arr_v.length) {
                    break;
                }
                arr_v[v1] = t1.y(arr_v[v1], t0, map0);
            }
        }
        return new f(t0, arr_f$a);
    }

    public a[] t() {
        byte[] arr_b = this.c();
        int v = g.d(arr_b, 0);
        a[] arr_f$a = new a[v];
        int v1 = 2;
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = g.d(arr_b, v1);
            int v4 = g.d(arr_b, v1 + 2);
            int[] arr_v = new int[v4];
            v1 += 4;
            for(int v5 = 0; v5 < v4; ++v5) {
                arr_v[v5] = g.d(arr_b, v1);
                v1 += 2;
            }
            arr_f$a[v2] = new a(v3, arr_v);
        }
        return arr_f$a;
    }
}

