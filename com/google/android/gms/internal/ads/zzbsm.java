package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbsm extends Image {
    private final zzbfw zza;
    @Nullable
    private final Drawable zzb;
    @Nullable
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbsm(zzbfw zzbfw0) {
        int v1;
        int v;
        double f;
        Drawable drawable0;
        this.zza = zzbfw0;
        Uri uri0 = null;
        try {
            IObjectWrapper iObjectWrapper0 = zzbfw0.zzf();
            if(iObjectWrapper0 == null) {
                goto label_11;
            }
            else {
                drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            drawable0 = null;
        }
        goto label_12;
    label_11:
        drawable0 = null;
        try {
        label_12:
            this.zzb = drawable0;
            uri0 = this.zza.zze();
        }
        catch(RemoteException remoteException1) {
            zzo.zzh("", remoteException1);
        }
        try {
            this.zzc = uri0;
            f = this.zza.zzb();
        }
        catch(RemoteException remoteException2) {
            zzo.zzh("", remoteException2);
            f = 1.0;
        }
        try {
            this.zzd = f;
            v = -1;
            v1 = this.zza.zzd();
        }
        catch(RemoteException remoteException3) {
            zzo.zzh("", remoteException3);
            v1 = -1;
        }
        try {
            this.zze = v1;
            v = this.zza.zzc();
        }
        catch(RemoteException remoteException4) {
            zzo.zzh("", remoteException4);
        }
        this.zzf = v;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$Image
    @Nullable
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$Image
    public final double getScale() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$Image
    @Nullable
    public final Uri getUri() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$Image
    public final int zza() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$Image
    public final int zzb() {
        return this.zze;
    }
}

