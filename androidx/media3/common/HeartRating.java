package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.B;

public final class HeartRating extends Rating {
    private final boolean h;
    private final boolean i;
    private static final int j;
    private static final String k;
    private static final String l;

    static {
        HeartRating.k = "1";
        HeartRating.l = "2";
    }

    public HeartRating() {
        this.h = false;
        this.i = false;
    }

    public HeartRating(boolean z) {
        this.h = true;
        this.i = z;
    }

    @Override  // androidx.media3.common.Rating
    public boolean b() {
        return this.h;
    }

    @Override  // androidx.media3.common.Rating
    @UnstableApi
    public Bundle c() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt(Rating.g, 0);
        bundle0.putBoolean("1", this.h);
        bundle0.putBoolean("2", this.i);
        return bundle0;
    }

    // 去混淆评级： 低(30)
    @UnstableApi
    public static HeartRating d(Bundle bundle0) {
        Assertions.a(bundle0.getInt(Rating.g, -1) == 0);
        return bundle0.getBoolean("1", false) ? new HeartRating(bundle0.getBoolean("2", false)) : new HeartRating();
    }

    public boolean e() {
        return this.i;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof HeartRating ? this.i == ((HeartRating)object0).i && this.h == ((HeartRating)object0).h : false;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{Boolean.valueOf(this.h), Boolean.valueOf(this.i)});
    }
}

