package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.RequiresApi;

public final class SizeFCompat {
    @RequiresApi(21)
    static final class Api21Impl {
        static SizeF a(SizeFCompat sizeFCompat0) {
            Preconditions.l(sizeFCompat0);
            return new SizeF(sizeFCompat0.b(), sizeFCompat0.a());
        }

        static SizeFCompat b(SizeF sizeF0) {
            Preconditions.l(sizeF0);
            return new SizeFCompat(sizeF0.getWidth(), sizeF0.getHeight());
        }
    }

    private final float a;
    private final float b;

    public SizeFCompat(float f, float f1) {
        this.a = Preconditions.d(f, "width");
        this.b = Preconditions.d(f1, "height");
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.a;
    }

    @RequiresApi(21)
    public SizeF c() {
        return Api21Impl.a(this);
    }

    @RequiresApi(21)
    public static SizeFCompat d(SizeF sizeF0) {
        return Api21Impl.b(sizeF0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SizeFCompat ? ((SizeFCompat)object0).a == this.a && ((SizeFCompat)object0).b == this.b : false;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b);
    }

    @Override
    public String toString() {
        return this.a + "x" + this.b;
    }
}

