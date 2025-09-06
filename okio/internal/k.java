package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okio.e0;
import y4.l;
import y4.m;

public final class k {
    @l
    private final e0 a;
    private final boolean b;
    @l
    private final String c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    @m
    private final Long h;
    private final long i;
    @l
    private final List j;

    public k(@l e0 e00, boolean z, @l String s, long v, long v1, long v2, int v3, @m Long long0, long v4) {
        L.p(e00, "canonicalPath");
        L.p(s, "comment");
        super();
        this.a = e00;
        this.b = z;
        this.c = s;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = long0;
        this.i = v4;
        this.j = new ArrayList();
    }

    public k(e0 e00, boolean z, String s, long v, long v1, long v2, int v3, Long long0, long v4, int v5, w w0) {
        this(e00, ((v5 & 2) == 0 ? z : false), ((v5 & 4) == 0 ? s : ""), ((v5 & 8) == 0 ? v : -1L), ((v5 & 16) == 0 ? v1 : -1L), ((v5 & 0x20) == 0 ? v2 : -1L), ((v5 & 0x40) == 0 ? v3 : -1), ((v5 & 0x80) == 0 ? long0 : null), ((v5 & 0x100) == 0 ? v4 : -1L));
    }

    @l
    public final e0 a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.j;
    }

    @l
    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.e;
    }

    public final int e() {
        return this.g;
    }

    public final long f() {
        return this.d;
    }

    @m
    public final Long g() {
        return this.h;
    }

    public final long h() {
        return this.i;
    }

    public final long i() {
        return this.f;
    }

    public final boolean j() {
        return this.b;
    }
}

