package com.dcinside.app.util.otp;

import android.os.Handler;
import android.os.Looper;
import com.dcinside.app.util.Dl;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTotpCountdownTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotpCountdownTask.kt\ncom/dcinside/app/util/otp/TotpCountdownTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
public final class j implements Runnable {
    public interface a {
        void a(long arg1);

        void b();
    }

    @l
    private final k a;
    @l
    private final d b;
    private final long c;
    @l
    private final Handler d;
    private long e;
    private boolean f;
    @m
    private a g;

    public j(@l k k0, @l i i0, long v) {
        L.p(k0, "mCounter");
        L.p(i0, "clock");
        super();
        this.a = k0;
        this.d = new Handler(Looper.getMainLooper());
        this.e = 0x8000000000000000L;
        this.b = i0;
        this.c = v;
    }

    private final void a(long v) {
        a j$a0 = this.g;
        if(j$a0 != null && !this.f) {
            L.m(j$a0);
            j$a0.a(v);
        }
    }

    private final void b() {
        a j$a0 = this.g;
        if(j$a0 != null && !this.f) {
            L.m(j$a0);
            j$a0.b();
        }
    }

    private final long c(long v) {
        return this.a.c(v / 1000L);
    }

    private final long d(long v) {
        long v1 = this.c(v);
        return v - Dl.w(this.a.d(v1));
    }

    private final long e(long v) {
        long v1 = this.c(v);
        return Dl.w(this.a.d(v1 + 1L)) - v;
    }

    private final void f() {
        long v = this.d(this.b.a());
        this.d.postDelayed(this, this.c - v % this.c);
    }

    public final void g(@m a j$a0) {
        this.g = j$a0;
    }

    public final void h() {
        if(this.f) {
            throw new IllegalStateException("Task already stopped and cannot be restarted.");
        }
        this.run();
    }

    public final void i() {
        this.f = true;
    }

    @Override
    public void run() {
        if(this.f) {
            return;
        }
        long v = this.b.a();
        long v1 = this.c(v);
        if(this.e != v1) {
            this.e = v1;
            this.b();
        }
        this.a(this.e(v));
        this.f();
    }
}

