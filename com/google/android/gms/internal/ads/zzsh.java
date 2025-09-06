package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint;
import android.media.MediaCodecInfo.VideoCapabilities;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.mediacodec.p;
import androidx.media3.exoplayer.mediacodec.r;
import java.util.List;

@RequiresApi(29)
final class zzsh {
    public static int zza(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1, double f) {
        List list0 = mediaCodecInfo$VideoCapabilities0.getSupportedPerformancePoints();
        if(list0 != null && !list0.isEmpty()) {
            int v2 = zzsh.zzc(list0, r.a(v, v1, ((int)f)));
            boolean z = true;
            if(v2 == 1 && zzsi.zza == null) {
                if(zzei.zza < 35) {
                    int v3 = zzsh.zzb(false);
                    int v4 = zzsh.zzb(true);
                    if(v3 != 0) {
                        if(v4 != 0) {
                            if(v3 == 2 && v4 == 2) {
                                z = false;
                            }
                        }
                        else if(v3 == 2) {
                            z = false;
                        }
                    }
                }
                else {
                    z = false;
                }
                zzsi.zza = Boolean.valueOf(z);
                return zzsi.zza.booleanValue() ? 0 : v2;
            }
            return v2;
        }
        return 0;
    }

    private static int zzb(boolean z) {
        try {
            zzz zzz0 = new zzz();
            zzz0.zzaa("video/avc");
            zzab zzab0 = zzz0.zzag();
            List list0 = zzta.zze(zzsp.zza, zzab0, z, false);
            for(int v = 0; v < list0.size(); ++v) {
                if(((zzsg)list0.get(v)).zzd != null && ((zzsg)list0.get(v)).zzd.getVideoCapabilities() != null) {
                    List list1 = ((zzsg)list0.get(v)).zzd.getVideoCapabilities().getSupportedPerformancePoints();
                    if(list1 != null && !list1.isEmpty()) {
                        return zzsh.zzc(list1, r.a(0x500, 720, 60));
                    }
                }
            }
        }
        catch(zzsu unused_ex) {
        }
        return 0;
    }

    private static int zzc(List list0, MediaCodecInfo.VideoCapabilities.PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint0) {
        for(int v = 0; v < list0.size(); ++v) {
            if(p.a(list0.get(v)).covers(mediaCodecInfo$VideoCapabilities$PerformancePoint0)) {
                return 2;
            }
        }
        return 1;
    }
}

