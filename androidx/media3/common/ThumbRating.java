package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.B;

public final class ThumbRating extends Rating {
    private final boolean h;
    private final boolean i;
    private static final int j = 3;
    private static final String k;
    private static final String l;

    static {
        ThumbRating.k = "1";
        ThumbRating.l = "2";
    }

    public ThumbRating() {
        this.h = false;
        this.i = false;
    }

    public ThumbRating(boolean z) {
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
        bundle0.putInt(Rating.g, 3);
        bundle0.putBoolean("1", this.h);
        bundle0.putBoolean("2", this.i);
        return bundle0;
    }

    // 去混淆评级： 低(30)
    @UnstableApi
    public static ThumbRating d(Bundle bundle0) {
        Assertions.a(bundle0.getInt(Rating.g, -1) == 3);
        return bundle0.getBoolean("1", false) ? new ThumbRating(bundle0.getBoolean("2", false)) : new ThumbRating();
    }

    public boolean e() {
        return this.i;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ThumbRating ? this.i == ((ThumbRating)object0).i && this.h == ((ThumbRating)object0).h : false;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{Boolean.valueOf(this.h), Boolean.valueOf(this.i)});
    }
}

