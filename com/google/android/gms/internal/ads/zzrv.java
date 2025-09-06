package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;

public final class zzrv implements zzsb {
    @Nullable
    private final Context zza;

    @Deprecated
    public zzrv() {
        this.zza = null;
    }

    public zzrv(Context context0) {
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzsb
    public final zzsd zzd(zzsa zzsa0) throws IOException {
        MediaCodec mediaCodec1;
        MediaCodec mediaCodec0;
        int v = zzei.zza;
        if(v >= 23 && (v >= 0x1F || this.zza != null && v >= 28 && this.zza.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int v1 = zzbb.zzb(zzsa0.zzc.zzo);
            zzdo.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + zzei.zzD(v1));
            zzrl zzrl0 = new zzrl(v1);
            zzrl0.zze(true);
            return zzrl0.zzc(zzsa0);
        }
        try {
            mediaCodec0 = null;
            Trace.beginSection(("createCodec:" + zzsa0.zza.zza));
            mediaCodec1 = MediaCodec.createByCodecName(zzsa0.zza.zza);
            Trace.endSection();
        }
        catch(IOException | RuntimeException iOException0) {
            goto label_23;
        }
        try {
            Trace.beginSection("configureCodec");
            mediaCodec1.configure(zzsa0.zzb, zzsa0.zzd, null, (zzsa0.zzd != null || !zzsa0.zza.zzh || v < 35 ? 0 : 8));
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec1.start();
            Trace.endSection();
            return new zztc(mediaCodec1, zzsa0.zzf, null);
        label_22:
            mediaCodec0 = mediaCodec1;
        }
        catch(IOException | RuntimeException iOException0) {
            goto label_22;
        }
    label_23:
        if(mediaCodec0 != null) {
            mediaCodec0.release();
        }
        throw iOException0;
    }
}

