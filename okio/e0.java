package okio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okio.internal.d;
import y4.l;
import y4.m;
import z3.f;
import z3.i;
import z3.j;
import z3.n;

@s0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
public final class e0 implements Comparable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @i(name = "get")
        @j
        @n
        public final e0 a(@l File file0) {
            L.p(file0, "<this>");
            return a.g(this, file0, false, 1, null);
        }

        @l
        @i(name = "get")
        @j
        @n
        public final e0 b(@l File file0, boolean z) {
            L.p(file0, "<this>");
            String s = file0.toString();
            L.o(s, "toString(...)");
            return this.d(s, z);
        }

        @l
        @i(name = "get")
        @j
        @n
        public final e0 c(@l String s) {
            L.p(s, "<this>");
            return a.h(this, s, false, 1, null);
        }

        @l
        @i(name = "get")
        @j
        @n
        public final e0 d(@l String s, boolean z) {
            L.p(s, "<this>");
            return d.B(s, z);
        }

        @l
        @i(name = "get")
        @j
        @n
        public final e0 e(@l Path path0) {
            L.p(path0, "<this>");
            return a.i(this, path0, false, 1, null);
        }

        @l
        @i(name = "get")
        @j
        @n
        public final e0 f(@l Path path0, boolean z) {
            L.p(path0, "<this>");
            return this.d(path0.toString(), z);
        }

        public static e0 g(a e0$a0, File file0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return e0$a0.b(file0, z);
        }

        public static e0 h(a e0$a0, String s, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return e0$a0.d(s, z);
        }

        public static e0 i(a e0$a0, Path path0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = false;
            }
            return e0$a0.f(path0, z);
        }
    }

    @l
    private final o a;
    @l
    public static final a b;
    @l
    @f
    public static final String c;

    static {
        e0.b = new a(null);
        L.o("/", "separator");
        e0.c = "/";
    }

    public e0(@l o o0) {
        L.p(o0, "bytes");
        super();
        this.a = o0;
    }

    @l
    @i(name = "resolve")
    public final e0 A(@l e0 e00) {
        L.p(e00, "child");
        return d.x(this, e00, false);
    }

    @l
    public final e0 B(@l e0 e00, boolean z) {
        L.p(e00, "child");
        return d.x(this, e00, z);
    }

    public static e0 C(e0 e00, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return e00.w(s, z);
    }

    public static e0 D(e0 e00, o o0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return e00.z(o0, z);
    }

    public static e0 E(e0 e00, e0 e01, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return e00.B(e01, z);
    }

    @l
    public final File F() {
        return new File(this.toString());
    }

    @l
    public final Path G() {
        Path path0 = Paths.get(this.toString(), new String[0]);
        L.o(path0, "get(...)");
        return path0;
    }

    @m
    @i(name = "volumeLetter")
    public final Character H() {
        if(o.I(this.h(), d.a, 0, 2, null) == -1 && this.h().h0() >= 2 && this.h().r(1) == 58) {
            int v = (char)this.h().r(0);
            return (97 > v || v >= 0x7B) && (65 > v || v >= 91) ? null : Character.valueOf(((char)v));
        }
        return null;
    }

    public int a(@l e0 e00) {
        L.p(e00, "other");
        return this.h().f(e00.h());
    }

    @l
    @i(name = "get")
    @j
    @n
    public static final e0 b(@l File file0) {
        return e0.b.a(file0);
    }

    @l
    @i(name = "get")
    @j
    @n
    public static final e0 c(@l File file0, boolean z) {
        return e0.b.b(file0, z);
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((e0)object0));
    }

    @l
    @i(name = "get")
    @j
    @n
    public static final e0 d(@l String s) {
        return e0.b.c(s);
    }

    @l
    @i(name = "get")
    @j
    @n
    public static final e0 e(@l String s, boolean z) {
        return e0.b.d(s, z);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof e0 && L.g(((e0)object0).h(), this.h());
    }

    @l
    @i(name = "get")
    @j
    @n
    public static final e0 f(@l Path path0) {
        return e0.b.e(path0);
    }

    @l
    @i(name = "get")
    @j
    @n
    public static final e0 g(@l Path path0, boolean z) {
        return e0.b.f(path0, z);
    }

    @l
    public final o h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.h().hashCode();
    }

    @m
    public final e0 i() {
        int v = d.M(this);
        return v == -1 ? null : new e0(this.h().o0(0, v));
    }

    @l
    public final List j() {
        ArrayList arrayList0 = new ArrayList();
        int v = d.M(this);
        if(v == -1) {
            v = 0;
        }
        else if(v < this.h().h0() && this.h().r(v) == 92) {
            ++v;
        }
        int v1 = this.h().h0();
        int v2 = v;
        while(v < v1) {
            switch(this.h().r(v)) {
                case 0x2F: 
                case 92: {
                    arrayList0.add(this.h().o0(v2, v));
                    v2 = v + 1;
                }
            }
            ++v;
        }
        if(v2 < this.h().h0()) {
            arrayList0.add(this.h().o0(v2, this.h().h0()));
        }
        List list0 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object0: arrayList0) {
            list0.add(((o)object0).t0());
        }
        return list0;
    }

    @l
    public final List k() {
        List list0 = new ArrayList();
        int v = d.M(this);
        if(v == -1) {
            v = 0;
        }
        else if(v < this.h().h0() && this.h().r(v) == 92) {
            ++v;
        }
        int v1 = this.h().h0();
        int v2 = v;
        while(v < v1) {
            switch(this.h().r(v)) {
                case 0x2F: 
                case 92: {
                    list0.add(this.h().o0(v2, v));
                    v2 = v + 1;
                }
            }
            ++v;
        }
        if(v2 < this.h().h0()) {
            list0.add(this.h().o0(v2, this.h().h0()));
        }
        return list0;
    }

    public final boolean l() {
        return d.M(this) != -1;
    }

    public final boolean m() {
        return d.M(this) == -1;
    }

    public final boolean n() {
        return d.M(this) == this.h().h0();
    }

    @l
    @i(name = "name")
    public final String p() {
        return this.r().t0();
    }

    @l
    @i(name = "nameBytes")
    public final o r() {
        int v = d.I(this);
        if(v != -1) {
            return o.p0(this.h(), v + 1, 0, 2, null);
        }
        return this.H() == null || this.h().h0() != 2 ? this.h() : o.f;
    }

    @l
    public final e0 s() {
        return e0.b.d(this.toString(), true);
    }

    @m
    @i(name = "parent")
    public final e0 t() {
        if(!L.g(this.h(), d.d) && !L.g(this.h(), d.a) && !L.g(this.h(), d.b) && !d.L(this)) {
            int v = d.I(this);
            if(v == 2 && this.H() != null) {
                return this.h().h0() == 3 ? null : new e0(o.p0(this.h(), 0, 3, 1, null));
            }
            if(v != 1 || !this.h().i0(d.b)) {
                if(v == -1 && this.H() != null) {
                    return this.h().h0() == 2 ? null : new e0(o.p0(this.h(), 0, 2, 1, null));
                }
                if(v == -1) {
                    return new e0(d.d);
                }
                return v == 0 ? new e0(o.p0(this.h(), 0, 1, 1, null)) : new e0(o.p0(this.h(), 0, v, 1, null));
            }
        }
        return null;
    }

    @Override
    @l
    public String toString() {
        return this.h().t0();
    }

    @l
    public final e0 u(@l e0 e00) {
        L.p(e00, "other");
        if(!L.g(this.i(), e00.i())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + e00).toString());
        }
        List list0 = this.k();
        List list1 = e00.k();
        int v = Math.min(list0.size(), list1.size());
        int v1;
        for(v1 = 0; v1 < v && L.g(list0.get(v1), list1.get(v1)); ++v1) {
        }
        if(v1 == v && this.h().h0() == e00.h().h0()) {
            return a.h(e0.b, ".", false, 1, null);
        }
        if(list1.subList(v1, list1.size()).indexOf(d.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + e00).toString());
        }
        okio.l l0 = new okio.l();
        o o0 = d.K(e00);
        if(o0 == null) {
            o0 = d.K(this);
            if(o0 == null) {
                o0 = d.Q("/");
            }
        }
        int v2 = list1.size();
        for(int v3 = v1; v3 < v2; ++v3) {
            l0.t1(d.e);
            l0.t1(o0);
        }
        int v4 = list0.size();
        while(v1 < v4) {
            l0.t1(((o)list0.get(v1)));
            l0.t1(o0);
            ++v1;
        }
        return d.O(l0, false);
    }

    @l
    @i(name = "resolve")
    public final e0 v(@l String s) {
        L.p(s, "child");
        return d.x(this, d.O(new okio.l().b3(s), false), false);
    }

    @l
    public final e0 w(@l String s, boolean z) {
        L.p(s, "child");
        return d.x(this, d.O(new okio.l().b3(s), false), z);
    }

    @l
    @i(name = "resolve")
    public final e0 y(@l o o0) {
        L.p(o0, "child");
        return d.x(this, d.O(new okio.l().t1(o0), false), false);
    }

    @l
    public final e0 z(@l o o0, boolean z) {
        L.p(o0, "child");
        return d.x(this, d.O(new okio.l().t1(o0), false), z);
    }
}

