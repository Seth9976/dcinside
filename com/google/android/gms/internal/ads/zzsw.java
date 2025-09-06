package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class zzsw implements zzsv {
    private zzsw() {
        throw null;
    }

    zzsw(zzsz zzsz0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final MediaCodecInfo zzb(int v) {
        return MediaCodecList.getCodecInfoAt(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final boolean zzc(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzsv
    public final boolean zzd(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return "secure-playback".equals(s) && "video/avc".equals(s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzsv
    public final boolean zze() {
        return false;
    }
}

