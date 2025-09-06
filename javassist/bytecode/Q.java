package javassist.bytecode;

import java.util.ArrayList;
import java.util.List;

public class q implements c0 {
    static class a extends Exception {
        private static final long a = 1L;

    }

    static abstract class b extends c {
        int c;
        int d;
        static final int e = 0;
        static final int f = 1;
        static final int g = 2;

        b(int v, int v1) {
            super(v);
            this.c = v1;
            this.d = 0;
        }

        @Override  // javassist.bytecode.q$c
        abstract int a();

        @Override  // javassist.bytecode.q$c
        boolean b() {
            if(this.d == 1) {
                this.d = 2;
                return true;
            }
            return false;
        }

        @Override  // javassist.bytecode.q$c
        void d(int v, int v1, boolean z) {
            this.c = c.e(this.a, this.c, v, v1, z);
            super.d(v, v1, z);
            if(this.d == 0 && (this.c < 0xFFFF8000 || 0x7FFF < this.c)) {
                this.d = 1;
            }
        }

        @Override  // javassist.bytecode.q$c
        int f(int v, byte[] arr_b, int v1, byte[] arr_b1) {
            if(this.d == 2) {
                this.g(v, arr_b, v1, arr_b1);
                return 3;
            }
            arr_b1[v1] = arr_b[v];
            g.e(this.c, arr_b1, v1 + 1);
            return 3;
        }

        abstract void g(int arg1, byte[] arg2, int arg3, byte[] arg4);
    }

    static abstract class c {
        int a;
        int b;

        c(int v) {
            this.b = v;
            this.a = v;
        }

        int a() {
            return 0;
        }

        boolean b() {
            return false;
        }

        int c() {
            return 0;
        }

        void d(int v, int v1, boolean z) {
            int v2 = this.a;
            if(v < v2 || v == v2 && z) {
                this.a = v2 + v1;
            }
        }

        static int e(int v, int v1, int v2, int v3, boolean z) {
            int v4 = v + v1;
            if(v < v2) {
                return v2 >= v4 && (!z || v2 != v4) ? v1 : v1 + v3;
            }
            if(v == v2) {
                if(v4 < v2 && z) {
                    return v1 - v3;
                }
                return v2 >= v4 || z ? v1 : v1 + v3;
            }
            return v4 < v2 || !z && v2 == v4 ? v1 - v3 : v1;
        }

        abstract int f(int arg1, byte[] arg2, int arg3, byte[] arg4) throws e;
    }

    public static class d {
        public int a;
        public int b;

    }

    static class javassist.bytecode.q.e extends b {
        javassist.bytecode.q.e(int v, int v1) {
            super(v, v1);
        }

        @Override  // javassist.bytecode.q$b
        int a() {
            return this.d == 2 ? 5 : 0;
        }

        @Override  // javassist.bytecode.q$b
        void g(int v, byte[] arr_b, int v1, byte[] arr_b1) {
            arr_b1[v1] = (byte)this.h(arr_b[v] & 0xFF);
            arr_b1[v1 + 1] = 0;
            arr_b1[v1 + 2] = 8;
            arr_b1[v1 + 3] = -56;
            g.f(this.c - 3, arr_b1, v1 + 4);
        }

        int h(int v) {
            switch(v) {
                case 0xC6: {
                    return 0xC7;
                }
                case 0xC7: {
                    return 0xC6;
                }
                default: {
                    return (v - 0x99 & 1) == 0 ? v + 1 : v - 1;
                }
            }
        }
    }

    static class f extends b {
        f(int v, int v1) {
            super(v, v1);
        }

        @Override  // javassist.bytecode.q$b
        int a() {
            return this.d == 2 ? 2 : 0;
        }

        @Override  // javassist.bytecode.q$b
        void g(int v, byte[] arr_b, int v1, byte[] arr_b1) {
            arr_b1[v1] = (byte)((arr_b[v] & 0xFF) == 0xA7 ? 200 : 201);
            g.f(this.c, arr_b1, v1 + 1);
        }
    }

    static class javassist.bytecode.q.g extends c {
        int c;

        javassist.bytecode.q.g(int v, int v1) {
            super(v);
            this.c = v1;
        }

        @Override  // javassist.bytecode.q$c
        void d(int v, int v1, boolean z) {
            this.c = c.e(this.a, this.c, v, v1, z);
            super.d(v, v1, z);
        }

        @Override  // javassist.bytecode.q$c
        int f(int v, byte[] arr_b, int v1, byte[] arr_b1) {
            arr_b1[v1] = arr_b[v];
            g.f(this.c, arr_b1, v1 + 1);
            return 5;
        }
    }

    static class h extends c {
        int c;
        boolean d;

        h(int v, int v1) {
            super(v);
            this.c = v1;
            this.d = true;
        }

        @Override  // javassist.bytecode.q$c
        int a() {
            return 1;
        }

        @Override  // javassist.bytecode.q$c
        boolean b() {
            if(this.d) {
                this.d = false;
                return true;
            }
            return false;
        }

        @Override  // javassist.bytecode.q$c
        int f(int v, byte[] arr_b, int v1, byte[] arr_b1) {
            arr_b1[v1] = 19;
            g.e(this.c, arr_b1, v1 + 1);
            return 2;
        }
    }

    static class i extends k {
        int[] g;

        i(int v, int v1, int[] arr_v, int[] arr_v1, j q$j0) {
            super(v, v1, arr_v1, q$j0);
            this.g = arr_v;
        }

        @Override  // javassist.bytecode.q$k
        int h() {
            return this.g.length * 8 + 4;
        }

        @Override  // javassist.bytecode.q$k
        int i(int v, byte[] arr_b) {
            int v1 = this.g.length;
            g.f(v1, arr_b, v);
            int v2 = v + 4;
            for(int v3 = 0; v3 < v1; ++v3) {
                g.f(this.g[v3], arr_b, v2);
                g.f(this.e[v3], arr_b, v2 + 4);
                v2 += 8;
            }
            return v1 * 8 + 4;
        }
    }

    static class j {
        int a;
        int b;
        int c;
        A d;
        L e;
        M f;
        M g;
        i0 h;
        h0 i;

        j(int v, int v1, int v2, A a0, p p0) {
            this.a = v;
            this.c = v1;
            this.b = v2;
            this.d = a0;
            this.e = (L)p0.x("LineNumberTable");
            this.f = (M)p0.x("LocalVariableTable");
            this.g = (M)p0.x("LocalVariableTypeTable");
            this.h = (i0)p0.x("StackMapTable");
            this.i = (h0)p0.x("StackMap");
        }

        void a(int v, int v1) throws e {
            i0 i00 = this.h;
            if(i00 != null) {
                i00.x(v, v1);
            }
            h0 h00 = this.i;
            if(h00 != null) {
                h00.x(v, v1);
            }
        }

        void b(int v, int v1, boolean z) throws e {
            int v2 = this.a;
            if(v < v2 || v == v2 && z) {
                this.a = v2 + v1;
            }
            int v3 = this.c;
            if(v < v3 || v == v3 && z) {
                this.c = v3 + v1;
            }
            int v4 = this.b;
            if(v < v4 || v == v4 && z) {
                this.b = v4 + v1;
            }
            this.d.o(v, v1, z);
            L l0 = this.e;
            if(l0 != null) {
                l0.u(v, v1, z);
            }
            M m0 = this.f;
            if(m0 != null) {
                m0.D(v, v1, z);
            }
            M m1 = this.g;
            if(m1 != null) {
                m1.D(v, v1, z);
            }
            i0 i00 = this.h;
            if(i00 != null) {
                i00.y(v, v1, z);
            }
            h0 h00 = this.i;
            if(h00 != null) {
                h00.y(v, v1, z);
            }
        }
    }

    static abstract class k extends c {
        int c;
        int d;
        int[] e;
        j f;

        k(int v, int v1, int[] arr_v, j q$j0) {
            super(v);
            this.c = ~v & 3;
            this.d = v1;
            this.e = arr_v;
            this.f = q$j0;
        }

        // 去混淆评级： 中等(50)
        @Override  // javassist.bytecode.q$c
        int a() {
            return this.c - (~this.b & 3);
        }

        @Override  // javassist.bytecode.q$c
        int c() {
            int v = ~this.a & 3;
            int v1 = this.c;
            if(v > v1) {
                this.c = v;
                return v - v1;
            }
            return 0;
        }

        @Override  // javassist.bytecode.q$c
        void d(int v, int v1, boolean z) {
            int v2 = this.a;
            this.d = c.e(v2, this.d, v, v1, z);
            for(int v3 = 0; v3 < this.e.length; ++v3) {
                this.e[v3] = c.e(v2, this.e[v3], v, v1, z);
            }
            super.d(v, v1, z);
        }

        @Override  // javassist.bytecode.q$c
        int f(int v, byte[] arr_b, int v1, byte[] arr_b1) throws e {
            int v2 = ~this.a & 3;
            int v3 = this.c - v2;
            int v4 = 8 - (this.b & 3);
            int v5 = this.h();
            if(v3 > 0) {
                this.g(v4 + v5, v3);
            }
            int v6 = v1 + 1;
            arr_b1[v1] = arr_b[v];
            while(v2 > 0) {
                arr_b1[v6] = 0;
                --v2;
                ++v6;
            }
            g.f(this.d, arr_b1, v6);
            int v7 = this.i(v6 + 4, arr_b1);
            for(int v8 = v6 + (v7 + 4); v3 > 0; ++v8) {
                arr_b1[v8] = 0;
                --v3;
            }
            return 8 - (this.b & 3) + v7;
        }

        void g(int v, int v1) throws e {
            this.f.a(this.a + v, v1);
            int v2 = this.d;
            if(v2 == v) {
                this.d = v2 - v1;
            }
            for(int v3 = 0; true; ++v3) {
                int[] arr_v = this.e;
                if(v3 >= arr_v.length) {
                    break;
                }
                int v4 = arr_v[v3];
                if(v4 == v) {
                    arr_v[v3] = v4 - v1;
                }
            }
        }

        abstract int h();

        abstract int i(int arg1, byte[] arg2);
    }

    static class l extends k {
        int g;
        int h;

        l(int v, int v1, int v2, int v3, int[] arr_v, j q$j0) {
            super(v, v1, arr_v, q$j0);
            this.g = v2;
            this.h = v3;
        }

        @Override  // javassist.bytecode.q$k
        int h() {
            return this.e.length * 4 + 8;
        }

        @Override  // javassist.bytecode.q$k
        int i(int v, byte[] arr_b) {
            g.f(this.g, arr_b, v);
            g.f(this.h, arr_b, v + 4);
            int v1 = v + 8;
            for(int v2 = 0; v2 < this.e.length; ++v2) {
                g.f(this.e[v2], arr_b, v1);
                v1 += 4;
            }
            return this.e.length * 4 + 8;
        }
    }

    protected p a;
    protected byte[] b;
    protected int c;
    protected int d;
    protected int e;
    private static final int[] f;

    static {
        q.f = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 0, 0, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 5, 5, 3, 2, 3, 1, 1, 3, 3, 1, 1, 0, 4, 3, 3, 5, 5};
    }

    protected q(p p0) {
        this.a = p0;
        this.b = p0.z();
        this.e();
    }

    public d A(int v, int v1, boolean z) throws e {
        byte[] arr_b1;
        d q$d0 = new d();
        if(v1 <= 0) {
            q$d0.a = v;
            q$d0.b = 0;
            return q$d0;
        }
        byte[] arr_b = this.b;
        if(arr_b.length + v1 > 0x7FFF) {
            arr_b1 = this.C(arr_b, v, v1, z, this.i().C(), this.a, q$d0);
        }
        else {
            int v2 = this.d;
            byte[] arr_b2 = q.B(arr_b, v, v1, z, this.i().C(), this.a);
            int v3 = arr_b2.length - this.b.length;
            q$d0.a = v;
            q$d0.b = v3;
            if(v2 >= v) {
                this.d = v2 + v3;
            }
            int v4 = this.e;
            if(v4 > v || v4 == v && z) {
                this.e = v4 + v3;
            }
            arr_b1 = arr_b2;
        }
        this.a.J(arr_b1);
        this.b = arr_b1;
        this.c = this.j();
        return q$d0;
    }

    static byte[] B(byte[] arr_b, int v, int v1, boolean z, A a0, p p0) throws e {
        if(v1 <= 0) {
            return arr_b;
        }
        try {
            return q.D(arr_b, v, v1, z, a0, p0);
        }
        catch(a unused_ex) {
            try {
                return q.D(arr_b, v, v1 + 3 & -4, z, a0, p0);
            }
            catch(a unused_ex) {
                throw new RuntimeException("fatal error?");
            }
        }
    }

    private byte[] C(byte[] arr_b, int v, int v1, boolean z, A a0, p p0, d q$d0) throws e {
        if(v1 <= 0) {
            return arr_b;
        }
        j q$j0 = new j(this.d, this.e, v, a0, p0);
        byte[] arr_b1 = q.z(arr_b, v, v1, z, q.G(arr_b, arr_b.length, q$j0), q$j0);
        int v2 = q$j0.a;
        this.d = v2;
        this.e = q$j0.c;
        int v3 = q$j0.b;
        if(v3 == v2 && !z) {
            this.d = v2 + v1;
        }
        if(z) {
            v3 -= v1;
        }
        q$d0.a = v3;
        q$d0.b = v1;
        return arr_b1;
    }

    private static byte[] D(byte[] arr_b, int v, int v1, boolean z, A a0, p p0) throws e, a {
        byte[] arr_b1 = new byte[arr_b.length + v1];
        q.y(arr_b, v, v1, arr_b.length, arr_b1, z);
        a0.o(v, v1, z);
        L l0 = (L)p0.x("LineNumberTable");
        if(l0 != null) {
            l0.u(v, v1, z);
        }
        M m0 = (M)p0.x("LocalVariableTable");
        if(m0 != null) {
            m0.D(v, v1, z);
        }
        M m1 = (M)p0.x("LocalVariableTypeTable");
        if(m1 != null) {
            m1.D(v, v1, z);
        }
        i0 i00 = (i0)p0.x("StackMapTable");
        if(i00 != null) {
            i00.y(v, v1, z);
        }
        h0 h00 = (h0)p0.x("StackMap");
        if(h00 != null) {
            h00.y(v, v1, z);
        }
        return arr_b1;
    }

    public int E() {
        return this.d;
    }

    private static byte[] F(byte[] arr_b, List list0, int v, int v1) throws e {
        int v4;
        c q$c0;
        int v2 = list0.size();
        int v3 = arr_b.length + v1;
        for(Object object0: list0) {
            v3 += ((c)object0).a();
        }
        byte[] arr_b1 = new byte[v3];
        if(v2 > 0) {
            q$c0 = (c)list0.get(0);
            v4 = q$c0.b;
        }
        else {
            v4 = arr_b.length;
            q$c0 = null;
        }
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        while(v5 < arr_b.length) {
            if(v5 == v) {
                int v8 = v6 + v1;
                while(v6 < v8) {
                    arr_b1[v6] = 0;
                    ++v6;
                }
            }
            if(v5 == v4) {
                int v9 = q$c0.f(v5, arr_b, v6, arr_b1);
                v5 += v9;
                v6 += v9 + q$c0.a();
                ++v7;
                if(v7 < v2) {
                    q$c0 = (c)list0.get(v7);
                    v4 = q$c0.b;
                }
                else {
                    v4 = arr_b.length;
                    q$c0 = null;
                }
            }
            else {
                arr_b1[v6] = arr_b[v5];
                ++v6;
                ++v5;
            }
        }
        return arr_b1;
    }

    private static List G(byte[] arr_b, int v, j q$j0) throws e {
        List list0 = new ArrayList();
        int v1 = 0;
        while(v1 < v) {
            int v2 = q.K(arr_b, v1);
            int v3 = arr_b[v1] & 0xFF;
            if(0x99 > v3 || v3 > 0xA8) {
                switch(v3) {
                    case 170: {
                        int v4 = g.b(arr_b, (v1 & -4) + 4);
                        int v5 = g.b(arr_b, (v1 & -4) + 8);
                        int v6 = g.b(arr_b, (v1 & -4) + 12);
                        int v7 = (v1 & -4) + 16;
                        int v8 = v6 - v5 + 1;
                        int[] arr_v = new int[v8];
                        for(int v9 = 0; v9 < v8; ++v9) {
                            arr_v[v9] = g.b(arr_b, v7);
                            v7 += 4;
                        }
                        list0.add(new l(v1, v4, v5, v6, arr_v, q$j0));
                        break;
                    }
                    case 0xAB: {
                        int v10 = g.b(arr_b, (v1 & -4) + 4);
                        int v11 = g.b(arr_b, (v1 & -4) + 8);
                        int v12 = (v1 & -4) + 12;
                        int[] arr_v1 = new int[v11];
                        int[] arr_v2 = new int[v11];
                        for(int v13 = 0; v13 < v11; ++v13) {
                            arr_v1[v13] = g.b(arr_b, v12);
                            arr_v2[v13] = g.b(arr_b, v12 + 4);
                            v12 += 8;
                        }
                        list0.add(new i(v1, v10, arr_v1, arr_v2, q$j0));
                        break;
                    }
                    case 0xC6: 
                    case 0xC7: {
                        goto label_38;
                    }
                    case 200: 
                    case 201: {
                        list0.add(new javassist.bytecode.q.g(v1, g.b(arr_b, v1 + 1)));
                    }
                }
            }
            else {
            label_38:
                int v14 = arr_b[v1 + 1] << 8 | arr_b[v1 + 2] & 0xFF;
                f q$f0 = v3 == 0xA7 || v3 == 0xA8 ? new f(v1, v14) : new javassist.bytecode.q.e(v1, v14);
                list0.add(q$f0);
            }
            v1 = v2;
        }
        return list0;
    }

    public void H(int v) {
        this.d = v;
    }

    private static int I(int v, int v1, int v2, int v3, boolean z) {
        int v4 = v + v1;
        if(v < v2) {
            return v2 >= v4 && (!z || v2 != v4) ? v1 : v1 + v3;
        }
        if(v == v2) {
            return v4 >= v2 ? v1 : v1 - v3;
        }
        return v4 < v2 || !z && v2 == v4 ? v1 - v3 : v1;
    }

    public int J() throws e {
        int v = this.d;
        this.d = q.K(this.b, v);
        return v;
    }

    static int K(byte[] arr_b, int v) throws e {
        int v1;
        try {
            v1 = arr_b[v];
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new e("invalid opcode address");
        }
        try {
            int v2 = q.f[v1 & 0xFF];
            if(v2 > 0) {
                return v + v2;
            }
            if((v1 & 0xFF) == 0xC4) {
                return arr_b[v + 1] == 0xFFFFFF84 ? v + 6 : v + 4;
            }
            int v3 = (v & -4) + 8;
            if((v1 & 0xFF) == 0xAB) {
                return v3 + g.b(arr_b, v3) * 8 + 4;
            }
            if((v1 & 0xFF) == 170) {
                return v3 - g.b(arr_b, v3) * 4 + g.b(arr_b, (v & -4) + 12) * 4 + 12;
            }
        }
        catch(IndexOutOfBoundsException unused_ex) {
        }
        throw new e(v1 & 0xFF);
    }

    public int L(int v) {
        return g.c(this.b, v);
    }

    public int M(int v) {
        return g.b(this.b, v);
    }

    public void N(int v) {
        this.e = v;
    }

    public int O(int v) {
        return this.b[v];
    }

    public int P() throws e {
        return this.R(-1);
    }

    public int Q() throws e {
        return this.R(0);
    }

    private int R(int v) throws e {
        this.e();
        t t0 = this.a.d();
        String s = this.a.B();
        boolean z = false;
        int v1 = 0;
        while(this.l()) {
            int v2 = this.J();
            int v3 = this.f(v2);
            if(v3 == 0xBB) {
                ++v1;
            }
            else if(v3 == 0xB7) {
                int v4 = g.d(this.b, v2 + 1);
                if(t0.e0(v4).equals("<init>")) {
                    --v1;
                    if(v1 < 0) {
                        if(v < 0) {
                            return v2;
                        }
                        boolean z1 = t0.d0(v4).equals(s);
                        if(v > 0) {
                            z = true;
                        }
                        if(z1 != z) {
                            break;
                        }
                        return v2;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        this.e();
        return -1;
    }

    public int S() throws e {
        return this.R(1);
    }

    public int T(int v) {
        return g.d(this.b, v);
    }

    protected void U(int v, int v1) {
    }

    public void V(byte[] arr_b, int v) {
        int v1 = 0;
        while(v1 < arr_b.length) {
            this.b[v] = arr_b[v1];
            ++v1;
            ++v;
        }
    }

    public void W(int v, int v1) {
        g.e(v, this.b, v1);
    }

    public void X(int v, int v1) {
        g.f(v, this.b, v1);
    }

    public void Y(int v, int v1) {
        this.b[v1] = (byte)v;
    }

    private static void a(javassist.bytecode.p.a p$a0, List list0) {
        int v = p$a0.b;
        h q$h0 = new h(v, p$a0.c);
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v < ((c)list0.get(v2)).b) {
                list0.add(v2, q$h0);
                return;
            }
        }
        list0.add(q$h0);
    }

    public int b(byte[] arr_b) {
        int v = this.j();
        if(arr_b.length <= 0) {
            return v;
        }
        this.d(arr_b.length);
        byte[] arr_b1 = this.b;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            arr_b1[v1 + v] = arr_b[v1];
        }
        return v;
    }

    public void c(A a0, int v) {
        A a1 = this.a.C();
        a1.c(a1.p(), a0, v);
    }

    public void d(int v) {
        byte[] arr_b = this.b;
        int v1 = arr_b.length;
        int v2 = v + v1;
        byte[] arr_b1 = new byte[v2];
        for(int v3 = 0; v3 < v1; ++v3) {
            arr_b1[v3] = arr_b[v3];
        }
        while(v1 < v2) {
            arr_b1[v1] = 0;
            ++v1;
        }
        this.a.J(arr_b1);
        this.b = arr_b1;
        this.c = this.j();
    }

    public void e() {
        this.e = 0;
        this.d = 0;
        this.c = this.j();
    }

    public int f(int v) {
        return this.b[v] & 0xFF;
    }

    static byte[] g(byte[] arr_b, A a0, p p0, javassist.bytecode.p.a p$a0) throws e {
        j q$j0 = new j(0, 0, 0, a0, p0);
        List list0 = q.G(arr_b, arr_b.length, q$j0);
        while(p$a0 != null) {
            q.a(p$a0, list0);
            p$a0 = p$a0.a;
        }
        return q.z(arr_b, 0, 0, false, list0, q$j0);
    }

    private static int h(byte[] arr_b, int v, byte[] arr_b1, int v1, int v2) {
        switch(v2 - v1) {
            case 1: {
                break;
            }
            case 2: {
                arr_b[v] = arr_b1[v1];
                ++v;
                ++v1;
                break;
            }
            case 3: {
            label_5:
                arr_b[v] = arr_b1[v1];
                ++v;
                ++v1;
                arr_b[v] = arr_b1[v1];
                ++v;
                ++v1;
                break;
            }
            case 4: {
                arr_b[v] = arr_b1[v1];
                ++v;
                ++v1;
                goto label_5;
            }
            default: {
                return v;
            }
        }
        arr_b[v] = arr_b1[v1];
        return v + 1;
    }

    public p i() {
        return this.a;
    }

    public int j() {
        return this.b.length;
    }

    public int k() {
        return this.e;
    }

    public boolean l() {
        return this.d < this.c;
    }

    public int m(byte[] arr_b) throws e {
        return this.p(this.d, arr_b, false);
    }

    public void n(int v, byte[] arr_b) throws e {
        this.p(v, arr_b, false);
    }

    public void o(A a0, int v) {
        this.a.C().c(0, a0, v);
    }

    private int p(int v, byte[] arr_b, boolean z) throws e {
        if(arr_b.length <= 0) {
            return v;
        }
        int v1 = this.A(v, arr_b.length, z).a;
        int v2 = 0;
        for(int v3 = v1; v2 < arr_b.length; ++v3) {
            this.b[v3] = arr_b[v2];
            ++v2;
        }
        return v1;
    }

    public int q(int v, byte[] arr_b) throws e {
        return this.p(v, arr_b, false);
    }

    public int r(byte[] arr_b) throws e {
        return this.p(this.d, arr_b, true);
    }

    public void s(int v, byte[] arr_b) throws e {
        this.p(v, arr_b, true);
    }

    public int t(int v, byte[] arr_b) throws e {
        return this.p(v, arr_b, true);
    }

    public int u(int v) throws e {
        return this.A(this.d, v, true).a;
    }

    public int v(int v, int v1) throws e {
        return this.A(v, v1, true).b;
    }

    public int w(int v) throws e {
        return this.A(this.d, v, false).a;
    }

    public int x(int v, int v1) throws e {
        return this.A(v, v1, false).b;
    }

    private static void y(byte[] arr_b, int v, int v1, int v2, byte[] arr_b1, boolean z) throws e, a {
        int v3 = 0;
        int v4 = 0;
        while(v3 < v2) {
            if(v3 == v) {
                int v5 = v4 + v1;
                while(v4 < v5) {
                    arr_b1[v4] = 0;
                    ++v4;
                }
            }
            int v6 = q.K(arr_b, v3);
            int v7 = arr_b[v3] & 0xFF;
            if(0x99 > v7 || v7 > 0xA8) {
                switch(v7) {
                    case 170: {
                        if(v3 != v4 && (v1 & 3) != 0) {
                            throw new a();
                        }
                        int v8 = (v3 & -4) + 4;
                        int v9 = q.h(arr_b1, v4, arr_b, v3, v8);
                        g.f(q.I(v3, g.b(arr_b, v8), v, v1, z), arr_b1, v9);
                        int v10 = g.b(arr_b, (v3 & -4) + 8);
                        g.f(v10, arr_b1, v9 + 4);
                        int v11 = g.b(arr_b, (v3 & -4) + 12);
                        g.f(v11, arr_b1, v9 + 8);
                        v4 = v9 + 12;
                        int v12 = (v3 & -4) + 16;
                        int v13 = (v11 - v10 + 1) * 4 + v12;
                        while(v12 < v13) {
                            g.f(q.I(v3, g.b(arr_b, v12), v, v1, z), arr_b1, v4);
                            v4 += 4;
                            v12 += 4;
                        }
                        break;
                    }
                    case 0xAB: {
                        if(v3 != v4 && (v1 & 3) != 0) {
                            throw new a();
                        }
                        int v14 = (v3 & -4) + 4;
                        int v15 = q.h(arr_b1, v4, arr_b, v3, v14);
                        g.f(q.I(v3, g.b(arr_b, v14), v, v1, z), arr_b1, v15);
                        int v16 = g.b(arr_b, (v3 & -4) + 8);
                        g.f(v16, arr_b1, v15 + 4);
                        v4 = v15 + 8;
                        int v17 = (v3 & -4) + 12;
                        int v18 = v16 * 8 + v17;
                        while(v17 < v18) {
                            g.a(arr_b, v17, arr_b1, v4);
                            g.f(q.I(v3, g.b(arr_b, v17 + 4), v, v1, z), arr_b1, v4 + 4);
                            v4 += 8;
                            v17 += 8;
                        }
                        break;
                    }
                    case 0xC6: 
                    case 0xC7: {
                        goto label_59;
                    }
                    case 200: 
                    case 201: {
                        int v19 = q.I(v3, g.b(arr_b, v3 + 1), v, v1, z);
                        arr_b1[v4] = arr_b[v3];
                        g.f(v19, arr_b1, v4 + 1);
                        v4 += 5;
                        break;
                    }
                    default: {
                        while(v3 < v6) {
                            arr_b1[v4] = arr_b[v3];
                            ++v4;
                            ++v3;
                        }
                    }
                }
            }
            else {
            label_59:
                int v20 = q.I(v3, arr_b[v3 + 1] << 8 | arr_b[v3 + 2] & 0xFF, v, v1, z);
                arr_b1[v4] = arr_b[v3];
                g.e(v20, arr_b1, v4 + 1);
                v4 += 3;
            }
            v3 = v6;
        }
    }

    private static byte[] z(byte[] arr_b, int v, int v1, boolean z, List list0, j q$j0) throws e {
        if(v1 > 0) {
            q$j0.b(v, v1, z);
            for(Object object0: list0) {
                ((c)object0).d(v, v1, z);
            }
        }
        int v2 = 1;
        while(true) {
            if(v2 == 0) {
                for(Object object3: list0) {
                    c q$c1 = (c)object3;
                    int v6 = q$c1.c();
                    if(v6 > 0) {
                        int v7 = q$c1.a;
                        q$j0.b(v7, v6, false);
                        for(Object object4: list0) {
                            ((c)object4).d(v7, v6, false);
                        }
                        v2 = 1;
                    }
                }
                if(v2 == 0) {
                    break;
                }
            }
            else {
                int v3 = 0;
                for(Object object1: list0) {
                    c q$c0 = (c)object1;
                    if(q$c0.b()) {
                        int v4 = q$c0.a;
                        int v5 = q$c0.a();
                        q$j0.b(v4, v5, false);
                        for(Object object2: list0) {
                            ((c)object2).d(v4, v5, false);
                        }
                        v3 = 1;
                    }
                }
                v2 = v3;
            }
        }
        return q.F(arr_b, list0, v, v1);
    }
}

