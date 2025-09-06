package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.RequiresApi;

@RequiresApi(30)
final class zzaam {
    public static void zza(Surface surface0, float f) {
        try {
            surface0.setFrameRate(f, (f == 0.0f ? 0 : 1));
        }
        catch(IllegalStateException illegalStateException0) {
            zzdo.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", illegalStateException0);
        }
    }
}

