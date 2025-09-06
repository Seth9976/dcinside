package javassist.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class m {
    public interface a {
        void a(DataOutputStream arg1) throws IOException;

        int size();
    }

    public static final class b {
        h a;
        protected int b;
        protected int c;

        b(h h0) {
            this.a = h0;
            this.b = h0.b();
            this.c = 1;
            this.a.o(1);
        }

        public int a(int v) {
            this.a.write(7);
            this.a.o(v);
            int v1 = this.c;
            this.c = v1 + 1;
            return v1;
        }

        public int b(String s) {
            int v = this.q(s);
            this.a.write(7);
            this.a.o(v);
            int v1 = this.c;
            this.c = v1 + 1;
            return v1;
        }

        public int[] c(String[] arr_s) {
            int[] arr_v = new int[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_v[v] = this.b(arr_s[v]);
            }
            return arr_v;
        }

        public int d(double f) {
            this.a.write(6);
            this.a.writeDouble(f);
            int v = this.c;
            this.c = v + 2;
            return v;
        }

        public int e(int v, int v1) {
            this.a.write(9);
            this.a.o(v);
            this.a.o(v1);
            int v2 = this.c;
            this.c = v2 + 1;
            return v2;
        }

        public int f(float f) {
            this.a.write(4);
            this.a.i(f);
            int v = this.c;
            this.c = v + 1;
            return v;
        }

        public int g(int v) {
            this.a.write(3);
            this.a.j(v);
            int v1 = this.c;
            this.c = v1 + 1;
            return v1;
        }

        public int h(int v, int v1) {
            this.a.write(11);
            this.a.o(v);
            this.a.o(v1);
            int v2 = this.c;
            this.c = v2 + 1;
            return v2;
        }

        public int i(int v, int v1) {
            this.a.write(18);
            this.a.o(v);
            this.a.o(v1);
            int v2 = this.c;
            this.c = v2 + 1;
            return v2;
        }

        public int j(long v) {
            this.a.write(5);
            this.a.n(v);
            int v1 = this.c;
            this.c = v1 + 2;
            return v1;
        }

        public int k(int v, int v1) {
            this.a.write(15);
            this.a.write(v);
            this.a.o(v1);
            int v2 = this.c;
            this.c = v2 + 1;
            return v2;
        }

        public int l(int v) {
            this.a.write(16);
            this.a.o(v);
            int v1 = this.c;
            this.c = v1 + 1;
            return v1;
        }

        public int m(int v, int v1) {
            this.a.write(10);
            this.a.o(v);
            this.a.o(v1);
            int v2 = this.c;
            this.c = v2 + 1;
            return v2;
        }

        public int n(int v, int v1) {
            this.a.write(12);
            this.a.o(v);
            this.a.o(v1);
            int v2 = this.c;
            this.c = v2 + 1;
            return v2;
        }

        public int o(String s, String s1) {
            return this.n(this.q(s), this.q(s1));
        }

        public int p(String s) {
            int v = this.q(s);
            this.a.write(8);
            this.a.o(v);
            int v1 = this.c;
            this.c = v1 + 1;
            return v1;
        }

        public int q(String s) {
            this.a.write(1);
            this.a.s(s);
            int v = this.c;
            this.c = v + 1;
            return v;
        }

        void r() {
            this.a.p(this.b, this.c);
        }
    }

    public static final class c {
        protected h a;
        protected b b;
        private int c;

        c(b m$b0) {
            this.a = new h(0x80);
            this.b = m$b0;
            this.c = 0;
        }

        public void a(int v, int v1, int v2, a m$a0) {
            ++this.c;
            this.a.o(v);
            this.a.o(v1);
            this.a.o(v2);
            m.f(this.a, m$a0, 0);
        }

        public void b(int v, String s, String s1, a m$a0) {
            this.a(v, this.b.q(s), this.b.q(s1), m$a0);
        }

        int c() {
            return this.a.size();
        }

        int d() {
            return this.c;
        }

        void e(OutputStream outputStream0) throws IOException {
            this.a.q(outputStream0);
        }
    }

    public static final class d {
        protected h a;
        protected b b;
        private int c;
        protected int d;
        protected int e;
        protected int f;
        private int g;
        private boolean h;
        private int i;
        private int j;

        d(b m$b0) {
            this.a = new h(0x100);
            this.b = m$b0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
        }

        public void a(int v) {
            this.a.write(v);
        }

        public void b(int v) {
            this.a.o(v);
        }

        public void c(int v) {
            this.a.j(v);
        }

        public void d(int v, int v1, int v2, int v3) {
            ++this.j;
            this.a.o(v);
            this.a.o(v1);
            this.a.o(v2);
            this.a.o(v3);
        }

        public void e(int v, String s, String s1, String s2) {
            int v1 = this.b.b(s);
            int v2 = this.b.o(s1, s2);
            int v3 = this.b.m(v1, v2);
            this.a(v);
            this.b(v3);
        }

        public void f(int v, int v1, int v2, int[] arr_v, a m$a0) {
            ++this.c;
            this.a.o(v);
            this.a.o(v1);
            this.a.o(v2);
            boolean z = (v & 0x400) != 0;
            this.h = z;
            int v3 = !z;
            if(arr_v != null) {
                ++v3;
            }
            m.f(this.a, m$a0, v3);
            if(arr_v != null) {
                this.n(arr_v);
            }
            if(!this.h) {
                if(this.d == 0) {
                    this.d = this.b.q("Code");
                }
                this.g = this.a.b();
                this.a.o(this.d);
                this.a.f(12);
            }
            this.i = -1;
            this.j = 0;
        }

        public void g(int v, String s, String s1, String[] arr_s, a m$a0) {
            this.f(v, this.b.q(s), this.b.q(s1), (arr_s == null ? null : this.b.c(arr_s)), m$a0);
        }

        public void h(int v, int v1) {
            if(!this.h) {
                this.a.p(this.g + 6, v);
                this.a.p(this.g + 8, v1);
                this.a.k(this.g + 10, this.a.b() - this.g - 14);
                this.i = this.a.b();
                this.j = 0;
                this.a.o(0);
            }
        }

        int i() {
            return this.a.size();
        }

        public void j(k i0$k0, a m$a0) {
            if(this.h) {
                return;
            }
            this.a.p(this.i, this.j);
            m.f(this.a, m$a0, (i0$k0 == null ? 0 : 1));
            if(i0$k0 != null) {
                if(this.f == 0) {
                    this.f = this.b.q("StackMapTable");
                }
                this.a.o(this.f);
                byte[] arr_b = i0$k0.f();
                this.a.j(arr_b.length);
                this.a.write(arr_b);
            }
            this.a.k(this.g + 2, this.a.b() - this.g - 6);
        }

        int k() {
            return this.c;
        }

        public int l() {
            return this.a.b() - this.g - 14;
        }

        void m(OutputStream outputStream0) throws IOException {
            this.a.q(outputStream0);
        }

        private void n(int[] arr_v) {
            if(this.e == 0) {
                this.e = this.b.q("Exceptions");
            }
            this.a.o(this.e);
            this.a.j(arr_v.length * 2 + 2);
            this.a.o(arr_v.length);
            for(int v = 0; v < arr_v.length; ++v) {
                this.a.o(arr_v[v]);
            }
        }
    }

    private h a;
    private b b;
    private c c;
    private d d;
    int e;
    int f;

    public m(int v, int v1) {
        h h0 = new h(0x200);
        this.a = h0;
        h0.j(0xCAFEBABE);
        this.a.o(v1);
        this.a.o(v);
        b m$b0 = new b(this.a);
        this.b = m$b0;
        this.c = new c(m$b0);
        this.d = new d(this.b);
    }

    public void a(DataOutputStream dataOutputStream0, int v, int v1, int v2, int[] arr_v, a m$a0) throws IOException {
        this.b.r();
        this.a.q(dataOutputStream0);
        dataOutputStream0.writeShort(v);
        dataOutputStream0.writeShort(v1);
        dataOutputStream0.writeShort(v2);
        if(arr_v == null) {
            dataOutputStream0.writeShort(0);
        }
        else {
            dataOutputStream0.writeShort(arr_v.length);
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                dataOutputStream0.writeShort(arr_v[v3]);
            }
        }
        dataOutputStream0.writeShort(this.c.d());
        this.c.e(dataOutputStream0);
        dataOutputStream0.writeShort(this.d.k());
        this.d.m(dataOutputStream0);
        if(m$a0 == null) {
            dataOutputStream0.writeShort(0);
            return;
        }
        dataOutputStream0.writeShort(m$a0.size());
        m$a0.a(dataOutputStream0);
    }

    public byte[] b(int v, int v1, int v2, int[] arr_v, a m$a0) {
        this.b.r();
        this.a.o(v);
        this.a.o(v1);
        this.a.o(v2);
        if(arr_v == null) {
            this.a.o(0);
        }
        else {
            this.a.o(arr_v.length);
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                this.a.o(arr_v[v3]);
            }
        }
        this.a.a(this.c.c() + this.d.i() + 6);
        try {
            this.a.o(this.c.d());
            this.c.e(this.a);
            this.a.o(this.d.k());
            this.d.m(this.a);
        }
        catch(IOException unused_ex) {
        }
        m.f(this.a, m$a0, 0);
        return new byte[0];
    }

    public b c() {
        return this.b;
    }

    public c d() {
        return this.c;
    }

    public d e() {
        return this.d;
    }

    static void f(h h0, a m$a0, int v) {
        if(m$a0 == null) {
            h0.o(v);
            return;
        }
        h0.o(m$a0.size() + v);
        DataOutputStream dataOutputStream0 = new DataOutputStream(h0);
        try {
            m$a0.a(dataOutputStream0);
            dataOutputStream0.flush();
        }
        catch(IOException unused_ex) {
        }
    }
}

