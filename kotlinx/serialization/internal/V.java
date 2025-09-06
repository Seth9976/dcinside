package kotlinx.serialization.internal;

import A3.o;
import j..util.concurrent.ConcurrentHashMap;
import java.util.List;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import kotlinx.serialization.i;
import y4.l;
import z3.b;

@O0
final class v implements s0 {
    @l
    private final o a;
    @l
    private final a b;

    public v(@l o o0) {
        L.p(o0, "compute");
        super();
        this.a = o0;
        this.b = this.b();
    }

    @Override  // kotlinx.serialization.internal.s0
    @l
    public Object a(@l d d0, @l List list0) {
        Object object0;
        L.p(d0, "key");
        L.p(list0, "types");
        Class class0 = b.e(d0);
        ConcurrentHashMap concurrentHashMap0 = ((r0)this.b.get(class0)).a;
        e0 e00 = concurrentHashMap0.get(list0);
        if(e00 == null) {
            try {
                object0 = e0.b(((i)this.a.invoke(d0, list0)));
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

    private final a b() {
        public static final class a extends ClassValue {
            @l
            protected r0 a(@l Class class0) {
                L.p(class0, "type");
                return new r0();
            }

            @Override
            public Object computeValue(Class class0) {
                return this.a(class0);
            }
        }

        return new a();
    }
}

