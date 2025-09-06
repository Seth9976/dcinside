package androidx.compose.foundation.shape;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,195:1\n154#2:196\n154#2:197\n154#2:198\n154#2:199\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n*L\n142#1:196\n143#1:197\n144#1:198\n145#1:199\n*E\n"})
public final class AbsoluteRoundedCornerShapeKt {
    @l
    public static final AbsoluteRoundedCornerShape a(float f) {
        return AbsoluteRoundedCornerShapeKt.e(CornerSizeKt.a(f));
    }

    @l
    public static final AbsoluteRoundedCornerShape b(float f, float f1, float f2, float f3) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.a(f), CornerSizeKt.a(f1), CornerSizeKt.a(f2), CornerSizeKt.a(f3));
    }

    @l
    public static final AbsoluteRoundedCornerShape c(int v) {
        return AbsoluteRoundedCornerShapeKt.e(CornerSizeKt.b(v));
    }

    @l
    public static final AbsoluteRoundedCornerShape d(int v, int v1, int v2, int v3) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.b(v), CornerSizeKt.b(v1), CornerSizeKt.b(v2), CornerSizeKt.b(v3));
    }

    @l
    public static final AbsoluteRoundedCornerShape e(@l CornerSize cornerSize0) {
        L.p(cornerSize0, "corner");
        return new AbsoluteRoundedCornerShape(cornerSize0, cornerSize0, cornerSize0, cornerSize0);
    }

    public static AbsoluteRoundedCornerShape f(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return AbsoluteRoundedCornerShapeKt.b(f, f1, f2, f3);
    }

    public static AbsoluteRoundedCornerShape g(int v, int v1, int v2, int v3, int v4, Object object0) {
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
        return AbsoluteRoundedCornerShapeKt.d(v, v1, v2, v3);
    }

    @l
    public static final AbsoluteRoundedCornerShape h(float f) {
        return AbsoluteRoundedCornerShapeKt.e(CornerSizeKt.c(f));
    }

    @l
    public static final AbsoluteRoundedCornerShape i(float f, float f1, float f2, float f3) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.c(f), CornerSizeKt.c(f1), CornerSizeKt.c(f2), CornerSizeKt.c(f3));
    }

    public static AbsoluteRoundedCornerShape j(float f, float f1, float f2, float f3, int v, Object object0) {
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
        return AbsoluteRoundedCornerShapeKt.i(f, f1, f2, f3);
    }
}

