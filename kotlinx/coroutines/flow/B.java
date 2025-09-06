package kotlinx.coroutines.flow;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.f0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.internal.e;
import y4.l;
import y4.m;

final class b extends f {
    @l
    private final o e;

    public b(@l o o0, @l g g0, int v, @l i i0) {
        super(o0, g0, v, i0);
        this.e = o0;
    }

    public b(o o0, g g0, int v, i i0, int v1, w w0) {
        if((v1 & 2) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if((v1 & 4) != 0) {
            v = -2;
        }
        if((v1 & 8) != 0) {
            i0 = i.a;
        }
        this(o0, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.f
    @m
    protected Object h(@l D d0, @l d d1) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            final b m;
            int n;

            a(b b0, d d0) {
                this.m = b0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.h(null, this);
            }
        }

        a b$a0;
        if(d1 instanceof a) {
            b$a0 = (a)d1;
            int v = b$a0.n;
            if((v & 0x80000000) == 0) {
                b$a0 = new a(this, d1);
            }
            else {
                b$a0.n = v ^ 0x80000000;
            }
        }
        else {
            b$a0 = new a(this, d1);
        }
        Object object0 = b$a0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(b$a0.n) {
            case 0: {
                f0.n(object0);
                b$a0.k = d0;
                b$a0.n = 1;
                if(super.h(d0, b$a0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                d0 = (D)b$a0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!d0.A()) {
            throw new IllegalStateException("\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        }
        return S0.a;
    }

    @Override  // kotlinx.coroutines.flow.f
    @l
    protected e i(@l g g0, int v, @l i i0) {
        return new b(this.e, g0, v, i0);
    }
}

