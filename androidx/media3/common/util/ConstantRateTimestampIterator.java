package androidx.media3.common.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

@UnstableApi
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final float a;
    private final double b;
    private final int c;
    private final long d;
    private final long e;
    private int f;

    public ConstantRateTimestampIterator(@IntRange(from = 1L) long v, @FloatRange(from = 0.0, fromInclusive = false) float f) {
        this(0L, v, f);
    }

    public ConstantRateTimestampIterator(@IntRange(from = 0L) long v, @IntRange(from = 1L) long v1, @FloatRange(from = 0.0, fromInclusive = false) float f) {
        boolean z = false;
        Assertions.a(v1 > 0L);
        Assertions.a(f > 0.0f);
        if(0L <= v && v < v1) {
            z = true;
        }
        Assertions.a(z);
        this.d = v;
        this.e = v1;
        this.a = f;
        this.c = Math.round(((float)(v1 - v)) / 1000000.0f * f);
        this.b = (double)(1000000.0f / f);
    }

    @Override  // androidx.media3.common.util.TimestampIterator
    public long a() {
        return this.c == 0 ? 0x8000000000000001L : this.d(this.c - 1);
    }

    @Override  // androidx.media3.common.util.TimestampIterator
    public TimestampIterator b() {
        return this.c();
    }

    public ConstantRateTimestampIterator c() {
        return new ConstantRateTimestampIterator(this.d, this.e, this.a);
    }

    private long d(int v) {
        long v1 = this.d + Math.round(this.b * ((double)v));
        Assertions.i(v1 >= 0L);
        return v1;
    }

    @Override  // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.f < this.c;
    }

    @Override  // androidx.media3.common.util.TimestampIterator
    public long next() {
        Assertions.i(this.hasNext());
        int v = this.f;
        this.f = v + 1;
        return this.d(v);
    }
}

