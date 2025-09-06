package javassist;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Collection;

public abstract class l {
    static class b extends OutputStream {
        private FileOutputStream a;
        private String b;

        b(String s) {
            this.a = null;
            this.b = s;
        }

        private void a() throws IOException {
            if(this.a == null) {
                this.a = new FileOutputStream(this.b);
            }
        }

        @Override
        public void close() throws IOException {
            this.a();
            this.a.close();
        }

        @Override
        public void flush() throws IOException {
            this.a();
            this.a.flush();
        }

        @Override
        public void write(int v) throws IOException {
            this.a();
            this.a.write(v);
        }

        @Override
        public void write(byte[] arr_b) throws IOException {
            this.a();
            this.a.write(arr_b);
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) throws IOException {
            this.a();
            this.a.write(arr_b, v, v1);
        }
    }

    protected String a;
    public static String b = null;
    public static final String c = "3.25.0-GA";
    static final String d = "java.lang.Object";
    public static l e;
    public static l f;
    public static l g;
    public static l h;
    public static l i;
    public static l j;
    public static l k;
    public static l l;
    public static l m;
    static l[] n;

    static {
        l.n = new l[9];
        w w0 = new w("boolean", 'Z', "java.lang.Boolean", "booleanValue", "()Z", 0xAC, 4, 1);
        l.e = w0;
        l.n[0] = w0;
        w w1 = new w("char", 'C', "java.lang.Character", "charValue", "()C", 0xAC, 5, 1);
        l.f = w1;
        l.n[1] = w1;
        w w2 = new w("byte", 'B', "java.lang.Byte", "byteValue", "()B", 0xAC, 8, 1);
        l.g = w2;
        l.n[2] = w2;
        w w3 = new w("short", 'S', "java.lang.Short", "shortValue", "()S", 0xAC, 9, 1);
        l.h = w3;
        l.n[3] = w3;
        w w4 = new w("int", 'I', "java.lang.Integer", "intValue", "()I", 0xAC, 10, 1);
        l.i = w4;
        l.n[4] = w4;
        w w5 = new w("long", 'J', "java.lang.Long", "longValue", "()J", 0xAD, 11, 2);
        l.j = w5;
        l.n[5] = w5;
        w w6 = new w("float", 'F', "java.lang.Float", "floatValue", "()F", 0xAE, 6, 1);
        l.k = w6;
        l.n[6] = w6;
        w w7 = new w("double", 'D', "java.lang.Double", "doubleValue", "()D", 0xAF, 7, 2);
        l.l = w7;
        l.n[7] = w7;
        w w8 = new w("void", 'V', "java.lang.Void", null, null, 0xB1, 0, 0);
        l.m = w8;
        l.n[8] = w8;
    }

    protected l(String s) {
        this.a = s;
    }

    public k[] A() {
        return new k[0];
    }

    public void A0(String s, String s1) {
        this.g();
    }

    public l[] B() throws E {
        return this.Y();
    }

    public void B0(d d0) {
        this.g();
    }

    public n C(l[] arr_l) throws E {
        return this.y(javassist.bytecode.w.p(arr_l));
    }

    public void C0(String s, byte[] arr_b) {
        this.g();
    }

    public n[] D() {
        return new n[0];
    }

    public void D0(String s) {
        this.g();
    }

    public o E(String s) throws E {
        throw new E(s);
    }

    public void E0(l[] arr_l) {
        this.g();
    }

    public o F(String s, String s1) throws E {
        throw new E(s);
    }

    public void F0(int v) {
        this.g();
    }

    public o[] G() {
        return new o[0];
    }

    public void G0(String s) {
        this.g();
        if(s != null) {
            this.a = s;
        }
    }

    public q H(String s) throws E {
        throw new E(s);
    }

    public void H0(l l0) throws javassist.b {
        this.g();
    }

    public q I(String s, l[] arr_l) throws E {
        throw new E(s);
    }

    public boolean I0(boolean z) {
        return true;
    }

    public q[] J() {
        return new q[0];
    }

    public boolean J0(l l0) {
        return false;
    }

    public q[] K(String s) throws E {
        throw new E(s);
    }

    public boolean K0(l l0) throws E {
        return this == l0 || this.X().equals(l0.X());
    }

    public l L() throws E {
        return null;
    }

    public void L0(DataOutputStream dataOutputStream0) throws javassist.b, IOException {
        throw new javassist.b("not a class");
    }

    public k M() throws E {
        return null;
    }

    public byte[] M0() throws IOException, javassist.b {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0)) {
            this.L0(dataOutputStream0);
            return byteArrayOutputStream0.toByteArray();
        }
    }

    @Deprecated
    public final q N() throws E {
        k k0 = this.M();
        if(k0 == null) {
            return null;
        }
        if(!(k0 instanceof q)) {
            throw new E(k0.B() + " is enclosing " + this.X());
        }
        return (q)k0;
    }

    public Class N0() throws javassist.b {
        return this.w().Q1(this);
    }

    public o O(String s) throws E {
        return this.P(s, null);
    }

    public Class O0(Class class0) throws javassist.b {
        return this.w().d2(this, class0);
    }

    public o P(String s, String s1) throws E {
        throw new E(s);
    }

    @Deprecated
    public final Class P0(ClassLoader classLoader0) throws javassist.b {
        return this.w().e2(this, null, classLoader0, null);
    }

    o Q(String s, String s1) {
        return null;
    }

    public Class Q0(ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws javassist.b {
        g g0 = this.w();
        if(classLoader0 == null) {
            classLoader0 = g0.L();
        }
        return g0.e2(this, null, classLoader0, protectionDomain0);
    }

    public o[] R() {
        return new o[0];
    }

    public Class R0(MethodHandles.Lookup methodHandles$Lookup0) throws javassist.b {
        return this.w().j2(this, methodHandles$Lookup0);
    }

    public String S() {
        return null;
    }

    public void S0() throws E, IOException, javassist.b {
        this.T0(".");
    }

    public l[] T() throws E {
        return new l[0];
    }

    public void T0(String s) throws javassist.b, IOException {
        try(DataOutputStream dataOutputStream0 = this.s0(s)) {
            this.L0(dataOutputStream0);
        }
    }

    public q U(String s, String s1) throws E {
        throw new E(s);
    }

    public q[] V() {
        return new q[0];
    }

    public int W() {
        return 0;
    }

    public String X() {
        return this.a;
    }

    public l[] Y() throws E {
        return new l[0];
    }

    public final String Z() {
        String s = this.a;
        int v = s.lastIndexOf(46);
        return v >= 0 ? s.substring(0, v) : null;
    }

    public void a(n n0) throws javassist.b {
        this.g();
    }

    public Collection a0() {
        class a extends d {
            final l c;
            private static final long d = 1L;

            @Override  // javassist.d
            public void a(String s) {
            }

            @Override  // javassist.d
            public String c(Object object0) {
                String s = d.h(((String)object0));
                this.f(s, s);
                return null;
            }

            @Override  // javassist.d
            public String d(String s, String s1) {
                return this.f(s, s1);
            }

            @Override  // javassist.d
            public Object get(Object object0) {
                return this.c(object0);
            }

            @Override  // javassist.d
            public Object put(Object object0, Object object1) {
                return this.d(((String)object0), ((String)object1));
            }
        }

        synchronized(this) {
            javassist.bytecode.k k0 = this.u();
            if(k0 != null) {
                a l$a0 = new a(this);
                k0.u(l$a0);
                return l$a0.values();
            }
            return null;
        }
    }

    public void b(o o0) throws javassist.b {
        this.d(o0, null);
    }

    public final String b0() {
        String s = this.a;
        int v = s.lastIndexOf(46);
        return v >= 0 ? s.substring(v + 1) : s;
    }

    public void c(o o0, String s) throws javassist.b {
        this.g();
    }

    public l c0() throws E {
        return null;
    }

    public void d(o o0, f o$f0) throws javassist.b {
        this.g();
    }

    public URL d0() throws E {
        throw new E(this.X());
    }

    public void e(l l0) {
        this.g();
    }

    public boolean e0(Class class0) {
        return this.f0(class0.getName());
    }

    public void f(q q0) throws javassist.b {
        this.g();
    }

    public boolean f0(String s) {
        return false;
    }

    void g() throws RuntimeException {
        if(this.m0()) {
            throw new RuntimeException(this.X() + " class is frozen");
        }
    }

    void g0() {
    }

    void h() {
    }

    public void h0(i i0) throws javassist.b {
        this.g();
    }

    public void i() {
        this.j(".");
    }

    public void i0(javassist.expr.d d0) throws javassist.b {
        this.g();
    }

    public void j(String s) {
        try {
            this.T0(s);
            this.k();
            this.I0(this.I0(true));
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public boolean j0() {
        return false;
    }

    public void k() {
        throw new RuntimeException("cannot defrost " + this.X());
    }

    public boolean k0() {
        return false;
    }

    public void l() {
        g g0 = this.w();
        l l0 = g0.J1(this.X());
        if(l0 != this) {
            g0.f(this.X(), l0, false);
        }
    }

    public boolean l0() {
        return false;
    }

    protected void m(StringBuffer stringBuffer0) {
        stringBuffer0.append(this.X());
    }

    public boolean m0() {
        return true;
    }

    public void n() {
    }

    public boolean n0() {
        return false;
    }

    public javassist.compiler.a o() {
        return null;
    }

    public boolean o0() {
        return false;
    }

    public Object p(Class class0) throws ClassNotFoundException {
        return null;
    }

    public boolean p0() {
        return false;
    }

    public Object[] q() throws ClassNotFoundException {
        return new Object[0];
    }

    public static void q0(String[] arr_s) {
        PrintStream printStream0 = System.out;
        printStream0.println("Javassist version 3.25.0-GA");
        printStream0.println("Copyright (C) 1999-2019 Shigeru Chiba. All Rights Reserved.");
    }

    public byte[] r(String s) {
        return null;
    }

    public n r0() throws javassist.b {
        throw new javassist.b("not a class");
    }

    public Object[] s() {
        return new Object[0];
    }

    protected DataOutputStream s0(String s) {
        int v = File.separatorChar;
        String s1 = s + ((char)v) + this.X().replace('.', ((char)v)) + ".class";
        int v1 = s1.lastIndexOf(v);
        if(v1 > 0) {
            String s2 = s1.substring(0, v1);
            if(!s2.equals(".")) {
                new File(s2).mkdirs();
            }
        }
        return new DataOutputStream(new BufferedOutputStream(new b(s1)));
    }

    public javassist.bytecode.k t() {
        this.g();
        return this.u();
    }

    public l t0(String s, boolean z) {
        throw new RuntimeException(this.X() + " is not a class");
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer(this.getClass().getName());
        stringBuffer0.append("@");
        stringBuffer0.append(Integer.toHexString(this.hashCode()));
        stringBuffer0.append("[");
        this.m(stringBuffer0);
        stringBuffer0.append("]");
        return stringBuffer0.toString();
    }

    public javassist.bytecode.k u() {
        return null;
    }

    public String u0(String s) {
        throw new RuntimeException("not available in " + this.X());
    }

    public n v() {
        return null;
    }

    public void v0() {
    }

    public g w() {
        return null;
    }

    public void w0() {
    }

    public l x() throws E {
        return null;
    }

    public void x0(n n0) throws E {
        this.g();
    }

    public n y(String s) throws E {
        throw new E("no such constructor");
    }

    public void y0(o o0) throws E {
        this.g();
    }

    public n[] z() {
        return new n[0];
    }

    public void z0(q q0) throws E {
        this.g();
    }
}

