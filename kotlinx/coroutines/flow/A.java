package kotlinx.coroutines.flow;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlinx.coroutines.flow.internal.v;
import kotlinx.coroutines.x0;
import y4.l;
import y4.m;

@x0
public abstract class a implements c, i {
    @Override  // kotlinx.coroutines.flow.i
    @m
    public final Object collect(@l j j0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {0xE2}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
        static final class kotlinx.coroutines.flow.a.a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            final a m;
            int n;

            kotlinx.coroutines.flow.a.a(a a0, d d0) {
                this.m = a0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.collect(null, this);
            }
        }

        v v2;
        Throwable throwable1;
        kotlinx.coroutines.flow.a.a a$a0;
        if(d0 instanceof kotlinx.coroutines.flow.a.a) {
            a$a0 = (kotlinx.coroutines.flow.a.a)d0;
            int v = a$a0.n;
            if((v & 0x80000000) == 0) {
                a$a0 = new kotlinx.coroutines.flow.a.a(this, d0);
            }
            else {
                a$a0.n = v ^ 0x80000000;
            }
        }
        else {
            a$a0 = new kotlinx.coroutines.flow.a.a(this, d0);
        }
        Object object0 = a$a0.l;
        Object object1 = b.l();
        switch(a$a0.n) {
            case 0: {
                f0.n(object0);
                v v1 = new v(j0, a$a0.getContext());
                try {
                    a$a0.k = v1;
                    a$a0.n = 1;
                    if(this.f(v1, a$a0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    v2 = v1;
                    v2.releaseIntercepted();
                    throw throwable1;
                }
                v2 = v1;
                break;
            }
            case 1: {
                v2 = (v)a$a0.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                v2.releaseIntercepted();
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        v2.releaseIntercepted();
        return S0.a;
    }

    @m
    public abstract Object f(@l j arg1, @l d arg2);
}

