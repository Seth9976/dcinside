package kotlinx.serialization.internal;

import A3.a;
import j..util.concurrent.ConcurrentHashMap;
import java.util.List;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.i;
import y4.l;

final class r0 {
    @l
    private final ConcurrentHashMap a;

    public r0() {
        this.a = new ConcurrentHashMap();
    }

    @l
    public final Object b(@l List list0, @l a a0) {
        Object object0;
        L.p(list0, "types");
        L.p(a0, "producer");
        ConcurrentHashMap concurrentHashMap0 = this.a;
        e0 e00 = concurrentHashMap0.get(list0);
        if(e00 == null) {
            try {
                object0 = e0.b(((i)a0.invoke()));
            }
            catch(Throwable throwable0) {
                object0 = e0.b(f0.a(throwable0));
            }
            e0 e01 = e0.a(object0);
            Object object1 = concurrentHashMap0.putIfAbsent(list0, e01);
            e00 = object1 == null ? e01 : object1;
        }
        L.o(e00, "serializers.getOrPut(typ… { producer() }\n        }");
        return e00.l();
    }
}

