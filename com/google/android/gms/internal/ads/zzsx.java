package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;
import h4.d;

final class zzsx implements zzsv {
    private final int zza;
    @Nullable
    private MediaCodecInfo[] zzb;

    public zzsx(boolean z, boolean z1) {
        this.zza = z || z1 ? 1 : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final int zza() {
        this.zzf();
        return this.zzb.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final MediaCodecInfo zzb(int v) {
        this.zzf();
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final boolean zzc(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return mediaCodecInfo$CodecCapabilities0.isFeatureRequired(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final boolean zzd(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return mediaCodecInfo$CodecCapabilities0.isFeatureSupported(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final boolean zze() {
        return true;
    }

    @d({"mediaCodecInfos"})
    private final void zzf() {
        if(this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }
}

