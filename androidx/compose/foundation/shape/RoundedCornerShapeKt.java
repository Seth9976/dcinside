package androidx.compose.foundation.shape;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,200:1\n154#2:201\n154#2:202\n154#2:203\n154#2:204\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n147#1:201\n148#1:202\n149#1:203\n150#1:204\n*E\n"})
public final class RoundedCornerShapeKt {
    @l
    private static final RoundedCornerShape a;

    static {
        RoundedCornerShapeKt.a = RoundedCornerShapeKt.c(50);
    }

    @l
    public static final RoundedCornerShape a(float f) {
        return RoundedCornerShapeKt.e(CornerSizeKt.a(f));
    }

    @l
    public static final RoundedCornerShape b(float f, float f1, float f2, float f3) {
        return new RoundedCornerShape(CornerSizeKt.a(f), CornerSizeKt.a(f1), CornerSizeKt.a(f2), CornerSizeKt.a(f3));
    }

    @l
    public static final RoundedCornerShape c(int v) {
        return RoundedCornerShapeKt.e(CornerSizeKt.b(v));
    }

    @l
    public static final RoundedCornerShape d(int v, int v1, int v2, int v3) {
        return new RoundedCornerShape(CornerSizeKt.b(v), CornerSizeKt.b(v1), CornerSizeKt.b(v2), CornerSizeKt.b(v3));
    }

    @l
    public static final RoundedCornerShape e(@l CornerSize cornerSize0) {
        L.p(cornerSize0, "corner");
        return new RoundedCornerShape(cornerSize0, cornerSize0, cornerSize0, cornerSize0);
    }

    public static RoundedCornerShape f(float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return RoundedCornerShapeKt.b(f, f1, f2, f3);
    }

    public static RoundedCornerShape g(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = 0;
        }
        if((v4 & 2) != 0) {
            v1 = 0;
        }
        if((v4 & 4) != 0) {
            v2 = 0;
        }
        if((v4 & 8) != 0) {
            v3 = 0;
        }
        return RoundedCornerShapeKt.d(v, v1, v2, v3);
    }

    @l
    public static final RoundedCornerShape h(float f) {
        return RoundedCornerShapeKt.e(CornerSizeKt.c(f));
    }

    @l
    public static final RoundedCornerShape i(float f, float f1, float f2, float f3) {
        return new RoundedCornerShape(CornerSizeKt.c(f), CornerSizeKt.c(f1), CornerSizeKt.c(f2), CornerSizeKt.c(f3));
    }

    public static RoundedCornerShape j(float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return RoundedCornerShapeKt.i(f, f1, f2, f3);
    }

    @l
    public static final RoundedCornerShape k() {
        return RoundedCornerShapeKt.a;
    }
}

