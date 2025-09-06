package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

public final class zzbsr {
    private final OnCustomFormatAdLoadedListener zza;
    @Nullable
    private final OnCustomClickListener zzb;
    @GuardedBy("this")
    @Nullable
    private NativeCustomFormatAd zzc;

    public zzbsr(OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, @Nullable OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener0) {
        this.zza = nativeCustomFormatAd$OnCustomFormatAdLoadedListener0;
        this.zzb = nativeCustomFormatAd$OnCustomClickListener0;
    }

    @Nullable
    public final zzbha zza() {
        return this.zzb == null ? null : new zzbso(this, null);
    }

    public final zzbhd zzb() {
        return new zzbsp(this, null);
    }

    private final NativeCustomFormatAd zzf(zzbgq zzbgq0) {
        synchronized(this) {
            NativeCustomFormatAd nativeCustomFormatAd0 = this.zzc;
            if(nativeCustomFormatAd0 != null) {
                return nativeCustomFormatAd0;
            }
            NativeCustomFormatAd nativeCustomFormatAd1 = new zzbss(zzbgq0);
            this.zzc = nativeCustomFormatAd1;
            return nativeCustomFormatAd1;
        }
    }
}

