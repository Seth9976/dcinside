package kotlinx.serialization.json;

import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.N;
import kotlinx.serialization.i;
import kotlinx.serialization.u;
import y4.l;

@u(with = x.class)
public final class w extends B {
    static final class a extends N implements A3.a {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(0);
        }

        @l
        public final i b() {
            return x.a;
        }

        @Override  // A3.a
        public Object invoke() {
            return this.b();
        }
    }

    @l
    public static final w c;
    @l
    private static final String d;
    private static final D e;

    static {
        w.c = new w();
        w.d = "null";
        w.e = E.c(H.b, a.e);
    }

    private w() {
        super(null);
    }

    @Override  // kotlinx.serialization.json.B
    @l
    public String a() {
        return w.d;
    }

    @Override  // kotlinx.serialization.json.B
    public boolean b() {
        return false;
    }

    private final D c() {
        return w.e;
    }

    @l
    public final i d() {
        return (i)this.c().getValue();
    }
}

