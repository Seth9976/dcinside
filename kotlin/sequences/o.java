package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.j;
import kotlin.h0;
import y4.l;
import y4.m;

@j
@h0(version = "1.3")
public abstract class o {
    @m
    public abstract Object a(Object arg1, @l d arg2);

    @m
    public final Object b(@l Iterable iterable0, @l d d0) {
        if(iterable0 instanceof Collection && ((Collection)iterable0).isEmpty()) {
            return S0.a;
        }
        Object object0 = this.d(iterable0.iterator(), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public abstract Object d(@l Iterator arg1, @l d arg2);

    @m
    public final Object f(@l kotlin.sequences.m m0, @l d d0) {
        Object object0 = this.d(m0.iterator(), d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

