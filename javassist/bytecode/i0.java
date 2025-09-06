package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Map;

public class i0 extends d {
    static class a extends h {
        private t d;
        private t e;
        private Map f;

        public a(t t0, byte[] arr_b, t t1, Map map0) {
            super(arr_b);
            this.d = t0;
            this.e = t1;
            this.f = map0;
        }

        @Override  // javassist.bytecode.i0$h
        protected int n(int v, int v1) {
            return v == 7 ? this.d.y(v1, this.e, this.f) : v1;
        }

        @Override  // javassist.bytecode.i0$h
        protected int[] o(int[] arr_v, int[] arr_v1) {
            int[] arr_v2 = new int[arr_v1.length];
            for(int v = 0; v < arr_v1.length; ++v) {
                arr_v2[v] = arr_v[v] == 7 ? this.d.y(arr_v1[v], this.e, this.f) : arr_v1[v];
            }
            return arr_v2;
        }
    }

    static class b extends h {
        private int d;
        private int e;
        private int f;

        public b(byte[] arr_b, int v, int v1, int v2) {
            super(arr_b);
            this.d = v;
            this.e = v1;
            this.f = v2;
        }

        @Override  // javassist.bytecode.i0$h
        public void e(int v, int v1, int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3) {
            int v2 = this.d;
            if(arr_v.length < v2) {
                super.e(v, v1, arr_v, arr_v1, arr_v2, arr_v3);
                return;
            }
            int v3 = this.e == 3 || this.e == 4 ? 2 : 1;
            int v4 = arr_v.length + v3;
            int[] arr_v4 = new int[v4];
            int[] arr_v5 = new int[v4];
            int v5 = 0;
            for(int v6 = 0; v5 < arr_v.length; ++v6) {
                if(v6 == v2) {
                    v6 += v3;
                }
                arr_v4[v6] = arr_v[v5];
                arr_v5[v6] = arr_v1[v5];
                ++v5;
            }
            arr_v4[v2] = this.e;
            arr_v5[v2] = this.f;
            if(v3 > 1) {
                arr_v4[v2 + 1] = 0;
                arr_v5[v2 + 1] = 0;
            }
            super.e(v, v1, arr_v4, arr_v5, arr_v2, arr_v3);
        }
    }

    static class c extends h {
        int d;

        public c(byte[] arr_b, int v) {
            super(arr_b);
            this.d = v;
        }

        @Override  // javassist.bytecode.i0$h
        public void e(int v, int v1, int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3) {
            int[] arr_v7;
            int[] arr_v6;
            int v2 = arr_v2.length - 1;
            for(int v4 = 0; true; ++v4) {
                if(v4 >= v2) {
                    arr_v6 = arr_v3;
                    arr_v7 = arr_v2;
                    break;
                }
                if(arr_v2[v4] == 8 && (arr_v3[v4] == this.d && arr_v2[v4 + 1] == 8 && arr_v3[v4 + 1] == this.d)) {
                    int[] arr_v4 = new int[arr_v2.length - 2];
                    int[] arr_v5 = new int[arr_v2.length - 2];
                    int v5 = 0;
                    for(int v3 = 0; v3 < arr_v2.length; ++v3) {
                        if(v3 == v4) {
                            ++v3;
                        }
                        else {
                            arr_v4[v5] = arr_v2[v3];
                            arr_v5[v5] = arr_v3[v3];
                            ++v5;
                        }
                    }
                    arr_v6 = arr_v5;
                    arr_v7 = arr_v4;
                    break;
                }
            }
            super.e(v, v1, arr_v, arr_v1, arr_v7, arr_v6);
        }

        @Override  // javassist.bytecode.i0$h
        public void j(int v, int v1, int v2, int v3) {
            if(v2 == 8 && v3 == this.d) {
                super.h(v, v1);
                return;
            }
            super.j(v, v1, v2, v3);
        }
    }

    static class javassist.bytecode.i0.d extends j {
        int c;
        int d;

        public javassist.bytecode.i0.d(i0 i00, int v, int v1) {
            super(i00);
            this.c = v;
            this.d = v1;
        }

        @Override  // javassist.bytecode.i0$j
        public void f(int v, int v1, int v2) {
            if(v == 8 && this.c <= v1) {
                g.e(v1 + this.d, this.a, v2);
            }
        }
    }

    static class e extends j {
        private PrintWriter c;
        private int d;

        e(byte[] arr_b, PrintWriter printWriter0) {
            super(arr_b);
            this.c = printWriter0;
            this.d = -1;
        }

        @Override  // javassist.bytecode.i0$j
        public void b(int v, int v1, int[] arr_v, int[] arr_v1) {
            this.d += v1 + 1;
            this.c.println(this.d + " append frame: " + v1);
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                this.o(arr_v[v2], arr_v1[v2]);
            }
        }

        @Override  // javassist.bytecode.i0$j
        public void c(int v, int v1, int v2) {
            this.d += v1 + 1;
            this.c.println(this.d + " chop frame: " + v1 + ",    " + v2 + " last locals");
        }

        @Override  // javassist.bytecode.i0$j
        public void e(int v, int v1, int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3) {
            this.d += v1 + 1;
            this.c.println(this.d + " full frame: " + v1);
            this.c.println("[locals]");
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                this.o(arr_v[v3], arr_v1[v3]);
            }
            this.c.println("[stack]");
            for(int v2 = 0; v2 < arr_v2.length; ++v2) {
                this.o(arr_v2[v2], arr_v3[v2]);
            }
        }

        @Override  // javassist.bytecode.i0$j
        public void h(int v, int v1) {
            this.d += v1 + 1;
            this.c.println(this.d + " same frame: " + v1);
        }

        @Override  // javassist.bytecode.i0$j
        public void j(int v, int v1, int v2, int v3) {
            this.d += v1 + 1;
            this.c.println(this.d + " same locals: " + v1);
            this.o(v2, v3);
        }

        public static void n(i0 i00, PrintWriter printWriter0) {
            try {
                new e(i00.c(), printWriter0).g();
            }
            catch(javassist.bytecode.e e0) {
                printWriter0.println(e0.getMessage());
            }
        }

        private void o(int v, int v1) {
            String s;
            switch(v) {
                case 0: {
                    s = "top";
                    break;
                }
                case 1: {
                    s = "integer";
                    break;
                }
                case 2: {
                    s = "float";
                    break;
                }
                case 3: {
                    s = "double";
                    break;
                }
                case 4: {
                    s = "long";
                    break;
                }
                case 5: {
                    s = "null";
                    break;
                }
                case 6: {
                    s = "this";
                    break;
                }
                case 7: {
                    s = "object (cpool_index " + v1 + ")";
                    break;
                }
                case 8: {
                    s = "uninitialized (offset " + v1 + ")";
                    break;
                }
                default: {
                    s = null;
                }
            }
            this.c.print("    ");
            this.c.println(s);
        }
    }

    public static class f extends RuntimeException {
        private static final long a = 1L;

        public f(String s) {
            super(s);
        }
    }

    static class javassist.bytecode.i0.g extends j {
        private i0 c;
        int d;
        int e;
        int f;
        byte[] g;
        boolean h;

        public javassist.bytecode.i0.g(i0 i00, int v, int v1, boolean z) {
            super(i00);
            this.c = i00;
            this.d = v;
            this.e = v1;
            this.f = 0;
            this.g = null;
            this.h = z;
        }

        @Override  // javassist.bytecode.i0$j
        public void b(int v, int v1, int[] arr_v, int[] arr_v1) {
            this.p(v, v1);
        }

        @Override  // javassist.bytecode.i0$j
        public void c(int v, int v1, int v2) {
            this.p(v, v1);
        }

        @Override  // javassist.bytecode.i0$j
        public void e(int v, int v1, int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3) {
            this.p(v, v1);
        }

        @Override  // javassist.bytecode.i0$j
        public void h(int v, int v1) {
            this.q(v, v1, 0, 0xFB);
        }

        @Override  // javassist.bytecode.i0$j
        public void j(int v, int v1, int v2, int v3) {
            this.q(v, v1, 0x40, 0xF7);
        }

        public void n() throws javassist.bytecode.e {
            this.g();
            byte[] arr_b = this.g;
            if(arr_b != null) {
                this.c.q(arr_b);
            }
        }

        static byte[] o(byte[] arr_b, int v, int v1) {
            byte[] arr_b1 = new byte[arr_b.length + v1];
            for(int v2 = 0; v2 < arr_b.length; ++v2) {
                arr_b1[(v2 >= v ? v1 : 0) + v2] = arr_b[v2];
            }
            return arr_b1;
        }

        void p(int v, int v1) {
            int v2 = this.f;
            int v3 = v2 + v1 + (v2 == 0 ? 0 : 1);
            this.f = v3;
            if(this.h) {
                if(v2 < this.d && this.d <= v3) {
                    g.e(v1 + this.e, this.a, v + 1);
                    this.f += this.e;
                }
            }
            else if(v2 <= this.d && this.d < v3) {
                g.e(v1 + this.e, this.a, v + 1);
                this.f += this.e;
            }
        }

        void q(int v, int v1, int v2, int v3) {
            int v4 = this.f;
            int v5 = v4 + v1 + (v4 == 0 ? 0 : 1);
            this.f = v5;
            if(!this.h) {
                if(v4 <= this.d && this.d < v5) {
                label_7:
                    int v6 = v1 + this.e;
                    this.f = v5 + this.e;
                    if(v6 < 0x40) {
                        this.a[v] = (byte)(v6 + v2);
                        return;
                    }
                    if(v1 < 0x40) {
                        byte[] arr_b = javassist.bytecode.i0.g.o(this.a, v, 2);
                        arr_b[v] = (byte)v3;
                        g.e(v6, arr_b, v + 1);
                        this.g = arr_b;
                        return;
                    }
                    g.e(v6, this.a, v + 1);
                }
            }
            else if(v4 < this.d && this.d <= v5) {
                goto label_7;
            }
        }
    }

    static class h extends j {
        private k c;

        public h(byte[] arr_b) {
            super(arr_b);
            this.c = new k(arr_b.length);
        }

        @Override  // javassist.bytecode.i0$j
        public void b(int v, int v1, int[] arr_v, int[] arr_v1) {
            this.c.a(v1, arr_v, this.o(arr_v, arr_v1));
        }

        @Override  // javassist.bytecode.i0$j
        public void c(int v, int v1, int v2) {
            this.c.b(v1, v2);
        }

        @Override  // javassist.bytecode.i0$j
        public void e(int v, int v1, int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3) {
            this.c.c(v1, arr_v, this.o(arr_v, arr_v1), arr_v2, this.o(arr_v2, arr_v3));
        }

        @Override  // javassist.bytecode.i0$j
        public void h(int v, int v1) {
            this.c.d(v1);
        }

        @Override  // javassist.bytecode.i0$j
        public void j(int v, int v1, int v2, int v3) {
            this.c.e(v1, v2, this.n(v2, v3));
        }

        protected int n(int v, int v1) {
            return v1;
        }

        protected int[] o(int[] arr_v, int[] arr_v1) {
            return arr_v1;
        }

        public byte[] p() throws javassist.bytecode.e {
            this.g();
            return this.c.f();
        }
    }

    static class i extends javassist.bytecode.i0.g {
        i(i0 i00, int v, int v1) {
            super(i00, v, v1, false);
        }

        @Override  // javassist.bytecode.i0$g
        void p(int v, int v1) {
            int v2 = this.f;
            int v3 = v2 + v1 + (v2 == 0 ? 0 : 1);
            this.f = v3;
            int v4 = this.d;
            if(v4 == v3) {
                g.e(v1 - this.e, this.a, v + 1);
                return;
            }
            if(v4 == v2) {
                g.e(v1 + this.e, this.a, v + 1);
            }
        }

        @Override  // javassist.bytecode.i0$g
        void q(int v, int v1, int v2, int v3) {
            int v7;
            int v4 = this.f;
            int v5 = v4 + v1 + (v4 == 0 ? 0 : 1);
            this.f = v5;
            int v6 = this.d;
            if(v6 == v5) {
                v7 = v1 - this.e;
                goto label_9;
            }
            else if(v6 == v4) {
                v7 = this.e + v1;
            label_9:
                if(v1 < 0x40) {
                    if(v7 < 0x40) {
                        this.a[v] = (byte)(v7 + v2);
                        return;
                    }
                    byte[] arr_b = javassist.bytecode.i0.g.o(this.a, v, 2);
                    arr_b[v] = (byte)v3;
                    g.e(v7, arr_b, v + 1);
                    this.g = arr_b;
                    return;
                }
                if(v7 < 0x40) {
                    byte[] arr_b1 = i.r(this.a, v, 2);
                    arr_b1[v] = (byte)(v7 + v2);
                    this.g = arr_b1;
                    return;
                }
                g.e(v7, this.a, v + 1);
            }
        }

        static byte[] r(byte[] arr_b, int v, int v1) {
            byte[] arr_b1 = new byte[arr_b.length - v1];
            for(int v2 = 0; v2 < arr_b.length; ++v2) {
                arr_b1[v2 - (v2 >= v + v1 ? v1 : 0)] = arr_b[v2];
            }
            return arr_b1;
        }
    }

    public static class j {
        byte[] a;
        int b;

        public j(i0 i00) {
            this(i00.c());
        }

        public j(byte[] arr_b) {
            this.a = arr_b;
            this.b = g.d(arr_b, 0);
        }

        private int a(int v, int v1) throws javassist.bytecode.e {
            int v2 = g.d(this.a, v + 1);
            int[] arr_v = new int[v1 - 0xFB];
            int[] arr_v1 = new int[v1 - 0xFB];
            int v3 = v + 3;
            for(int v4 = 0; v4 < v1 - 0xFB; ++v4) {
                byte[] arr_b = this.a;
                int v5 = arr_b[v3] & 0xFF;
                arr_v[v4] = v5;
                if(v5 == 7 || v5 == 8) {
                    int v6 = g.d(arr_b, v3 + 1);
                    arr_v1[v4] = v6;
                    this.f(v5, v6, v3 + 1);
                    v3 += 3;
                }
                else {
                    arr_v1[v4] = 0;
                    ++v3;
                }
            }
            this.b(v, v2, arr_v, arr_v1);
            return v3;
        }

        public void b(int v, int v1, int[] arr_v, int[] arr_v1) throws javassist.bytecode.e {
        }

        public void c(int v, int v1, int v2) throws javassist.bytecode.e {
        }

        private int d(int v) throws javassist.bytecode.e {
            int v1 = g.d(this.a, v + 1);
            int v2 = g.d(this.a, v + 3);
            int[] arr_v = new int[v2];
            int[] arr_v1 = new int[v2];
            int v3 = this.m(v + 5, v2, arr_v, arr_v1);
            int v4 = g.d(this.a, v3);
            int[] arr_v2 = new int[v4];
            int[] arr_v3 = new int[v4];
            int v5 = this.m(v3 + 2, v4, arr_v2, arr_v3);
            this.e(v, v1, arr_v, arr_v1, arr_v2, arr_v3);
            return v5;
        }

        public void e(int v, int v1, int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3) throws javassist.bytecode.e {
        }

        public void f(int v, int v1, int v2) {
        }

        public void g() throws javassist.bytecode.e {
            int v = this.b;
            int v1 = 2;
            for(int v2 = 0; v2 < v; ++v2) {
                v1 = this.l(v1, v2);
            }
        }

        public void h(int v, int v1) throws javassist.bytecode.e {
        }

        private int i(int v, int v1) throws javassist.bytecode.e {
            int v5;
            int v3;
            int v2;
            if(v1 < 0x80) {
                v2 = v1 - 0x40;
                v3 = v;
            }
            else {
                v2 = g.d(this.a, v + 1);
                v3 = v + 2;
            }
            byte[] arr_b = this.a;
            int v4 = arr_b[v3 + 1] & 0xFF;
            if(v4 == 7 || v4 == 8) {
                v3 += 2;
                v5 = g.d(arr_b, v3);
                this.f(v4, v5, v3);
            }
            else {
                v5 = 0;
            }
            this.j(v, v2, v4, v5);
            return v3 + 2;
        }

        public void j(int v, int v1, int v2, int v3) throws javassist.bytecode.e {
        }

        public final int k() {
            return this.b;
        }

        int l(int v, int v1) throws javassist.bytecode.e {
            byte[] arr_b = this.a;
            int v2 = arr_b[v] & 0xFF;
            if(v2 < 0x40) {
                this.h(v, v2);
                return v + 1;
            }
            if(v2 < 0x80) {
                return this.i(v, v2);
            }
            if(v2 < 0xF7) {
                throw new javassist.bytecode.e("bad frame_type in StackMapTable");
            }
            if(v2 == 0xF7) {
                return this.i(v, 0xF7);
            }
            if(v2 < 0xFB) {
                this.c(v, g.d(arr_b, v + 1), 0xFB - v2);
                return v + 3;
            }
            if(v2 == 0xFB) {
                this.h(v, g.d(arr_b, v + 1));
                return v + 3;
            }
            return v2 >= 0xFF ? this.d(v) : this.a(v, v2);
        }

        private int m(int v, int v1, int[] arr_v, int[] arr_v1) {
            for(int v2 = 0; v2 < v1; ++v2) {
                byte[] arr_b = this.a;
                int v3 = arr_b[v] & 0xFF;
                arr_v[v2] = v3;
                if(v3 == 7 || v3 == 8) {
                    int v4 = g.d(arr_b, v + 1);
                    arr_v1[v2] = v4;
                    this.f(v3, v4, v + 1);
                    v += 3;
                }
                else {
                    ++v;
                }
            }
            return v;
        }
    }

    public static class k {
        ByteArrayOutputStream a;
        int b;

        public k(int v) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(v);
            this.a = byteArrayOutputStream0;
            this.b = 0;
            byteArrayOutputStream0.write(0);
            this.a.write(0);
        }

        public void a(int v, int[] arr_v, int[] arr_v1) {
            ++this.b;
            this.a.write(arr_v.length + 0xFB);
            this.h(v);
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                this.i(arr_v[v1], arr_v1[v1]);
            }
        }

        public void b(int v, int v1) {
            ++this.b;
            this.a.write(0xFB - v1);
            this.h(v);
        }

        public void c(int v, int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3) {
            ++this.b;
            this.a.write(0xFF);
            this.h(v);
            this.h(arr_v.length);
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                this.i(arr_v[v2], arr_v1[v2]);
            }
            this.h(arr_v2.length);
            for(int v1 = 0; v1 < arr_v2.length; ++v1) {
                this.i(arr_v2[v1], arr_v3[v1]);
            }
        }

        public void d(int v) {
            ++this.b;
            if(v < 0x40) {
                this.a.write(v);
                return;
            }
            this.a.write(0xFB);
            this.h(v);
        }

        public void e(int v, int v1, int v2) {
            ++this.b;
            if(v < 0x40) {
                this.a.write(v + 0x40);
            }
            else {
                this.a.write(0xF7);
                this.h(v);
            }
            this.i(v1, v2);
        }

        public byte[] f() {
            byte[] arr_b = this.a.toByteArray();
            g.e(this.b, arr_b, 0);
            return arr_b;
        }

        public i0 g(t t0) {
            return new i0(t0, this.f());
        }

        private void h(int v) {
            this.a.write(v >>> 8 & 0xFF);
            this.a.write(v & 0xFF);
        }

        private void i(int v, int v1) {
            this.a.write(v);
            if(v == 7 || v == 8) {
                this.h(v1);
            }
        }
    }

    public static final String d = "StackMapTable";
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;

    i0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    i0(t t0, byte[] arr_b) {
        super(t0, "StackMapTable", arr_b);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) throws f {
        try {
            return new i0(t0, new a(this.a, this.c, t0, map0).p());
        }
        catch(javassist.bytecode.e unused_ex) {
            throw new f("bad bytecode. fatal?");
        }
    }

    @Override  // javassist.bytecode.d
    void r(DataOutputStream dataOutputStream0) throws IOException {
        super.r(dataOutputStream0);
    }

    public void t(int v, int v1, int v2) throws javassist.bytecode.e {
        this.q(new b(this.c(), v, v1, v2).p());
    }

    public void u(PrintStream printStream0) {
        e.n(this, new PrintWriter(printStream0, true));
    }

    public void v(PrintWriter printWriter0) {
        e.n(this, printWriter0);
    }

    public void w(int v) throws javassist.b {
        try {
            this.q(new c(this.c(), v).p());
        }
        catch(javassist.bytecode.e e0) {
            throw new javassist.b("bad stack map table", e0);
        }
    }

    void x(int v, int v1) throws javassist.bytecode.e {
        new i(this, v, v1).n();
    }

    void y(int v, int v1, boolean z) throws javassist.bytecode.e {
        new javassist.bytecode.i0.d(this, v, v1).g();
        new javassist.bytecode.i0.g(this, v, v1, z).n();
    }

    public static int z(char c) {
        switch(c) {
            case 68: {
                return 3;
            }
            case 70: {
                return 2;
            }
            case 74: {
                return 4;
            }
            case 76: 
            case 91: {
                return 7;
            }
            default: {
                return 1;
            }
        }
    }
}

