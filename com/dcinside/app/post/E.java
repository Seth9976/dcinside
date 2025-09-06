package com.dcinside.app.post;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import rx.g;
import rx.o;
import rx.subjects.b;
import y4.l;
import y4.m;

public final class e {
    @l
    private final b a;
    @m
    private WeakReference b;
    @m
    private o c;
    private long d;
    @m
    private Throwable e;

    public e() {
        b b0 = b.C7();
        L.o(b0, "create(...)");
        this.a = b0;
    }

    public final void d(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }

    @m
    public final Throwable e() {
        return this.e;
    }

    public final long f() {
        return this.d;
    }

    public final void g(@m d1 d10) {
        static final class a extends N implements Function1 {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(1);
            }

            public final g a(Boolean boolean0) {
                L.m(boolean0);
                return boolean0.booleanValue() ? g.s6(0L, TimeUnit.MILLISECONDS) : g.s6(500L, TimeUnit.MILLISECONDS);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.post.e.b extends N implements Function1 {
            final e e;

            com.dcinside.app.post.e.b(e e0) {
                this.e = e0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                this.e.j(boolean0.booleanValue());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        WeakReference weakReference0 = this.b;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.b = new WeakReference(d10);
        o o0 = this.c;
        if(o0 != null) {
            o0.l();
        }
        c c0 = (Object object0) -> {
            L.p(a.e, "$tmp0");
            return (g)a.e.invoke(object0);
        };
        this.c = this.a.t1(c0).M3(rx.android.schedulers.a.c()).x5((Object object0) -> {
            L.p(new com.dcinside.app.post.e.b(this), "$tmp0");
            new com.dcinside.app.post.e.b(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final g h(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void i(Function1 function10, Object object0) [...]

    private final void j(boolean z) {
        WeakReference weakReference0 = this.b;
        if(weakReference0 != null) {
            d1 d10 = (d1)weakReference0.get();
            if(d10 != null) {
                d10.f().setVisibility(0);
                if(z) {
                    d10.f().setText("");
                    d10.h().setVisibility(0);
                    d10.e().setVisibility(4);
                    return;
                }
                d10.f().setText((this.e == null ? null : this.e.getMessage()));
                d10.h().setVisibility(4);
                d10.e().setVisibility(0);
            }
        }
    }

    public final void k() {
        WeakReference weakReference0 = this.b;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        o o0 = this.c;
        if(o0 != null) {
            o0.l();
        }
    }

    public final void l(@m Throwable throwable0) {
        if(throwable0 == null) {
            this.d = 0L;
        }
        else {
            ++this.d;
        }
        this.e = throwable0;
    }

    public final void m(long v) {
        this.d = v;
    }
}

