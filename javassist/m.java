package javassist;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javassist.bytecode.G;
import javassist.bytecode.T;
import javassist.bytecode.annotation.b;
import javassist.bytecode.c;
import javassist.bytecode.e0;
import javassist.bytecode.e;
import javassist.bytecode.f0;
import javassist.bytecode.j;
import javassist.bytecode.k;
import javassist.bytecode.t;
import javassist.bytecode.u;
import javassist.bytecode.w;
import javassist.bytecode.z;
import javassist.compiler.a;

class m extends l {
    private boolean A;
    private int B;
    private static final int C = 2;
    g o;
    boolean p;
    private boolean q;
    boolean r;
    boolean s;
    k t;
    byte[] u;
    private Reference v;
    private a w;
    private y x;
    private Map y;
    private int z;

    m(InputStream inputStream0, g g0) throws IOException {
        this(null, g0);
        k k0 = new k(new DataInputStream(inputStream0));
        this.t = k0;
        this.a = k0.t();
    }

    m(String s, g g0) {
        super(s);
        this.A = g.h;
        this.o = g0;
        this.s = false;
        this.r = false;
        this.q = false;
        this.p = false;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = 0;
        this.B = 0;
    }

    m(k k0, g g0) {
        this(null, g0);
        this.t = k0;
        this.a = k0.t();
    }

    @Override  // javassist.l
    public javassist.k[] A() {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0.v();
        p p1 = p$a0.y();
        p p2 = p$a0;
        p p3 = p$a0.A();
        javassist.k[] arr_k = new javassist.k[javassist.p.a.w(p0, p1) + javassist.p.a.w(p2, p3)];
        int v;
        for(v = 0; p0 != p1; ++v) {
            p0 = p0.n();
            arr_k[v] = (javassist.k)p0;
        }
        while(p2 != p3) {
            p2 = p2.n();
            arr_k[v] = (javassist.k)p2;
            ++v;
        }
        return arr_k;
    }

    @Override  // javassist.l
    public void A0(String s, String s1) throws RuntimeException {
        if(this.X().equals(s)) {
            this.G0(s1);
            return;
        }
        super.A0(s, s1);
        this.u().J(s, s1);
        this.u1();
    }

    private static Object A1(javassist.bytecode.annotation.a a0, g g0) throws ClassNotFoundException {
        try {
            return a0.h(g0.L(), g0);
        }
        catch(ClassNotFoundException unused_ex) {
            ClassLoader classLoader0 = g0.getClass().getClassLoader();
            try {
                return a0.h(classLoader0, g0);
            }
            catch(ClassNotFoundException unused_ex) {
                try {
                    Class class0 = g0.s(a0.g()).N0();
                    return b.g(class0.getClassLoader(), class0, g0, a0);
                }
                catch(Throwable unused_ex) {
                    throw new ClassNotFoundException(a0.g());
                }
            }
        }
    }

    @Override  // javassist.l
    public void B0(d d0) throws RuntimeException {
        String s = this.X();
        String s1 = d0.c(w.B(s));
        if(s1 != null) {
            s1 = w.A(s1);
            this.o.j(s1);
        }
        super.B0(d0);
        this.u().K(d0);
        this.u1();
        if(s1 != null) {
            super.G0(s1);
            this.o.k(s, this);
        }
    }

    static Object[] B1(boolean z, g g0, c c0, c c1) throws ClassNotFoundException {
        int v2;
        int v1;
        javassist.bytecode.annotation.a[] arr_a1;
        javassist.bytecode.annotation.a[] arr_a = null;
        int v = 0;
        if(c0 == null) {
            arr_a1 = null;
            v1 = 0;
        }
        else {
            arr_a1 = c0.v();
            v1 = arr_a1.length;
        }
        if(c1 == null) {
            v2 = 0;
        }
        else {
            arr_a = c1.v();
            v2 = arr_a.length;
        }
        if(!z) {
            Object[] arr_object = new Object[v1 + v2];
            for(int v3 = 0; v3 < v1; ++v3) {
                arr_object[v3] = m.A1(arr_a1[v3], g0);
            }
            while(v < v2) {
                arr_object[v + v1] = m.A1(arr_a[v], g0);
                ++v;
            }
            return arr_object;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v4 = 0; v4 < v1; ++v4) {
            try {
                arrayList0.add(m.A1(arr_a1[v4], g0));
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        while(v < v2) {
            try {
                arrayList0.add(m.A1(arr_a[v], g0));
            }
            catch(ClassNotFoundException unused_ex) {
            }
            ++v;
        }
        return arrayList0.toArray();
    }

    @Override  // javassist.l
    public void C0(String s, byte[] arr_b) {
        this.g();
        k k0 = this.u();
        k0.a(new javassist.bytecode.d(k0.l(), s, arr_b));
    }

    static Object[][] C1(boolean z, g g0, e0 e00, e0 e01, T t0) throws ClassNotFoundException {
        int v3;
        int v2;
        javassist.bytecode.annotation.a[] arr_a1;
        int v;
        if(e00 == null) {
            v = e01 == null ? w.m(t0.h()) : e01.u();
        }
        else {
            v = e00.u();
        }
        Object[][] arr2_object = new Object[v][];
        for(int v1 = 0; true; ++v1) {
            javassist.bytecode.annotation.a[] arr_a = null;
            if(v1 >= v) {
                break;
            }
            if(e00 == null) {
                arr_a1 = null;
                v2 = 0;
            }
            else {
                arr_a1 = e00.t()[v1];
                v2 = arr_a1.length;
            }
            if(e01 == null) {
                v3 = 0;
            }
            else {
                arr_a = e01.t()[v1];
                v3 = arr_a.length;
            }
            if(z) {
                ArrayList arrayList0 = new ArrayList();
                for(int v6 = 0; v6 < v2; ++v6) {
                    try {
                        arrayList0.add(m.A1(arr_a1[v6], g0));
                    }
                    catch(ClassNotFoundException unused_ex) {
                    }
                }
                for(int v7 = 0; v7 < v3; ++v7) {
                    try {
                        arrayList0.add(m.A1(arr_a[v7], g0));
                    }
                    catch(ClassNotFoundException unused_ex) {
                    }
                }
                arr2_object[v1] = arrayList0.toArray();
            }
            else {
                arr2_object[v1] = new Object[v2 + v3];
                for(int v4 = 0; v4 < v2; ++v4) {
                    Object[] arr_object = arr2_object[v1];
                    arr_object[v4] = m.A1(arr_a1[v4], g0);
                }
                for(int v5 = 0; v5 < v3; ++v5) {
                    Object[] arr_object1 = arr2_object[v1];
                    arr_object1[v5 + v2] = m.A1(arr_a[v5], g0);
                }
            }
        }
        return arr2_object;
    }

    @Override  // javassist.l
    public n[] D() {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0.v();
        p p1 = p$a0.y();
        int v = 0;
        p p2 = p0;
        int v1 = 0;
        while(p2 != p1) {
            p2 = p2.n();
            if(((n)p2).f0()) {
                ++v1;
            }
        }
        n[] arr_n = new n[v1];
        while(p0 != p1) {
            p0 = p0.n();
            n n0 = (n)p0;
            if(n0.f0()) {
                arr_n[v] = n0;
                ++v;
            }
        }
        return arr_n;
    }

    @Override  // javassist.l
    public void D0(String s) {
        k k0 = this.t();
        k0.a(new f0(k0.l(), s));
    }

    private static void D1(int v, String s, l l0, boolean z) {
        G g0 = (G)l0.u().j("InnerClasses");
        if(g0 != null) {
            int v1 = g0.w(s);
            if(v1 >= 0) {
                int v2 = g0.t(v1);
                if((v2 & 8) != 0 || !D.l(v)) {
                    l0.g();
                    g0.E(v1, v & -9 | v2 & 8);
                    String s1 = g0.B(v1);
                    if(s1 != null && z) {
                        try {
                            m.D1(v & -9, s, l0.w().s(s1), false);
                            return;
                        }
                        catch(E unused_ex) {
                            throw new RuntimeException("cannot find the declaring class: " + s1);
                        }
                    }
                    return;
                }
            }
        }
        if(D.l(v)) {
            throw new RuntimeException("cannot change " + w.A(s) + " into a static class");
        }
    }

    @Override  // javassist.l
    public o E(String s) throws E {
        return this.F(s, null);
    }

    @Override  // javassist.l
    public void E0(l[] arr_l) {
        String[] arr_s;
        this.g();
        if(arr_l == null) {
            arr_s = new String[0];
        }
        else {
            String[] arr_s1 = new String[arr_l.length];
            for(int v = 0; v < arr_l.length; ++v) {
                arr_s1[v] = arr_l[v].X();
            }
            arr_s = arr_s1;
        }
        this.u().M(arr_s);
    }

    @Override  // javassist.l
    public o F(String s, String s1) throws E {
        return this.U0(this.b1(s, s1), s, s1);
    }

    @Override  // javassist.l
    public void F0(int v) {
        this.g();
        m.D1(v, this.X(), this, true);
        this.u().L(v & -9);
    }

    @Override  // javassist.l
    public o[] G() {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0.x();
        p p1 = p$a0.z();
        o[] arr_o = new o[javassist.p.a.w(p0, p1)];
        for(int v = 0; p0 != p1; ++v) {
            p0 = p0.n();
            arr_o[v] = (o)p0;
        }
        return arr_o;
    }

    @Override  // javassist.l
    public void G0(String s) throws RuntimeException {
        String s1 = this.X();
        if(s.equals(s1)) {
            return;
        }
        this.o.j(s);
        k k0 = this.u();
        super.G0(s);
        k0.P(s);
        this.u1();
        this.o.k(s1, this);
    }

    @Override  // javassist.l
    public q H(String s) throws E {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0;
        p p1 = p$a0.A();
        while(p0 != p1) {
            p0 = p0.n();
            if(p0.i().equals(s)) {
                return (q)p0;
            }
            if(false) {
                break;
            }
        }
        throw new E(s + "(..) is not found in " + this.X());
    }

    @Override  // javassist.l
    public void H0(l l0) throws javassist.b {
        this.g();
        if(this.n0()) {
            this.e(l0);
            return;
        }
        this.u().Q(l0.X());
    }

    @Override  // javassist.l
    public q I(String s, l[] arr_l) throws E {
        String s1 = w.r(arr_l);
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0;
        p p1 = p$a0.A();
        while(p0 != p1) {
            p0 = p0.n();
            if(p0.i().equals(s) && ((q)p0).D().h().startsWith(s1)) {
                return (q)p0;
            }
            if(false) {
                break;
            }
        }
        throw new E(s + "(..) is not found in " + this.X());
    }

    @Override  // javassist.l
    public boolean I0(boolean z) {
        boolean z1 = !this.A;
        this.A = !z;
        return z1;
    }

    @Override  // javassist.l
    public q[] J() {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0;
        p p1 = p$a0.A();
        ArrayList arrayList0 = new ArrayList();
        while(p0 != p1) {
            p0 = p0.n();
            arrayList0.add(p0);
        }
        return (q[])arrayList0.toArray(new q[arrayList0.size()]);
    }

    @Override  // javassist.l
    public boolean J0(l l0) {
        if(l0 == null) {
            return false;
        }
        String s = l0.X();
        l l1 = this;
        while(l1 != null) {
            try {
                if(l1.X().equals(s)) {
                    return true;
                }
                l1 = l1.c0();
                continue;
            }
            catch(Exception unused_ex) {
            }
            break;
        }
        return false;
    }

    @Override  // javassist.l
    public q[] K(String s) throws E {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0;
        p p1 = p$a0.A();
        ArrayList arrayList0 = new ArrayList();
        while(p0 != p1) {
            p0 = p0.n();
            if(p0.i().equals(s)) {
                arrayList0.add(p0);
            }
        }
        return (q[])arrayList0.toArray(new q[arrayList0.size()]);
    }

    @Override  // javassist.l
    public boolean K0(l l0) throws E {
        String s = l0.X();
        if(this != l0 && !this.X().equals(s)) {
            k k0 = this.u();
            String s1 = k0.y();
            if(s1 != null && s1.equals(s)) {
                return true;
            }
            String[] arr_s = k0.o();
            for(int v = 0; v < arr_s.length; ++v) {
                if(arr_s[v].equals(s)) {
                    return true;
                }
            }
            if(s1 != null && this.o.s(s1).K0(l0)) {
                return true;
            }
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(this.o.s(arr_s[v1]).K0(l0)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override  // javassist.l
    public l L() throws E {
        k k0 = this.u();
        G g0 = (G)k0.j("InnerClasses");
        if(g0 == null) {
            return null;
        }
        String s = this.X();
        int v = g0.I();
        for(int v1 = 0; v1 < v; ++v1) {
            if(s.equals(g0.x(v1))) {
                String s1 = g0.B(v1);
                if(s1 != null) {
                    return this.o.s(s1);
                }
                z z0 = (z)k0.j("EnclosingMethod");
                if(z0 != null) {
                    return this.o.s(z0.u());
                }
            }
        }
        return null;
    }

    @Override  // javassist.l
    public void L0(DataOutputStream dataOutputStream0) throws javassist.b, IOException {
        try {
            if(this.o0()) {
                this.V0("toBytecode");
                k k0 = this.u();
                if(this.s) {
                    k0.g();
                    this.s = false;
                }
                this.r1(k0);
                this.t1(k0);
                if(l.b != null) {
                    this.W0(k0);
                }
                k0.U(dataOutputStream0);
                dataOutputStream0.flush();
                this.x = null;
                if(this.A) {
                    k0.G();
                    this.r = true;
                }
            }
            else {
                this.o.o2(this.X(), dataOutputStream0);
            }
            this.B = 0;
            this.q = true;
            return;
        }
        catch(E e0) {
        }
        catch(IOException iOException0) {
            throw new javassist.b(iOException0);
        }
        throw new javassist.b(e0);
    }

    @Override  // javassist.l
    public javassist.k M() throws E {
        z z0 = (z)this.u().j("EnclosingMethod");
        if(z0 == null) {
            return null;
        }
        l l0 = this.o.s(z0.u());
        String s = z0.x();
        if("<init>".equals(s)) {
            return l0.y(z0.v());
        }
        return "<clinit>".equals(s) ? l0.v() : l0.U(s, z0.v());
    }

    @Override  // javassist.l
    public o P(String s, String s1) throws E {
        return this.U0(this.Q(s, s1), s, s1);
    }

    @Override  // javassist.l
    o Q(String s, String s1) {
        o o0 = this.b1(s, s1);
        if(o0 != null) {
            return o0;
        }
        try {
            l[] arr_l = this.T();
            for(int v = 0; v < arr_l.length; ++v) {
                o o1 = arr_l[v].Q(s, s1);
                if(o1 != null) {
                    return o1;
                }
            }
            l l0 = this.c0();
            return l0 == null ? null : l0.Q(s, s1);
        }
        catch(E unused_ex) {
        }
        return null;
    }

    @Override  // javassist.l
    public o[] R() {
        ArrayList arrayList0 = new ArrayList();
        m.c1(arrayList0, this);
        return (o[])arrayList0.toArray(new o[arrayList0.size()]);
    }

    @Override  // javassist.l
    public String S() {
        f0 f00 = (f0)this.u().j("Signature");
        return f00 == null ? null : f00.v();
    }

    @Override  // javassist.l
    public l[] T() throws E {
        String[] arr_s = this.u().o();
        l[] arr_l = new l[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            arr_l[v] = this.o.s(arr_s[v]);
        }
        return arr_l;
    }

    @Override  // javassist.l
    public q U(String s, String s1) throws E {
        q q0 = m.f1(this, s, s1);
        if(q0 == null) {
            throw new E(s + "(..) is not found in " + this.X());
        }
        return q0;
    }

    private o U0(o o0, String s, String s1) throws E {
        if(o0 == null) {
            throw new E((s1 == null ? "field: " + s : "field: " + s + " type " + s1) + " in " + this.X());
        }
        return o0;
    }

    @Override  // javassist.l
    public q[] V() {
        HashMap hashMap0 = new HashMap();
        m.g1(hashMap0, this);
        return (q[])hashMap0.values().toArray(new q[hashMap0.size()]);
    }

    private void V0(String s) {
        if(this.r) {
            throw new RuntimeException(s + "(): " + this.X() + " was pruned.");
        }
    }

    @Override  // javassist.l
    public int W() {
        k k0 = this.u();
        int v = javassist.bytecode.a.a(k0.i(), 0x20);
        int v1 = k0.n();
        if(v1 != -1) {
            if((v1 & 8) != 0) {
                v |= 8;
            }
            if((v1 & 1) != 0) {
                return v | 1;
            }
            v &= -2;
            if((v1 & 4) != 0) {
                return v | 4;
            }
            return (v1 & 2) == 0 ? v : v | 2;
        }
        return v;
    }

    private void W0(k k0) throws IOException {
        try(DataOutputStream dataOutputStream0 = this.s0(l.b)) {
            k0.U(dataOutputStream0);
        }
    }

    private void X0(StringBuffer stringBuffer0, String s, p p0, p p1) {
        stringBuffer0.append(s);
        while(p0 != p1) {
            p0 = p0.n();
            stringBuffer0.append(p0);
            stringBuffer0.append(", ");
        }
    }

    @Override  // javassist.l
    public l[] Y() throws E {
        k k0 = this.u();
        G g0 = (G)k0.j("InnerClasses");
        if(g0 == null) {
            return new l[0];
        }
        String s = k0.t() + "$";
        int v1 = g0.I();
        ArrayList arrayList0 = new ArrayList(v1);
        for(int v = 0; v < v1; ++v) {
            String s1 = g0.x(v);
            if(s1 != null && s1.startsWith(s) && s1.lastIndexOf(36) < s.length()) {
                arrayList0.add(this.o.s(s1));
            }
        }
        return (l[])arrayList0.toArray(new l[arrayList0.size()]);
    }

    static Object Y0(Class class0, g g0, c c0, c c1) throws ClassNotFoundException {
        javassist.bytecode.annotation.a[] arr_a = c0 == null ? null : c0.v();
        javassist.bytecode.annotation.a[] arr_a1 = c1 == null ? null : c1.v();
        String s = class0.getName();
        if(arr_a != null) {
            for(int v1 = 0; v1 < arr_a.length; ++v1) {
                if(arr_a[v1].g().equals(s)) {
                    return m.A1(arr_a[v1], g0);
                }
            }
        }
        if(arr_a1 != null) {
            for(int v = 0; v < arr_a1.length; ++v) {
                if(arr_a1[v].g().equals(s)) {
                    return m.A1(arr_a1[v], g0);
                }
            }
        }
        return null;
    }

    private Object[] Z0(boolean z) throws ClassNotFoundException {
        k k0 = this.u();
        return m.B1(z, this.w(), ((c)k0.j("RuntimeInvisibleAnnotations")), ((c)k0.j("RuntimeVisibleAnnotations")));
    }

    @Override  // javassist.l
    public void a(n n0) throws javassist.b {
        this.g();
        if(n0.f() != this) {
            throw new javassist.b("cannot add");
        }
        this.e1().s(n0);
        this.u().e(n0.D());
    }

    public k a1(boolean z) {
        k k3;
        Throwable throwable1;
        IOException iOException2;
        E e1;
        InputStream inputStream1;
        k k0 = this.t;
        if(k0 != null) {
            return k0;
        }
        if(z) {
            this.o.o();
        }
        InputStream inputStream0 = null;
        if(this.u != null) {
            try {
                k k1 = new k(new DataInputStream(new ByteArrayInputStream(this.u)));
                this.u = null;
                this.B = 2;
                return this.y1(k1);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0.toString(), iOException0);
            }
        }
        try {
            inputStream0 = this.o.l1(this.X());
            if(inputStream0 == null) {
                throw new E(this.X());
            }
            inputStream1 = new BufferedInputStream(inputStream0);
        }
        catch(E e0) {
            e1 = e0;
            inputStream1 = inputStream0;
            throw new RuntimeException(e1.toString(), e1);
        }
        catch(IOException iOException1) {
            iOException2 = iOException1;
            inputStream1 = inputStream0;
            throw new RuntimeException(iOException2.toString(), iOException2);
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            inputStream1 = inputStream0;
            goto label_40;
        }
        try {
            try {
                k k2 = new k(new DataInputStream(inputStream1));
                if(!k2.t().equals(this.a)) {
                    throw new RuntimeException("cannot find " + this.a + ": " + k2.t() + " found in " + this.a.replace('.', '/') + ".class");
                }
                k3 = this.y1(k2);
                goto label_43;
            }
            catch(E e1) {
                throw new RuntimeException(e1.toString(), e1);
            }
            catch(IOException iOException2) {
            }
            throw new RuntimeException(iOException2.toString(), iOException2);
        }
        catch(Throwable throwable1) {
        }
    label_40:
        if(inputStream1 != null) {
            try {
                inputStream1.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable1;
        try {
        label_43:
            inputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        return k3;
    }

    private o b1(String s, String s1) {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0.x();
        p p1 = p$a0.z();
        while(p0 != p1) {
            p0 = p0.n();
            if(p0.i().equals(s) && (s1 == null || s1.equals(p0.j()))) {
                return (o)p0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // javassist.l
    public void c(o o0, String s) throws javassist.b {
        this.d(o0, f.e(s));
    }

    @Override  // javassist.l
    public l c0() throws E {
        String s = this.u().y();
        return s == null ? null : this.o.s(s);
    }

    private static void c1(List list0, l l0) {
        if(l0 == null) {
            return;
        }
        try {
            m.c1(list0, l0.c0());
        }
        catch(E unused_ex) {
        }
        try {
            l[] arr_l = l0.T();
            for(int v = 0; v < arr_l.length; ++v) {
                m.c1(list0, arr_l[v]);
            }
        }
        catch(E unused_ex) {
        }
        javassist.p.a p$a0 = ((m)l0).e1();
        p p0 = p$a0.x();
        p p1 = p$a0.z();
        while(p0 != p1) {
            p0 = p0.n();
            if(!D.i(p0.h())) {
                list0.add(p0);
            }
        }
    }

    @Override  // javassist.l
    public void d(o o0, f o$f0) throws javassist.b {
        this.g();
        if(o0.f() != this) {
            throw new javassist.b("cannot add");
        }
        if(o$f0 == null) {
            o$f0 = o0.w();
        }
        if(o$f0 != null) {
            o$f0.n(o0.j());
            int v = o0.h();
            if(D.l(v) && D.e(v)) {
                try {
                    t t0 = this.u().l();
                    int v1 = o$f0.w(t0, o0.y());
                    if(v1 != 0) {
                        o0.v().a(new u(t0, v1));
                        o$f0 = null;
                    }
                }
                catch(E unused_ex) {
                }
            }
        }
        this.e1().t(o0);
        this.u().b(o0.v());
        if(o$f0 != null) {
            y y0 = new y(o0, o$f0);
            y y1 = this.x;
            if(y1 == null) {
                this.x = y0;
                return;
            }
            y y2;
            while((y2 = y1.a) != null) {
                y1 = y2;
            }
            y1.a = y0;
        }
    }

    @Override  // javassist.l
    public URL d0() throws E {
        URL uRL0 = this.o.q(this.X());
        if(uRL0 == null) {
            throw new E(this.X());
        }
        return uRL0;
    }

    Map d1() {
        if(this.y == null) {
            this.y = new Hashtable();
        }
        return this.y;
    }

    @Override  // javassist.l
    public void e(l l0) {
        this.g();
        if(l0 != null) {
            this.u().d(l0.X());
        }
    }

    protected javassist.p.a e1() {
        javassist.p.a p$a0;
        synchronized(this) {
            Reference reference0 = this.v;
            if(reference0 == null) {
            label_6:
                p$a0 = new javassist.p.a(this);
                this.o1(p$a0);
                this.n1(p$a0);
                this.v = new WeakReference(p$a0);
            }
            else {
                p$a0 = (javassist.p.a)reference0.get();
                if(p$a0 == null) {
                    goto label_6;
                }
            }
            return p$a0;
        }
    }

    @Override  // javassist.l
    public void f(q q0) throws javassist.b {
        this.g();
        if(q0.f() != this) {
            throw new javassist.b("bad declaring class");
        }
        int v = q0.h();
        if((this.W() & 0x200) != 0) {
            if(D.j(v) || D.i(v)) {
                throw new javassist.b("an interface method must be public: " + q0.toString());
            }
            q0.q(v | 1);
        }
        this.e1().u(q0);
        this.u().e(q0.D());
        if((v & 0x400) != 0) {
            this.F0(this.W() | 0x400);
        }
    }

    @Override  // javassist.l
    public boolean f0(String s) {
        k k0 = this.u();
        return m.j1(s, this.w(), ((c)k0.j("RuntimeInvisibleAnnotations")), ((c)k0.j("RuntimeVisibleAnnotations")));
    }

    private static q f1(l l0, String s, String s1) {
        if(l0 instanceof m) {
            javassist.p.a p$a0 = ((m)l0).e1();
            p p0 = p$a0;
            p p1 = p$a0.A();
            while(p0 != p1) {
                p0 = p0.n();
                if(p0.i().equals(s) && ((q)p0).D().h().equals(s1)) {
                    return (q)p0;
                }
                if(false) {
                    break;
                }
            }
        }
        try {
            l l1 = l0.c0();
            if(l1 != null) {
                q q0 = m.f1(l1, s, s1);
                if(q0 != null) {
                    return q0;
                }
            }
            goto label_14;
        }
        catch(E unused_ex) {
            try {
            label_14:
                l[] arr_l = l0.T();
                for(int v = 0; v < arr_l.length; ++v) {
                    q q1 = m.f1(arr_l[v], s, s1);
                    if(q1 != null) {
                        return q1;
                    }
                }
            }
            catch(E unused_ex) {
            }
            return null;
        }
    }

    @Override  // javassist.l
    void g() throws RuntimeException {
        if(this.m0()) {
            throw new RuntimeException((this.r ? this.X() + " class is frozen" + " and pruned" : this.X() + " class is frozen"));
        }
        this.p = true;
    }

    @Override  // javassist.l
    final void g0() {
        ++this.B;
    }

    private static void g1(Map map0, l l0) {
        try {
            l[] arr_l = l0.T();
            for(int v = 0; v < arr_l.length; ++v) {
                m.g1(map0, arr_l[v]);
            }
        }
        catch(E unused_ex) {
        }
        try {
            l l1 = l0.c0();
            if(l1 != null) {
                m.g1(map0, l1);
            }
        }
        catch(E unused_ex) {
        }
        if(l0 instanceof m) {
            javassist.p.a p$a0 = ((m)l0).e1();
            p p0 = p$a0;
            p p1 = p$a0.A();
            while(p0 != p1) {
                p0 = p0.n();
                if(!D.i(p0.h())) {
                    map0.put(((q)p0).c0(), p0);
                }
            }
        }
    }

    @Override  // javassist.l
    void h() {
        if(this.B < 2) {
            if(!this.o0() && g.j) {
                this.w1();
            }
            else if(this.m0() && !this.r) {
                this.x1();
            }
        }
        this.B = 0;
    }

    @Override  // javassist.l
    public void h0(i i0) throws javassist.b {
        this.g();
        k k0 = this.u();
        t t0 = k0.l();
        List list0 = k0.r();
        T[] arr_t = (T[])list0.toArray(new T[list0.size()]);
        for(int v = 0; v < arr_t.length; ++v) {
            i0.a(this, arr_t[v], t0);
        }
    }

    int h1() {
        int v = this.z;
        this.z = v + 1;
        return v;
    }

    @Override  // javassist.l
    public void i0(javassist.expr.d d0) throws javassist.b {
        this.g();
        List list0 = this.u().r();
        T[] arr_t = (T[])list0.toArray(new T[list0.size()]);
        for(int v = 0; v < arr_t.length; ++v) {
            d0.a(this, arr_t[v]);
        }
    }

    @Deprecated
    static boolean i1(Class class0, g g0, c c0, c c1) {
        return m.j1(class0.getName(), g0, c0, c1);
    }

    @Override  // javassist.l
    public boolean j0() {
        return D.c(this.W());
    }

    static boolean j1(String s, g g0, c c0, c c1) {
        javassist.bytecode.annotation.a[] arr_a = null;
        javassist.bytecode.annotation.a[] arr_a1 = c0 == null ? null : c0.v();
        if(c1 != null) {
            arr_a = c1.v();
        }
        if(arr_a1 != null) {
            for(int v = 0; v < arr_a1.length; ++v) {
                if(arr_a1[v].g().equals(s)) {
                    return true;
                }
            }
        }
        if(arr_a != null) {
            for(int v1 = 0; v1 < arr_a.length; ++v1) {
                if(arr_a[v1].g().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // javassist.l
    public void k() {
        this.V0("defrost");
        this.q = false;
    }

    protected javassist.p.a k1() {
        return this.v == null ? null : ((javassist.p.a)this.v.get());
    }

    @Override  // javassist.l
    public boolean l0() {
        return D.d(this.W());
    }

    private static void l1(javassist.bytecode.p p0, j j0, int v) throws e {
        javassist.bytecode.q q0 = p0.G();
        if(q0.Q() < 0 && q0.S() >= 0) {
            return;
        }
        q0.o(j0.G0(), q0.r(j0.E0()));
        if(p0.E() < v) {
            p0.L(v);
        }
    }

    @Override  // javassist.l
    protected void m(StringBuffer stringBuffer0) {
        if(this.p) {
            stringBuffer0.append("changed ");
        }
        if(this.q) {
            stringBuffer0.append("frozen ");
        }
        if(this.r) {
            stringBuffer0.append("pruned ");
        }
        stringBuffer0.append(D.v(this.W()));
        stringBuffer0.append(" class ");
        stringBuffer0.append(this.X());
        try {
            l l0 = this.c0();
            if(l0 != null && !l0.X().equals("java.lang.Object")) {
                stringBuffer0.append(" extends " + l0.X());
            }
        }
        catch(E unused_ex) {
            stringBuffer0.append(" extends ??");
        }
        try {
            l[] arr_l = this.T();
            if(arr_l.length > 0) {
                stringBuffer0.append(" implements ");
            }
        label_18:
            for(int v = 0; v < arr_l.length; ++v) {
                stringBuffer0.append(arr_l[v].X());
                stringBuffer0.append(", ");
            }
        }
        catch(E unused_ex) {
            stringBuffer0.append(" extends ??");
            if(true) {
                goto label_25;
            }
            goto label_18;
        }
    label_25:
        javassist.p.a p$a0 = this.e1();
        this.X0(stringBuffer0, " fields=", p$a0.x(), p$a0.z());
        this.X0(stringBuffer0, " constructors=", p$a0.v(), p$a0.y());
        this.X0(stringBuffer0, " methods=", p$a0, p$a0.A());
    }

    @Override  // javassist.l
    public boolean m0() {
        return this.q;
    }

    // 去混淆评级： 低(20)
    private static boolean m1(n n0) {
        return !D.i(n0.h()) && n0.f0();
    }

    @Override  // javassist.l
    public void n() {
        this.q = true;
    }

    @Override  // javassist.l
    public boolean n0() {
        return D.f(this.W());
    }

    private void n1(javassist.p.a p$a0) {
        for(Object object0: this.a1(false).r()) {
            T t0 = (T)object0;
            if(t0.m()) {
                p$a0.u(new q(t0, this));
            }
            else {
                p$a0.s(new n(t0, this));
            }
        }
    }

    @Override  // javassist.l
    public a o() {
        if(this.w == null) {
            this.w = new a(this);
        }
        return this.w;
    }

    @Override  // javassist.l
    public boolean o0() {
        return this.p;
    }

    private void o1(javassist.p.a p$a0) {
        for(Object object0: this.a1(false).m()) {
            p$a0.t(new o(((javassist.bytecode.D)object0), this));
        }
    }

    @Override  // javassist.l
    public Object p(Class class0) throws ClassNotFoundException {
        k k0 = this.u();
        return m.Y0(class0, this.w(), ((c)k0.j("RuntimeInvisibleAnnotations")), ((c)k0.j("RuntimeVisibleAnnotations")));
    }

    private int p1(j j0, l[] arr_l) throws javassist.b, E {
        int v;
        y y0;
        javassist.compiler.d d0 = new javassist.compiler.d(j0, this);
        try {
            d0.n(arr_l, false);
            y0 = this.x;
            v = 0;
        }
        catch(javassist.compiler.c c0) {
            throw new javassist.b(c0);
        }
        while(y0 != null) {
            o o0 = y0.b;
            if(!D.l(o0.h())) {
                int v1 = y0.c.o(o0.y(), o0.i(), j0, arr_l, d0);
                if(v < v1) {
                    v = v1;
                }
            }
            y0 = y0.a;
        }
        return v;
    }

    @Override  // javassist.l
    public Object[] q() throws ClassNotFoundException {
        return this.Z0(false);
    }

    private void q1(Map map0) {
        int v = this.W();
        if(D.b(v) || D.f(v)) {
            try {
                l[] arr_l = this.T();
                for(int v1 = 0; v1 < arr_l.length; ++v1) {
                    l l0 = arr_l[v1];
                    if(l0 != null && l0 instanceof m) {
                        ((m)l0).q1(map0);
                    }
                }
            }
            catch(E unused_ex) {
            }
        }
        try {
            l l1 = this.c0();
            if(l1 != null && l1 instanceof m) {
                ((m)l1).q1(map0);
            }
        }
        catch(E unused_ex) {
        }
        for(Object object0: this.u().r()) {
            map0.put(((T)object0).k(), this);
        }
        for(Object object1: this.u().m()) {
            map0.put(((javassist.bytecode.D)object1).i(), this);
        }
    }

    @Override  // javassist.l
    public byte[] r(String s) {
        javassist.bytecode.d d0 = this.u().j(s);
        return d0 == null ? null : d0.c();
    }

    @Override  // javassist.l
    public n r0() throws javassist.b {
        n n0 = this.v();
        if(n0 != null) {
            return n0;
        }
        this.g();
        k k0 = this.u();
        this.s1(k0, new j(k0.l(), 0, 0), 0, 0);
        return this.v();
    }

    private void r1(k k0) throws javassist.b, E {
        if(this.x == null) {
            return;
        }
        j j0 = new j(k0.l(), 0, 0);
        javassist.compiler.d d0 = new javassist.compiler.d(j0, this);
        y y0 = this.x;
        boolean z = false;
        int v = 0;
        while(y0 != null) {
            o o0 = y0.b;
            if(D.l(o0.h())) {
                int v1 = y0.c.p(o0.y(), o0.i(), j0, d0);
                if(v < v1) {
                    v = v1;
                }
                z = true;
            }
            y0 = y0.a;
        }
        if(z) {
            this.s1(k0, j0, v, 0);
        }
    }

    @Override  // javassist.l
    public Object[] s() {
        try {
            return this.Z0(true);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("Unexpected exception ", classNotFoundException0);
        }
    }

    private void s1(k k0, j j0, int v, int v1) throws javassist.b {
        T t0 = k0.x();
        if(t0 == null) {
            j0.a(0xB1);
            j0.R0(v);
            j0.P0(v1);
            t0 = new T(k0.l(), "<clinit>", "()V");
            t0.x(8);
            t0.y(j0.T0());
            k0.e(t0);
            javassist.p.a p$a0 = this.k1();
            if(p$a0 == null) {
                goto label_24;
            }
            p$a0.s(new n(t0, this));
            goto label_24;
        }
        javassist.bytecode.p p0 = t0.f();
        if(p0 != null) {
            try {
                javassist.bytecode.q q0 = p0.G();
                q0.o(j0.G0(), q0.r(j0.E0()));
                if(p0.E() < v) {
                    p0.L(v);
                }
                if(p0.D() < v1) {
                    p0.K(v1);
                }
                goto label_24;
            }
            catch(e e0) {
            }
            throw new javassist.b(e0);
            try {
            label_24:
                t0.t(this.o, k0);
                return;
            }
            catch(e e1) {
                throw new javassist.b(e1);
            }
        }
        throw new javassist.b("empty <clinit>");
    }

    @Override  // javassist.l
    public l t0(String s, boolean z) {
        if(!z) {
            throw new RuntimeException("sorry, only nested static class is supported");
        }
        this.g();
        l l0 = this.o.i1(this.X() + "$" + s);
        k k0 = this.u();
        k k1 = l0.u();
        G g0 = (G)k0.j("InnerClasses");
        if(g0 == null) {
            g0 = new G(k0.l());
            k0.a(g0);
        }
        g0.v(l0.X(), this.X(), s, k1.i() & -33 | 8);
        k1.a(g0.a(k1.l(), null));
        return l0;
    }

    private void t1(k k0) throws javassist.b, E {
        if(this.x == null) {
            return;
        }
        t t0 = k0.l();
        for(Object object0: k0.r()) {
            T t1 = (T)object0;
            if(t1.l()) {
                javassist.bytecode.p p0 = t1.f();
                if(p0 != null) {
                    try {
                        j j0 = new j(t0, 0, p0.D());
                        m.l1(p0, j0, this.p1(j0, w.i(t1.h(), this.o)));
                        t1.t(this.o, k0);
                    }
                    catch(e e0) {
                        throw new javassist.b(e0);
                    }
                }
            }
        }
    }

    @Override  // javassist.l
    public k u() {
        return this.a1(true);
    }

    @Override  // javassist.l
    public String u0(String s) {
        HashMap hashMap0 = new HashMap();
        this.q1(hashMap0);
        Set set0 = hashMap0.keySet();
        String[] arr_s = new String[set0.size()];
        set0.toArray(arr_s);
        if(m.v1(s, arr_s)) {
            return s;
        }
        for(int v = 100; v <= 999; ++v) {
            String s1 = s + v;
            if(m.v1(s1, arr_s)) {
                return s1;
            }
        }
        throw new RuntimeException("too many unique name");
    }

    private void u1() {
        javassist.p.a p$a0 = this.k1();
        if(p$a0 != null) {
            p p0 = p$a0;
            p p1 = p$a0.A();
            while(p0 != p1) {
                p0 = p0.n();
                p0.m();
            }
        }
    }

    @Override  // javassist.l
    public n v() {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0.v();
        p p1 = p$a0.y();
        while(p0 != p1) {
            p0 = p0.n();
            n n0 = (n)p0;
            if(n0.e0()) {
                return n0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // javassist.l
    public void v0() {
        if(this.r) {
            return;
        }
        this.q = true;
        this.r = true;
        this.u().G();
    }

    private static boolean v1(String s, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].startsWith(s)) {
                return false;
            }
        }
        return true;
    }

    @Override  // javassist.l
    public g w() {
        return this.o;
    }

    @Override  // javassist.l
    public void w0() {
        this.s = true;
    }

    private void w1() {
        synchronized(this) {
            if(this.t != null && !this.o0() && this.k1() == null) {
                this.t = null;
            }
        }
    }

    @Override  // javassist.l
    public void x0(n n0) throws E {
        this.g();
        if(!this.u().r().remove(n0.D())) {
            throw new E(n0.toString());
        }
        this.e1().C(n0);
        this.s = true;
    }

    private void x1() {
        synchronized(this) {
            if(this.t != null && this.k1() == null) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
                try {
                    this.t.U(dataOutputStream0);
                    byteArrayOutputStream0.close();
                    this.u = byteArrayOutputStream0.toByteArray();
                    this.t = null;
                }
                catch(IOException unused_ex) {
                }
            }
        }
    }

    @Override  // javassist.l
    public n y(String s) throws E {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0.v();
        p p1 = p$a0.y();
        while(p0 != p1) {
            p0 = p0.n();
            n n0 = (n)p0;
            if(n0.D().h().equals(s) && n0.f0()) {
                return n0;
            }
            if(false) {
                break;
            }
        }
        return super.y(s);
    }

    @Override  // javassist.l
    public void y0(o o0) throws E {
        this.g();
        if(!this.u().m().remove(o0.v())) {
            throw new E(o0.toString());
        }
        this.e1().C(o0);
        this.s = true;
    }

    private k y1(k k0) {
        synchronized(this) {
            if(this.t == null) {
                this.t = k0;
            }
        }
        return this.t;
    }

    @Override  // javassist.l
    public n[] z() {
        javassist.p.a p$a0 = this.e1();
        p p0 = p$a0.v();
        p p1 = p$a0.y();
        int v = 0;
        p p2 = p0;
        int v1 = 0;
        while(p2 != p1) {
            p2 = p2.n();
            if(m.m1(((n)p2))) {
                ++v1;
            }
        }
        n[] arr_n = new n[v1];
        while(p0 != p1) {
            p0 = p0.n();
            n n0 = (n)p0;
            if(m.m1(n0)) {
                arr_n[v] = n0;
                ++v;
            }
        }
        return arr_n;
    }

    @Override  // javassist.l
    public void z0(q q0) throws E {
        this.g();
        if(!this.u().r().remove(q0.D())) {
            throw new E(q0.toString());
        }
        this.e1().C(q0);
        this.s = true;
    }

    void z1(g g0) {
        this.o = g0;
    }
}

