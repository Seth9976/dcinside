package io.realm.transformer;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import org.slf4j.a;
import org.slf4j.b;
import y4.l;

public final class j {
    @l
    private final a a;
    private long b;
    private long c;
    public String d;

    public j() {
        a a0 = b.j("realm-stopwatch");
        L.o(a0, "getLogger(\"realm-stopwatch\")");
        this.a = a0;
        this.b = -1L;
        this.c = -1L;
    }

    @l
    public final String a() {
        String s = this.d;
        if(s != null) {
            return s;
        }
        L.S("label");
        return null;
    }

    public final long b() {
        return this.c;
    }

    @l
    public final a c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final void e(@l String s) {
        L.p(s, "<set-?>");
        this.d = s;
    }

    public final void f(long v) {
        this.c = v;
    }

    public final void g(long v) {
        this.b = v;
    }

    public final void h(@l String s, boolean z) {
        L.p(s, "label");
        long v = System.nanoTime();
        long v1 = z ? this.c : this.b;
        this.c = v;
        long v2 = TimeUnit.NANOSECONDS.toMillis(v - v1);
        this.a.n(s + ": " + v2 + " ms.");
    }

    public static void i(j j0, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        j0.h(s, z);
    }

    public final void j(@l String s) {
        L.p(s, "label");
        if(this.b != -1L) {
            throw new IllegalStateException("Stopwatch was already started");
        }
        this.e(s);
        long v = System.nanoTime();
        this.b = v;
        this.c = v;
    }

    public final void k() {
        long v = System.nanoTime() - this.b;
        String s = this.a();
        long v1 = TimeUnit.NANOSECONDS.toMillis(v);
        this.a.n(s + ": " + v1 + " ms.");
    }
}

