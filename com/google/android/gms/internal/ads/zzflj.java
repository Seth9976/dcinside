package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;

public final class zzflj extends zzflm {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzflj zzb;

    static {
        zzflj.zzb = new zzflj();
    }

    public static zzflj zza() {
        return zzflj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzflm
    public final void zzb(boolean z) {
        for(Object object0: zzflk.zza().zzc()) {
            ((zzfkt)object0).zzg().zzk(z);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzflm
    public final boolean zzc() {
        for(Object object0: zzflk.zza().zzb()) {
            View view0 = ((zzfkt)object0).zzf();
            if(view0 != null && view0.hasWindowFocus()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

