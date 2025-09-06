package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import o3.j;

@Deprecated
@j
public final class zzbcr {
    public static final void zza(zzbcq zzbcq0, @Nullable zzbco zzbco0) {
        if(zzbco0.zza() == null) {
            throw new IllegalArgumentException("Context can\'t be null. Please set up context in CsiConfiguration.");
        }
        if(TextUtils.isEmpty(zzbco0.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can\'t be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbcq0.zzd(zzbco0.zza(), zzbco0.zzb(), zzbco0.zzc(), zzbco0.zzd());
    }
}

