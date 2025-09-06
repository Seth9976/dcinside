package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyu;

public final class zzcn extends zzaya implements zzcp {
    zzcn(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(IObjectWrapper iObjectWrapper0, String s, zzbpe zzbpe0, int v) throws RemoteException {
        zzbu zzbu0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(3, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbu0 = iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
        }
        parcel1.recycle();
        return zzbu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, zzbpe zzbpe0, int v) throws RemoteException {
        zzby zzby0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzs0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(13, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzby0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzby0 = iInterface0 instanceof zzby ? ((zzby)iInterface0) : new zzbw(iBinder0);
        }
        parcel1.recycle();
        return zzby0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, zzbpe zzbpe0, int v) throws RemoteException {
        zzby zzby0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzs0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzby0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzby0 = iInterface0 instanceof zzby ? ((zzby)iInterface0) : new zzbw(iBinder0);
        }
        parcel1.recycle();
        return zzby0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, zzbpe zzbpe0, int v) throws RemoteException {
        zzby zzby0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzs0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzby0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzby0 = iInterface0 instanceof zzby ? ((zzby)iInterface0) : new zzbw(iBinder0);
        }
        parcel1.recycle();
        return zzby0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, int v) throws RemoteException {
        zzby zzby0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzs0);
        parcel0.writeString(s);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(10, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzby0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzby0 = iInterface0 instanceof zzby ? ((zzby)iInterface0) : new zzbw(iBinder0);
        }
        parcel1.recycle();
        return zzby0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) throws RemoteException {
        zzci zzci0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(18, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzci0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzci0 = iInterface0 instanceof zzci ? ((zzci)iInterface0) : new zzcg(iBinder0);
        }
        parcel1.recycle();
        return zzci0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        zzcz zzcz0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(9, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzcz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcz0 = iInterface0 instanceof zzcz ? ((zzcz)iInterface0) : new zzcx(iBinder0);
        }
        parcel1.recycle();
        return zzcz0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) throws RemoteException {
        zzdu zzdu0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(17, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzdu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdu0 = iInterface0 instanceof zzdu ? ((zzdu)iInterface0) : new zzds(iBinder0);
        }
        parcel1.recycle();
        return zzdu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbga zzj(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, iObjectWrapper1);
        Parcel parcel1 = this.zzcZ(5, parcel0);
        zzbga zzbga0 = zzbfz.zzdy(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbga0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgg zzk(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, iObjectWrapper1);
        zzayc.zzf(parcel0, iObjectWrapper2);
        Parcel parcel1 = this.zzcZ(11, parcel0);
        zzbgg zzbgg0 = zzbgf.zze(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbgg0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbkr zzl(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v, zzbko zzbko0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        zzayc.zzf(parcel0, zzbko0);
        Parcel parcel1 = this.zzcZ(16, parcel0);
        zzbkr zzbkr0 = zzbkq.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbkr0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbsx zzm(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(15, parcel0);
        zzbsx zzbsx0 = zzbsw.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbsx0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbte zzn(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzcZ(8, parcel0);
        zzbte zzbte0 = zzbtd.zzI(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbte0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbvz zzo(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbwp zzp(IObjectWrapper iObjectWrapper0, String s, zzbpe zzbpe0, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(12, parcel0);
        zzbwp zzbwp0 = zzbwo.zzq(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbwp0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcp
    public final zzbyu zzq(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(14, parcel0);
        zzbyu zzbyu0 = zzbyt.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbyu0;
    }
}

