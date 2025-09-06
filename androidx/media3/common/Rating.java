package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.UnstableApi;

public abstract class Rating {
    static final float a = -1.0f;
    static final int b = -1;
    static final int c = 0;
    static final int d = 1;
    static final int e = 2;
    static final int f = 3;
    static final String g;

    static {
        Rating.g = "0";
    }

    @UnstableApi
    public static Rating a(Bundle bundle0) {
        int v = bundle0.getInt(Rating.g, -1);
        switch(v) {
            case 0: {
                return HeartRating.d(bundle0);
            }
            case 1: {
                return PercentageRating.d(bundle0);
            }
            case 2: {
                return StarRating.d(bundle0);
            }
            case 3: {
                return ThumbRating.d(bundle0);
            }
            default: {
                throw new IllegalArgumentException("Unknown RatingType: " + v);
            }
        }
    }

    public abstract boolean b();

    @UnstableApi
    public abstract Bundle c();
}

