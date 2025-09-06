package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo.Pattern;
import android.media.MediaCodec.CryptoInfo;
import androidx.annotation.RequiresApi;
import androidx.media3.decoder.c;

@RequiresApi(24)
final class zzhc {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb;

    zzhc(MediaCodec.CryptoInfo mediaCodec$CryptoInfo0, zzhd zzhd0) {
        this.zza = mediaCodec$CryptoInfo0;
        this.zzb = c.a(0, 0);
    }

    static void zza(zzhc zzhc0, int v, int v1) {
        zzhc0.zzb.set(v, v1);
        zzhc0.zza.setPattern(zzhc0.zzb);
    }
}

