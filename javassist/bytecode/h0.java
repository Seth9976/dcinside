package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class h0 extends d {
    static class a extends h {
        byte[] b;
        t c;
        t d;
        Map e;

        a(h0 h00, t t0, Map map0) {
            super(h00);
            this.c = h00.d();
            this.b = new byte[this.a.length];
            this.d = t0;
            this.e = map0;
        }

        @Override  // javassist.bytecode.h0$h
        public int a(int v, int v1, int v2) {
            g.e(v1, this.b, v - 4);
            return super.a(v, v1, v2);
        }

        @Override  // javassist.bytecode.h0$h
        public void b(int v, int v1) {
            this.b[v] = 7;
            g.e(this.c.y(v1, this.d, this.e), this.b, v + 1);
        }

        @Override  // javassist.bytecode.h0$h
        public void d(int v, byte b) {
            this.b[v] = b;
        }

        @Override  // javassist.bytecode.h0$h
        public int e(int v, int v1, int v2, boolean z) {
            g.e(v2, this.b, v - 2);
            return super.e(v, v1, v2, z);
        }

        @Override  // javassist.bytecode.h0$h
        public void g(int v, int v1) {
            byte[] arr_b = this.b;
            arr_b[v] = 8;
            g.e(v1, arr_b, v + 1);
        }

        @Override  // javassist.bytecode.h0$h
        public void h() {
            g.e(g.d(this.a, 0), this.b, 0);
            super.h();
        }

        public h0 i() {
            return new h0(this.d, this.b);
        }
    }

    static class b extends f {
        private int c;
        private int d;
        private int e;

        b(h0 h00, int v, int v1, int v2) {
            super(h00);
            this.c = v;
            this.d = v1;
            this.e = v2;
        }

        @Override  // javassist.bytecode.h0$f
        public int e(int v, int v1, int v2, boolean z) {
            if(z && v2 >= this.c) {
                this.b.c(v2 + 1);
                for(int v3 = 0; v3 < v2; ++v3) {
                    if(v3 == this.c) {
                        this.j();
                    }
                    v = this.f(v3, v);
                }
                if(v2 == this.c) {
                    this.j();
                }
                return v;
            }
            return super.e(v, v1, v2, z);
        }

        private void j() {
            int v = this.d;
            if(v == 7) {
                this.b.d(7, this.e);
                return;
            }
            if(v == 8) {
                this.b.d(8, this.e);
                return;
            }
            this.b.d(v, 0);
        }
    }

    static class c extends f {
        int c;

        c(h0 h00, int v) {
            super(h00);
            this.c = v;
        }

        @Override  // javassist.bytecode.h0$h
        public int c(int v, int v1, int v2) {
            return this.j(v, v1, v2);
        }

        private int j(int v, int v1, int v2) {
            int v4 = v;
            int v5 = 0;
            int v6 = 0;
            while(v5 < v2) {
                byte[] arr_b = this.a;
                int v7 = arr_b[v4];
                if(v7 == 7) {
                label_14:
                    v4 += 3;
                }
                else if(v7 != 8) {
                    ++v4;
                }
                else if(g.d(arr_b, v4 + 1) == this.c) {
                    ++v6;
                    goto label_14;
                }
                ++v5;
            }
            this.b.c(v2 - v6);
            for(int v3 = 0; v3 < v2; ++v3) {
                byte[] arr_b1 = this.a;
                int v8 = arr_b1[v];
                if(v8 == 7) {
                    this.b(v, g.d(arr_b1, v + 1));
                    v += 3;
                }
                else if(v8 == 8) {
                    int v9 = g.d(arr_b1, v + 1);
                    if(v9 != this.c) {
                        this.g(v, v9);
                    }
                    v += 3;
                }
                else {
                    this.d(v, ((byte)v8));
                    ++v;
                }
            }
            return v;
        }
    }

    static class javassist.bytecode.h0.d extends h {
        private PrintWriter b;

        public javassist.bytecode.h0.d(h0 h00, PrintWriter printWriter0) {
            super(h00);
            this.b = printWriter0;
        }

        @Override  // javassist.bytecode.h0$h
        public int a(int v, int v1, int v2) {
            this.b.println("  * offset " + v1);
            return super.a(v, v1, v2);
        }

        public void i() {
            int v = g.d(this.a, 0);
            this.b.println(v + " entries");
            this.h();
        }
    }

    static class e extends h {
        private int b;
        private int c;
        private boolean d;

        public e(h0 h00, int v, int v1, boolean z) {
            super(h00);
            this.b = v;
            this.c = v1;
            this.d = z;
        }

        @Override  // javassist.bytecode.h0$h
        public int a(int v, int v1, int v2) {
            if(this.d) {
                if(this.b <= v1) {
                    g.e(this.c + v1, this.a, v - 4);
                    return super.a(v, v1, v2);
                }
            }
            else if(this.b < v1) {
                g.e(this.c + v1, this.a, v - 4);
            }
            return super.a(v, v1, v2);
        }

        @Override  // javassist.bytecode.h0$h
        public void g(int v, int v1) {
            if(this.b <= v1) {
                g.e(v1 + this.c, this.a, v + 1);
            }
        }
    }

    static class f extends h {
        i b;

        f(h0 h00) {
            super(h00);
            this.b = new i();
        }

        @Override  // javassist.bytecode.h0$h
        public int a(int v, int v1, int v2) {
            this.b.c(v1);
            return super.a(v, v1, v2);
        }

        @Override  // javassist.bytecode.h0$h
        public void b(int v, int v1) {
            this.b.d(7, v1);
        }

        @Override  // javassist.bytecode.h0$h
        public void d(int v, byte b) {
            this.b.d(((int)b), 0);
        }

        @Override  // javassist.bytecode.h0$h
        public int e(int v, int v1, int v2, boolean z) {
            this.b.c(v2);
            return super.e(v, v1, v2, z);
        }

        @Override  // javassist.bytecode.h0$h
        public void g(int v, int v1) {
            this.b.d(8, v1);
        }

        @Override  // javassist.bytecode.h0$h
        public void h() {
            int v = g.d(this.a, 0);
            this.b.c(v);
            super.h();
        }

        byte[] i() {
            this.h();
            return new byte[0];
        }
    }

    static class javassist.bytecode.h0.g extends h {
        private int b;
        private int c;

        public javassist.bytecode.h0.g(h0 h00, int v, int v1) {
            super(h00);
            this.b = v;
            this.c = v1;
        }

        @Override  // javassist.bytecode.h0$h
        public int a(int v, int v1, int v2) {
            int v3 = this.b;
            if(v3 == v + v1) {
                g.e(v1 - this.c, this.a, v - 4);
                return super.a(v, v1, v2);
            }
            if(v3 == v) {
                g.e(this.c + v1, this.a, v - 4);
            }
            return super.a(v, v1, v2);
        }
    }

    public static class h {
        byte[] a;

        public h(h0 h00) {
            this.a = h00.c();
        }

        public int a(int v, int v1, int v2) {
            return this.e(v, v1, v2, true);
        }

        public void b(int v, int v1) {
        }

        public int c(int v, int v1, int v2) {
            return this.e(v, v1, v2, false);
        }

        public void d(int v, byte b) {
        }

        public int e(int v, int v1, int v2, boolean z) {
            for(int v3 = 0; v3 < v2; ++v3) {
                v = this.f(v3, v);
            }
            return v;
        }

        int f(int v, int v1) {
            byte[] arr_b = this.a;
            int v2 = arr_b[v1];
            if(v2 == 7) {
                this.b(v1, g.d(arr_b, v1 + 1));
                return v1 + 3;
            }
            if(v2 == 8) {
                this.g(v1, g.d(arr_b, v1 + 1));
                return v1 + 3;
            }
            this.d(v1, ((byte)v2));
            return v1 + 1;
        }

        public void g(int v, int v1) {
        }

        public void h() {
            int v1 = g.d(this.a, 0);
            int v2 = 2;
            for(int v = 0; v < v1; ++v) {
                int v3 = g.d(this.a, v2);
                int v4 = this.a(v2 + 4, v3, g.d(this.a, v2 + 2));
                v2 = this.c(v4 + 2, v3, g.d(this.a, v4));
            }
        }
    }

    public static class i {
        private ByteArrayOutputStream a;

        public i() {
            this.a = new ByteArrayOutputStream();
        }

        public byte[] a() [...] // 潜在的解密器

        public h0 b(t t0) {
            return new h0(t0, this.a.toByteArray());
        }

        public void c(int v) {
            this.a.write(v >>> 8 & 0xFF);
            this.a.write(v & 0xFF);
        }

        public void d(int v, int v1) {
            this.a.write(v);
            if(v == 7 || v == 8) {
                this.c(v1);
            }
        }
    }

    public static final String d = "StackMap";
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;

    h0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    h0(t t0, byte[] arr_b) {
        super(t0, "StackMap", arr_b);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        a h0$a0 = new a(this, t0, map0);
        h0$a0.h();
        return h0$a0.i();
    }

    public void t(int v, int v1, int v2) throws javassist.bytecode.e {
        this.q(new b(this, v, v1, v2).i());
    }

    public int u() {
        return g.d(this.c, 0);
    }

    public void v(PrintWriter printWriter0) {
        new javassist.bytecode.h0.d(this, printWriter0).i();
    }

    public void w(int v) throws javassist.b {
        this.q(new c(this, v).i());
    }

    void x(int v, int v1) throws javassist.bytecode.e {
        new javassist.bytecode.h0.g(this, v, v1).h();
    }

    void y(int v, int v1, boolean z) throws javassist.bytecode.e {
        new e(this, v, v1, z).h();
    }
}

