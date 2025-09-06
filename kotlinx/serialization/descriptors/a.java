package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class a {
    @l
    private final String a;
    private boolean b;
    @l
    private List c;
    @l
    private final List d;
    @l
    private final Set e;
    @l
    private final List f;
    @l
    private final List g;
    @l
    private final List h;

    public a(@l String s) {
        L.p(s, "serialName");
        super();
        this.a = s;
        this.c = u.H();
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    public final void a(@l String s, @l f f0, @l List list0, boolean z) {
        L.p(s, "elementName");
        L.p(f0, "descriptor");
        L.p(list0, "annotations");
        if(!this.e.add(s)) {
            throw new IllegalArgumentException(("Element with name \'" + s + "\' is already registered").toString());
        }
        this.d.add(s);
        this.f.add(f0);
        this.g.add(list0);
        this.h.add(Boolean.valueOf(z));
    }

    public static void b(a a0, String s, f f0, List list0, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = u.H();
        }
        if((v & 8) != 0) {
            z = false;
        }
        a0.a(s, f0, list0, z);
    }

    @l
    public final List c() {
        return this.c;
    }

    @kotlinx.serialization.f
    public static void d() {
    }

    @l
    public final List e() {
        return this.g;
    }

    @l
    public final List f() {
        return this.f;
    }

    @l
    public final List g() {
        return this.d;
    }

    @l
    public final List h() {
        return this.h;
    }

    @l
    public final String i() {
        return this.a;
    }

    public final boolean j() {
        return this.b;
    }

    @k(level = m.b, message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.")
    @kotlinx.serialization.f
    public static void k() {
    }

    public final void l(@l List list0) {
        L.p(list0, "<set-?>");
        this.c = list0;
    }

    public final void m(boolean z) {
        this.b = z;
    }
}

