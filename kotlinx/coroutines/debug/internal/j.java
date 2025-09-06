package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.util.List;
import kotlin.b0;
import kotlin.coroutines.g;
import kotlinx.coroutines.M;
import kotlinx.coroutines.N;
import y4.l;
import y4.m;

@b0
public final class j implements Serializable {
    @m
    private final Long a;
    @m
    private final String b;
    @m
    private final String c;
    @l
    private final String d;
    @m
    private final String e;
    @m
    private final String f;
    @l
    private final List g;
    private final long h;

    public j(@l e e0, @l g g0) {
        String s1;
        M m0 = (M)g0.get(M.b);
        String s = null;
        this.a = m0 == null ? null : m0.j1();
        kotlin.coroutines.e e1 = (kotlin.coroutines.e)g0.get(kotlin.coroutines.e.z8);
        this.b = e1 == null ? null : e1.toString();
        N n0 = (N)g0.get(N.b);
        this.c = n0 == null ? null : n0.j1();
        this.d = e0.g();
        Thread thread0 = e0.lastObservedThread;
        if(thread0 == null) {
            s1 = null;
        }
        else {
            Thread.State thread$State0 = thread0.getState();
            s1 = thread$State0 == null ? null : thread$State0.toString();
        }
        this.e = s1;
        Thread thread1 = e0.lastObservedThread;
        if(thread1 != null) {
            s = thread1.getName();
        }
        this.f = s;
        this.g = e0.h();
        this.h = e0.b;
    }

    @m
    public final Long a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @l
    public final List c() {
        return this.g;
    }

    @m
    public final String d() {
        return this.f;
    }

    @m
    public final String e() {
        return this.e;
    }

    public final long f() {
        return this.h;
    }

    @l
    public final String g() {
        return this.d;
    }

    @m
    public final String getName() {
        return this.c;
    }
}

