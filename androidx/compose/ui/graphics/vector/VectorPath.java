package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class VectorPath extends VectorNode {
    @l
    private final String b;
    @l
    private final List c;
    private final int d;
    @m
    private final Brush e;
    private final float f;
    @m
    private final Brush g;
    private final float h;
    private final float i;
    private final int j;
    private final int k;
    private final float l;
    private final float m;
    private final float n;
    private final float o;
    public static final int p;

    static {
    }

    private VectorPath(String s, List list0, int v, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6) {
        super(null);
        this.b = s;
        this.c = list0;
        this.d = v;
        this.e = brush0;
        this.f = f;
        this.g = brush1;
        this.h = f1;
        this.i = f2;
        this.j = v1;
        this.k = v2;
        this.l = f3;
        this.m = f4;
        this.n = f5;
        this.o = f6;
    }

    // 去混淆评级： 低(20)
    public VectorPath(String s, List list0, int v, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, int v3, w w0) {
        this(((v3 & 1) == 0 ? s : ""), list0, v, ((v3 & 8) == 0 ? brush0 : null), ((v3 & 16) == 0 ? f : 1.0f), ((v3 & 0x20) == 0 ? brush1 : null), ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? f2 : 0.0f), ((v3 & 0x100) == 0 ? v1 : 0), ((v3 & 0x200) == 0 ? v2 : 0), ((v3 & 0x400) == 0 ? f3 : 4.0f), ((v3 & 0x800) == 0 ? f4 : 0.0f), ((v3 & 0x1000) == 0 ? f5 : 1.0f), ((v3 & 0x2000) == 0 ? f6 : 0.0f), null);
    }

    public VectorPath(String s, List list0, int v, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, w w0) {
        this(s, list0, v, brush0, f, brush1, f1, f2, v1, v2, f3, f4, f5, f6);
    }

    @m
    public final Brush a() {
        return this.e;
    }

    public final float b() {
        return this.f;
    }

    @l
    public final String c() {
        return this.b;
    }

    @l
    public final List d() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(VectorPath.class != class0 || !L.g(this.b, ((VectorPath)object0).b)) {
                return false;
            }
            if(!L.g(this.e, ((VectorPath)object0).e)) {
                return false;
            }
            if(this.f != ((VectorPath)object0).f || !L.g(this.g, ((VectorPath)object0).g)) {
                return false;
            }
            if(this.h != ((VectorPath)object0).h || this.i != ((VectorPath)object0).i || !StrokeCap.g(this.j, ((VectorPath)object0).j)) {
                return false;
            }
            if(!StrokeJoin.g(this.k, ((VectorPath)object0).k)) {
                return false;
            }
            return this.l == ((VectorPath)object0).l && this.m == ((VectorPath)object0).m && this.n == ((VectorPath)object0).n && this.o == ((VectorPath)object0).o && PathFillType.f(this.d, ((VectorPath)object0).d) ? L.g(this.c, ((VectorPath)object0).c) : false;
        }
        return false;
    }

    public final int g() {
        return this.d;
    }

    @m
    public final Brush h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        int v = this.b.hashCode();
        int v1 = this.c.hashCode();
        int v2 = 0;
        int v3 = this.e == null ? 0 : this.e.hashCode();
        int v4 = Float.floatToIntBits(this.f);
        Brush brush0 = this.g;
        if(brush0 != null) {
            v2 = brush0.hashCode();
        }
        return ((((((((((((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2) * 0x1F + Float.floatToIntBits(this.h)) * 0x1F + Float.floatToIntBits(this.i)) * 0x1F + this.j) * 0x1F + this.k) * 0x1F + Float.floatToIntBits(this.l)) * 0x1F + Float.floatToIntBits(this.m)) * 0x1F + Float.floatToIntBits(this.n)) * 0x1F + Float.floatToIntBits(this.o)) * 0x1F + this.d;
    }

    public final float i() {
        return this.h;
    }

    public final int j() {
        return this.j;
    }

    public final int k() {
        return this.k;
    }

    public final float l() {
        return this.l;
    }

    public final float m() {
        return this.i;
    }

    public final float o() {
        return this.n;
    }

    public final float p() {
        return this.o;
    }

    public final float q() {
        return this.m;
    }
}

