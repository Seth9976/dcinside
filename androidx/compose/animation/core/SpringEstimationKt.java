package androidx.compose.animation.core;

import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n1#1,318:1\n317#1:319\n317#1:320\n313#1:321\n317#1:322\n317#1:323\n313#1:324\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n141#1:319\n142#1:320\n183#1:321\n211#1:322\n212#1:323\n259#1:324\n*E\n"})
public final class SpringEstimationKt {
    public static final long a(double f, double f1, double f2, double f3, double f4) {
        return SpringEstimationKt.g(ComplexDoubleKt.a(1.0, 2.0 * f1 * Math.sqrt(f), f), f1, f2, f3, f4);
    }

    public static final long b(double f, double f1, double f2, double f3, double f4, double f5) {
        return SpringEstimationKt.g(ComplexDoubleKt.a(f2, f1, f), f1 / (Math.sqrt(f * f2) * 2.0), f3, f4, f5);
    }

    public static final long c(float f, float f1, float f2, float f3, float f4) {
        return SpringEstimationKt.a(f, f1, f2, f3, f4);
    }

    private static final double d(V v0, double f, double f1, double f2) {
        double f8;
        double f3 = ((ComplexDouble)v0.e()).k();
        double f4 = f3 * f;
        double f5 = f1 - f4;
        double f6 = Math.log(Math.abs(f2 / f)) / f3;
        double f7 = SpringEstimationKt.e(Math.log(Math.abs(f2 / f5)), f3) / f3;
        if(Double.isInfinite(f6) || Double.isNaN(f6)) {
            f8 = f7;
        }
        else {
            if(!Double.isInfinite(f7) && !Double.isNaN(f7)) {
                f6 = Math.max(f6, f7);
            }
            f8 = f6;
        }
        double f9 = -(f4 + f5) / (f3 * f5);
        if(Double.isNaN(f9) || f9 <= 0.0) {
            f2 = -f2;
        }
        else if(f9 > 0.0 && -SpringEstimationKt.f(f, f3, f9, f5) < f2) {
            if(f5 < 0.0 && f > 0.0) {
                f8 = 0.0;
            }
            f2 = -f2;
        }
        else {
            f8 = -(2.0 / f3) - f / f5;
        }
        androidx.compose.animation.core.SpringEstimationKt.estimateCriticallyDamped.fn.1 springEstimationKt$estimateCriticallyDamped$fn$10 = new Function1(f, f5, f3, f2) {
            final double e;
            final double f;
            final double g;
            final double h;

            {
                this.e = f;
                this.f = f1;
                this.g = f2;
                this.h = f3;
                super(1);
            }

            @l
            public final Double a(double f) {
                return (double)((this.e + this.f * f) * Math.exp(this.g * f) + this.h);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).doubleValue());
            }
        };
        androidx.compose.animation.core.SpringEstimationKt.estimateCriticallyDamped.fnPrime.1 springEstimationKt$estimateCriticallyDamped$fnPrime$10 = new Function1(f5, f3, f) {
            final double e;
            final double f;
            final double g;

            {
                this.e = f;
                this.f = f1;
                this.g = f2;
                super(1);
            }

            @l
            public final Double a(double f) {
                return (double)((this.e * (this.f * f + 1.0) + this.g * this.f) * Math.exp(this.f * f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).doubleValue());
            }
        };
        int v1 = 0;
        for(double f10 = 1.797693E+308; f10 > 0.001 && v1 < 100; f10 = f12) {
            ++v1;
            double f11 = f8 - ((Number)springEstimationKt$estimateCriticallyDamped$fn$10.invoke(f8)).doubleValue() / ((Number)springEstimationKt$estimateCriticallyDamped$fnPrime$10.invoke(f8)).doubleValue();
            double f12 = Math.abs(f8 - f11);
            f8 = f11;
        }
        return f8;
    }

    private static final double e(double f, double f1) {
        double f2 = f;
        for(int v = 0; v < 6; ++v) {
            f2 = f - Math.log(Math.abs(f2 / f1));
        }
        return f2;
    }

    private static final double f(double f, double f1, double f2, double f3) {
        return f * Math.exp(f1 * f2) + f3 * f2 * Math.exp(f1 * f2);
    }

    private static final long g(V v0, double f, double f1, double f2, double f3) {
        int v1 = Double.compare(f2, 0.0);
        if(v1 == 0 && f1 == 0.0) {
            return 0L;
        }
        if(v1 < 0) {
            f1 = -f1;
        }
        double f4 = Math.abs(f2);
        if(f > 1.0) {
            return (long)(SpringEstimationKt.h(v0, f4, f1, f3) * 1000.0);
        }
        return f < 1.0 ? ((long)(SpringEstimationKt.j(v0, f4, f1, f3) * 1000.0)) : ((long)(SpringEstimationKt.d(v0, f4, f1, f3) * 1000.0));
    }

    private static final double h(V v0, double f, double f1, double f2) {
        double f10;
        double f3 = ((ComplexDouble)v0.e()).k();
        double f4 = ((ComplexDouble)v0.f()).k();
        double f5 = f3 - f4;
        double f6 = (f3 * f - f1) / f5;
        double f7 = f - f6;
        double f8 = Math.log(Math.abs(f2 / f7)) / f3;
        double f9 = Math.log(Math.abs(f2 / f6)) / f4;
        if(Double.isInfinite(f8) || Double.isNaN(f8)) {
            f10 = f9;
        }
        else {
            if(!Double.isInfinite(f9) && !Double.isNaN(f9)) {
                f8 = Math.max(f8, f9);
            }
            f10 = f8;
        }
        double f11 = f7 * f3;
        double f12 = Math.log(f11 / (-f6 * f4)) / (f4 - f3);
        if(Double.isNaN(f12) || f12 <= 0.0) {
            f2 = -f2;
        }
        else if(f12 > 0.0 && -SpringEstimationKt.i(f7, f3, f12, f6, f4) < f2) {
            if(f6 > 0.0 && f7 < 0.0) {
                f10 = 0.0;
            }
            f2 = -f2;
        }
        else {
            f10 = Math.log(-(f6 * f4 * f4) / (f11 * f3)) / f5;
        }
        androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped.fn.1 springEstimationKt$estimateOverDamped$fn$10 = new Function1(f7, f3, f6, f4, f2) {
            final double e;
            final double f;
            final double g;
            final double h;
            final double i;

            {
                this.e = f;
                this.f = f1;
                this.g = f2;
                this.h = f3;
                this.i = f4;
                super(1);
            }

            @l
            public final Double a(double f) {
                return (double)(this.e * Math.exp(this.f * f) + this.g * Math.exp(this.h * f) + this.i);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).doubleValue());
            }
        };
        androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped.fnPrime.1 springEstimationKt$estimateOverDamped$fnPrime$10 = new Function1(f7, f3, f6, f4) {
            final double e;
            final double f;
            final double g;
            final double h;

            {
                this.e = f;
                this.f = f1;
                this.g = f2;
                this.h = f3;
                super(1);
            }

            @l
            public final Double a(double f) {
                return (double)(this.e * this.f * Math.exp(this.f * f) + this.g * this.h * Math.exp(this.h * f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).doubleValue());
            }
        };
        if(Math.abs(((Number)springEstimationKt$estimateOverDamped$fn$10.invoke(f10)).doubleValue()) < 0.0001) {
            return f10;
        }
        int v1 = 0;
        for(double f13 = 1.797693E+308; f13 > 0.001 && v1 < 100; f13 = f15) {
            ++v1;
            double f14 = f10 - ((Number)springEstimationKt$estimateOverDamped$fn$10.invoke(f10)).doubleValue() / ((Number)springEstimationKt$estimateOverDamped$fnPrime$10.invoke(f10)).doubleValue();
            double f15 = Math.abs(f10 - f14);
            f10 = f14;
        }
        return f10;
    }

    private static final double i(double f, double f1, double f2, double f3, double f4) {
        return f * Math.exp(f1 * f2) + f3 * Math.exp(f4 * f2);
    }

    private static final double j(V v0, double f, double f1, double f2) {
        double f3 = ((ComplexDouble)v0.e()).k();
        double f4 = (f1 - f3 * f) / ((ComplexDouble)v0.e()).j();
        return Math.log(f2 / Math.sqrt(f * f + f4 * f4)) / f3;
    }

    // 去混淆评级： 低(20)
    private static final boolean k(double f) {
        return Double.isInfinite(f) || Double.isNaN(f) ? 1 : 0;
    }

    private static final double l(double f, Function1 function10, Function1 function11) {
        return f - ((Number)function10.invoke(f)).doubleValue() / ((Number)function11.invoke(f)).doubleValue();
    }
}

