package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.B;

public final class PercentageRating extends Rating {
    private final float h;
    private static final int i = 1;
    private static final String j;

    static {
        PercentageRating.j = "1";
    }

    public PercentageRating() {
        this.h = -1.0f;
    }

    public PercentageRating(@FloatRange(from = 0.0, to = 100.0) float f) {
        Assertions.b(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.h = f;
    }

    @Override  // androidx.media3.common.Rating
    public boolean b() {
        return this.h != -1.0f;
    }

    @Override  // androidx.media3.common.Rating
    @UnstableApi
    public Bundle c() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt(Rating.g, 1);
        bundle0.putFloat("1", this.h);
        return bundle0;
    }

    @UnstableApi
    public static PercentageRating d(Bundle bundle0) {
        Assertions.a(bundle0.getInt("0", -1) == 1);
        float f = bundle0.getFloat("1", -1.0f);
        return f == -1.0f ? new PercentageRating() : new PercentageRating(f);
    }

    public float e() {
        return this.h;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof PercentageRating ? this.h == ((PercentageRating)object0).h : false;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.h});
    }
}

