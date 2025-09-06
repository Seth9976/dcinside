package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import y4.l;
import y4.m;

@Immutable
public final class FixedScale implements ContentScale {
    private final float b;
    public static final int c;

    static {
    }

    public FixedScale(float f) {
        this.b = f;
    }

    @Override  // androidx.compose.ui.layout.ContentScale
    public long a(long v, long v1) {
        return ScaleFactorKt.a(this.b, this.b);
    }

    public final float b() {
        return this.b;
    }

    @l
    public final FixedScale c(float f) {
        return new FixedScale(f);
    }

    public static FixedScale d(FixedScale fixedScale0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = fixedScale0.b;
        }
        return fixedScale0.c(f);
    }

    public final float e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FixedScale ? Float.compare(this.b, ((FixedScale)object0).b) == 0 : false;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    @Override
    @l
    public String toString() {
        return "FixedScale(value=" + this.b + ')';
    }
}

