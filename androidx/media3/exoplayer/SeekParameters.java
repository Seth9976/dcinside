package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class SeekParameters {
    public final long a;
    public final long b;
    public static final SeekParameters c;
    public static final SeekParameters d;
    public static final SeekParameters e;
    public static final SeekParameters f;
    public static final SeekParameters g;

    static {
        SeekParameters seekParameters0 = new SeekParameters(0L, 0L);
        SeekParameters.c = seekParameters0;
        SeekParameters.d = new SeekParameters(0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL);
        SeekParameters.e = new SeekParameters(0x7FFFFFFFFFFFFFFFL, 0L);
        SeekParameters.f = new SeekParameters(0L, 0x7FFFFFFFFFFFFFFFL);
        SeekParameters.g = seekParameters0;
    }

    public SeekParameters(long v, long v1) {
        boolean z = false;
        Assertions.a(v >= 0L);
        if(v1 >= 0L) {
            z = true;
        }
        Assertions.a(z);
        this.a = v;
        this.b = v1;
    }

    public long a(long v, long v1, long v2) {
        long v3 = this.a;
        if(v3 == 0L && this.b == 0L) {
            return v;
        }
        long v4 = Util.q2(v, v3, 0x8000000000000000L);
        long v5 = Util.f(v, this.b, 0x7FFFFFFFFFFFFFFFL);
        boolean z = false;
        boolean z1 = v4 <= v1 && v1 <= v5;
        if(v4 <= v2 && v2 <= v5) {
            z = true;
        }
        if(z1 && z) {
            return Math.abs(v1 - v) > Math.abs(v2 - v) ? v2 : v1;
        }
        if(z1) {
            return v1;
        }
        return z ? v2 : v4;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return SeekParameters.class == class0 && (this.a == ((SeekParameters)object0).a && this.b == ((SeekParameters)object0).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((int)this.a) * 0x1F + ((int)this.b);
    }
}

