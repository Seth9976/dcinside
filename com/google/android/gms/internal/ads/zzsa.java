package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

public final class zzsa {
    public final zzsg zza;
    public final MediaFormat zzb;
    public final zzab zzc;
    @Nullable
    public final Surface zzd;
    @Nullable
    public final MediaCrypto zze;
    @Nullable
    public final zzrz zzf;

    private zzsa(zzsg zzsg0, MediaFormat mediaFormat0, zzab zzab0, @Nullable Surface surface0, @Nullable MediaCrypto mediaCrypto0, @Nullable zzrz zzrz0) {
        this.zza = zzsg0;
        this.zzb = mediaFormat0;
        this.zzc = zzab0;
        this.zzd = surface0;
        this.zze = null;
        this.zzf = zzrz0;
    }

    public static zzsa zza(zzsg zzsg0, MediaFormat mediaFormat0, zzab zzab0, @Nullable MediaCrypto mediaCrypto0, @Nullable zzrz zzrz0) {
        return new zzsa(zzsg0, mediaFormat0, zzab0, null, null, zzrz0);
    }

    public static zzsa zzb(zzsg zzsg0, MediaFormat mediaFormat0, zzab zzab0, @Nullable Surface surface0, @Nullable MediaCrypto mediaCrypto0) {
        return new zzsa(zzsg0, mediaFormat0, zzab0, surface0, null, null);
    }
}

