package androidx.compose.animation.core;

import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;

@s0({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n103#1:113\n107#1:119\n103#1:123\n103#1:134\n35#2,2:114\n72#2,3:116\n66#2,3:120\n35#2,2:124\n72#2,3:126\n35#2,2:129\n66#2,3:131\n35#2,2:135\n54#2,3:137\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n86#1:113\n87#1:119\n87#1:123\n107#1:134\n86#1:114,2\n86#1:116,3\n87#1:120,3\n87#1:124,2\n87#1:126,3\n103#1:129,2\n107#1:131,3\n107#1:135,2\n111#1:137,3\n*E\n"})
public final class ComplexDoubleKt {
    @l
    public static final V a(double f, double f1, double f2) {
        double f3 = ((long)f1) * ((long)f1) - 0x4010000000000000L * ((long)f) * f2;
        ComplexDouble complexDouble0 = ComplexDoubleKt.b(f3);
        complexDouble0.a += -((long)f1);
        complexDouble0.a /= ((long)f) * 0x4000000000000000L;
        complexDouble0.b /= ((long)f) * 0x4000000000000000L;
        ComplexDouble complexDouble1 = ComplexDoubleKt.b(f3);
        complexDouble1.a *= -1.0;
        complexDouble1.b *= -1.0;
        complexDouble1.a += -((long)f1);
        complexDouble1.a /= ((long)f) * 0x4000000000000000L;
        complexDouble1.b /= ((long)f) * 0x4000000000000000L;
        return r0.a(complexDouble0, complexDouble1);
    }

    @l
    public static final ComplexDouble b(double f) {
        return f < 0.0 ? new ComplexDouble(0.0, Math.sqrt(Math.abs(f))) : new ComplexDouble(Math.sqrt(f), 0.0);
    }

    @l
    public static final ComplexDouble c(double f, @l ComplexDouble complexDouble0) {
        L.p(complexDouble0, "other");
        complexDouble0.a *= -1.0;
        complexDouble0.b *= -1.0;
        complexDouble0.a += f;
        return complexDouble0;
    }

    @l
    public static final ComplexDouble d(double f, @l ComplexDouble complexDouble0) {
        L.p(complexDouble0, "other");
        complexDouble0.a += f;
        return complexDouble0;
    }

    @l
    public static final ComplexDouble e(double f, @l ComplexDouble complexDouble0) {
        L.p(complexDouble0, "other");
        complexDouble0.a *= f;
        complexDouble0.b *= f;
        return complexDouble0;
    }
}

