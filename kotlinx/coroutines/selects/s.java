package kotlinx.coroutines.selects;

import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e0;
import kotlin.f0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@b0
public final class s extends t {
    @l
    private final p h;

    public s(@l d d0) {
        super(d0.getContext());
        this.h = new p(b.e(d0), 1);
    }

    @b0
    public final void S(@l Throwable throwable0) {
        Object object0 = e0.b(f0.a(throwable0));
        this.h.resumeWith(object0);
    }

    @b0
    @m
    public final Object T() {
        @f(c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", f = "SelectOld.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            final s l;

            a(s s0, d d0) {
                this.l = s0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new a(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        try {
                            this.k = 1;
                            object0 = this.l.w(this);
                            if(object0 == object1) {
                                return object1;
                            label_8:
                                f0.n(object0);
                            }
                            break;
                        }
                        catch(Throwable throwable0) {
                            kotlinx.coroutines.selects.p.d(this.l.h, throwable0);
                            return S0.a;
                        }
                    }
                    case 1: {
                        goto label_8;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                kotlinx.coroutines.selects.p.c(this.l.h, object0);
                return S0.a;
            }
        }

        if(this.h.k()) {
            return this.h.x();
        }
        O o0 = P.a(this.getContext());
        a s$a0 = new a(this, null);
        k.f(o0, null, Q.d, s$a0, 1, null);
        return this.h.x();
    }
}

