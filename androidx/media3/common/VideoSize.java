package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

public final class VideoSize {
    @IntRange(from = 0L)
    public final int a;
    @IntRange(from = 0L)
    public final int b;
    @IntRange(from = 0L, to = 359L)
    public final int c;
    @FloatRange(from = 0.0, fromInclusive = false)
    public final float d;
    private static final int e = 0;
    private static final int f = 0;
    private static final int g = 0;
    private static final float h = 1.0f;
    public static final VideoSize i;
    private static final String j;
    private static final String k;
    private static final String l;
    private static final String m;

    static {
        VideoSize.i = new VideoSize(0, 0);
        VideoSize.j = "0";
        VideoSize.k = "1";
        VideoSize.l = "2";
        VideoSize.m = "3";
    }

    @UnstableApi
    public VideoSize(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        this(v, v1, 0, 1.0f);
    }

    @UnstableApi
    public VideoSize(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L, to = 359L) int v2, @FloatRange(from = 0.0, fromInclusive = false) float f) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = f;
    }

    @UnstableApi
    public static VideoSize a(Bundle bundle0) {
        return new VideoSize(bundle0.getInt(VideoSize.j, 0), bundle0.getInt(VideoSize.k, 0), bundle0.getInt(VideoSize.l, 0), bundle0.getFloat(VideoSize.m, 1.0f));
    }

    @UnstableApi
    public Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("0", this.a);
        bundle0.putInt("1", this.b);
        bundle0.putInt("2", this.c);
        bundle0.putFloat("3", this.d);
        return bundle0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof VideoSize && (this.a == ((VideoSize)object0).a && this.b == ((VideoSize)object0).b && this.c == ((VideoSize)object0).c && this.d == ((VideoSize)object0).d);
    }

    @Override
    public int hashCode() {
        return (((this.a + 0xD9) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + Float.floatToRawIntBits(this.d);
    }
}

