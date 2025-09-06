package androidx.compose.foundation.shape;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,198:1\n154#2:199\n154#2:200\n154#2:201\n154#2:202\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n*L\n145#1:199\n146#1:200\n147#1:201\n148#1:202\n*E\n"})
public final class CutCornerShapeKt {
    @l
    public static final CutCornerShape a(float f) {
        return CutCornerShapeKt.e(CornerSizeKt.a(f));
    }

    @l
    public static final CutCornerShape b(float f, float f1, float f2, float f3) {
        return new CutCornerShape(CornerSizeKt.a(f), CornerSizeKt.a(f1), CornerSizeKt.a(f2), CornerSizeKt.a(f3));
    }

    @l
    public static final CutCornerShape c(int v) {
        return CutCornerShapeKt.e(CornerSizeKt.b(v));
    }

    @l
    public static final CutCornerShape d(int v, int v1, int v2, int v3) {
        return new CutCornerShape(CornerSizeKt.b(v), CornerSizeKt.b(v1), CornerSizeKt.b(v2), CornerSizeKt.b(v3));
    }

    @l
    public static final CutCornerShape e(@l CornerSize cornerSize0) {
        L.p(cornerSize0, "corner");
        return new CutCornerShape(cornerSize0, cornerSize0, cornerSize0, cornerSize0);
    }

    public static CutCornerShape f(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return CutCornerShapeKt.b(f, f1, f2, f3);
    }

    public static CutCornerShape g(int v, int v1, int v2, int v3, int v4, Object object0) {
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
        return CutCornerShapeKt.d(v, v1, v2, v3);
    }

    @l
    public static final CutCornerShape h(float f) {
        return CutCornerShapeKt.e(CornerSizeKt.c(f));
    }

    @l
    public static final CutCornerShape i(float f, float f1, float f2, float f3) {
        return new CutCornerShape(CornerSizeKt.c(f), CornerSizeKt.c(f1), CornerSizeKt.c(f2), CornerSizeKt.c(f3));
    }

    public static CutCornerShape j(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return CutCornerShapeKt.i(f, f1, f2, f3);
    }
}

