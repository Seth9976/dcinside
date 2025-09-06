package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzefb implements zzdgc {
    private final zzfbo zza;
    private final zzbrd zzb;
    private final AdFormat zzc;
    @Nullable
    private zzcwl zzd;

    zzefb(zzfbo zzfbo0, zzbrd zzbrd0, AdFormat adFormat0) {
        this.zzd = null;
        this.zza = zzfbo0;
        this.zzb = zzbrd0;
        this.zzc = adFormat0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context0, @Nullable zzcwg zzcwg0) throws zzdgb {
        boolean z1;
        try {
            int v = this.zzc.ordinal();
            switch(v) {
                case 1: {
                    IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(context0);
                    z1 = this.zzb.zzs(iObjectWrapper1);
                    goto label_14;
                }
                case 2: {
                    IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(context0);
                    z1 = this.zzb.zzt(iObjectWrapper2);
                    goto label_14;
                }
                default: {
                    if(v != 5) {
                        throw new zzdgb("Adapter failed to show.");
                    }
                    IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                    z1 = this.zzb.zzr(iObjectWrapper0);
                    goto label_14;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        throw new zzdgb(throwable0);
    label_14:
        if(!z1) {
            throw new zzdgb("Adapter failed to show.");
        }
        zzcwl zzcwl0 = this.zzd;
        if(zzcwl0 != null && !((Boolean)zzbe.zzc().zza(zzbcl.zzbE)).booleanValue() && this.zza.zzY == 2) {
            zzcwl0.zza();
        }
    }

    public final void zzb(zzcwl zzcwl0) {
        this.zzd = zzcwl0;
    }
}

