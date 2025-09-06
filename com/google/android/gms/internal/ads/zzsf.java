package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;
import androidx.annotation.Nullable;

public class zzsf extends zzhf {
    @Nullable
    public final String zza;
    public final int zzb;

    public zzsf(Throwable throwable0, @Nullable zzsg zzsg0) {
        int v;
        String s = null;
        super("Decoder failed: " + (zzsg0 == null ? null : zzsg0.zza), throwable0);
        if(throwable0 instanceof MediaCodec.CodecException) {
            s = ((MediaCodec.CodecException)throwable0).getDiagnosticInfo();
        }
        this.zza = s;
        if(zzei.zza < 23) {
            v = zzei.zzm(s);
        }
        else if(throwable0 instanceof MediaCodec.CodecException) {
            v = ((MediaCodec.CodecException)throwable0).getErrorCode();
        }
        else {
            v = 0;
        }
        this.zzb = v;
    }
}

