package javassist.util.proxy;

import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javassist.bytecode.C;
import javassist.bytecode.D;
import javassist.bytecode.T;
import javassist.bytecode.p;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.bytecode.y;

public class k {
    class a implements d {
        a() {
            super();
        }

        @Override  // javassist.util.proxy.k$d
        public ClassLoader a(k k0) {
            return k0.z();
        }
    }

    class b implements g {
        private final String a;
        private int b;

        b() {
            super();
            this.a = "_$$_jvst" + Integer.toHexString(this.hashCode() & 0xFFF) + "_";
            this.b = 0;
        }

        @Override  // javassist.util.proxy.k$g
        public String get(String s) {
            int v = this.b;
            this.b = v + 1;
            return s + this.a + Integer.toHexString(v);
        }
    }

    class c implements Comparator {
        c() {
            super();
        }

        public int b(Map.Entry map$Entry0, Map.Entry map$Entry1) {
            return ((String)map$Entry0.getKey()).compareTo(((String)map$Entry1.getKey()));
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((Map.Entry)object0), ((Map.Entry)object1));
        }
    }

    public interface d {
        ClassLoader a(k arg1);
    }

    static class e {
        String a;
        String b;
        String c;
        int d;

        e(String s, String s1, String s2, int v) {
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = v;
        }
    }

    static class f {
        byte[] a;
        Reference b;
        boolean c;

        f(byte[] arr_b, Class class0, boolean z) {
            this.a = arr_b;
            this.b = new WeakReference(class0);
            this.c = z;
        }
    }

    public interface g {
        String get(String arg1);
    }

    private static final String A = "getHandler";
    private static final String B = null;
    private static final String C = "serialVersionUID";
    private static final String D = "J";
    private static final long E = -1L;
    public static volatile boolean F = false;
    public static volatile boolean G = false;
    private static Map H = null;
    private static char[] I = null;
    public static d J = null;
    public static g K = null;
    private static final String L = "javassist.util.proxy.";
    private static Comparator M = null;
    private static final String N = "getHandler:()";
    private Class a;
    private Class[] b;
    private h c;
    private i d;
    private List e;
    private boolean f;
    private byte[] g;
    private String h;
    private String i;
    private String j;
    private Class k;
    private boolean l;
    private boolean m;
    public String n;
    public static boolean o = false;
    private static final Class p = null;
    private static final String q = "_methods_";
    private static final String r = "[Ljava/lang/reflect/Method;";
    private static final String s = "_filter_signature";
    private static final String t = "[B";
    private static final String u = "handler";
    private static final String v = "javassist.util.proxy.RuntimeSupport";
    private static final String w = "default_interceptor";
    private static final String x = null;
    private static final String y = "setHandler";
    private static final String z;

    static {
        k.p = Object.class;
        String s = 'L' + i.class.getName().replace('.', '/') + ';';
        k.x = s;
        k.z = "(" + s + ")V";
        k.B = "()" + s;
        k.F = true;
        k.G = true;
        k.H = new WeakHashMap();
        k.I = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        k.J = new a();
        k.K = new b();
        k.M = new c();
    }

    public k() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.e = null;
        this.f = false;
        this.k = null;
        this.n = null;
        this.l = k.F;
        this.m = k.G;
    }

    protected ProtectionDomain A() {
        if(this.a != null && !this.a.getName().equals("java.lang.Object")) {
            return this.a.getProtectionDomain();
        }
        Class[] arr_class = this.b;
        return arr_class == null || arr_class.length <= 0 ? this.getClass().getProtectionDomain() : arr_class[0].getProtectionDomain();
    }

    private static Object B(Class class0, String s) {
        try {
            Field field0 = class0.getField(s);
            field0.setAccessible(true);
            Object object0 = field0.get(null);
            field0.setAccessible(false);
            return object0;
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    static byte[] C(Class class0) {
        return (byte[])k.B(class0, "_filter_signature");
    }

    public static i D(j j0) {
        try {
            Field field0 = j0.getClass().getDeclaredField("handler");
            field0.setAccessible(true);
            Object object0 = field0.get(j0);
            field0.setAccessible(false);
            return (i)object0;
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public Class[] E() {
        return this.b;
    }

    public String F(Class class0, Class[] arr_class, byte[] arr_b, boolean z) {
        StringBuffer stringBuffer0 = new StringBuffer();
        if(class0 != null) {
            stringBuffer0.append(class0.getName());
        }
        stringBuffer0.append(":");
        for(int v1 = 0; v1 < arr_class.length; ++v1) {
            stringBuffer0.append(arr_class[v1].getName());
            stringBuffer0.append(":");
        }
        for(int v = 0; v < arr_b.length; ++v) {
            int v2 = arr_b[v];
            stringBuffer0.append(k.I[v2 & 15]);
            stringBuffer0.append(k.I[v2 >> 4 & 15]);
        }
        if(z) {
            stringBuffer0.append(":w");
        }
        return stringBuffer0.toString();
    }

    private Map G(Class class0, Class[] arr_class) {
        Map map0 = new HashMap();
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < arr_class.length; ++v) {
            this.H(map0, arr_class[v], hashSet0);
        }
        this.H(map0, class0, hashSet0);
        return map0;
    }

    private void H(Map map0, Class class0, Set set0) {
        if(!set0.add(class0)) {
            return;
        }
        Class[] arr_class = class0.getInterfaces();
        for(int v1 = 0; v1 < arr_class.length; ++v1) {
            this.H(map0, arr_class[v1], set0);
        }
        Class class1 = class0.getSuperclass();
        if(class1 != null) {
            this.H(map0, class1, set0);
        }
        Method[] arr_method = q.f(class0);
        for(int v = 0; v < arr_method.length; ++v) {
            if(!Modifier.isPrivate(arr_method[v].getModifiers())) {
                Method method0 = arr_method[v];
                String s = method0.getName() + ':' + o.l(method0);
                if(s.startsWith("getHandler:()")) {
                    this.f = true;
                }
                Method method1 = (Method)map0.put(s, method0);
                if(method1 != null && k.M(method0) && !Modifier.isPublic(method1.getDeclaringClass().getModifiers()) && !Modifier.isAbstract(method1.getModifiers()) && !k.N(v, arr_method)) {
                    map0.put(s, method1);
                }
                if(method1 != null && Modifier.isPublic(method1.getModifiers()) && !Modifier.isPublic(method0.getModifiers())) {
                    map0.put(s, method1);
                }
            }
        }
    }

    private static String I(String s) {
        int v = s.lastIndexOf(46);
        return v >= 0 ? s.substring(0, v) : null;
    }

    public Class J() {
        return this.a;
    }

    private void K(byte[] arr_b) {
        this.a0();
        if(arr_b.length != this.e.size() + 7 >> 3) {
            throw new RuntimeException("invalid filter signature length for deserialized proxy class");
        }
        this.g = arr_b;
    }

    private Class L(Class class0) {
        if(class0.isInterface()) {
            Class[] arr_class = this.b;
            for(int v = 0; v < arr_class.length; ++v) {
                Class class1 = arr_class[v];
                if(class0.isAssignableFrom(class1)) {
                    return class1;
                }
            }
        }
        return this.a;
    }

    private static boolean M(Method method0) {
        return method0.isBridge();
    }

    private static boolean N(int v, Method[] arr_method) {
        String s = arr_method[v].getName();
        for(int v1 = 0; v1 < arr_method.length; ++v1) {
            if(v1 != v && s.equals(arr_method[v1].getName()) && k.i(arr_method[v], arr_method[v1])) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(Class class0) {
        return j.class.isAssignableFrom(class0);
    }

    public boolean P() {
        return this.l;
    }

    public boolean Q() {
        return this.m;
    }

    private static boolean R(int v, String s, Member member0) {
        if((v & 2) != 0) {
            return false;
        }
        if((v & 5) != 0) {
            return true;
        }
        String s1 = k.I(s);
        String s2 = k.I(member0.getDeclaringClass().getName());
        return s1 == null ? s2 == null : s1.equals(s2);
    }

    private static String S(String s, Method method0) {
        return s.substring(s.indexOf(58) + 1);
    }

    private javassist.bytecode.k T() throws javassist.b {
        javassist.bytecode.k k0 = new javassist.bytecode.k(false, this.h, this.j);
        k0.L(1);
        k.l0(k0, this.b, (this.f ? j.class : l.class));
        t t0 = k0.l();
        if(!this.l) {
            D d0 = new D(t0, "default_interceptor", "Ljavassist/util/proxy/i;");
            d0.m(9);
            k0.b(d0);
        }
        D d1 = new D(t0, "handler", "Ljavassist/util/proxy/i;");
        d1.m(2);
        k0.b(d1);
        D d2 = new D(t0, "_filter_signature", "[B");
        d2.m(9);
        k0.b(d2);
        D d3 = new D(t0, "serialVersionUID", "J");
        d3.m(25);
        k0.b(d3);
        this.V(this.h, k0, t0, this.h);
        ArrayList arrayList0 = new ArrayList();
        int v = this.g0(k0, t0, this.h, arrayList0);
        k.a(k0, t0, this.h, v, arrayList0);
        k.f(this.h, k0, t0);
        if(!this.f) {
            k.b(this.h, k0, t0);
        }
        if(this.m) {
            try {
                k0.e(k.e0(t0));
            }
            catch(y unused_ex) {
            }
        }
        this.k = null;
        return k0;
    }

    private static T U(String s, Constructor constructor0, t t0, Class class0, boolean z) {
        String s1 = o.m(constructor0.getParameterTypes(), Void.TYPE);
        T t1 = new T(t0, "<init>", s1);
        t1.x(1);
        k.p0(t1, t0, constructor0.getExceptionTypes());
        javassist.bytecode.j j0 = new javassist.bytecode.j(t0, 0, 0);
        if(z) {
            j0.k(0);
            j0.C(s, "default_interceptor", "Ljavassist/util/proxy/i;");
            j0.u0(s, "handler", "Ljavassist/util/proxy/i;");
            j0.C(s, "default_interceptor", "Ljavassist/util/proxy/i;");
            j0.s0(0xC7);
            j0.G(10);
        }
        j0.k(0);
        j0.C("javassist.util.proxy.RuntimeSupport", "default_interceptor", "Ljavassist/util/proxy/i;");
        j0.u0(s, "handler", "Ljavassist/util/proxy/i;");
        int v = j0.D0();
        j0.k(0);
        int v1 = k.d(j0, constructor0.getParameterTypes(), 1);
        j0.P(class0.getName(), "<init>", s1);
        j0.s0(0xB1);
        j0.P0(v1 + 1);
        p p0 = j0.T0();
        t1.y(p0);
        javassist.bytecode.i0.k i0$k0 = new javassist.bytecode.i0.k(0x20);
        i0$k0.d(v);
        p0.I(i0$k0.g(t0));
        return t1;
    }

    private void V(String s, javassist.bytecode.k k0, t t0, String s1) throws javassist.b {
        Constructor[] arr_constructor = q.d(this.a);
        int v = !this.l;
        for(int v1 = 0; v1 < arr_constructor.length; ++v1) {
            Constructor constructor0 = arr_constructor[v1];
            int v2 = constructor0.getModifiers();
            if(!Modifier.isFinal(v2) && !Modifier.isPrivate(v2) && k.R(v2, this.i, constructor0)) {
                k0.e(k.U(s, constructor0, t0, this.a, ((boolean)v)));
            }
        }
    }

    private T W(Method method0, String s, t t0, Class class0, String s1) {
        T t1 = new T(t0, s1, s);
        t1.x(method0.getModifiers() & 0xFFFFFAD9 | 17);
        k.o0(t1, t0, method0);
        javassist.bytecode.j j0 = new javassist.bytecode.j(t0, 0, 0);
        j0.k(0);
        int v = k.d(j0, method0.getParameterTypes(), 1);
        Class class1 = this.L(class0);
        j0.S(class1.isInterface(), t0.a(class1.getName()), method0.getName(), s);
        k.e(j0, method0.getReturnType());
        j0.P0(v + 1);
        t1.y(j0.T0());
        return t1;
    }

    private static T X(String s, Method method0, String s1, t t0, Class class0, String s2, int v, List list0) {
        T t1 = new T(t0, method0.getName(), s1);
        t1.x(method0.getModifiers() & 0xFFFFFADF | 16);
        k.o0(t1, t0, method0);
        int v1 = w.s(s1);
        javassist.bytecode.j j0 = new javassist.bytecode.j(t0, 0, v1 + 2);
        j0.C(s, "_methods_", "[Ljava/lang/reflect/Method;");
        j0.n(v1 + 1);
        list0.add(new e(method0.getName(), s2, s1, v * 2));
        j0.k(0);
        j0.A(s, "handler", "Ljavassist/util/proxy/i;");
        j0.k(0);
        j0.k(v1 + 1);
        j0.E(v * 2);
        j0.s0(50);
        j0.k(v1 + 1);
        j0.E(v * 2 + 1);
        j0.s0(50);
        k.Y(j0, method0.getParameterTypes());
        j0.K("javassist.util.proxy.i", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", 5);
        Class class1 = method0.getReturnType();
        k.g(j0, class1);
        k.e(j0, class1);
        t1.y(j0.T0());
        return t1;
    }

    private static void Y(javassist.bytecode.j j0, Class[] arr_class) {
        j0.E(arr_class.length);
        j0.l("java/lang/Object");
        int v = 1;
        for(int v1 = 0; v1 < arr_class.length; ++v1) {
            j0.s0(89);
            j0.E(v1);
            Class class0 = arr_class[v1];
            if(class0.isPrimitive()) {
                v = k.d0(j0, class0, v);
            }
            else {
                j0.k(v);
                ++v;
            }
            j0.s0(83);
        }
    }

    private static String Z(String s) {
        synchronized(k.K) {
        }
        return k.K.get(s);
    }

    private static void a(javassist.bytecode.k k0, t t0, String s, int v, List list0) throws javassist.b {
        D d0 = new D(t0, "_methods_", "[Ljava/lang/reflect/Method;");
        d0.m(10);
        k0.b(d0);
        T t1 = new T(t0, "<clinit>", "()V");
        t1.x(8);
        k.p0(t1, t0, new Class[]{ClassNotFoundException.class});
        javassist.bytecode.j j0 = new javassist.bytecode.j(t0, 0, 2);
        j0.E(v * 2);
        j0.l("java.lang.reflect.Method");
        j0.n(0);
        j0.f0(s);
        j0.V("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
        j0.n(1);
        for(Object object0: list0) {
            k.j(j0, ((e)object0).a, ((e)object0).b, ((e)object0).d, ((e)object0).c, 1, 0);
        }
        j0.k(0);
        j0.x0(s, "_methods_", "[Ljava/lang/reflect/Method;");
        j0.d0(-1L);
        j0.x0(s, "serialVersionUID", "J");
        j0.s0(0xB1);
        t1.y(j0.T0());
        k0.e(t1);
    }

    private void a0() {
        this.k();
        this.f = false;
        ArrayList arrayList0 = new ArrayList(this.G(this.a, this.b).entrySet());
        this.e = arrayList0;
        Collections.sort(arrayList0, k.M);
    }

    private static void b(String s, javassist.bytecode.k k0, t t0) throws javassist.b {
        T t1 = new T(t0, "getHandler", "()Ljavassist/util/proxy/i;");
        t1.x(1);
        javassist.bytecode.j j0 = new javassist.bytecode.j(t0, 1, 1);
        j0.k(0);
        j0.A(s, "handler", "Ljavassist/util/proxy/i;");
        j0.s0(0xB0);
        t1.y(j0.T0());
        k0.e(t1);
    }

    private static String b0(String s, List list0) {
        if(k.c0(s, list0.iterator())) {
            return s;
        }
        for(int v = 100; v < 999; ++v) {
            String s1 = s + v;
            if(k.c0(s1, list0.iterator())) {
                return s1;
            }
        }
        throw new RuntimeException("cannot make a unique method name");
    }

    private static int c(javassist.bytecode.j j0, int v, Class class0) {
        if(class0.isPrimitive()) {
            if(class0 == Long.TYPE) {
                j0.i0(v);
                return 2;
            }
            if(class0 == Float.TYPE) {
                j0.y(v);
                return 1;
            }
            if(class0 == Double.TYPE) {
                j0.s(v);
                return 2;
            }
            j0.F(v);
            return 1;
        }
        j0.k(v);
        return 1;
    }

    private static boolean c0(String s, Iterator iterator0) {
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((String)((Map.Entry)object0).getKey()).startsWith(s)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static int d(javassist.bytecode.j j0, Class[] arr_class, int v) {
        int v2 = 0;
        for(int v1 = 0; v1 < arr_class.length; ++v1) {
            v2 += k.c(j0, v2 + v, arr_class[v1]);
        }
        return v2;
    }

    private static int d0(javassist.bytecode.j j0, Class class0, int v) {
        int v1 = javassist.util.proxy.g.f(class0);
        String s = javassist.util.proxy.g.b[v1];
        j0.p0(s);
        j0.s0(89);
        k.c(j0, v, class0);
        j0.P(s, "<init>", javassist.util.proxy.g.c[v1]);
        return v + javassist.util.proxy.g.f[v1];
    }

    private static int e(javassist.bytecode.j j0, Class class0) {
        if(class0.isPrimitive()) {
            if(class0 == Long.TYPE) {
                j0.s0(0xAD);
                return 2;
            }
            if(class0 == Float.TYPE) {
                j0.s0(0xAE);
                return 1;
            }
            if(class0 == Double.TYPE) {
                j0.s0(0xAF);
                return 2;
            }
            if(class0 == Void.TYPE) {
                j0.s0(0xB1);
                return 0;
            }
            j0.s0(0xAC);
            return 1;
        }
        j0.s0(0xB0);
        return 1;
    }

    private static T e0(t t0) {
        T t1 = new T(t0, "writeReplace", "()Ljava/lang/Object;");
        C c0 = new C(t0);
        c0.y(new String[]{"java.io.ObjectStreamException"});
        t1.A(c0);
        javassist.bytecode.j j0 = new javassist.bytecode.j(t0, 0, 1);
        j0.k(0);
        j0.V("javassist.util.proxy.RuntimeSupport", "makeSerializedProxy", "(Ljava/lang/Object;)Ljavassist/util/proxy/SerializedProxy;");
        j0.s0(0xB0);
        t1.y(j0.T0());
        return t1;
    }

    private static void f(String s, javassist.bytecode.k k0, t t0) throws javassist.b {
        T t1 = new T(t0, "setHandler", k.z);
        t1.x(1);
        javassist.bytecode.j j0 = new javassist.bytecode.j(t0, 2, 2);
        j0.k(0);
        j0.k(1);
        j0.u0(s, "handler", "Ljavassist/util/proxy/i;");
        j0.s0(0xB1);
        t1.y(j0.T0());
        k0.e(t1);
    }

    private void f0(String s, Method method0, String s1, int v, String s2, javassist.bytecode.k k0, t t0, List list0) throws javassist.b {
        String s4;
        Class class0 = method0.getDeclaringClass();
        String s3 = s1 + v + method0.getName();
        if(Modifier.isAbstract(method0.getModifiers())) {
            s4 = null;
        }
        else {
            s4 = s3;
            T t1 = this.W(method0, s2, t0, class0, s4);
            t1.x(t1.c() & -65);
            k0.e(t1);
        }
        k0.e(k.X(s, method0, s2, t0, class0, s4, v, list0));
    }

    private static void g(javassist.bytecode.j j0, Class class0) {
        if(class0.isPrimitive()) {
            if(class0 == Void.TYPE) {
                j0.s0(87);
                return;
            }
            int v = javassist.util.proxy.g.f(class0);
            String s = javassist.util.proxy.g.b[v];
            j0.o(s);
            j0.Z(s, javassist.util.proxy.g.d[v], javassist.util.proxy.g.e[v]);
            return;
        }
        j0.o(class0.getName());
    }

    private int g0(javassist.bytecode.k k0, t t0, String s, List list0) throws javassist.b {
        String s1 = k.b0("_d", this.e);
        int v = 0;
        for(Object object0: this.e) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if((javassist.bytecode.k.y < 49 || !k.M(((Method)map$Entry0.getValue()))) && this.s0(this.g, v)) {
                this.f0(s, ((Method)map$Entry0.getValue()), s1, v, k.S(((String)map$Entry0.getKey()), ((Method)map$Entry0.getValue())), k0, t0, list0);
            }
            ++v;
        }
        return v;
    }

    private void h() {
        this.h = k.Z(this.i);
    }

    private void h0(byte[] arr_b, int v) {
        if(v >> 3 < arr_b.length) {
            arr_b[v >> 3] = (byte)(1 << (v & 7) | arr_b[v >> 3]);
        }
    }

    private static boolean i(Method method0, Method method1) {
        Class[] arr_class = method0.getParameterTypes();
        Class[] arr_class1 = method1.getParameterTypes();
        if(arr_class.length == arr_class1.length) {
            int v = 0;
            while(v < arr_class.length) {
                if(arr_class[v].getName().equals(arr_class1[v].getName())) {
                    ++v;
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private void i0(String s, Object object0) {
        Class class0 = this.k;
        if(class0 != null && object0 != null) {
            try {
                Field field0 = class0.getField(s);
                q.j(field0, true);
                field0.set(null, object0);
                q.j(field0, false);
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0);
            }
        }
    }

    private static void j(javassist.bytecode.j j0, String s, String s1, int v, String s2, int v1, int v2) {
        j0.k(v1);
        j0.f0(s);
        if(s1 == null) {
            j0.s0(1);
        }
        else {
            j0.f0(s1);
        }
        j0.E(v);
        j0.f0(s2);
        j0.k(v2);
        j0.V("javassist.util.proxy.o", "find2Methods", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/reflect/Method;)V");
    }

    public void j0(h h0) {
        this.c = h0;
        this.g = null;
    }

    private void k() {
        if(this.b == null) {
            this.b = new Class[0];
        }
        Class class0 = this.a;
        if(class0 == null) {
            this.a = k.p;
            String s = "java.lang.Object";
            this.j = "java.lang.Object";
            Class[] arr_class = this.b;
            if(arr_class.length != 0) {
                s = arr_class[0].getName();
            }
            this.i = s;
        }
        else {
            String s1 = class0.getName();
            this.j = s1;
            this.i = s1;
        }
        if(Modifier.isFinal(this.a.getModifiers())) {
            throw new RuntimeException(this.j + " is final");
        }
        if(this.i.startsWith("java.") || this.i.startsWith("jdk.") || k.o) {
            this.i = "javassist.util.proxy." + this.i.replace('.', '_');
        }
    }

    @Deprecated
    public void k0(i i0) {
        if(this.l && i0 != null) {
            this.l = false;
            this.k = null;
        }
        this.d = i0;
        this.i0("default_interceptor", i0);
    }

    private void l(h h0) {
        this.a0();
        int v = this.e.size();
        this.g = new byte[v + 7 >> 3];
        for(int v1 = 0; v1 < v; ++v1) {
            Method method0 = (Method)((Map.Entry)this.e.get(v1)).getValue();
            int v2 = method0.getModifiers();
            if(!Modifier.isFinal(v2) && !Modifier.isStatic(v2) && k.R(v2, this.i, method0) && (h0 == null || h0.a(method0))) {
                this.h0(this.g, v1);
            }
        }
    }

    private static void l0(javassist.bytecode.k k0, Class[] arr_class, Class class0) {
        String[] arr_s;
        String s = class0.getName();
        if(arr_class == null || arr_class.length == 0) {
            arr_s = new String[]{s};
        }
        else {
            arr_s = new String[arr_class.length + 1];
            for(int v = 0; v < arr_class.length; ++v) {
                arr_s[v] = arr_class[v].getName();
            }
            arr_s[arr_class.length] = s;
        }
        k0.M(arr_s);
    }

    public Object m(Class[] arr_class, Object[] arr_object) throws NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return this.o().getConstructor(arr_class).newInstance(arr_object);
    }

    public void m0(Class[] arr_class) {
        this.b = arr_class;
        this.g = null;
    }

    public Object n(Class[] arr_class, Object[] arr_object, i i0) throws NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Object object0 = this.m(arr_class, arr_object);
        ((j)object0).a(i0);
        return object0;
    }

    public void n0(Class class0) {
        this.a = class0;
        this.g = null;
    }

    public Class o() {
        if(this.g == null) {
            this.l(this.c);
        }
        return this.u(null);
    }

    private static void o0(T t0, t t1, Method method0) {
        k.p0(t0, t1, method0.getExceptionTypes());
    }

    public Class p(MethodHandles.Lookup methodHandles$Lookup0) {
        if(this.g == null) {
            this.l(this.c);
        }
        return this.u(methodHandles$Lookup0);
    }

    private static void p0(T t0, t t1, Class[] arr_class) {
        if(arr_class.length == 0) {
            return;
        }
        String[] arr_s = new String[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_s[v] = arr_class[v].getName();
        }
        C c0 = new C(t1);
        c0.y(arr_s);
        t0.A(c0);
    }

    public Class q(MethodHandles.Lookup methodHandles$Lookup0, h h0) {
        this.l(h0);
        return this.u(methodHandles$Lookup0);
    }

    public void q0(boolean z) {
        if(this.d != null && z) {
            throw new RuntimeException("caching cannot be enabled if the factory default interceptor has been set");
        }
        this.l = z;
    }

    Class r(MethodHandles.Lookup methodHandles$Lookup0, byte[] arr_b) {
        this.K(arr_b);
        return this.u(methodHandles$Lookup0);
    }

    public void r0(boolean z) {
        this.m = z;
    }

    public Class s(h h0) {
        this.l(h0);
        return this.u(null);
    }

    private boolean s0(byte[] arr_b, int v) {
        return v >> 3 <= arr_b.length ? (arr_b[v >> 3] & 1 << (v & 7)) != 0 : false;
    }

    Class t(byte[] arr_b) {
        this.K(arr_b);
        return this.u(null);
    }

    private Class u(MethodHandles.Lookup methodHandles$Lookup0) {
        Class class0 = this.k;
        if(class0 == null) {
            ClassLoader classLoader0 = this.y();
            synchronized(k.H) {
                if(this.l) {
                    this.v(classLoader0, methodHandles$Lookup0);
                }
                else {
                    this.w(classLoader0, methodHandles$Lookup0);
                }
                class0 = this.k;
                this.k = null;
            }
        }
        return class0;
    }

    private void v(ClassLoader classLoader0, MethodHandles.Lookup methodHandles$Lookup0) {
        String s = this.F(this.a, this.b, this.g, this.m);
        Map map0 = (Map)k.H.get(classLoader0);
        if(map0 == null) {
            map0 = new HashMap();
            k.H.put(classLoader0, map0);
        }
        f k$f0 = (f)map0.get(s);
        if(k$f0 != null) {
            Class class0 = (Class)k$f0.b.get();
            this.k = class0;
            if(class0 != null) {
                return;
            }
        }
        this.w(classLoader0, methodHandles$Lookup0);
        map0.put(s, new f(this.g, this.k, this.m));
    }

    private void w(ClassLoader classLoader0, MethodHandles.Lookup methodHandles$Lookup0) {
        this.h();
        try {
            javassist.bytecode.k k0 = this.T();
            String s = this.n;
            if(s != null) {
                javassist.util.proxy.g.g(k0, s);
            }
            this.k = methodHandles$Lookup0 == null ? javassist.util.proxy.g.b(k0, this.x(), classLoader0, this.A()) : javassist.util.proxy.g.e(k0, methodHandles$Lookup0);
            this.i0("_filter_signature", this.g);
            if(!this.l) {
                this.i0("default_interceptor", this.d);
            }
            return;
        }
        catch(javassist.b b0) {
        }
        throw new RuntimeException(b0.getMessage(), b0);
    }

    private Class x() {
        if(this.i.startsWith("javassist.util.proxy.")) {
            return this.getClass();
        }
        Class class0 = this.a;
        if(class0 != null && class0 != k.p) {
            return class0;
        }
        Class[] arr_class = this.b;
        return arr_class == null || arr_class.length <= 0 ? this.getClass() : arr_class[0];
    }

    protected ClassLoader y() {
        return k.J.a(this);
    }

    protected ClassLoader z() {
        ClassLoader classLoader0;
        if(this.a == null || this.a.getName().equals("java.lang.Object")) {
            classLoader0 = this.b == null || this.b.length <= 0 ? null : this.b[0].getClassLoader();
        }
        else {
            classLoader0 = this.a.getClassLoader();
        }
        if(classLoader0 == null) {
            classLoader0 = this.getClass().getClassLoader();
            if(classLoader0 == null) {
                classLoader0 = Thread.currentThread().getContextClassLoader();
                return classLoader0 == null ? ClassLoader.getSystemClassLoader() : classLoader0;
            }
        }
        return classLoader0;
    }
}

