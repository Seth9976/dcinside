package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import y4.l;
import y4.m;

public final class AndroidFlingSpline {
    @StabilityInferred(parameters = 0)
    public static final class FlingResult {
        private final float a;
        private final float b;
        public static final int c;

        static {
        }

        public FlingResult(float f, float f1) {
            this.a = f;
            this.b = f1;
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        @l
        public final FlingResult c(float f, float f1) {
            return new FlingResult(f, f1);
        }

        public static FlingResult d(FlingResult androidFlingSpline$FlingResult0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = androidFlingSpline$FlingResult0.a;
            }
            if((v & 2) != 0) {
                f1 = androidFlingSpline$FlingResult0.b;
            }
            return androidFlingSpline$FlingResult0.c(f, f1);
        }

        public final float e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof FlingResult)) {
                return false;
            }
            return Float.compare(this.a, ((FlingResult)object0).a) == 0 ? Float.compare(this.b, ((FlingResult)object0).b) == 0 : false;
        }

        public final float f() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
        }

        @Override
        @l
        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
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
        AndroidFlingSpline.a = new AndroidFlingSpline();
        float[] arr_f = new float[101];
        AndroidFlingSpline.c = arr_f;
        float[] arr_f1 = new float[101];
        AndroidFlingSpline.d = arr_f1;
        SplineBasedDecayKt.b(arr_f, arr_f1, 100);
    }

    public final double a(float f, float f1) {
        return Math.log(((double)(Math.abs(f) * 0.35f)) / ((double)f1));
    }

    @l
    public final FlingResult b(float f) {
        int v = (int)(100.0f * f);
        if(v < 100) {
            float f1 = AndroidFlingSpline.c[v];
            float f2 = (AndroidFlingSpline.c[v + 1] - f1) / (((float)(v + 1)) / 100.0f - ((float)v) / 100.0f);
            return new FlingResult(f1 + (f - ((float)v) / 100.0f) * f2, f2);
        }
        return new FlingResult(1.0f, 0.0f);
    }
}

