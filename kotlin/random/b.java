package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.L;
import y4.l;

public final class b extends a {
    @l
    private final kotlin.random.b.a c;

    public b() {
        public static final class kotlin.random.b.a extends ThreadLocal {
            protected Random a() {
                return new Random();
            }

            @Override
            public Object initialValue() {
                return this.a();
            }
        }

        this.c = new kotlin.random.b.a();
    }

    @Override  // kotlin.random.a
    @l
    public Random r() {
        Object object0 = this.c.get();
        L.o(object0, "get(...)");
        return (Random)object0;
    }
}

