package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import kotlinx.serialization.i;
import y4.l;
import y4.m;
import z3.b;

@O0
final class t implements I0 {
    @l
    private final Function1 a;
    @l
    private final a b;

    public t(@l Function1 function10) {
        L.p(function10, "compute");
        super();
        this.a = function10;
        this.b = this.c();
    }

    @Override  // kotlinx.serialization.internal.I0
    @m
    public i a(@l d d0) {
        L.p(d0, "key");
        Class class0 = b.e(d0);
        return ((kotlinx.serialization.internal.m)this.b.get(class0)).a;
    }

    public static final Function1 b(t t0) {
        return t0.a;
    }

    private final a c() {
        public static final class a extends ClassValue {
            final t a;

            a(t t0) {
            }

            protected kotlinx.serialization.internal.m a(Class class0) {
            }

            @Override
            public Object computeValue(Class class0) {
            }
        }

        return new a(this);
    }
}

