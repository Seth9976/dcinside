package javassist.bytecode;

import j..util.Optional;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javassist.b;

public final class k {
    int a;
    int b;
    t c;
    int d;
    int e;
    int f;
    int[] g;
    List h;
    List i;
    List j;
    String k;
    String[] l;
    String m;
    public static final int n = 45;
    public static final int o = 46;
    public static final int p = 0x2F;
    public static final int q = 0x30;
    public static final int r = 49;
    public static final int s = 50;
    public static final int t = 51;
    public static final int u = 52;
    public static final int v = 53;
    public static final int w = 54;
    public static final int x = 55;
    public static final int y;

    static {
        int v;
        try {
            Class.forName("java.lang.invoke.CallSite", false, ClassLoader.getSystemClassLoader());
            List.class.getMethod("copyOf", Collection.class);
            v = 54;
            Optional.class.getMethod("isEmpty", null);
            v = 55;
        }
        catch(Throwable unused_ex) {
        }
        k.y = v;
    }

    public k(DataInputStream dataInputStream0) throws IOException {
        this.H(dataInputStream0);
    }

    public k(boolean z, String s, String s1) {
        this.a = k.y;
        this.b = 0;
        t t0 = new t(s);
        this.c = t0;
        this.d = t0.o0();
        this.e = z ? 0x600 : 0x20;
        this.A(s1);
        this.g = null;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = s;
        ArrayList arrayList0 = new ArrayList();
        this.j = arrayList0;
        arrayList0.add(new g0(this.c, k.w(this.k)));
    }

    private void A(String s) {
        if(s != null) {
            this.f = this.c.a(s);
            this.m = s;
            return;
        }
        this.f = this.c.a("java.lang.Object");
        this.m = "java.lang.Object";
    }

    public boolean B() {
        return (this.e & 0x400) != 0;
    }

    private static boolean C(T t0, String s, String s1, T t1, ListIterator listIterator0) {
        if(!t1.k().equals(s)) {
            return false;
        }
        String s2 = t1.h();
        if(!w.g(s2, s1)) {
            return false;
        }
        if(s2.equals(s1)) {
            if(k.F(t1)) {
                return true;
            }
            listIterator0.remove();
        }
        return false;
    }

    public boolean D() {
        return (this.e & 16) != 0;
    }

    public boolean E() {
        return (this.e & 0x200) != 0;
    }

    private static boolean F(T t0) {
        return (t0.c() & 0x40) == 0;
    }

    public void G() {
        t t0 = this.h();
        ArrayList arrayList0 = new ArrayList();
        d d0 = this.j("RuntimeInvisibleAnnotations");
        if(d0 != null) {
            arrayList0.add(d0.a(t0, null));
        }
        d d1 = this.j("RuntimeVisibleAnnotations");
        if(d1 != null) {
            arrayList0.add(d1.a(t0, null));
        }
        d d2 = this.j("Signature");
        if(d2 != null) {
            arrayList0.add(d2.a(t0, null));
        }
        for(Object object0: this.i) {
            ((T)object0).o(t0);
        }
        for(Object object1: this.h) {
            ((D)object1).j(t0);
        }
        this.j = arrayList0;
        this.c = t0;
    }

    private void H(DataInputStream dataInputStream0) throws IOException {
        int v = dataInputStream0.readInt();
        if(v != 0xCAFEBABE) {
            throw new IOException("bad magic number: " + Integer.toHexString(v));
        }
        this.b = dataInputStream0.readUnsignedShort();
        this.a = dataInputStream0.readUnsignedShort();
        this.c = new t(dataInputStream0);
        this.e = dataInputStream0.readUnsignedShort();
        int v1 = dataInputStream0.readUnsignedShort();
        this.d = v1;
        this.c.A0(v1);
        this.f = dataInputStream0.readUnsignedShort();
        int v2 = dataInputStream0.readUnsignedShort();
        if(v2 == 0) {
            this.g = null;
        }
        else {
            this.g = new int[v2];
            for(int v4 = 0; v4 < v2; ++v4) {
                int[] arr_v = this.g;
                arr_v[v4] = dataInputStream0.readUnsignedShort();
            }
        }
        t t0 = this.c;
        int v5 = dataInputStream0.readUnsignedShort();
        this.h = new ArrayList();
        for(int v6 = 0; v6 < v5; ++v6) {
            this.c(new D(t0, dataInputStream0));
        }
        int v7 = dataInputStream0.readUnsignedShort();
        this.i = new ArrayList();
        for(int v8 = 0; v8 < v7; ++v8) {
            this.f(new T(t0, dataInputStream0));
        }
        this.j = new ArrayList();
        int v9 = dataInputStream0.readUnsignedShort();
        for(int v3 = 0; v3 < v9; ++v3) {
            this.a(d.k(t0, dataInputStream0));
        }
        this.k = this.c.A(this.d);
    }

    public d I(String s) {
        return d.l(this.j, s);
    }

    public final void J(String s, String s1) {
        if(s.equals(s1)) {
            return;
        }
        if(s.equals(this.k)) {
            this.k = s1;
        }
        String s2 = w.B(s);
        String s3 = w.B(s1);
        this.c.y0(s2, s3);
        d.n(this.j, s2, s3);
        for(Object object0: this.i) {
            ((T)object0).z(w.t(((T)object0).h(), s2, s3));
            d.n(((T)object0).e(), s2, s3);
        }
        for(Object object1: this.h) {
            ((D)object1).n(w.t(((D)object1).h(), s2, s3));
            d.n(((D)object1).e(), s2, s3);
        }
    }

    public final void K(Map map0) {
        String s = (String)map0.get(w.B(this.k));
        if(s != null) {
            this.k = w.A(s);
        }
        this.c.z0(map0);
        d.o(this.j, map0);
        for(Object object0: this.i) {
            ((T)object0).z(w.u(((T)object0).h(), map0));
            d.o(((T)object0).e(), map0);
        }
        for(Object object1: this.h) {
            ((D)object1).n(w.u(((D)object1).h(), map0));
            d.o(((D)object1).e(), map0);
        }
    }

    public void L(int v) {
        if((v & 0x200) == 0) {
            v |= 0x20;
        }
        this.e = v;
    }

    public void M(String[] arr_s) {
        this.l = null;
        if(arr_s != null) {
            this.g = new int[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                int[] arr_v = this.g;
                arr_v[v] = this.c.a(arr_s[v]);
            }
        }
    }

    public void N(int v) {
        this.a = v;
    }

    public void O(int v) {
        this.b = v;
    }

    public void P(String s) {
        this.J(this.k, s);
    }

    public void Q(String s) throws b {
        if(s == null) {
            s = "java.lang.Object";
        }
        try {
            this.f = this.c.a(s);
            for(Object object0: this.i) {
                ((T)object0).C(s);
            }
            this.m = s;
        }
        catch(e e0) {
            throw new b(e0);
        }
    }

    public void R() {
        this.a = 49;
        this.b = 0;
    }

    private void S(String s, String s1) throws y {
        for(Object object0: this.h) {
            if(((D)object0).i().equals(s)) {
                throw new y("duplicate field: " + s);
            }
            if(false) {
                break;
            }
        }
    }

    private void T(T t0) throws y {
        String s = t0.k();
        String s1 = t0.h();
        ListIterator listIterator0 = this.i.listIterator(0);
        while(listIterator0.hasNext()) {
            if(k.C(t0, s, s1, ((T)listIterator0.next()), listIterator0)) {
                throw new y("duplicate method: " + s + " in " + this.t());
            }
            if(false) {
                break;
            }
        }
    }

    public void U(DataOutputStream dataOutputStream0) throws IOException {
        dataOutputStream0.writeInt(0xCAFEBABE);
        dataOutputStream0.writeShort(this.b);
        dataOutputStream0.writeShort(this.a);
        this.c.B0(dataOutputStream0);
        dataOutputStream0.writeShort(this.e);
        dataOutputStream0.writeShort(this.d);
        dataOutputStream0.writeShort(this.f);
        int v1 = this.g == null ? 0 : this.g.length;
        dataOutputStream0.writeShort(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            dataOutputStream0.writeShort(this.g[v2]);
        }
        int v3 = this.h.size();
        dataOutputStream0.writeShort(v3);
        for(int v = 0; v < v3; ++v) {
            ((D)this.h.get(v)).p(dataOutputStream0);
        }
        dataOutputStream0.writeShort(this.i.size());
        for(Object object0: this.i) {
            ((T)object0).D(dataOutputStream0);
        }
        dataOutputStream0.writeShort(this.j.size());
        d.s(this.j, dataOutputStream0);
    }

    public void a(d d0) {
        d.l(this.j, d0.f());
        this.j.add(d0);
    }

    public void b(D d0) throws y {
        this.S(d0.i(), d0.h());
        this.h.add(d0);
    }

    public final void c(D d0) {
        this.h.add(d0);
    }

    public void d(String s) {
        this.l = null;
        int v = this.c.a(s);
        int[] arr_v = this.g;
        if(arr_v == null) {
            int[] arr_v1 = new int[1];
            this.g = arr_v1;
            arr_v1[0] = v;
            return;
        }
        int[] arr_v2 = new int[arr_v.length + 1];
        System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
        arr_v2[arr_v.length] = v;
        this.g = arr_v2;
    }

    public void e(T t0) throws y {
        this.T(t0);
        this.i.add(t0);
    }

    public final void f(T t0) {
        this.i.add(t0);
    }

    public void g() {
        t t0 = this.h();
        for(Object object0: this.i) {
            ((T)object0).b(t0);
        }
        for(Object object1: this.h) {
            ((D)object1).b(t0);
        }
        this.j = d.b(this.j, t0);
        this.c = t0;
    }

    private t h() {
        t t0 = new t(this.k);
        this.d = t0.o0();
        if(this.y() != null) {
            this.f = t0.a(this.y());
        }
        if(this.g != null) {
            for(int v = 0; true; ++v) {
                int[] arr_v = this.g;
                if(v >= arr_v.length) {
                    break;
                }
                arr_v[v] = t0.a(this.c.A(arr_v[v]));
            }
        }
        return t0;
    }

    public int i() {
        return this.e;
    }

    public d j(String s) {
        for(Object object0: this.j) {
            d d0 = (d)object0;
            if(d0.f().equals(s)) {
                return d0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public List k() {
        return this.j;
    }

    public t l() {
        return this.c;
    }

    public List m() {
        return this.h;
    }

    public int n() {
        G g0 = (G)this.j("InnerClasses");
        if(g0 == null) {
            return -1;
        }
        String s = this.t();
        int v = g0.I();
        for(int v1 = 0; v1 < v; ++v1) {
            if(s.equals(g0.x(v1))) {
                return g0.t(v1);
            }
        }
        return -1;
    }

    public String[] o() {
        String[] arr_s1;
        String[] arr_s = this.l;
        if(arr_s != null) {
            return arr_s;
        }
        int[] arr_v = this.g;
        if(arr_v == null) {
            arr_s1 = new String[0];
        }
        else {
            arr_s1 = new String[arr_v.length];
            for(int v = 0; true; ++v) {
                int[] arr_v1 = this.g;
                if(v >= arr_v1.length) {
                    break;
                }
                arr_s1[v] = this.c.A(arr_v1[v]);
            }
        }
        this.l = arr_s1;
        return arr_s1;
    }

    public int p() {
        return this.a;
    }

    public T q(String s) {
        for(Object object0: this.i) {
            T t0 = (T)object0;
            if(t0.k().equals(s)) {
                return t0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public List r() {
        return this.i;
    }

    public int s() {
        return this.b;
    }

    public String t() {
        return this.k;
    }

    public final void u(Map map0) {
        this.c.z0(map0);
        d.g(this.j, map0);
        for(Object object0: this.i) {
            w.u(((T)object0).h(), map0);
            d.g(((T)object0).e(), map0);
        }
        for(Object object1: this.h) {
            w.u(((D)object1).h(), map0);
            d.g(((D)object1).e(), map0);
        }
    }

    public String v() {
        g0 g00 = (g0)this.j("SourceFile");
        return g00 == null ? null : g00.t();
    }

    private static String w(String s) {
        return s.replaceAll("^.*\\.", "") + ".java";
    }

    public T x() {
        return this.q("<clinit>");
    }

    public String y() {
        if(this.m == null) {
            this.m = this.c.A(this.f);
        }
        return this.m;
    }

    public int z() {
        return this.f;
    }
}

