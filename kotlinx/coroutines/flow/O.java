package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import y4.l;
import y4.m;

final class o {
    @m
    public static final Object a(@l i i0, @l Collection collection0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return k.W1(null, null, this);
            }
        }


        static final class b implements j {
            final Collection a;

            b(Collection collection0) {
                this.a = collection0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                this.a.add(object0);
                return S0.a;
            }
        }

        a o$a0;
        if(d0 instanceof a) {
            o$a0 = (a)d0;
            int v = o$a0.m;
            if((v & 0x80000000) == 0) {
                o$a0 = new a(d0);
            }
            else {
                o$a0.m = v ^ 0x80000000;
            }
        }
        else {
            o$a0 = new a(d0);
        }
        Object object0 = o$a0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(o$a0.m) {
            case 0: {
                f0.n(object0);
                b o$b0 = new b(collection0);
                o$a0.k = collection0;
                o$a0.m = 1;
                return i0.collect(o$b0, o$a0) == object1 ? object1 : collection0;
            }
            case 1: {
                collection0 = (Collection)o$a0.k;
                f0.n(object0);
                return collection0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public static final Object b(@l i i0, @l List list0, @l d d0) {
        return k.W1(i0, list0, d0);
    }

    public static Object c(i i0, List list0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        return k.X1(i0, list0, d0);
    }

    @m
    public static final Object d(@l i i0, @l Set set0, @l d d0) {
        return k.W1(i0, set0, d0);
    }

    public static Object e(i i0, Set set0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            set0 = new LinkedHashSet();
        }
        return k.Z1(i0, set0, d0);
    }
}

