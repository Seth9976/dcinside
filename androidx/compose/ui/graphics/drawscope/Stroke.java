package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class Stroke extends DrawStyle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int b() {
            return 0;
        }
    }

    private final float a;
    private final float b;
    private final int c;
    private final int d;
    @m
    private final PathEffect e;
    @l
    public static final Companion f = null;
    public static final float g = 0.0f;
    public static final float h = 4.0f;
    private static final int i;
    private static final int j;

    static {
        Stroke.f = new Companion(null);
        Stroke.i = 0;
        Stroke.j = 0;
    }

    private Stroke(float f, float f1, int v, int v1, PathEffect pathEffect0) {
        super(null);
        this.a = f;
        this.b = f1;
        this.c = v;
        this.d = v1;
        this.e = pathEffect0;
    }

    public Stroke(float f, float f1, int v, int v1, PathEffect pathEffect0, int v2, w w0) {
        if((v2 & 4) != 0) {
            v = Stroke.i;
        }
        if((v2 & 8) != 0) {
            v1 = Stroke.j;
        }
        if((v2 & 16) != 0) {
            pathEffect0 = null;
        }
        this(((v2 & 1) == 0 ? f : 0.0f), ((v2 & 2) == 0 ? f1 : 4.0f), v, v1, pathEffect0, null);
    }

    public Stroke(float f, float f1, int v, int v1, PathEffect pathEffect0, w w0) {
        this(f, f1, v, v1, pathEffect0);
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final float e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Stroke)) {
            return false;
        }
        if(this.a != ((Stroke)object0).a || this.b != ((Stroke)object0).b || !StrokeCap.g(this.c, ((Stroke)object0).c)) {
            return false;
        }
        return StrokeJoin.g(this.d, ((Stroke)object0).d) ? L.g(this.e, ((Stroke)object0).e) : false;
    }

    @m
    public final PathEffect f() {
        return this.e;
    }

    public final float g() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = Float.floatToIntBits(this.a);
        int v1 = Float.floatToIntBits(this.b);
        return this.e == null ? (((v * 0x1F + v1) * 0x1F + this.c) * 0x1F + this.d) * 0x1F : (((v * 0x1F + v1) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + StrokeCap.i(this.c) + ", join=" + StrokeJoin.i(this.d) + ", pathEffect=" + this.e + ')';
    }
}

