package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbfj extends zzbfv {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbfj(Drawable drawable0, Uri uri0, double f, int v, int v1) {
        this.zza = drawable0;
        this.zzb = uri0;
        this.zzc = f;
        this.zzd = v;
        this.zze = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final double zzb() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final int zzc() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final int zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final Uri zze() throws RemoteException {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final IObjectWrapper zzf() throws RemoteException {
        return ObjectWrapper.wrap(this.zza);
    }
}

