package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;
import androidx.annotation.Nullable;

public final class zzsj extends Exception {
    @Nullable
    public final String zza;
    public final boolean zzb;
    @Nullable
    public final zzsg zzc;
    @Nullable
    public final String zzd;

    public zzsj(zzab zzab0, @Nullable Throwable throwable0, boolean z, int v) {
        this("Decoder init failed: [" + v + "], " + zzab0.toString(), throwable0, zzab0.zzo, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(v), null);
    }

    public zzsj(zzab zzab0, @Nullable Throwable throwable0, boolean z, zzsg zzsg0) {
        String s = throwable0 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException)throwable0).getDiagnosticInfo() : null;
        this("Decoder init failed: " + zzsg0.zza + ", " + zzab0.toString(), throwable0, zzab0.zzo, false, zzsg0, s, null);
    }

    private zzsj(@Nullable String s, @Nullable Throwable throwable0, @Nullable String s1, boolean z, @Nullable zzsg zzsg0, @Nullable String s2, @Nullable zzsj zzsj0) {
        super(s, throwable0);
        this.zza = s1;
        this.zzb = false;
        this.zzc = zzsg0;
        this.zzd = s2;
    }

    static zzsj zza(zzsj zzsj0, zzsj zzsj1) {
        return new zzsj(zzsj0.getMessage(), zzsj0.getCause(), zzsj0.zza, false, zzsj0.zzc, zzsj0.zzd, zzsj1);
    }
}

