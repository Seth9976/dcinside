package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.ads.internal.util.zzbb;

public final class zzdxq extends zzbvb {
    final zzdxs zza;

    protected zzdxq(zzdxs zzdxs0) {
        this.zza = zzdxs0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvc
    public final void zze(zzbb zzbb0) {
        zzba zzba0 = zzbb0.zza();
        this.zza.zza.zzd(zzba0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor0) {
        zzdyi zzdyi0 = new zzdyi(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0), this.zza.zze);
        this.zza.zza.zzc(zzdyi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor0, zzbvk zzbvk0) {
        zzdyi zzdyi0 = new zzdyi(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0), zzbvk0);
        this.zza.zza.zzc(zzdyi0);
    }
}

