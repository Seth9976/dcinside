package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.b0;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import y4.l;
import y4.m;
import z3.i;

@b0
public final class d {
    @l
    private final g a;
    @m
    private final e b;
    private final long c;
    @l
    private final List d;
    @l
    private final String e;
    @m
    private final Thread f;
    @m
    private final e g;
    @l
    private final List h;

    public d(@l kotlinx.coroutines.debug.internal.e e0, @l g g0) {
        this.a = g0;
        this.b = e0.d();
        this.c = e0.b;
        this.d = e0.e();
        this.e = e0.g();
        this.f = e0.lastObservedThread;
        this.g = e0.f();
        this.h = e0.h();
    }

    @l
    public final g a() {
        return this.a;
    }

    @m
    public final e b() {
        return this.b;
    }

    @l
    public final List c() {
        return this.d;
    }

    @m
    public final e d() {
        return this.g;
    }

    @m
    public final Thread e() {
        return this.f;
    }

    public final long f() {
        return this.c;
    }

    @l
    public final String g() {
        return this.e;
    }

    @l
    @i(name = "lastObservedStackTrace")
    public final List h() {
        return this.h;
    }
}

