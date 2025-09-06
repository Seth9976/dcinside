package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
final class zzpx {
    public static void zza(AudioTrack audioTrack0, @Nullable zzoo zzoo0) {
        audioTrack0.setPreferredDevice((zzoo0 == null ? null : zzoo0.zza));
    }
}

