package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.B;

public final class StarRating extends Rating {
    @IntRange(from = 1L)
    private final int h;
    private final float i;
    private static final int j = 2;
    private static final int k = 5;
    private static final String l;
    private static final String m;

    static {
        StarRating.l = "1";
        StarRating.m = "2";
    }

    public StarRating(@IntRange(from = 1L) int v) {
        Assertions.b(v > 0, "maxStars must be a positive integer");
        this.h = v;
        this.i = -1.0f;
    }

    public StarRating(@IntRange(from = 1L) int v, @FloatRange(from = 0.0) float f) {
        boolean z = false;
        Assertions.b(v > 0, "maxStars must be a positive integer");
        if(f >= 0.0f && f <= ((float)v)) {
            z = true;
        }
        Assertions.b(z, "starRating is out of range [0, maxStars]");
        this.h = v;
        this.i = f;
    }

    @Override  // androidx.media3.common.Rating
    public boolean b() {
        return this.i != -1.0f;
    }

    @Override  // androidx.media3.common.Rating
    @UnstableApi
    public Bundle c() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt(Rating.g, 2);
        bundle0.putInt("1", this.h);
        bundle0.putFloat("2", this.i);
        return bundle0;
    }

    @UnstableApi
    public static StarRating d(Bundle bundle0) {
        Assertions.a(bundle0.getInt(Rating.g, -1) == 2);
        int v = bundle0.getInt("1", 5);
        float f = bundle0.getFloat("2", -1.0f);
        return f == -1.0f ? new StarRating(v) : new StarRating(v, f);
    }

    @IntRange(from = 1L)
    public int e() {
        return this.h;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof StarRating ? this.h == ((StarRating)object0).h && this.i == ((StarRating)object0).i : false;
    }

    public float f() {
        return this.i;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.h, this.i});
    }
}

