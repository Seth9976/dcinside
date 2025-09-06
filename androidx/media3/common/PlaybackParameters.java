package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

public final class PlaybackParameters {
    public final float a;
    public final float b;
    private final int c;
    public static final PlaybackParameters d;
    private static final String e;
    private static final String f;

    static {
        PlaybackParameters.d = new PlaybackParameters(1.0f);
        PlaybackParameters.e = "0";
        PlaybackParameters.f = "1";
    }

    public PlaybackParameters(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        this(f, 1.0f);
    }

    public PlaybackParameters(@FloatRange(from = 0.0, fromInclusive = false) float f, @FloatRange(from = 0.0, fromInclusive = false) float f1) {
        boolean z = false;
        Assertions.a(f > 0.0f);
        if(f1 > 0.0f) {
            z = true;
        }
        Assertions.a(z);
        this.a = f;
        this.b = f1;
        this.c = Math.round(f * 1000.0f);
    }

    @UnstableApi
    public static PlaybackParameters a(Bundle bundle0) {
        return new PlaybackParameters(bundle0.getFloat(PlaybackParameters.e, 1.0f), bundle0.getFloat(PlaybackParameters.f, 1.0f));
    }

    @UnstableApi
    public long b(long v) {
        return v * ((long)this.c);
    }

    @UnstableApi
    public Bundle c() {
        Bundle bundle0 = new Bundle();
        bundle0.putFloat(PlaybackParameters.e, this.a);
        bundle0.putFloat(PlaybackParameters.f, this.b);
        return bundle0;
    }

    @CheckResult
    public PlaybackParameters d(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        return new PlaybackParameters(f, this.b);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return PlaybackParameters.class == class0 && (this.a == ((PlaybackParameters)object0).a && this.b == ((PlaybackParameters)object0).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (Float.floatToRawIntBits(this.a) + 0x20F) * 0x1F + Float.floatToRawIntBits(this.b);
    }

    @Override
    public String toString() {
        return Util.S("PlaybackParameters(speed=%.2f, pitch=%.2f)", new Object[]{this.a, this.b});
    }
}

