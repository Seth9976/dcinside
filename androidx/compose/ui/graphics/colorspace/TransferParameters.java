package androidx.compose.ui.graphics.colorspace;

import androidx.compose.animation.core.b;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class TransferParameters {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;

    public TransferParameters(double f, double f1, double f2, double f3, double f4, double f5, double f6) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        if(Double.isNaN(f1) || Double.isNaN(f2) || Double.isNaN(f3) || Double.isNaN(f4) || Double.isNaN(f5) || Double.isNaN(f6) || Double.isNaN(f)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if(f4 < 0.0 || f4 > 1.0) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + f4);
        }
        if(f4 == 0.0 && (f1 == 0.0 || f == 0.0)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if(f4 >= 1.0 && f3 == 0.0) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if((f1 == 0.0 || f == 0.0) && f3 == 0.0) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if(f3 < 0.0) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if(f1 < 0.0 || f < 0.0) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public TransferParameters(double f, double f1, double f2, double f3, double f4, double f5, double f6, int v, w w0) {
        this(f, f1, f2, f3, f4, ((v & 0x20) == 0 ? f5 : 0.0), ((v & 0x40) == 0 ? f6 : 0.0));
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final double d() {
        return this.d;
    }

    public final double e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransferParameters)) {
            return false;
        }
        if(Double.compare(this.a, ((TransferParameters)object0).a) != 0) {
            return false;
        }
        if(Double.compare(this.b, ((TransferParameters)object0).b) != 0) {
            return false;
        }
        if(Double.compare(this.c, ((TransferParameters)object0).c) != 0) {
            return false;
        }
        if(Double.compare(this.d, ((TransferParameters)object0).d) != 0) {
            return false;
        }
        if(Double.compare(this.e, ((TransferParameters)object0).e) != 0) {
            return false;
        }
        return Double.compare(this.f, ((TransferParameters)object0).f) == 0 ? Double.compare(this.g, ((TransferParameters)object0).g) == 0 : false;
    }

    public final double f() {
        return this.f;
    }

    public final double g() {
        return this.g;
    }

    @l
    public final TransferParameters h(double f, double f1, double f2, double f3, double f4, double f5, double f6) {
        return new TransferParameters(f, f1, f2, f3, f4, f5, f6);
    }

    @Override
    public int hashCode() {
        return (((((b.a(this.a) * 0x1F + b.a(this.b)) * 0x1F + b.a(this.c)) * 0x1F + b.a(this.d)) * 0x1F + b.a(this.e)) * 0x1F + b.a(this.f)) * 0x1F + b.a(this.g);
    }

    public static TransferParameters i(TransferParameters transferParameters0, double f, double f1, double f2, double f3, double f4, double f5, double f6, int v, Object object0) {
        double f7 = (v & 1) == 0 ? f : transferParameters0.a;
        double f8 = (v & 2) == 0 ? f1 : transferParameters0.b;
        double f9 = (v & 4) == 0 ? f2 : transferParameters0.c;
        double f10 = (v & 8) == 0 ? f3 : transferParameters0.d;
        double f11 = (v & 16) == 0 ? f4 : transferParameters0.e;
        double f12 = (v & 0x20) == 0 ? f5 : transferParameters0.f;
        return (v & 0x40) == 0 ? transferParameters0.h(f7, f8, f9, f10, f11, f12, f6) : transferParameters0.h(f7, f8, f9, f10, f11, f12, transferParameters0.g);
    }

    public final double j() {
        return this.b;
    }

    public final double k() {
        return this.c;
    }

    public final double l() {
        return this.d;
    }

    public final double m() {
        return this.e;
    }

    public final double n() {
        return this.f;
    }

    public final double o() {
        return this.g;
    }

    public final double p() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }
}

