package androidx.media3.common.util;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import com.google.common.util.concurrent.t0;

public final class a {
    @Nullable
    public static t0 a(BitmapLoader bitmapLoader0, MediaMetadata mediaMetadata0) {
        byte[] arr_b = mediaMetadata0.k;
        if(arr_b != null) {
            return bitmapLoader0.a(arr_b);
        }
        return mediaMetadata0.m == null ? null : bitmapLoader0.d(mediaMetadata0.m);
    }
}

