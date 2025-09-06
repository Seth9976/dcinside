package androidx.compose.foundation.layout;

import kotlin.jvm.internal.s0;
import y4.l;
import z3.g;

@s0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n25#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n684#1:709,3\n*E\n"})
final class AndroidFlingSpline {
    @s0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n34#2:709\n41#2:710\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n701#1:709\n706#1:710\n*E\n"})
    @g
    public static final class FlingResult {
        private final long a;

        private FlingResult(long v) {
            this.a = v;
        }

        public static final FlingResult a(long v) {
            return new FlingResult(v);
        }

        public static long b(long v) [...] // Inlined contents

        public static boolean c(long v, Object object0) {
            return object0 instanceof FlingResult ? v == ((FlingResult)object0).i() : false;
        }

        public static final boolean d(long v, long v1) {
            return v == v1;
        }

        public static final float e(long v) [...] // 潜在的解密器

        @Override
        public boolean equals(Object object0) {
            return FlingResult.c(this.a, object0);
        }

        public static final float f(long v) {
            return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        }

        public static int g(long v) {
            return (int)(v ^ v >>> 0x20);
        }

        public static String h(long v) {
            return "FlingResult(packedValue=" + v + ')';
        }

        @Override
        public int hashCode() {
            return FlingResult.g(this.a);
        }

        public final long i() {
            return this.a;
        }

        @Override
        public String toString() {
            return FlingResult.h(this.a);
        }
    }

    @l
    public static final AndroidFlingSpline a = null;
    private static final int b = 100;
    @l
    private static final float[] c;
    @l
    private static final float[] d;

    static {
        float f13;
        float f12;
        float f11;
        float f10;
        float f7;
        float f6;
        float f5;
        float f4;
        AndroidFlingSpline.a = new AndroidFlingSpline();
        AndroidFlingSpline.c = new float[101];
        AndroidFlingSpline.d = new float[101];
        float f = 0.0f;
        float f1 = 0.0f;
        for(int v = 0; v < 100; ++v) {
            float f2 = ((float)v) / 100.0f;
            float f3 = 1.0f;
            while(true) {
                f4 = (f3 - f) / 2.0f + f;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float f8 = (f5 * 0.175f + f4 * 0.35f) * f6 + f7;
                if(((double)Math.abs(f8 - f2)) < 0.00001) {
                    break;
                }
                if(f8 > f2) {
                    f3 = f4;
                }
                else {
                    f = f4;
                }
            }
            AndroidFlingSpline.c[v] = f6 * (f5 * 0.5f + f4) + f7;
            float f9 = 1.0f;
            while(true) {
                f10 = (f9 - f1) / 2.0f + f1;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f14 = (f11 * 0.5f + f10) * f12 + f13;
                if(((double)Math.abs(f14 - f2)) < 0.00001) {
                    break;
                }
                if(f14 > f2) {
                    f9 = f10;
                }
                else {
                    f1 = f10;
                }
            }
            AndroidFlingSpline.d[v] = f12 * (f11 * 0.175f + f10 * 0.35f) + f13;
        }
        AndroidFlingSpline.d[100] = 1.0f;
        AndroidFlingSpline.c[100] = 1.0f;
    }

    public final double a(float f, float f1) {
        return Math.log(((double)(Math.abs(f) * 0.35f)) / ((double)f1));
    }

    public final long b(float f) [...] // 潜在的解密器
}

