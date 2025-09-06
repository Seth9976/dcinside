package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Stable
public final class KeyboardActions {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final KeyboardActions a() {
            return KeyboardActions.i;
        }

        @Stable
        public static void b() {
        }
    }

    @m
    private final Function1 a;
    @m
    private final Function1 b;
    @m
    private final Function1 c;
    @m
    private final Function1 d;
    @m
    private final Function1 e;
    @m
    private final Function1 f;
    @l
    public static final Companion g;
    public static final int h;
    @l
    private static final KeyboardActions i;

    static {
        KeyboardActions.g = new Companion(null);
        KeyboardActions.i = new KeyboardActions(null, null, null, null, null, null, 0x3F, null);
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 0x3F, null);
    }

    public KeyboardActions(@m Function1 function10, @m Function1 function11, @m Function1 function12, @m Function1 function13, @m Function1 function14, @m Function1 function15) {
        this.a = function10;
        this.b = function11;
        this.c = function12;
        this.d = function13;
        this.e = function14;
        this.f = function15;
    }

    public KeyboardActions(Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, w w0) {
        this(((v & 1) == 0 ? function10 : null), ((v & 2) == 0 ? function11 : null), ((v & 4) == 0 ? function12 : null), ((v & 8) == 0 ? function13 : null), ((v & 16) == 0 ? function14 : null), ((v & 0x20) == 0 ? function15 : null));
    }

    @m
    public final Function1 b() {
        return this.a;
    }

    @m
    public final Function1 c() {
        return this.b;
    }

    @m
    public final Function1 d() {
        return this.c;
    }

    @m
    public final Function1 e() {
        return this.d;
    }

    // 去混淆评级： 低(23)
    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof KeyboardActions ? L.g(this.a, ((KeyboardActions)object0).a) && L.g(this.b, ((KeyboardActions)object0).b) && L.g(this.c, ((KeyboardActions)object0).c) && L.g(this.d, ((KeyboardActions)object0).d) && L.g(this.e, ((KeyboardActions)object0).e) && L.g(this.f, ((KeyboardActions)object0).f) : false;
    }

    @m
    public final Function1 f() {
        return this.e;
    }

    @m
    public final Function1 g() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        Function1 function10 = this.f;
        if(function10 != null) {
            v = function10.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }
}

