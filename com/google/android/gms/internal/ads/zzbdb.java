package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o3.j;

@j
public final class zzbdb extends zzbdc {
    private final zzg zza;
    @Nullable
    private final String zzb;
    private final String zzc;

    public zzbdb(zzg zzg0, @Nullable String s, String s1) {
        this.zza = zzg0;
        this.zzb = s;
        this.zzc = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbdd
    public final String zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbdd
    public final String zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzbdd
    public final void zzd(@Nullable IObjectWrapper iObjectWrapper0) {
        if(iObjectWrapper0 == null) {
            return;
        }
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.zza(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbdd
    public final void zze() {
        this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbdd
    public final void zzf() {
        this.zza.zzc();
    }
}

