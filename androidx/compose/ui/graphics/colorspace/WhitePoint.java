package androidx.compose.ui.graphics.colorspace;

import y4.l;
import y4.m;

public final class WhitePoint {
    private final float a;
    private final float b;

    public WhitePoint(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public WhitePoint(float f, float f1, float f2) {
        this(f, f1, f2, f + f1 + f2);
    }

    private WhitePoint(float f, float f1, float f2, float f3) {
        this(f / f3, f1 / f3);
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    @l
    public final WhitePoint c(float f, float f1) {
        return new WhitePoint(f, f1);
    }

    public static WhitePoint d(WhitePoint whitePoint0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = whitePoint0.a;
        }
        if((v & 2) != 0) {
            f1 = whitePoint0.b;
        }
        return whitePoint0.c(f, f1);
    }

    public final float e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WhitePoint)) {
            return false;
        }
        return Float.compare(this.a, ((WhitePoint)object0).a) == 0 ? Float.compare(this.b, ((WhitePoint)object0).b) == 0 : false;
    }

    public final float f() {
        return this.b;
    }

    @l
    public final float[] g() {
        return new float[]{this.a / this.b, 1.0f, (1.0f - this.a - this.b) / this.b};
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override
    @l
    public String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ')';
    }
}

