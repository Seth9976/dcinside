package com.dcinside.app.rx.bus;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import rx.g;
import rx.subjects.c;
import y4.l;
import y4.m;

public final class b implements a {
    private boolean a;
    @l
    private final c b;

    public b() {
        c c0 = c.C7();
        L.o(c0, "create(...)");
        this.b = c0;
    }

    public final void c() {
        this.a = true;
        this.b.d();
    }

    @Override  // com.dcinside.app.rx.bus.a
    @l
    public g e(@l Class class0) {
        g g0;
        L.p(class0, "eventType");
        if(this.a) {
            g0 = g.W1();
            L.m(g0);
            return g0;
        }
        g0 = this.b.Q3(class0);
        L.m(g0);
        return g0;
    }

    @Override  // com.dcinside.app.rx.bus.a
    public void k(@l Object object0) {
        @f(c = "com.dcinside.app.rx.bus.ContextBus$busPost$1", f = "ContextBus.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.rx.bus.b.a extends o implements A3.o {
            int k;
            final b l;
            final Object m;

            com.dcinside.app.rx.bus.b.a(b b0, Object object0, d d0) {
                this.l = b0;
                this.m = object0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.rx.bus.b.a(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.rx.bus.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(!this.l.a) {
                    this.l.b.onNext(this.m);
                }
                return S0.a;
            }
        }

        L.p(object0, "event");
        com.dcinside.app.rx.bus.b.a b$a0 = new com.dcinside.app.rx.bus.b.a(this, object0, null);
        k.f(() -> i.a, h0.e(), null, b$a0, 2, null);
    }
}

