package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmi;

public final class zzbs extends zzaya implements zzbu {
    zzbs(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzbr zze() throws RemoteException {
        zzbr zzbr0;
        Parcel parcel0 = this.zzcZ(1, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbr0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbr0 = iInterface0 instanceof zzbr ? ((zzbr)iInterface0) : new zzbp(iBinder0);
        }
        parcel0.recycle();
        return zzbr0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(zzbgu zzbgu0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbgx zzbgx0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String s, zzbhd zzbhd0, zzbha zzbha0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbhd0);
        zzayc.zzf(parcel0, zzbha0);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzbmi zzbmi0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzbhh zzbhh0, zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbhh0);
        zzayc.zzd(parcel0, zzs0);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(zzbhk zzbhk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbhk0);
        this.zzda(10, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzbl0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbl0);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, adManagerAdViewOptions0);
        this.zzda(15, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzblz zzblz0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzbfl zzbfl0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbfl0);
        this.zzda(6, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzcq zzcq0) throws RemoteException {
        throw null;
    }
}

