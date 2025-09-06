package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class Shadow {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Shadow a() {
            return Shadow.e;
        }

        @Stable
        public static void b() {
        }
    }

    private final long a;
    private final long b;
    private final float c;
    @l
    public static final Companion d;
    @l
    private static final Shadow e;

    static {
        Shadow.d = new Companion(null);
        Shadow.e = new Shadow(0L, 0L, 0.0f, 7, null);
    }

    private Shadow(long v, long v1, float f) {
        this.a = v;
        this.b = v1;
        this.c = f;
    }

    public Shadow(long v, long v1, float f, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 0xFF00000000000000L;
        }
        if((v2 & 2) != 0) {
            v1 = 0L;
        }
        this(v, v1, ((v2 & 4) == 0 ? f : 0.0f), null);
    }

    public Shadow(long v, long v1, float f, w w0) {
        this(v, v1, f);
    }

    @l
    public final Shadow b(long v, long v1, float f) {
        return new Shadow(v, v1, f, null);
    }

    public static Shadow c(Shadow shadow0, long v, long v1, float f, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = shadow0.a;
        }
        if((v2 & 2) != 0) {
            v1 = shadow0.b;
        }
        if((v2 & 4) != 0) {
            f = shadow0.c;
        }
        return shadow0.b(v, v1, f);
    }

    public final float d() {
        return this.c;
    }

    @Stable
    public static void e() {
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Shadow)) {
            return false;
        }
        if(!Color.y(this.a, ((Shadow)object0).a)) {
            return false;
        }
        return Offset.l(this.b, ((Shadow)object0).b) ? this.c == ((Shadow)object0).c : false;
    }

    public final long f() {
        return this.a;
    }

    @Stable
    public static void g() {
    }

    public final long h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return (Color.K(this.a) * 0x1F + Offset.s(this.b)) * 0x1F + Float.floatToIntBits(this.c);
    }

    @Stable
    public static void i() {
    }

    @Override
    @l
    public String toString() {
        return "Shadow(color=" + Color.L(this.a) + ", offset=" + Offset.y(this.b) + ", blurRadius=" + this.c + ')';
    }
}

