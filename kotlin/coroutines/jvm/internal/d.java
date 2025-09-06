package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.e;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@h0(version = "1.3")
@s0({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class d extends a {
    @m
    private final g _context;
    @m
    private transient kotlin.coroutines.d intercepted;

    public d(@m kotlin.coroutines.d d0) {
        this(d0, (d0 == null ? null : d0.getContext()));
    }

    public d(@m kotlin.coroutines.d d0, @m g g0) {
        super(d0);
        this._context = g0;
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        L.m(this._context);
        return this._context;
    }

    @l
    public final kotlin.coroutines.d intercepted() {
        kotlin.coroutines.d d0 = this.intercepted;
        if(d0 == null) {
            e e0 = (e)this.getContext().get(e.z8);
            if(e0 == null) {
                d0 = this;
            }
            else {
                d0 = e0.f0(this);
                if(d0 == null) {
                    d0 = this;
                }
            }
            this.intercepted = d0;
        }
        return d0;
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        kotlin.coroutines.d d0 = this.intercepted;
        if(d0 != null && d0 != this) {
            b g$b0 = this.getContext().get(e.z8);
            L.m(g$b0);
            ((e)g$b0).i(d0);
        }
        this.intercepted = c.a;
    }
}

