package com.dcinside.app.rx;

import android.os.SystemClock;
import com.dcinside.app.base.i;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nRxCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxCache.kt\ncom/dcinside/app/rx/RxCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class g implements i {
    static final class a {
        private final long a;
        @l
        private final rx.g b;

        public a(long v, @l rx.g g0) {
            L.p(g0, "cache");
            super();
            this.a = v;
            this.b = g0;
        }

        @l
        public final rx.g a() {
            return this.b;
        }

        public final boolean b(long v) {
            long v1 = SystemClock.elapsedRealtime();
            return Math.abs(this.a - v1) > v;
        }
    }

    private final long a;
    @m
    private A3.a b;
    @m
    private Function1 c;
    private boolean d;
    @m
    private a e;

    public g(long v, @m A3.a a0, @m Function1 function10) {
        this.a = v;
        this.b = a0;
        this.c = function10;
    }

    public g(long v, A3.a a0, Function1 function10, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = TimeUnit.HOURS.toMillis(1L);
        }
        this(v, a0, function10);
    }

    public final void c() {
        this.e = null;
        this.d = false;
    }

    @l
    public final rx.g d() {
        static final class b extends N implements Function1 {
            final g e;
            final Function1 f;

            b(g g0, Function1 function10) {
                this.e = g0;
                this.f = function10;
                super(1);
            }

            public final Object a(Throwable throwable0) {
                this.e.d = true;
                L.m(throwable0);
                return this.f.invoke(throwable0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        rx.g g0;
        Function1 function10 = this.c;
        L.m(function10);
        A3.a a0 = this.b;
        L.m(a0);
        a g$a0 = this.e != null && !this.d && !this.e.b(this.a) ? this.e : null;
        this.d = false;
        if(g$a0 == null) {
        label_9:
            g0 = ((rx.g)a0.invoke()).a4((Object object0) -> {
                L.p(new b(this, function10), "$tmp0");
                return new b(this, function10).invoke(object0);
            }).g0();
            long v = SystemClock.elapsedRealtime();
            L.m(g0);
            this.e = new a(v, g0);
            L.o(g0, "also(...)");
        }
        else {
            g0 = g$a0.a();
            if(g0 == null) {
                goto label_9;
            }
        }
        return g0;
    }

    // 检测为 Lambda 实现
    private static final Object e(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.i
    public void release() {
        this.c = null;
        this.b = null;
        this.c();
    }
}

