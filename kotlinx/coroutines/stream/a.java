package kotlinx.coroutines.stream;

import j..util.stream.Stream;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;

final class a implements i {
    @l
    private final Stream a;
    private static final AtomicIntegerFieldUpdater b;
    private volatile int consumed$volatile;

    static {
        a.b = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed$volatile");
    }

    public a(@l Stream stream0) {
        this.a = stream0;
        this.consumed$volatile = 0;
    }

    @Override  // kotlinx.coroutines.flow.i
    @m
    public Object collect(@l j j0, @l d d0) {
        @f(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
        static final class kotlinx.coroutines.stream.a.a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            final a o;
            int p;

            kotlinx.coroutines.stream.a.a(a a0, d d0) {
                this.o = a0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.p |= 0x80000000;
                return this.o.collect(null, this);
            }
        }

        Iterator iterator0;
        j j1;
        a a0;
        kotlinx.coroutines.stream.a.a a$a0;
        if(d0 instanceof kotlinx.coroutines.stream.a.a) {
            a$a0 = (kotlinx.coroutines.stream.a.a)d0;
            int v = a$a0.p;
            if((v & 0x80000000) == 0) {
                a$a0 = new kotlinx.coroutines.stream.a.a(this, d0);
            }
            else {
                a$a0.p = v ^ 0x80000000;
            }
        }
        else {
            a$a0 = new kotlinx.coroutines.stream.a.a(this, d0);
        }
        Object object0 = a$a0.n;
        Object object1 = b.l();
        switch(a$a0.p) {
            case 0: {
                f0.n(object0);
                if(a.b.compareAndSet(this, 0, 1)) {
                    try {
                        a0 = this;
                        j1 = j0;
                        iterator0 = this.a.iterator();
                        goto label_25;
                    }
                    catch(Throwable throwable0) {
                        break;
                    }
                }
                throw new IllegalStateException("Stream.consumeAsFlow can be collected only once");
            }
            case 1: {
                iterator0 = (Iterator)a$a0.m;
                j j2 = (j)a$a0.l;
                a0 = (a)a$a0.k;
                try {
                    f0.n(object0);
                    j1 = j2;
                    while(true) {
                    label_25:
                        if(!iterator0.hasNext()) {
                            goto label_38;
                        }
                        Object object2 = iterator0.next();
                        a$a0.k = a0;
                        a$a0.l = j1;
                        a$a0.m = iterator0;
                        a$a0.p = 1;
                        if(j1.emit(object2, a$a0) == object1) {
                            return object1;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a0.a.close();
        throw throwable0;
    label_38:
        a0.a.close();
        return S0.a;
    }

    private final int f() {
        return this.consumed$volatile;
    }

    private final void h(int v) {
        this.consumed$volatile = v;
    }
}

