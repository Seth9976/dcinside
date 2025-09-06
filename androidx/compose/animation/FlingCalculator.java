package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class FlingCalculator {
    @StabilityInferred(parameters = 0)
    public static final class FlingInfo {
        private final float a;
        private final float b;
        private final long c;
        public static final int d;

        static {
        }

        public FlingInfo(float f, float f1, long v) {
            this.a = f;
            this.b = f1;
            this.c = v;
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        @l
        public final FlingInfo d(float f, float f1, long v) {
            return new FlingInfo(f, f1, v);
        }

        public static FlingInfo e(FlingInfo flingCalculator$FlingInfo0, float f, float f1, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                f = flingCalculator$FlingInfo0.a;
            }
            if((v1 & 2) != 0) {
                f1 = flingCalculator$FlingInfo0.b;
            }
            if((v1 & 4) != 0) {
                v = flingCalculator$FlingInfo0.c;
            }
            return flingCalculator$FlingInfo0.d(f, f1, v);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof FlingInfo)) {
                return false;
            }
            if(Float.compare(this.a, ((FlingInfo)object0).a) != 0) {
                return false;
            }
            return Float.compare(this.b, ((FlingInfo)object0).b) == 0 ? this.c == ((FlingInfo)object0).c : false;
        }

        public final float f() {
            return this.b;
        }

        public final long g() {
            return this.c;
        }

        public final float h() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return (Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
        }

        public final float i(long v) {
            float f = AndroidFlingSpline.a.b((this.c <= 0L ? 1.0f : ((float)v) / ((float)this.c))).e();
            return this.b * Math.signum(this.a) * f;
        }

        public final float j(long v) {
            return this.c <= 0L ? AndroidFlingSpline.a.b(1.0f).f() * Math.signum(this.a) * this.b / ((float)this.c) * 1000.0f : AndroidFlingSpline.a.b(((float)v) / ((float)this.c)).f() * Math.signum(this.a) * this.b / ((float)this.c) * 1000.0f;
        }

        @Override
        @l
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
        }
    }

    private final float a;
    @l
    private final Density b;
    private final float c;

    public FlingCalculator(float f, @l Density density0) {
        L.p(density0, "density");
        super();
        this.a = f;
        this.b = density0;
        this.c = this.a(density0);
    }

    private final float a(Density density0) {
        return FlingCalculatorKt.a(0.84f, density0.getDensity());
    }

    // 去混淆评级： 低(20)
    public final float b(float f) {
        double f1 = Math.exp(1.736268 * this.f(f));
        return (float)(((double)(this.a * this.c)) * f1);
    }

    // 去混淆评级： 低(20)
    public final long c(float f) {
        return (long)(Math.exp(this.f(f) / 1.358202) * 1000.0);
    }

    // 去混淆评级： 低(20)
    @l
    public final FlingInfo d(float f) {
        double f1 = this.f(f);
        return new FlingInfo(f, ((float)(((double)(this.a * this.c)) * Math.exp(1.736268 * f1))), ((long)(Math.exp(f1 / 1.358202) * 1000.0)));
    }

    @l
    public final Density e() {
        return this.b;
    }

    private final double f(float f) {
        return AndroidFlingSpline.a.a(f, this.a * this.c);
    }
}

