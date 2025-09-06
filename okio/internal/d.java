package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.e0.a;
import okio.e0;
import okio.o;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n59#1,22:407\n209#1:433\n209#1:434\n1549#2:429\n1620#2,3:430\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n53#1:407,22\n199#1:433\n204#1:434\n53#1:429\n53#1:430,3\n*E\n"})
@i(name = "-Path")
public final class d {
    @l
    private static final o a;
    @l
    private static final o b;
    @l
    private static final o c;
    @l
    private static final o d;
    @l
    private static final o e;

    static {
        d.a = o.d.l("/");
        d.b = o.d.l("\\");
        d.c = o.d.l("/\\");
        d.d = o.d.l(".");
        d.e = o.d.l("..");
    }

    @l
    public static final List A(@l e0 e00) {
        L.p(e00, "<this>");
        List list0 = new ArrayList();
        int v = d.M(e00);
        if(v == -1) {
            v = 0;
        }
        else if(v < e00.h().h0() && e00.h().r(v) == 92) {
            ++v;
        }
        int v1 = e00.h().h0();
        int v2 = v;
        while(v < v1) {
            switch(e00.h().r(v)) {
                case 0x2F: 
                case 92: {
                    list0.add(e00.h().o0(v2, v));
                    v2 = v + 1;
                }
            }
            ++v;
        }
        if(v2 < e00.h().h0()) {
            list0.add(e00.h().o0(v2, e00.h().h0()));
        }
        return list0;
    }

    @l
    public static final e0 B(@l String s, boolean z) {
        L.p(s, "<this>");
        return d.O(new okio.l().b3(s), z);
    }

    @l
    public static final String C(@l e0 e00) {
        L.p(e00, "<this>");
        return e00.h().t0();
    }

    @m
    public static final Character D(@l e0 e00) {
        L.p(e00, "<this>");
        if(o.I(e00.h(), d.a, 0, 2, null) != -1) {
            return null;
        }
        if(e00.h().h0() < 2) {
            return null;
        }
        if(e00.h().r(1) != 58) {
            return null;
        }
        int v = (char)e00.h().r(0);
        return (97 > v || v >= 0x7B) && (65 > v || v >= 91) ? null : Character.valueOf(((char)v));
    }

    private static void E() {
    }

    private static void F() {
    }

    private static void G() {
    }

    private static void H() {
    }

    private static final int I(e0 e00) {
        int v = o.Q(e00.h(), d.a, 0, 2, null);
        return v == -1 ? o.Q(e00.h(), d.b, 0, 2, null) : v;
    }

    private static void J() {
    }

    private static final o K(e0 e00) {
        o o0 = d.a;
        if(o.I(e00.h(), o0, 0, 2, null) == -1) {
            return o.I(e00.h(), d.b, 0, 2, null) == -1 ? null : d.b;
        }
        return o0;
    }

    private static final boolean L(e0 e00) {
        if(e00.h().n(d.e)) {
            if(e00.h().h0() == 2) {
                return true;
            }
            return e00.h().W(e00.h().h0() - 3, d.a, 0, 1) ? true : e00.h().W(e00.h().h0() - 3, d.b, 0, 1);
        }
        return false;
    }

    private static final int M(e0 e00) {
        if(e00.h().h0() == 0) {
            return -1;
        }
        switch(e00.h().r(0)) {
            case 0x2F: {
                return 1;
            }
            case 92: {
                if(e00.h().h0() > 2 && e00.h().r(1) == 92) {
                    int v1 = e00.h().F(d.b, 2);
                    return v1 == -1 ? e00.h().h0() : v1;
                }
                return 1;
            }
            default: {
                if(e00.h().h0() > 2 && e00.h().r(1) == 58 && e00.h().r(2) == 92) {
                    int v = (char)e00.h().r(0);
                    return (97 > v || v >= 0x7B) && (65 > v || v >= 91) ? -1 : 3;
                }
                return -1;
            }
        }
    }

    private static final boolean N(okio.l l0, o o0) {
        if(!L.g(o0, d.b)) {
            return false;
        }
        if(l0.size() < 2L) {
            return false;
        }
        if(l0.Q(1L) != 58) {
            return false;
        }
        int v = (char)l0.Q(0L);
        return 97 <= v && v < 0x7B || 65 <= v && v < 91;
    }

    @l
    public static final e0 O(@l okio.l l0, boolean z) {
        o o2;
        o o1;
        L.p(l0, "<this>");
        okio.l l1 = new okio.l();
        o o0 = null;
        int v1 = 0;
        while(true) {
            if(!l0.a0(0L, d.a)) {
                o1 = d.b;
                if(l0.a0(0L, o1)) {
                    goto label_8;
                }
                break;
            }
        label_8:
            int v2 = l0.readByte();
            if(o0 == null) {
                o0 = d.P(((byte)v2));
            }
            ++v1;
        }
        boolean z1 = v1 >= 2 && L.g(o0, o1);
        if(z1) {
            L.m(o0);
            l1.t1(o0);
            l1.t1(o0);
        }
        else if(v1 > 0) {
            L.m(o0);
            l1.t1(o0);
        }
        else {
            long v3 = l0.W(d.c);
            if(o0 == null) {
                o0 = v3 == -1L ? d.Q("/") : d.P(l0.Q(v3));
            }
            if(d.N(l0, o0)) {
                if(v3 == 2L) {
                    l1.write(l0, 3L);
                }
                else {
                    l1.write(l0, 2L);
                }
            }
        }
        boolean z2 = l1.size() > 0L;
        ArrayList arrayList0 = new ArrayList();
        while(!l0.j3()) {
            long v4 = l0.W(d.c);
            if(v4 == -1L) {
                o2 = l0.B1();
            }
            else {
                o2 = l0.F0(v4);
                l0.readByte();
            }
            o o3 = d.e;
            if(L.g(o2, o3)) {
                if(z2 && arrayList0.isEmpty()) {
                    continue;
                }
                if(!z || !z2 && (arrayList0.isEmpty() || L.g(u.p3(arrayList0), o3))) {
                    arrayList0.add(o2);
                }
                else {
                    if(z1 && arrayList0.size() == 1) {
                        continue;
                    }
                    u.P0(arrayList0);
                }
            }
            else if(!L.g(o2, d.d) && !L.g(o2, o.f)) {
                arrayList0.add(o2);
            }
        }
        int v5 = arrayList0.size();
        for(int v = 0; v < v5; ++v) {
            if(v > 0) {
                l1.t1(o0);
            }
            l1.t1(((o)arrayList0.get(v)));
        }
        if(l1.size() == 0L) {
            l1.t1(d.d);
        }
        return new e0(l1.B1());
    }

    private static final o P(byte b) {
        switch(b) {
            case 0x2F: {
                return d.a;
            }
            case 92: {
                return d.b;
            }
            default: {
                throw new IllegalArgumentException("not a directory separator: " + ((int)b));
            }
        }
    }

    private static final o Q(String s) {
        if(L.g(s, "/")) {
            return d.a;
        }
        if(!L.g(s, "\\")) {
            throw new IllegalArgumentException("not a directory separator: " + s);
        }
        return d.b;
    }

    public static final int j(@l e0 e00, @l e0 e01) {
        L.p(e00, "<this>");
        L.p(e01, "other");
        return e00.h().f(e01.h());
    }

    public static final boolean k(@l e0 e00, @m Object object0) {
        L.p(e00, "<this>");
        return object0 instanceof e0 && L.g(((e0)object0).h(), e00.h());
    }

    public static final int l(@l e0 e00) {
        L.p(e00, "<this>");
        return e00.h().hashCode();
    }

    public static final boolean m(@l e0 e00) {
        L.p(e00, "<this>");
        return d.M(e00) != -1;
    }

    public static final boolean n(@l e0 e00) {
        L.p(e00, "<this>");
        return d.M(e00) == -1;
    }

    public static final boolean o(@l e0 e00) {
        L.p(e00, "<this>");
        return d.M(e00) == e00.h().h0();
    }

    @l
    public static final String p(@l e0 e00) {
        L.p(e00, "<this>");
        return e00.r().t0();
    }

    @l
    public static final o q(@l e0 e00) {
        L.p(e00, "<this>");
        int v = d.I(e00);
        if(v != -1) {
            return o.p0(e00.h(), v + 1, 0, 2, null);
        }
        return e00.H() == null || e00.h().h0() != 2 ? e00.h() : o.f;
    }

    @l
    public static final e0 r(@l e0 e00) {
        L.p(e00, "<this>");
        return e0.b.d(e00.toString(), true);
    }

    @m
    public static final e0 s(@l e0 e00) {
        L.p(e00, "<this>");
        if(!L.g(e00.h(), d.d) && !L.g(e00.h(), d.a) && !L.g(e00.h(), d.b) && !d.L(e00)) {
            int v = d.I(e00);
            if(v == 2 && e00.H() != null) {
                return e00.h().h0() == 3 ? null : new e0(o.p0(e00.h(), 0, 3, 1, null));
            }
            if(v == 1 && e00.h().i0(d.b)) {
                return null;
            }
            if(v == -1 && e00.H() != null) {
                return e00.h().h0() == 2 ? null : new e0(o.p0(e00.h(), 0, 2, 1, null));
            }
            if(v == -1) {
                return new e0(d.d);
            }
            return v == 0 ? new e0(o.p0(e00.h(), 0, 1, 1, null)) : new e0(o.p0(e00.h(), 0, v, 1, null));
        }
        return null;
    }

    @l
    public static final e0 t(@l e0 e00, @l e0 e01) {
        L.p(e00, "<this>");
        L.p(e01, "other");
        if(!L.g(e00.i(), e01.i())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + e00 + " and " + e01).toString());
        }
        List list0 = e00.k();
        List list1 = e01.k();
        int v = Math.min(list0.size(), list1.size());
        int v1;
        for(v1 = 0; v1 < v && L.g(list0.get(v1), list1.get(v1)); ++v1) {
        }
        if(v1 == v && e00.h().h0() == e01.h().h0()) {
            return a.h(e0.b, ".", false, 1, null);
        }
        if(list1.subList(v1, list1.size()).indexOf(d.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + e00 + " and " + e01).toString());
        }
        okio.l l0 = new okio.l();
        o o0 = d.K(e01);
        if(o0 == null) {
            o0 = d.K(e00);
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
    public static final e0 u(@l e0 e00, @l String s, boolean z) {
        L.p(e00, "<this>");
        L.p(s, "child");
        return d.x(e00, d.O(new okio.l().b3(s), false), z);
    }

    @l
    public static final e0 v(@l e0 e00, @l okio.l l0, boolean z) {
        L.p(e00, "<this>");
        L.p(l0, "child");
        return d.x(e00, d.O(l0, false), z);
    }

    @l
    public static final e0 w(@l e0 e00, @l o o0, boolean z) {
        L.p(e00, "<this>");
        L.p(o0, "child");
        return d.x(e00, d.O(new okio.l().t1(o0), false), z);
    }

    @l
    public static final e0 x(@l e0 e00, @l e0 e01, boolean z) {
        L.p(e00, "<this>");
        L.p(e01, "child");
        if(!e01.l() && e01.H() == null) {
            o o0 = d.K(e00);
            if(o0 == null) {
                o0 = d.K(e01);
                if(o0 == null) {
                    o0 = d.Q("/");
                }
            }
            okio.l l0 = new okio.l();
            l0.t1(e00.h());
            if(l0.size() > 0L) {
                l0.t1(o0);
            }
            l0.t1(e01.h());
            return d.O(l0, z);
        }
        return e01;
    }

    @m
    public static final e0 y(@l e0 e00) {
        L.p(e00, "<this>");
        int v = d.M(e00);
        return v == -1 ? null : new e0(e00.h().o0(0, v));
    }

    @l
    public static final List z(@l e0 e00) {
        L.p(e00, "<this>");
        ArrayList arrayList0 = new ArrayList();
        int v = d.M(e00);
        if(v == -1) {
            v = 0;
        }
        else if(v < e00.h().h0() && e00.h().r(v) == 92) {
            ++v;
        }
        int v1 = e00.h().h0();
        int v2 = v;
        while(v < v1) {
            switch(e00.h().r(v)) {
                case 0x2F: 
                case 92: {
                    arrayList0.add(e00.h().o0(v2, v));
                    v2 = v + 1;
                }
            }
            ++v;
        }
        if(v2 < e00.h().h0()) {
            arrayList0.add(e00.h().o0(v2, e00.h().h0()));
        }
        List list0 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object0: arrayList0) {
            list0.add(((o)object0).t0());
        }
        return list0;
    }
}

