package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

final class d extends a implements Serializable {
    static final class kotlin.random.d.a {
        private kotlin.random.d.a() {
        }

        public kotlin.random.d.a(w w0) {
        }
    }

    @l
    private final Random c;
    @l
    private static final kotlin.random.d.a d;
    private static final long e;

    static {
        d.d = new kotlin.random.d.a(null);
    }

    public d(@l Random random0) {
        L.p(random0, "impl");
        super();
        this.c = random0;
    }

    @Override  // kotlin.random.a
    @l
    public Random r() {
        return this.c;
    }
}

