package javassist.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javassist.bytecode.c0;
import javassist.bytecode.j;
import javassist.compiler.ast.a;
import javassist.compiler.ast.d;
import javassist.compiler.ast.e;
import javassist.compiler.ast.f;
import javassist.compiler.ast.g;
import javassist.compiler.ast.h;
import javassist.compiler.ast.i;
import javassist.compiler.ast.k;
import javassist.compiler.ast.l;
import javassist.compiler.ast.m;
import javassist.compiler.ast.n;
import javassist.compiler.ast.o;
import javassist.compiler.ast.p;
import javassist.compiler.ast.s;
import javassist.compiler.ast.t;
import javassist.compiler.ast.u;
import javassist.compiler.ast.v;
import javassist.compiler.ast.w;
import javassist.compiler.ast.x;

public abstract class b extends x implements c0, q {
    public static abstract class javassist.compiler.b.b {
        javassist.compiler.b.b a;

        protected javassist.compiler.b.b(b b0) {
            this.a = b0.h;
            b0.h = this;
        }

        protected abstract boolean a(j arg1, int arg2);

        protected void b(b b0) {
            b0.h = this.a;
        }
    }

    protected j a;
    private int b;
    r c;
    protected boolean d;
    public boolean e;
    protected List f;
    protected List g;
    protected javassist.compiler.b.b h;
    protected int i;
    protected int j;
    protected String k;
    static final String l = "java.lang.Object";
    static final String m = "java/lang/Object";
    static final String n = "java.lang.String";
    static final String o = "java/lang/String";
    static final int[] p = null;
    private static final int[] q = null;
    private static final int[] r = null;
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = -1;
    private static final int[] x;

    static {
        b.p = new int[]{43, 99, 98, 97, 0x60, 45, 103, 102, 101, 100, 42, 107, 106, 105, 104, 0x2F, 0x6F, 110, 109, 108, 37, 0x73, 0x72, 0x71, 0x70, 0x7C, 0, 0, 0x81, 0x80, 94, 0, 0, 0x83, 130, 38, 0, 0, 0x7F, 0x7E, 364, 0, 0, 0x79, 120, 366, 0, 0, 0x7B, 0x7A, 370, 0, 0, 0x7D, 0x7C};
        b.q = new int[]{358, 0x9F, 0xA0, 350, 0xA0, 0x9F, 357, 0xA4, 0xA3, 359, 0xA2, 0xA1, 60, 0xA1, 0xA2, 62, 0xA3, 0xA4};
        b.r = new int[]{358, 0x99, 0x9A, 350, 0x9A, 0x99, 357, 0x9E, 0x9D, 359, 0x9C, 0x9B, 60, 0x9B, 0x9C, 62, 0x9D, 0x9E};
        b.x = new int[]{0, 0x90, 0x8F, 0x8E, 0x8D, 0, 140, 0x8B, 0x8A, 0x89, 0, 0x88, 0x87, 0x86, 0x85, 0};
    }

    public b(j j0) {
        this.a = j0;
        this.b = -1;
        this.c = null;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public void A(javassist.compiler.ast.b b0, javassist.compiler.ast.b b1) throws c {
        this.w(b0, b1);
        this.a.s0(b.p0(this.i, this.j));
    }

    private boolean A0(int v, int v1, String s, int v2, int v3, String s1, boolean z) {
        if(v1 == v3 || v == 412) {
            return false;
        }
        return v3 != 0 || v2 != 307 || !"java/lang/Object".equals(s1) ? !z || v1 != 0 || v != 307 || !"java/lang/Object".equals(s) : false;
    }

    protected abstract void B(javassist.compiler.ast.c arg1, int arg2, int arg3, String arg4) throws c;

    public static boolean B0(int v, int v1) {
        return v1 == 0 && (v == 312 || v == 326);
    }

    protected void C(k k0, int v, javassist.compiler.ast.b b0, int v1, int v2, String s) throws c {
        if(v != 354 || v2 != 0 || v1 != 307) {
            b0.a(this);
            if(this.A0(this.i, this.j, this.k, v1, v2, s, false) || v != 61 && v2 > 0) {
                b.a0(k0);
            }
            if(v != 61) {
                int v3 = q.g8[v - 0x15F];
                int v4 = b.G0(v3);
                if(v4 < 0) {
                    b.o0();
                }
                this.x(k0, v3, v4, v1);
            }
        }
        else {
            this.T(k0, 307, 0, s, b0);
        }
        if(v != 61 || v2 == 0 && !b.F0(v1)) {
            this.N(this.i, v1);
        }
    }

    private static boolean C0(javassist.compiler.ast.b b0, boolean z) {
        if(b0 instanceof o) {
            int v = ((o)b0).g();
            return z ? v == 410 : v == 411;
        }
        return false;
    }

    protected void D(d d0, boolean z) throws c {
        int v = d0.r();
        javassist.compiler.ast.b b0 = d0.w();
        javassist.compiler.ast.b b1 = d0.x();
        if(b0 instanceof w) {
            this.Y(d0, v, ((w)b0), ((w)b0).h(), b1, z);
            return;
        }
        if(b0 instanceof k && ((k)b0).r() == 65) {
            this.y(d0, v, ((k)b0), b1, z);
            return;
        }
        this.H(d0, v, b0, b1, z);
    }

    static boolean D0(int v) {
        return b.Q0(v) == 3;
    }

    private void E(t t0, boolean z) throws c {
        if(t0.i() != null) {
            throw new c("sorry, not support labeled break or continue");
        }
        this.a.s0(0xA7);
        Integer integer0 = this.a.D0();
        this.a.G(0);
        if(z) {
            this.f.add(integer0);
            return;
        }
        this.g.add(integer0);
    }

    private static boolean E0(javassist.compiler.ast.b b0) {
        if(b0 instanceof k) {
            switch(((k)b0).r()) {
                case 362: 
                case 363: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public void F(k k0) throws c {
        javassist.compiler.ast.b b0 = k0.w();
        if(!(b0 instanceof v)) {
            throw new c("fatal error: badly parsed .class expr");
        }
        String s = ((v)b0).g();
        if(s.startsWith("[")) {
            int v = s.indexOf("[L");
            if(v >= 0) {
                String s1 = s.substring(v + 2, s.length() - 1);
                String s2 = this.J0(s1);
                if(!s1.equals(s2)) {
                    String s3 = javassist.compiler.j.l(s2);
                    StringBuffer stringBuffer0 = new StringBuffer();
                    while(v >= 0) {
                        stringBuffer0.append('[');
                        --v;
                    }
                    stringBuffer0.append('L');
                    stringBuffer0.append(s3);
                    stringBuffer0.append(';');
                    s = stringBuffer0.toString();
                }
            }
        }
        else {
            s = javassist.compiler.j.l(this.J0(javassist.compiler.j.k(s)));
        }
        this.G(s);
        this.i = 307;
        this.j = 0;
        this.k = "java/lang/Class";
    }

    protected static boolean F0(int v) {
        return v == 307 || v == 412;
    }

    protected void G(String s) throws c {
        int v = this.a.D0();
        this.a.f0(s);
        this.a.V("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
        int v1 = this.a.D0();
        this.a.s0(0xA7);
        int v2 = this.a.D0();
        this.a.G(0);
        this.a.v(v, v1, this.a.D0(), "java.lang.ClassNotFoundException");
        this.a.K0(1);
        this.a.V("javassist.runtime.DotClass", "fail", "(Ljava/lang/ClassNotFoundException;)Ljava/lang/NoClassDefFoundError;");
        this.a.s0(0xBF);
        this.a.U0(v2, this.a.D0() - v2 + 1);
    }

    static int G0(int v) {
        int[] arr_v = b.p;
        for(int v1 = 0; v1 < arr_v.length; v1 += 5) {
            if(arr_v[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    protected abstract void H(k arg1, int arg2, javassist.compiler.ast.b arg3, javassist.compiler.ast.b arg4, boolean arg5) throws c;

    private boolean H0(t t0) throws c {
        if(t0.r() == 66) {
            t0 = (t)t0.i();
        }
        if(t0 != null && t0.r() == 69) {
            javassist.compiler.ast.b b0 = t0.i();
            if(b0 != null && b0 instanceof k && ((k)b0).r() == 67) {
                javassist.compiler.ast.b b1 = ((k)b0).i();
                if(b1 instanceof o) {
                    switch(((o)b1).g()) {
                        case 0x150: 
                        case 339: {
                            return false;
                        }
                        default: {
                            return true;
                        }
                    }
                }
            }
        }
        return true;
    }

    protected abstract void I(int arg1, boolean arg2, javassist.compiler.ast.b arg3, k arg4, boolean arg5) throws c;

    protected void I0(List list0, int v) {
        for(Object object0: list0) {
            int v1 = (int)(((Integer)object0));
            this.a.U0(v1, v - v1 + 1);
        }
    }

    protected abstract void J(javassist.compiler.ast.b arg1) throws c;

    protected abstract String J0(String arg1) throws c;

    private void K(t t0) throws c {
        int v1;
        List list0 = this.f;
        List list1 = this.g;
        this.f = new ArrayList();
        this.g = new ArrayList();
        t t1 = (t)t0.i();
        a a0 = t0.q();
        javassist.compiler.ast.b b0 = a0.i();
        a a1 = a0.q();
        t t2 = (t)a1.i();
        t t3 = (t)a1.q();
        if(t1 != null) {
            t1.a(this);
        }
        int v = this.a.D0();
        if(b0 == null) {
            v1 = 0;
        }
        else {
            if(this.g0(false, b0)) {
                this.g = list1;
                this.f = list0;
                this.d = false;
                return;
            }
            v1 = this.a.D0();
            this.a.G(0);
        }
        if(t3 != null) {
            t3.a(this);
        }
        int v2 = this.a.D0();
        if(t2 != null) {
            t2.a(this);
        }
        this.a.s0(0xA7);
        this.a.G(v - this.a.D0() + 1);
        int v3 = this.a.D0();
        if(b0 != null) {
            this.a.U0(v1, v3 - v1 + 1);
        }
        this.I0(this.f, v3);
        this.I0(this.g, v2);
        this.g = list1;
        this.f = list0;
        this.d = false;
    }

    protected abstract String K0(a arg1) throws c;

    private void L(t t0) throws c {
        int v1;
        t t1 = (t)t0.q().i();
        t t2 = (t)t0.q().q().i();
        boolean z = false;
        if(this.g0(false, t0.i())) {
            this.d = false;
            if(t2 != null) {
                t2.a(this);
            }
            return;
        }
        int v = this.a.D0();
        this.a.G(0);
        this.d = false;
        if(t1 != null) {
            t1.a(this);
        }
        boolean z1 = this.d;
        this.d = false;
        if(t2 == null || z1) {
            v1 = 0;
        }
        else {
            this.a.s0(0xA7);
            v1 = this.a.D0();
            this.a.G(0);
        }
        this.a.U0(v, this.a.D0() - v + 1);
        if(t2 != null) {
            t2.a(this);
            if(!z1) {
                this.a.U0(v1, this.a.D0() - v1 + 1);
            }
            if(z1 && this.d) {
                z = true;
            }
            this.d = z;
        }
    }

    static boolean L0(int v, int v1) {
        int v2 = b.Q0(v);
        int v3 = b.Q0(v1);
        return v2 >= 0 && v3 >= 0 && v2 > v3;
    }

    public void M(t t0, boolean z, boolean z1) throws c {
        if(t0 == null) {
            return;
        }
        if(z && this.H0(t0)) {
            this.z0();
        }
        this.d = false;
        t0.a(this);
        if(!this.d) {
            if(!z1) {
                throw new c("no return statement");
            }
            this.a.s0(0xB1);
            this.d = true;
        }
    }

    public void M0(int v) {
        this.a.P0(v);
    }

    void N(int v, int v1) throws c {
        if(v == v1) {
            return;
        }
        int v2 = b.Q0(v);
        int v3 = 0;
        int v4 = v2 < 0 || v2 >= 3 ? 0 : b.x[v2 * 4 + b.Q0(v1)];
        switch(v1) {
            case 303: {
                v3 = 0x91;
                break;
            }
            case 306: {
                v3 = 0x92;
                break;
            }
            case 312: {
                v3 = 0x87;
                break;
            }
            case 317: {
                v3 = 0x86;
                break;
            }
            case 326: {
                v3 = 0x85;
                break;
            }
            case 334: {
                v3 = 0x93;
            }
        }
        if(v4 != 0) {
            this.a.s0(v4);
        }
        if((v4 == 0 || v4 == 0x88 || v4 == 0x8B || v4 == 0x8E) && v3 != 0) {
            this.a.s0(v3);
        }
    }

    public void N0(r r0) {
        this.c = r0;
    }

    private void O(int v, javassist.compiler.ast.b b0, k k0, boolean z) throws c {
        int v1 = 1;
        boolean z1 = b0 == null;
        if(z1) {
            b0 = k0.x();
        }
        if(b0 instanceof w) {
            i i0 = ((w)b0).h();
            int v2 = i0.A();
            this.i = v2;
            this.j = i0.w();
            int v3 = this.t0(i0);
            if(this.j > 0) {
                b.b0(k0);
            }
            switch(v2) {
                case 312: {
                    this.a.s(v3);
                    if(z && z1) {
                        this.a.s0(92);
                    }
                    this.a.r(1.0);
                    this.a.s0((v == 362 ? 99 : 103));
                    if(z && !z1) {
                        this.a.s0(92);
                    }
                    this.a.t(v3);
                    return;
                }
                case 317: {
                    this.a.y(v3);
                    if(z && z1) {
                        this.a.s0(89);
                    }
                    this.a.x(1.0f);
                    this.a.s0((v == 362 ? 98 : 102));
                    if(z && !z1) {
                        this.a.s0(89);
                    }
                    this.a.z(v3);
                    return;
                }
                case 326: {
                    this.a.i0(v3);
                    if(z && z1) {
                        this.a.s0(92);
                    }
                    this.a.d0(1L);
                    this.a.s0((v == 362 ? 97 : 101));
                    if(z && !z1) {
                        this.a.s0(92);
                    }
                    this.a.l0(v3);
                    return;
                }
                case 303: 
                case 306: 
                case 324: 
                case 334: {
                    if(z && z1) {
                        this.a.F(v3);
                    }
                    if(v != 362) {
                        v1 = -1;
                    }
                    if(v3 > 0xFF) {
                        this.a.s0(0xC4);
                        this.a.s0(0x84);
                        this.a.G(v3);
                        this.a.G(v1);
                    }
                    else {
                        this.a.s0(0x84);
                        this.a.a(v3);
                        this.a.a(v1);
                    }
                    break;
                }
                default: {
                    b.b0(k0);
                    return;
                }
            }
            if(z && !z1) {
                this.a.F(v3);
            }
        }
        else {
            if(b0 instanceof k && ((k)b0).r() == 65) {
                this.z(v, z1, ((k)b0), z);
                return;
            }
            this.I(v, z1, b0, k0, z);
        }
    }

    protected static String O0(String s, int v) {
        if(s == null) {
            return null;
        }
        if(v == 0) {
            return s;
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        while(v > 0) {
            stringBuffer0.append('[');
            --v;
        }
        stringBuffer0.append('L');
        stringBuffer0.append(s);
        stringBuffer0.append(';');
        return stringBuffer0.toString();
    }

    protected void P(int v, boolean z, int v1, boolean z1, k k0) throws c {
        int v2 = this.i;
        if(z && z1) {
            this.a.s0(v);
        }
        switch(v2) {
            case 312: {
                this.a.r(1.0);
                this.a.s0((v1 == 362 ? 99 : 103));
                break;
            }
            case 317: {
                this.a.x(1.0f);
                this.a.s0((v1 == 362 ? 98 : 102));
                break;
            }
            case 326: {
                this.a.d0(1L);
                this.a.s0((v1 == 362 ? 97 : 101));
                break;
            }
            case 303: 
            case 306: 
            case 324: 
            case 334: {
                this.a.E(1);
                this.a.s0((v1 == 362 ? 0x60 : 100));
                this.i = 324;
                break;
            }
            default: {
                b.b0(k0);
            }
        }
        if(z && !z1) {
            this.a.s0(v);
        }
    }

    protected static String P0(int v, int v1) {
        int v2;
        switch(v) {
            case 301: {
                v2 = 90;
                break;
            }
            case 303: {
                v2 = 66;
                break;
            }
            case 306: {
                v2 = 67;
                break;
            }
            case 312: {
                v2 = 68;
                break;
            }
            case 317: {
                v2 = 70;
                break;
            }
            default: {
                v2 = 73;
                switch(v) {
                    case 326: {
                        v2 = 74;
                        break;
                    }
                    case 334: {
                        v2 = 83;
                        break;
                    }
                    case 344: {
                        v2 = 86;
                    }
                }
            }
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        while(v1 > 0) {
            stringBuffer0.append('[');
            --v1;
        }
        stringBuffer0.append(((char)v2));
        return stringBuffer0.toString();
    }

    protected void Q(t t0) throws c {
        this.R(t0.b());
    }

    private static int Q0(int v) {
        switch(v) {
            case 312: {
                return 0;
            }
            case 317: {
                return 1;
            }
            case 326: {
                return 2;
            }
            default: {
                if(b.F0(v)) {
                    return -1;
                }
                return v == 344 ? -1 : 3;
            }
        }
    }

    protected final void R(javassist.compiler.ast.b b0) throws c {
        int v;
        if(b0 == null) {
            v = 0xB1;
        }
        else {
            this.h0(b0);
            if(this.j <= 0) {
                int v1 = this.i;
                if(v1 == 312) {
                    v = 0xAF;
                }
                else {
                    switch(v1) {
                        case 317: {
                            v = 0xAE;
                            break;
                        }
                        case 326: {
                            v = 0xAD;
                            break;
                        }
                        default: {
                            v = b.F0(v1) ? 0xB0 : 0xAC;
                        }
                    }
                }
            }
            else {
                v = 0xB0;
            }
        }
        for(javassist.compiler.b.b b$b0 = this.h; b$b0 != null; b$b0 = b$b0.a) {
            if(b$b0.a(this.a, v)) {
                this.d = true;
                return;
            }
        }
        this.a.s0(v);
        this.d = true;
    }

    private void S(k k0, int v, int v1, String s) throws c {
        int v2 = this.i;
        int v3 = this.j;
        boolean z = b.B0(v2, v3);
        boolean z1 = v2 == 307 && "java/lang/String".equals(this.k);
        if(z) {
            this.l0(v2, v3);
        }
        if(b.B0(v, v1)) {
            this.a.s0(91);
            this.a.s0(87);
        }
        else {
            this.a.s0(0x5F);
        }
        this.l0(v, v1);
        this.a.s0(0x5F);
        if(!z && !z1) {
            this.l0(v2, v3);
        }
        this.a.Z("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
        this.i = 307;
        this.j = 0;
        this.k = "java/lang/String";
    }

    private void T(k k0, int v, int v1, String s, javassist.compiler.ast.b b0) throws c {
        if(!"java/lang/String".equals(s)) {
            b.a0(k0);
        }
        this.l0(v, v1);
        b0.a(this);
        this.l0(this.i, this.j);
        this.a.Z("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
        this.i = 307;
        this.j = 0;
        this.k = "java/lang/String";
    }

    private void U(t t0) throws c {
        int v9;
        long[] arr_v1;
        int v1;
        boolean z;
        if(this.c == null) {
            z = false;
        }
        else {
            this.n0(t0.i());
            z = this.c.a != 307 || this.c.b != 0 || !"java/lang/String".equals(this.c.c) ? false : true;
        }
        this.h0(t0.i());
        int v = -1;
        if(z) {
            v1 = this.u0();
            this.y0(1);
            this.a.n(v1);
            this.a.k(v1);
            this.a.Z("java/lang/String", "hashCode", "()I");
        }
        else {
            v1 = -1;
        }
        List list0 = this.f;
        this.f = new ArrayList();
        int v2 = this.a.D0();
        this.a.s0(0xAB);
        for(int v3 = ~v2 & 3; v3 > 0; --v3) {
            this.a.a(0);
        }
        a a0 = (t)t0.q();
        a a1 = a0;
        int v4 = 0;
        while(a1 != null) {
            if(((t)a1.i()).r() == 304) {
                ++v4;
            }
            a1 = a1.q();
        }
        int v5 = this.a.D0();
        this.a.d(4);
        this.a.j(v4);
        this.a.d(v4 * 8);
        long[] arr_v = new long[v4];
        ArrayList arrayList0 = new ArrayList();
        int v6 = 0;
        while(a0 != null) {
            t t1 = (t)a0.i();
            int v7 = t1.r();
            if(v7 == 310) {
                v = this.a.D0();
                arr_v1 = arr_v;
            }
            else if(v7 == 304) {
                int v8 = this.a.D0();
                if(z) {
                    v9 = this.k0(t1.i(), v1, arrayList0);
                    arr_v1 = arr_v;
                }
                else {
                    arr_v1 = arr_v;
                    v9 = this.j0(t1.i());
                }
                arr_v1[v6] = (((long)v9) << 0x20) + ((long)(v8 - v2));
                ++v6;
            }
            else {
                b.o0();
                arr_v1 = arr_v;
            }
            this.d = false;
            ((t)t1.q()).a(this);
            a0 = a0.q();
            arr_v = arr_v1;
        }
        Arrays.sort(arr_v);
        int v10 = v5 + 8;
        for(int v11 = 0; v11 < v4; ++v11) {
            this.a.V0(v10, ((int)(arr_v[v11] >>> 0x20)));
            this.a.V0(v10 + 4, ((int)arr_v[v11]));
            v10 += 8;
        }
        if(v < 0 || this.f.size() > 0) {
            this.d = false;
        }
        int v12 = this.a.D0();
        if(v < 0) {
            v = v12;
        }
        this.a.V0(v5, v - v2);
        for(Object object0: arrayList0) {
            int v13 = (int)(((Integer)object0));
            this.a.U0(v13, v - v13 + 1);
        }
        this.I0(this.f, v12);
        this.f = list0;
    }

    private void V(t t0) throws c {
        class javassist.compiler.b.a extends javassist.compiler.b.b {
            final int b;
            final b c;

            javassist.compiler.b.a(b b1, int v) {
                this.b = v;
                super(b1);
            }

            @Override  // javassist.compiler.b$b
            protected boolean a(j j0, int v) {
                j0.k(this.b);
                j0.s0(0xC3);
                return false;
            }
        }

        int v5;
        int v = b.s0(this.f);
        int v1 = b.s0(this.g);
        this.h0(t0.i());
        if(this.i != 307 && this.j == 0) {
            throw new c("bad type expr for synchronized block");
        }
        j j0 = this.a;
        int v2 = j0.H0();
        j0.L0(1);
        j0.s0(89);
        j0.n(v2);
        j0.s0(0xC2);
        javassist.compiler.b.a b$a0 = new javassist.compiler.b.a(this, this, v2);
        int v3 = j0.D0();
        t t1 = (t)t0.q();
        if(t1 != null) {
            t1.a(this);
        }
        int v4 = j0.D0();
        if(this.d) {
            v5 = 0;
        }
        else {
            b$a0.a(j0, 0);
            j0.s0(0xA7);
            v5 = j0.D0();
            j0.G(0);
        }
        if(v3 < v4) {
            int v6 = j0.D0();
            b$a0.a(j0, 0);
            j0.s0(0xBF);
            j0.u(v3, v4, v6, 0);
        }
        if(!this.d) {
            j0.U0(v5, j0.D0() - v5 + 1);
        }
        b$a0.b(this);
        if(b.s0(this.f) != v || b.s0(this.g) != v1) {
            throw new c("sorry, cannot break/continue in synchronized block");
        }
    }

    private void W(t t0) throws c {
        this.h0(t0.b());
        if(this.i != 307 || this.j > 0) {
            throw new c("bad throw statement");
        }
        this.a.s0(0xBF);
        this.d = true;
    }

    protected void X(t t0) throws c {
        this.d = false;
    }

    private void Y(k k0, int v, w w0, i i0, javassist.compiler.ast.b b0, boolean z) throws c {
        int v1 = i0.A();
        int v2 = i0.w();
        String s = i0.x();
        int v3 = this.t0(i0);
        if(v != 61) {
            this.v(w0);
        }
        if(k0 != null || !(b0 instanceof javassist.compiler.ast.c)) {
            this.C(k0, v, b0, v1, v2, s);
        }
        else {
            this.B(((javassist.compiler.ast.c)b0), v1, v2, s);
        }
        if(z) {
            if(b.B0(v1, v2)) {
                this.a.s0(92);
            }
            else {
                this.a.s0(89);
            }
        }
        if(v2 > 0) {
            this.a.n(v3);
        }
        else {
            switch(v1) {
                case 312: {
                    this.a.t(v3);
                    break;
                }
                case 317: {
                    this.a.z(v3);
                    break;
                }
                case 326: {
                    this.a.l0(v3);
                    break;
                }
                default: {
                    if(b.F0(v1)) {
                        this.a.n(v3);
                    }
                    else {
                        this.a.c0(v3);
                    }
                }
            }
        }
        this.i = v1;
        this.j = v2;
        this.k = s;
    }

    private void Z(t t0, boolean z) throws c {
        int v;
        List list0 = this.f;
        List list1 = this.g;
        this.f = new ArrayList();
        this.g = new ArrayList();
        javassist.compiler.ast.b b0 = t0.i();
        t t1 = (t)t0.q();
        boolean z1 = false;
        if(z) {
            this.a.s0(0xA7);
            v = this.a.D0();
            this.a.G(0);
        }
        else {
            v = 0;
        }
        int v1 = this.a.D0();
        if(t1 != null) {
            t1.a(this);
        }
        int v2 = this.a.D0();
        if(z) {
            this.a.U0(v, v2 - v + 1);
        }
        boolean z2 = this.g0(true, b0);
        if(z2) {
            this.a.s0(0xA7);
            if(this.f.size() == 0) {
                z1 = true;
            }
            z2 = z1;
        }
        this.a.G(v1 - this.a.D0() + 1);
        this.I0(this.f, this.a.D0());
        this.I0(this.g, v2);
        this.g = list1;
        this.f = list0;
        this.d = z2;
    }

    @Override  // javassist.compiler.ast.x
    public void a(a a0) throws c {
        b.o0();
    }

    protected static void a0(k k0) throws c {
        throw new c((k0 == null ? "incompatible type for assignment" : "incompatible type for " + k0.getName()));
    }

    @Override  // javassist.compiler.ast.x
    public abstract void b(javassist.compiler.ast.c arg1) throws c;

    protected static void b0(k k0) throws c {
        throw new c("invalid type for " + k0.getName());
    }

    @Override  // javassist.compiler.ast.x
    public void c(d d0) throws c {
        this.D(d0, true);
    }

    protected static void c0(k k0) throws c {
        throw new c("invalid types for " + k0.getName());
    }

    @Override  // javassist.compiler.ast.x
    public void d(e e0) throws c {
        int v = e0.r();
        int v1 = b.G0(v);
        if(v1 >= 0) {
            e0.w().a(this);
            javassist.compiler.ast.b b0 = e0.x();
            if(b0 == null) {
                return;
            }
            int v2 = this.i;
            int v3 = this.j;
            String s = this.k;
            b0.a(this);
            if(v3 != this.j) {
                throw new c("incompatible array types");
            }
            if(v == 43 && v3 == 0 && (v2 == 307 || this.i == 307)) {
                this.S(e0, v2, 0, s);
                return;
            }
            this.x(e0, v, v1, v2);
            return;
        }
        if(!this.d0(true, e0)) {
            this.a.G(7);
            this.a.E(0);
            this.a.s0(0xA7);
            this.a.G(4);
        }
        this.a.E(1);
    }

    private boolean d0(boolean z, javassist.compiler.ast.b b0) throws c {
        int v1;
        int v = b.r0(b0);
        if(v == 358) {
            this.f0(z, ((e)b0).r(), this.i0(((e)b0)), ((e)b0));
        }
        else {
            switch(v) {
                case 33: {
                    return this.d0(!z, ((k)b0).w());
                }
                case 369: {
                    v1 = 1;
                    break;
                }
                default: {
                    v1 = 0;
                    break;
                }
            }
            if(v1 != 0 || v == 0x170) {
                if(this.d0(((boolean)(v1 ^ 1)), ((e)b0).w())) {
                    this.i = 301;
                    this.j = 0;
                    return true;
                }
                int v2 = this.a.D0();
                this.a.G(0);
                if(this.d0(((boolean)v1), ((e)b0).x())) {
                    this.a.s0(0xA7);
                }
                this.a.U0(v2, this.a.D0() - v2 + 3);
                if(z != v1) {
                    this.a.G(6);
                    this.a.s0(0xA7);
                }
            }
            else {
                if(b.C0(b0, z)) {
                    this.i = 301;
                    this.j = 0;
                    return true;
                }
                b0.a(this);
                if(this.i != 301 || this.j != 0) {
                    throw new c("boolean expr is required");
                }
                this.a.s0((z ? 0x9A : 0x99));
            }
        }
        this.i = 301;
        this.j = 0;
        return false;
    }

    @Override  // javassist.compiler.ast.x
    public abstract void e(f arg1) throws c;

    private String e0(g g0, String s) throws c {
        int v = g0.r();
        int v1 = g0.w();
        g0.u().a(this);
        int v2 = this.i;
        int v3 = this.j;
        if(!this.A0(v2, v3, this.k, v1, v, s, true) && v2 != 344) {
            switch(v1) {
                case 307: {
                    if(!b.F0(v2) && v3 == 0) {
                        throw new c("invalid cast");
                    }
                    return b.O0(s, v);
                }
                case 344: {
                    break;
                }
                default: {
                    return v <= 0 ? null : b.P0(v1, v);
                }
            }
        }
        throw new c("invalid cast");
    }

    @Override  // javassist.compiler.ast.x
    public void f(g g0) throws c {
        String s = this.K0(g0.s());
        String s1 = this.e0(g0, s);
        int v = this.i;
        this.i = g0.w();
        this.j = g0.r();
        this.k = s;
        if(s1 == null) {
            this.N(v, this.i);
            return;
        }
        this.a.o(s1);
    }

    private void f0(boolean z, int v, int v1, e e0) throws c {
        if(this.j == 0) {
            this.m0(v1, this.i, e0);
        }
        int v2 = 0xA6;
        int v3 = b.Q0(this.i);
        if(v3 != -1 && this.j <= 0) {
            int v4 = 0;
            int v5 = 2;
            if(v3 == 3) {
                int[] arr_v = b.q;
                while(v4 < arr_v.length) {
                    if(arr_v[v4] == v) {
                        j j0 = this.a;
                        if(z) {
                            v5 = 1;
                        }
                        j0.s0(arr_v[v4 + v5]);
                        return;
                    }
                    v4 += 3;
                }
                b.c0(e0);
                return;
            }
            switch(v3) {
                case 0: {
                    if(v == 60 || v == 357) {
                        this.a.s0(0x98);
                    }
                    else {
                        this.a.s0(0x97);
                    }
                    break;
                }
                case 1: {
                    if(v == 60 || v == 357) {
                        this.a.s0(150);
                    }
                    else {
                        this.a.s0(0x95);
                    }
                    break;
                }
                case 2: {
                    this.a.s0(0x94);
                    break;
                }
                default: {
                    b.o0();
                }
            }
            int[] arr_v1 = b.r;
            while(v4 < arr_v1.length) {
                if(arr_v1[v4] == v) {
                    j j1 = this.a;
                    if(z) {
                        v5 = 1;
                    }
                    j1.s0(arr_v1[v4 + v5]);
                    return;
                }
                v4 += 3;
            }
            b.c0(e0);
            return;
        }
        switch(v) {
            case 350: {
                j j2 = this.a;
                if(!z) {
                    v2 = 0xA5;
                }
                j2.s0(v2);
                return;
            }
            case 358: {
                j j3 = this.a;
                if(z) {
                    v2 = 0xA5;
                }
                j3.s0(v2);
                return;
            }
            default: {
                b.c0(e0);
            }
        }
    }

    @Override  // javassist.compiler.ast.x
    public void g(h h0) throws c {
        if(this.d0(false, h0.r())) {
            h0.s().a(this);
            return;
        }
        int v = this.a.D0();
        this.a.G(0);
        h0.y().a(this);
        int v1 = this.j;
        this.a.s0(0xA7);
        int v2 = this.a.D0();
        this.a.G(0);
        this.a.U0(v, this.a.D0() - v + 1);
        h0.s().a(this);
        if(v1 != this.j) {
            throw new c("type mismatch in ?:");
        }
        this.a.U0(v2, this.a.D0() - v2 + 1);
    }

    public boolean g0(boolean z, javassist.compiler.ast.b b0) throws c {
        this.n0(b0);
        return this.d0(z, b0);
    }

    @Override  // javassist.compiler.ast.x
    public void h(i i0) throws c {
        i0.E(this.u0());
        i0.D(this.J0(i0.x()));
        this.y0((b.B0(i0.A(), i0.w()) ? 2 : 1));
        javassist.compiler.ast.b b0 = i0.y();
        if(b0 != null) {
            this.n0(b0);
            this.Y(null, 61, null, i0, b0, false);
        }
    }

    public void h0(javassist.compiler.ast.b b0) throws c {
        this.n0(b0);
        b0.a(this);
    }

    @Override  // javassist.compiler.ast.x
    public void i(javassist.compiler.ast.j j0) throws c {
        this.j = 0;
        if(j0.l() == 405) {
            this.i = 312;
            this.a.r(j0.k());
            return;
        }
        this.i = 317;
        this.a.x(((float)j0.k()));
    }

    private int i0(e e0) throws c {
        e0.w().a(this);
        int v = this.i;
        int v1 = this.j;
        e0.x().a(this);
        if(v1 != this.j) {
            if(v != 412 && this.i != 412) {
                throw new c("incompatible array types");
            }
            if(this.i == 412) {
                this.j = v1;
            }
        }
        return v == 412 ? this.i : v;
    }

    @Override  // javassist.compiler.ast.x
    public void j(k k0) throws c {
        int v = k0.r();
        javassist.compiler.ast.b b0 = k0.w();
        switch(v) {
            case 33: {
                if(!this.d0(false, k0)) {
                    this.a.G(7);
                    this.a.E(1);
                    this.a.s0(0xA7);
                    this.a.G(4);
                }
                this.a.E(0);
                return;
            }
            case 35: {
                this.J(k0);
                return;
            }
            case 65: {
                this.A(b0, k0.x());
                return;
            }
            case 67: {
                b.o0();
                return;
            label_17:
                k0.w().a(this);
                int v1 = b.Q0(this.i);
                if(this.j > 0) {
                    b.b0(k0);
                }
                switch(v) {
                    case 43: {
                        goto label_50;
                    }
                    case 45: {
                        goto label_24;
                    }
                    case 0x7E: {
                        goto label_39;
                    }
                }
                b.o0();
                return;
            label_24:
                if(v1 == 0) {
                    this.a.s0(0x77);
                    return;
                }
                if(v1 == 1) {
                    this.a.s0(0x76);
                    return;
                }
                if(v1 == 2) {
                    this.a.s0(0x75);
                    return;
                }
                if(v1 == 3) {
                    this.a.s0(0x74);
                    this.i = 324;
                    return;
                }
                b.b0(k0);
                return;
            label_39:
                if(v1 == 3) {
                    this.a.E(-1);
                    this.a.s0(130);
                    this.i = 324;
                    return;
                }
                if(v1 == 2) {
                    this.a.d0(-1L);
                    this.a.s0(0x83);
                    return;
                }
                b.b0(k0);
                return;
            label_50:
                if(v1 == -1) {
                    b.b0(k0);
                    return;
                }
                break;
            }
            case 362: 
            case 363: {
                this.O(v, b0, k0, true);
                break;
            }
            default: {
                goto label_17;
            }
        }
    }

    private int j0(javassist.compiler.ast.b b0) throws c {
        this.n0(b0);
        javassist.compiler.ast.b b1 = r.h0(b0);
        if(!(b1 instanceof n)) {
            throw new c("bad case label");
        }
        return (int)((n)b1).j();
    }

    @Override  // javassist.compiler.ast.x
    public void k(l l0) throws c {
        l0.s().a(this);
    }

    private int k0(javassist.compiler.ast.b b0, int v, List list0) throws c {
        this.n0(b0);
        javassist.compiler.ast.b b1 = r.h0(b0);
        if(!(b1 instanceof u)) {
            throw new c("bad case label");
        }
        String s = ((u)b1).g();
        this.a.k(v);
        this.a.f0(s);
        this.a.Z("java/lang/String", "equals", "(Ljava/lang/Object;)Z");
        this.a.s0(0x99);
        Integer integer0 = this.a.D0();
        this.a.G(0);
        list0.add(integer0);
        return s.hashCode();
    }

    @Override  // javassist.compiler.ast.x
    public void l(m m0) throws c {
        String s = this.e0(m0, this.K0(m0.s()));
        this.a.H(s);
        this.i = 301;
        this.j = 0;
    }

    private void l0(int v, int v1) throws c {
        if(!b.F0(v) && v1 <= 0) {
            switch(v) {
                case 301: {
                    this.a.V("java.lang.String", "valueOf", "(Z)Ljava/lang/String;");
                    return;
                }
                case 306: {
                    this.a.V("java.lang.String", "valueOf", "(C)Ljava/lang/String;");
                    return;
                }
                case 312: {
                    this.a.V("java.lang.String", "valueOf", "(D)Ljava/lang/String;");
                    return;
                }
                case 317: {
                    this.a.V("java.lang.String", "valueOf", "(F)Ljava/lang/String;");
                    return;
                }
                case 326: {
                    this.a.V("java.lang.String", "valueOf", "(J)Ljava/lang/String;");
                    return;
                }
                case 344: {
                    throw new c("void type expression");
                }
                default: {
                    this.a.V("java.lang.String", "valueOf", "(I)Ljava/lang/String;");
                    return;
                }
            }
        }
        this.a.V("java.lang.String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;");
    }

    @Override  // javassist.compiler.ast.x
    public void m(n n0) throws c {
        this.j = 0;
        long v = n0.j();
        int v1 = n0.k();
        if(v1 != 401 && v1 != 402) {
            this.i = 326;
            this.a.d0(v);
            return;
        }
        this.i = v1 == 402 ? 324 : 306;
        this.a.E(((int)v));
    }

    private void m0(int v, int v1, k k0) throws c {
        int v5;
        boolean z;
        int v4;
        int v2 = b.Q0(v);
        int v3 = b.Q0(v1);
        if(v3 < 0 && v2 < 0) {
            return;
        }
        if(v3 < 0 || v2 < 0) {
            b.c0(k0);
        }
        if(v2 <= v3) {
            this.i = v;
            v4 = b.x[v3 * 4 + v2];
            z = false;
            v5 = v2;
        }
        else {
            v4 = b.x[v2 * 4 + v3];
            v5 = v3;
            z = true;
        }
        if(z) {
            if(v5 != 0 && v5 != 2) {
                if(v5 == 1) {
                    if(v2 == 2) {
                        this.a.s0(91);
                        this.a.s0(87);
                    }
                    else {
                        this.a.s0(0x5F);
                    }
                    this.a.s0(v4);
                    this.a.s0(0x5F);
                    return;
                }
                b.o0();
                return;
            }
            if(v2 == 0 || v2 == 2) {
                this.a.s0(94);
            }
            else {
                this.a.s0(93);
            }
            this.a.s0(88);
            this.a.s0(v4);
            this.a.s0(94);
            this.a.s0(88);
            return;
        }
        if(v4 != 0) {
            this.a.s0(v4);
        }
    }

    @Override  // javassist.compiler.ast.x
    public void n(o o0) throws c {
        this.j = 0;
        int v = o0.g();
        if(v != 0x150 && v != 339) {
            switch(v) {
                case 410: {
                    this.a.E(1);
                    this.i = 301;
                    return;
                }
                case 411: {
                    this.a.E(0);
                    this.i = 301;
                    return;
                }
                case 412: {
                    this.a.s0(1);
                    this.i = 412;
                    return;
                }
                default: {
                    b.o0();
                    return;
                }
            }
        }
        if(this.e) {
            throw new c("not-available: " + (v == 339 ? "this" : "super"));
        }
        this.a.k(0);
        this.i = 307;
        if(v == 339) {
            this.k = this.x0();
            return;
        }
        this.k = this.v0();
    }

    public void n0(javassist.compiler.ast.b b0) throws c {
        r r0 = this.c;
        if(r0 != null) {
            b0.a(r0);
        }
    }

    @Override  // javassist.compiler.ast.x
    public abstract void o(p arg1) throws c;

    protected static void o0() throws c {
        throw new c("fatal");
    }

    @Override  // javassist.compiler.ast.x
    public void p(javassist.compiler.ast.q q0) throws c {
        a a0 = q0.s();
        boolean z = true;
        this.M0(1);
        while(a0 != null) {
            o o0 = (o)a0.i();
            a0 = a0.q();
            if(o0.g() == 0x14F) {
                this.M0(0);
                this.e = true;
            }
        }
        for(a a1 = q0.u(); a1 != null; a1 = a1.q()) {
            this.h(((i)a1.i()));
        }
        t t0 = q0.r();
        boolean z1 = q0.y();
        if(q0.w().A() != 344) {
            z = false;
        }
        this.M(t0, z1, z);
    }

    protected static int p0(int v, int v1) {
        if(v1 > 0) {
            return 50;
        }
        switch(v) {
            case 301: 
            case 303: {
                return 51;
            }
            case 306: {
                return 52;
            }
            case 312: {
                return 49;
            }
            case 317: {
                return 0x30;
            }
            case 324: {
                return 46;
            }
            case 326: {
                return 0x2F;
            }
            case 334: {
                return 53;
            }
            default: {
                return 50;
            }
        }
    }

    @Override  // javassist.compiler.ast.x
    public abstract void q(javassist.compiler.ast.r arg1) throws c;

    protected static int q0(int v, int v1) {
        if(v1 > 0) {
            return 83;
        }
        switch(v) {
            case 301: 
            case 303: {
                return 84;
            }
            case 306: {
                return 85;
            }
            case 312: {
                return 82;
            }
            case 317: {
                return 81;
            }
            case 324: {
                return 0x4F;
            }
            case 326: {
                return 80;
            }
            case 334: {
                return 86;
            }
            default: {
                return 83;
            }
        }
    }

    @Override  // javassist.compiler.ast.x
    public void r(s s0) throws c {
        b.o0();
    }

    static int r0(javassist.compiler.ast.b b0) throws c {
        if(b0 instanceof k) {
            int v = ((k)b0).r();
            if(v == 33) {
                return 33;
            }
            return !(((k)b0) instanceof e) || (v == 38 || v == 0x7C || v == 0x170 || v == 369) ? v : 358;
        }
        return 0x20;
    }

    @Override  // javassist.compiler.ast.x
    public void s(t t0) throws c {
        if(t0 == null) {
            return;
        }
        int v = t0.r();
        boolean z = false;
        if(v == 69) {
            javassist.compiler.ast.b b0 = t0.b();
            this.n0(b0);
            if(b0 instanceof d) {
                this.D(((d)b0), false);
                return;
            }
            if(b.E0(b0)) {
                this.O(((k)b0).r(), ((k)b0).w(), ((k)b0), false);
                return;
            }
            b0.a(this);
            if(b.B0(this.i, this.j)) {
                this.a.s0(88);
                return;
            }
            if(this.i != 344) {
                this.a.s0(87);
            }
        }
        else {
            switch(v) {
                case 66: 
                case 68: {
                    break;
                }
                case 302: 
                case 309: {
                    if(v == 302) {
                        z = true;
                    }
                    this.E(t0, z);
                    return;
                }
                case 318: {
                    this.K(t0);
                    return;
                }
                case 320: {
                    this.L(t0);
                    return;
                }
                case 333: {
                    this.Q(t0);
                    return;
                }
                case 337: {
                    this.U(t0);
                    return;
                }
                case 338: {
                    this.V(t0);
                    return;
                }
                case 340: {
                    this.W(t0);
                    return;
                }
                case 343: {
                    this.X(t0);
                    return;
                }
                case 311: 
                case 346: {
                    if(v == 346) {
                        z = true;
                    }
                    this.Z(t0, z);
                    return;
                }
                default: {
                    this.d = false;
                    throw new c("sorry, not supported statement: TokenId " + v);
                }
            }
            while(t0 != null) {
                javassist.compiler.ast.b b1 = t0.i();
                t0 = t0.q();
                if(b1 != null) {
                    b1.a(this);
                }
            }
        }
    }

    private static int s0(List list0) {
        return list0 == null ? 0 : list0.size();
    }

    @Override  // javassist.compiler.ast.x
    public void t(u u0) throws c {
        this.i = 307;
        this.j = 0;
        this.k = "java/lang/String";
        this.a.f0(u0.g());
    }

    protected int t0(i i0) {
        int v = i0.z();
        if(v < 0) {
            v = this.u0();
            i0.E(v);
            this.y0(1);
        }
        return v;
    }

    @Override  // javassist.compiler.ast.x
    public void u(v v0) throws c {
        b.o0();
    }

    public int u0() {
        return this.a.H0();
    }

    @Override  // javassist.compiler.ast.x
    public void v(w w0) throws c {
        i i0 = w0.h();
        this.i = i0.A();
        this.j = i0.w();
        this.k = i0.x();
        int v = this.t0(i0);
        if(this.j > 0) {
            this.a.k(v);
            return;
        }
        switch(this.i) {
            case 307: {
                this.a.k(v);
                return;
            }
            case 312: {
                this.a.s(v);
                return;
            }
            case 317: {
                this.a.y(v);
                return;
            }
            case 326: {
                this.a.i0(v);
                return;
            }
            default: {
                this.a.F(v);
            }
        }
    }

    protected abstract String v0() throws c;

    protected void w(javassist.compiler.ast.b b0, javassist.compiler.ast.b b1) throws c {
        b0.a(this);
        int v = this.i;
        int v1 = this.j;
        if(v1 == 0) {
            throw new c("bad array access");
        }
        String s = this.k;
        b1.a(this);
        if(b.Q0(this.i) != 3 || this.j > 0) {
            throw new c("bad array index");
        }
        this.i = v;
        this.j = v1 - 1;
        this.k = s;
    }

    protected int w0() {
        if(this.b < 0) {
            this.b = this.u0();
            this.y0(2);
        }
        return this.b;
    }

    private void x(k k0, int v, int v1, int v2) throws c {
        if(this.j != 0) {
            b.c0(k0);
        }
        int v3 = this.i;
        if(v != 364 && v != 366 && v != 370) {
            this.m0(v2, v3, k0);
        }
        else if(v3 == 303 || v3 == 306 || v3 == 324 || v3 == 334) {
            this.i = v2;
        }
        else {
            b.c0(k0);
        }
        int v4 = b.Q0(this.i);
        if(v4 >= 0) {
            int v5 = b.p[v1 + v4 + 1];
            if(v5 != 0) {
                if(v4 == 3 && this.i != 301) {
                    this.i = 324;
                }
                this.a.s0(v5);
                return;
            }
        }
        b.c0(k0);
    }

    protected abstract String x0();

    private void y(k k0, int v, k k1, javassist.compiler.ast.b b0, boolean z) throws c {
        this.w(k1.w(), k1.x());
        if(v != 61) {
            this.a.s0(92);
            this.a.s0(b.p0(this.i, this.j));
        }
        int v1 = this.i;
        int v2 = this.j;
        String s = this.k;
        this.C(k0, v, b0, v1, v2, s);
        if(z) {
            if(b.B0(v1, v2)) {
                this.a.s0(94);
            }
            else {
                this.a.s0(91);
            }
        }
        this.a.s0(b.q0(v1, v2));
        this.i = v1;
        this.j = v2;
        this.k = s;
    }

    protected void y0(int v) {
        this.a.L0(v);
    }

    public void z(int v, boolean z, k k0, boolean z1) throws c {
        this.w(k0.w(), k0.x());
        int v1 = this.i;
        int v2 = this.j;
        if(v2 > 0) {
            b.b0(k0);
        }
        this.a.s0(92);
        this.a.s0(b.p0(v1, this.j));
        this.P((b.B0(v1, v2) ? 94 : 91), z1, v, z, k0);
        this.a.s0(b.q0(v1, v2));
    }

    protected abstract void z0() throws c;
}

