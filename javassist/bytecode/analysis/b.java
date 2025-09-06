package javassist.bytecode.analysis;

import java.util.ArrayList;
import javassist.bytecode.T;
import javassist.bytecode.stackmap.a.c;
import javassist.bytecode.stackmap.a;
import javassist.l;
import javassist.q;

public class b {
    static abstract class d {
        g[] a;

        d(g[] arr_b$g) {
            this.a = arr_b$g;
        }

        abstract a[] a(g arg1);

        abstract a[] b(g arg1);

        g c(a a0) {
            return this.a[((e)a0).h];
        }
    }

    public static class e extends a {
        public Object g;
        int h;
        T i;
        e[] j;

        e(int v, T t0) {
            super(v);
            this.g = null;
            this.i = t0;
        }

        @Override  // javassist.bytecode.stackmap.a
        protected void b(StringBuffer stringBuffer0) {
            super.b(stringBuffer0);
            stringBuffer0.append(", incoming{");
            for(int v = 0; true; ++v) {
                e[] arr_b$e = this.j;
                if(v >= arr_b$e.length) {
                    break;
                }
                stringBuffer0.append(arr_b$e[v].a);
                stringBuffer0.append(", ");
            }
            stringBuffer0.append("}");
        }

        public f[] c() {
            ArrayList arrayList0 = new ArrayList();
            for(javassist.bytecode.stackmap.a.a a$a0 = this.f; a$a0 != null; a$a0 = a$a0.a) {
                arrayList0.add(new f(a$a0));
            }
            return (f[])arrayList0.toArray(new f[arrayList0.size()]);
        }

        public e d(int v) {
            return (e)this.d[v];
        }

        public int e() {
            return this.d == null ? 0 : this.d.length;
        }

        a[] f() {
            return this.d;
        }

        public e g(int v) {
            return this.j[v];
        }

        public int h() {
            return this.c;
        }

        public int i() {
            return this.h;
        }

        public int j() {
            return this.b;
        }

        public int k() {
            return this.a;
        }
    }

    public static class f {
        private e a;
        private int b;

        f(javassist.bytecode.stackmap.a.a a$a0) {
            this.a = (e)a$a0.b;
            this.b = a$a0.c;
        }

        public e b() {
            return this.a;
        }

        public String c() {
            return this.b == 0 ? "java.lang.Throwable" : this.a.i.g().A(this.b);
        }
    }

    public static class g {
        private e a;
        private g b;
        private g[] c;

        g(e b$e0) {
            this.a = b$e0;
            this.b = null;
        }

        public e c() {
            return this.a;
        }

        public g d(int v) {
            return this.c[v];
        }

        public int e() {
            return this.c.length;
        }

        private static g f(g b$g0, g b$g1, int[] arr_v) {
            while(b$g0 != b$g1) {
                if(arr_v[b$g0.a.h] < arr_v[b$g1.a.h]) {
                    b$g0 = b$g0.b;
                }
                else {
                    b$g1 = b$g1.b;
                }
                if(b$g0 == null || b$g1 == null) {
                    return null;
                }
                if(false) {
                    break;
                }
            }
            return b$g0;
        }

        int g(g b$g0, boolean[] arr_z, int v, int[] arr_v, d b$d0) {
            int v1 = this.a.h;
            if(arr_z[v1]) {
                return v;
            }
            arr_z[v1] = true;
            this.b = b$g0;
            a[] arr_a = b$d0.b(this);
            if(arr_a != null) {
                int v3 = v;
                for(int v2 = 0; v2 < arr_a.length; ++v2) {
                    v3 = b$d0.c(arr_a[v2]).g(this, arr_z, v3, arr_v, b$d0);
                }
                v = v3;
            }
            arr_v[v1] = v;
            return v + 1;
        }

        boolean h(boolean[] arr_z, int[] arr_v, d b$d0) {
            boolean z;
            int v = this.a.h;
            if(arr_z[v]) {
                return false;
            }
            arr_z[v] = true;
            a[] arr_a = b$d0.b(this);
            if(arr_a == null) {
                z = false;
            }
            else {
                z = false;
                for(int v2 = 0; v2 < arr_a.length; ++v2) {
                    if(b$d0.c(arr_a[v2]).h(arr_z, arr_v, b$d0)) {
                        z = true;
                    }
                }
            }
            a[] arr_a1 = b$d0.a(this);
            if(arr_a1 != null) {
                for(int v1 = 0; v1 < arr_a1.length; ++v1) {
                    g b$g0 = this.b;
                    if(b$g0 != null) {
                        g b$g1 = g.f(b$g0, b$d0.c(arr_a1[v1]), arr_v);
                        if(b$g1 != this.b) {
                            this.b = b$g1;
                            z = true;
                        }
                    }
                }
            }
            return z;
        }

        public g i() {
            return this.b;
        }

        private static void j(g[] arr_b$g) {
            int[] arr_v = new int[arr_b$g.length];
            for(int v1 = 0; v1 < arr_b$g.length; ++v1) {
                arr_v[v1] = 0;
            }
            for(int v2 = 0; v2 < arr_b$g.length; ++v2) {
                g b$g0 = arr_b$g[v2].b;
                if(b$g0 != null) {
                    int v3 = b$g0.a.h;
                    ++arr_v[v3];
                }
            }
            for(int v4 = 0; v4 < arr_b$g.length; ++v4) {
                arr_b$g[v4].c = new g[arr_v[v4]];
            }
            for(int v5 = 0; v5 < arr_b$g.length; ++v5) {
                arr_v[v5] = 0;
            }
            for(int v = 0; v < arr_b$g.length; ++v) {
                g b$g1 = arr_b$g[v];
                g b$g2 = b$g1.b;
                if(b$g2 != null) {
                    g[] arr_b$g1 = b$g2.c;
                    int v6 = b$g2.a.h;
                    int v7 = arr_v[v6];
                    arr_v[v6] = v7 + 1;
                    arr_b$g1[v7] = b$g1;
                }
            }
        }

        @Override
        public String toString() {
            StringBuffer stringBuffer0 = new StringBuffer();
            stringBuffer0.append("Node[pos=");
            stringBuffer0.append(this.c().k());
            stringBuffer0.append(", parent=");
            stringBuffer0.append((this.b == null ? "*" : Integer.toString(this.b.c().k())));
            stringBuffer0.append(", children{");
            for(int v = 0; true; ++v) {
                g[] arr_b$g = this.c;
                if(v >= arr_b$g.length) {
                    break;
                }
                stringBuffer0.append(arr_b$g[v].c().k());
                stringBuffer0.append(", ");
            }
            stringBuffer0.append("}]");
            return stringBuffer0.toString();
        }
    }

    private l a;
    private T b;
    private e[] c;
    private javassist.bytecode.analysis.d[] d;

    public b(l l0, T t0) throws javassist.bytecode.e {
        class javassist.bytecode.analysis.b.a extends c {
            final b a;

            @Override  // javassist.bytecode.stackmap.a$c
            protected a[] e(int v) {
                return new e[v];
            }

            @Override  // javassist.bytecode.stackmap.a$c
            protected a h(int v) {
                return new e(v, b.this.b);
            }
        }

        this.a = l0;
        this.b = t0;
        this.d = null;
        e[] arr_b$e = (e[])new javassist.bytecode.analysis.b.a(this).d(t0);
        this.c = arr_b$e;
        if(arr_b$e == null) {
            this.c = new e[0];
        }
        int v = this.c.length;
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            e b$e0 = this.c[v1];
            b$e0.h = v1;
            b$e0.j = new e[b$e0.h()];
            arr_v[v1] = 0;
        }
        for(int v2 = 0; v2 < v; ++v2) {
            e b$e1 = this.c[v2];
            for(int v3 = 0; v3 < b$e1.e(); ++v3) {
                e b$e2 = b$e1.d(v3);
                e[] arr_b$e1 = b$e2.j;
                int v4 = b$e2.h;
                int v5 = arr_v[v4];
                arr_v[v4] = v5 + 1;
                arr_b$e1[v5] = b$e1;
            }
            f[] arr_b$f = b$e1.c();
            for(int v6 = 0; v6 < arr_b$f.length; ++v6) {
                e b$e3 = arr_b$f[v6].a;
                e[] arr_b$e2 = b$e3.j;
                int v7 = b$e3.h;
                int v8 = arr_v[v7];
                arr_v[v7] = v8 + 1;
                arr_b$e2[v8] = b$e1;
            }
        }
    }

    public b(q q0) throws javassist.bytecode.e {
        this(q0.f(), q0.D());
    }

    public e[] b() {
        return this.c;
    }

    public g[] c() {
        class javassist.bytecode.analysis.b.b extends d {
            final b b;

            javassist.bytecode.analysis.b.b(g[] arr_b$g) {
                super(arr_b$g);
            }

            @Override  // javassist.bytecode.analysis.b$d
            a[] a(g b$g0) {
                return b$g0.a.j;
            }

            @Override  // javassist.bytecode.analysis.b$d
            a[] b(g b$g0) {
                return b$g0.a.f();
            }
        }

        int v = this.c.length;
        if(v == 0) {
            return null;
        }
        g[] arr_b$g = new g[v];
        boolean[] arr_z = new boolean[v];
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b$g[v1] = new g(this.c[v1]);
            arr_z[v1] = false;
        }
        javassist.bytecode.analysis.b.b b$b0 = new javassist.bytecode.analysis.b.b(this, arr_b$g);
        arr_b$g[0].g(null, arr_z, 0, arr_v, b$b0);
        do {
            for(int v2 = 0; v2 < v; ++v2) {
                arr_z[v2] = false;
            }
        }
        while(arr_b$g[0].h(arr_z, arr_v, b$b0));
        g.j(arr_b$g);
        return arr_b$g;
    }

    public javassist.bytecode.analysis.d d(int v) throws javassist.bytecode.e {
        if(this.d == null) {
            this.d = new javassist.bytecode.analysis.a().a(this.a, this.b);
        }
        return this.d[v];
    }

    public g[] e() {
        class javassist.bytecode.analysis.b.c extends d {
            final b b;

            javassist.bytecode.analysis.b.c(g[] arr_b$g) {
                super(arr_b$g);
            }

            @Override  // javassist.bytecode.analysis.b$d
            a[] a(g b$g0) {
                return b$g0.a.f();
            }

            @Override  // javassist.bytecode.analysis.b$d
            a[] b(g b$g0) {
                return b$g0.a.j;
            }
        }

        int v = this.c.length;
        if(v == 0) {
            return null;
        }
        g[] arr_b$g = new g[v];
        boolean[] arr_z = new boolean[v];
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b$g[v1] = new g(this.c[v1]);
            arr_z[v1] = false;
        }
        javassist.bytecode.analysis.b.c b$c0 = new javassist.bytecode.analysis.b.c(this, arr_b$g);
        int v2 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            if(arr_b$g[v3].a.e() == 0) {
                v2 = arr_b$g[v3].g(null, arr_z, v2, arr_v, b$c0);
            }
        }
        do {
            for(int v4 = 0; v4 < v; ++v4) {
                arr_z[v4] = false;
            }
            boolean z = false;
            for(int v5 = 0; v5 < v; ++v5) {
                if(arr_b$g[v5].a.e() == 0 && arr_b$g[v5].h(arr_z, arr_v, b$c0)) {
                    z = true;
                }
            }
        }
        while(z);
        g.j(arr_b$g);
        return arr_b$g;
    }
}

