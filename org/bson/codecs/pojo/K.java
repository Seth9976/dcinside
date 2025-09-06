package org.bson.codecs.pojo;

import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class k {
    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final List f;
    public static final List g;

    static {
        g g0 = new g();
        k.a = g0;
        f f0 = new f();
        k.b = f0;
        k.c = new i();
        k.d = new j();
        h h0 = new h();
        k.e = h0;
        k.f = DesugarCollections.unmodifiableList(Arrays.asList(new e[]{g0, f0, h0}));
        k.g = Collections.emptyList();
    }
}

