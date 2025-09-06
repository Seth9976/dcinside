package androidx.datastore.core;

import A3.o;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.channels.p.a;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class SimpleActor {
    @l
    private final O a;
    @l
    private final o b;
    @l
    private final kotlinx.coroutines.channels.l c;
    @l
    private final AtomicInteger d;

    public SimpleActor(@l O o0, @l Function1 function10, @l o o1, @l o o2) {
        L.p(o0, "scope");
        L.p(function10, "onComplete");
        L.p(o1, "onUndeliveredElement");
        L.p(o2, "consumeMessage");
        super();
        this.a = o0;
        this.b = o2;
        this.c = kotlinx.coroutines.channels.o.d(0x7FFFFFFF, null, null, 6, null);
        this.d = new AtomicInteger(0);
        I0 i00 = (I0)o0.getCoroutineContext().get(I0.B8);
        if(i00 != null) {
            i00.w(new Function1(this, o1) {
                final Function1 e;
                final SimpleActor f;
                final o g;

                {
                    this.e = function10;
                    this.f = simpleActor0;
                    this.g = o0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return S0.a;
                }

                public final void invoke(@m Throwable throwable0) {
                    S0 s00;
                    this.e.invoke(throwable0);
                    this.f.c.G(throwable0);
                    do {
                        Object object0 = p.h(this.f.c.v());
                        if(object0 == null) {
                            s00 = null;
                        }
                        else {
                            this.g.invoke(object0, throwable0);
                            s00 = S0.a;
                        }
                    }
                    while(s00 != null);
                }
            });
        }
    }

    public final void e(Object object0) {
        Object object1 = this.c.l(object0);
        if(object1 instanceof a) {
            Throwable throwable0 = p.f(object1);
            if(throwable0 == null) {
                throwable0 = new w("Channel was closed normally");
            }
            throw throwable0;
        }
        if(!p.m(object1)) {
            throw new IllegalStateException("Check failed.");
        }
        if(this.d.getAndIncrement() == 0) {
            androidx.datastore.core.SimpleActor.offer.2 simpleActor$offer$20 = new o(null) {
                Object k;
                int l;
                final SimpleActor m;

                {
                    this.m = simpleActor0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.datastore.core.SimpleActor.offer.2(this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.datastore.core.SimpleActor.offer.2)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    o o0;
                    Object object1 = b.l();
                    switch(this.l) {
                        case 0: {
                            f0.n(object0);
                            if(this.m.d.get() <= 0) {
                                throw new IllegalStateException("Check failed.");
                            }
                            goto label_12;
                        }
                        case 1: {
                            o0 = (o)this.k;
                            f0.n(object0);
                            goto label_19;
                        }
                        case 2: {
                            f0.n(object0);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    do {
                        if(this.m.d.decrementAndGet() == 0) {
                            return S0.a;
                        }
                    label_12:
                        P.j(this.m.a);
                        o0 = this.m.b;
                        this.k = o0;
                        this.l = 1;
                        object0 = this.m.c.F(this);
                        if(object0 == object1) {
                            return object1;
                        }
                    label_19:
                        this.k = null;
                        this.l = 2;
                    }
                    while(o0.invoke(object0, this) != object1);
                    return object1;
                }
            };
            k.f(this.a, null, null, simpleActor$offer$20, 3, null);
        }
    }
}

