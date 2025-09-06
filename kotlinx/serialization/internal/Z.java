package kotlinx.serialization.internal;

import j..util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import kotlinx.serialization.i;
import y4.l;
import y4.m;
import z3.b;

final class z implements I0 {
    @l
    private final Function1 a;
    @l
    private final ConcurrentHashMap b;

    public z(@l Function1 function10) {
        L.p(function10, "compute");
        super();
        this.a = function10;
        this.b = new ConcurrentHashMap();
    }

    @Override  // kotlinx.serialization.internal.I0
    @m
    public i a(@l d d0) {
        L.p(d0, "key");
        ConcurrentHashMap concurrentHashMap0 = this.b;
        Class class0 = b.e(d0);
        kotlinx.serialization.internal.m m0 = concurrentHashMap0.get(class0);
        if(m0 == null) {
            m0 = new kotlinx.serialization.internal.m(((i)this.a.invoke(d0)));
            Object object0 = concurrentHashMap0.putIfAbsent(class0, m0);
            if(object0 != null) {
                m0 = object0;
            }
        }
        return m0.a;
    }
}

