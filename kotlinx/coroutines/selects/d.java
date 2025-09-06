package kotlinx.coroutines.selects;

import kotlin.S0;
import kotlin.b0;
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
import y4.m;

@b0
public final class d extends l {
    @y4.l
    private final p g;

    public d(@y4.l kotlin.coroutines.d d0) {
        super(d0.getContext());
        this.g = new p(b.e(d0), 1);
    }

    @b0
    @m
    public final Object Q() {
        @f(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            final d l;

            a(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.l
            public final kotlin.coroutines.d create(@m Object object0, @y4.l kotlin.coroutines.d d0) {
                return new a(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@y4.l O o0, @m kotlin.coroutines.d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
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
                            kotlinx.coroutines.selects.p.d(this.l.g, throwable0);
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
                kotlinx.coroutines.selects.p.c(this.l.g, object0);
                return S0.a;
            }
        }

        if(this.g.k()) {
            return this.g.x();
        }
        O o0 = P.a(this.getContext());
        a d$a0 = new a(this, null);
        k.f(o0, null, Q.d, d$a0, 1, null);
        return this.g.x();
    }

    @b0
    public final void R(@y4.l Throwable throwable0) {
        Object object0 = e0.b(f0.a(throwable0));
        this.g.resumeWith(object0);
    }
}

